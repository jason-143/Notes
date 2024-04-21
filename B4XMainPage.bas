B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private item_recipe As B4XView
	Public View_Quotes As viewQuotes
	
	Private ss As ServerSocket
	Public Ip As String = ""
	Public link As String
	Private spnCategory As Spinner
	Private category As String
	Private clvMain As CustomListView
	Private clvSaveQuotes As CustomListView
	
	Private TabStrip1 As TabStrip
	Private TabStrip2 As TabStrip
	
	#Region Quotes
	Private categorylist As B4XView
	Private item_clicked As B4XView
	Private Quoteclicked As B4XView
	Private PanelTop As Panel
	Private PanelMain As Panel
	Private lblQuote As Label
	Private save As Button
	Private randomize As Button
	Private quote_text As Label
	Private author As Label
	Private authorContainer As Label
	Public sam As String
	#End Region
	
	#Region Facts
	Private factsview As B4XView
	Public factsClick As B4XView
	Private saveFacts As Button
	Private GenerateFacts As Button
	Private fact_text As Label
	Private lblFacts As Label
	Private clvSaveFacts As CustomListView
	Private factsContainer As Label
	#End Region
	
	#Region Recipe
	Public recipeItemClick As String
	Private recipeClick As B4XView
	Private recipeView As B4XView
	Private txtRecipe As EditText
	Private Instruction As Label
	Private Ingredients As Label
	Private Servings As Label
	Private Title As Label
	Private lblRecipe As Label
	Private clvRecipe As CustomListView
	Private titleContainer As Label
	Private saveRecipe As Button
	#End Region
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	SetActionBarColor(0xFF426192)
	Dim cs As CSBuilder
	cs.Initialize.Size(24).Color(xui.Color_White).Append("Notes").Popall
	B4XPages.SetTitle(Me,cs)
	
	TabStrip1.LoadLayout("MainPage1","Quote")
	TabStrip1.LoadLayout("MainPage3","Facts")
	TabStrip1.LoadLayout("MainPage4","Recipe")
	TabStrip1.LoadLayout("MainPage2","Saved")
	TabStrip2.LoadLayout("SubMainPage2","         Saved Quotes        ")
	TabStrip2.LoadLayout("SubMainPage3","           Saved Facts           ")
	'TabStrip2.LoadLayout("SubMainPage4","Saved Recipe")
	
	View_Quotes.Initialize
	B4XPages.AddPage("View_Quotes",View_Quotes)
	B4XPages.GetPage("View_Quotes")
	
	ss.Initialize(0, "")
	If ss.GetMyIP = "127.0.0.1" Then
	xui.MsgboxAsync("No internet","Offline")
	Return
	Else
		Log("Ip: "&ss.GetMyIP)
	End If
	Ip = "192.168.43.166"
	link = "http:/"& Ip &"/Quotes/Quotes.php"

	ItemCategory
	display
	
End Sub

Public Sub SetActionBarColor(Color As Int)
	Dim p As Phone
	
	Dim jo As JavaObject
	jo.InitializeContext
	Dim cd As ColorDrawable
	cd.Initialize(Color, 0)
	jo.RunMethodJO("getActionBar", Null).RunMethod("setBackgroundDrawable", Array(cd))
	
	If p.SdkVersion >= 21 Then
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setStatusBarColor", Array(Color))
	End If
End Sub
Sub Activity_Resume
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("No internet","Offline")
		Return	
	Else
		Log("Ip: "&ss.GetMyIP)
	End If
End Sub
Sub Activity_Pause (UserClosed As Boolean)
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("No internet","Offline")
		Return
	Else
		Log("Ip: "&ss.GetMyIP)
	End If
End Sub
Public Sub ItemCategory
	spnCategory.AddAll(Array As String("age", "alone", "amazing", "anger", "architecture", "art", "attitude", "beauty", "best", _
		 							"birthday", "business", "car", "change", "communication", "computers", "cool", "courage", _
									"dad", "dating", "death", "design", "dreams", "education", "environmental", "equality", _ 
									"experience", "failure", "faith", "family", "famous", "fear", "fitness", "food", "forgiveness", _
									"freedom", "friendship", "funny", "future", "god", "good", "government", "graduation", "great", _ 
									"happiness", "health", "history", "home", "hope", "humor", "imagination", "inspirational", _
									"intelligence", "jealousy", "knowledge", "leadership", "learning", "legal", "life", "love", _ 
									"marriage", "medical", "men", "mom", "money", "morning", "movies", "success"))
End Sub
Public Sub display
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("Server connection is lost","Offline")
		Return
	Else
		Dim fetchQ As HttpJob
		fetchQ.Initialize("Fetch_FetchedAPI",Me)
		fetchQ.Download2(link,Array As String("action","Fetch_FetchedAPI"))
		
		Dim job1 As HttpJob
		job1.Initialize("Displayfacts",Me)
		job1.Download2(link,Array As String("action","Displayfacts"))
	End If
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
#Region API fetch
Sub JobDone (Job As HttpJob)
	Dim res As String
	res = Job.GetString
	Log("Back from Job:" & Job.JobName)
	Log("Response from server: " & res)
	'Database
	Dim parser As JSONParser
	parser.Initialize(res)

	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	Dim JSON As JSONParser
	JSON.Initialize(res)
	
	If res.Contains("Record_Exists") Then 'Facts Insert, Checks for duplication
		ToastMessageShow("Facts already saved",False)
	End If
	
	If Job.Success = True Then
		
		Select Job.JobName
#Region Quotes
			Case "Fetch_API":
			
				Dim quotes As List
				quotes = JSON.NextArray
				
				If quotes.Size > 0 Then 
					' For simplicity, let's just display the first quote
					Dim quoteMap As Map
					quoteMap = quotes.Get(0)
					If quoteMap.ContainsKey("quote") And quoteMap.ContainsKey("author") Then
						quote_text.Text = quoteMap.Get("quote")
						author.Text = "--- "&quoteMap.Get("author")
					End If
					lblQuote.Text = "Generate quote"
				End If
				Log(Job.GetString) ' Print the JSON response to the logs
			
			Case "Insert_FetchedAPI":
				
			Case "DeleteQuote":
				
			Case "Fetch_FetchedAPI":
				Dim li As List
				li = parser.NextArray
				clvSaveQuotes.Clear
				If li.Size = 0 Then
					Log("No Item")
				Else
					For i = 0 To li.Size - 1
						Dim map As Map
						map = li.Get(i)
					
						categorylist = xui.CreatePanel("")
						categorylist.SetLayoutAnimated(0, 0, 0, 100%x, 56dip)
						categorylist.LoadLayout("displayAuthor")
						clvSaveQuotes.Add(categorylist, "")
						
						authorContainer.Text = map.Get("category")
					Next
				End If
#End Region
#Region Facts
			Case "Fetch_APIFacts":
				
				Dim quotes As List
				quotes = JSON.NextArray
				
				If quotes.Size > 0 Then
					' For simplicity, let's just display the first quote
					Dim quoteMap As Map
					quoteMap = quotes.Get(0)
					If quoteMap.ContainsKey("fact") Then
						fact_text.Text = quoteMap.Get("fact")
					End If
					lblFacts.Text = "Generate Facts"
					Dim y(6) As Int = Array As Int(0,256,0,128,0,256)
					fact_text.TextColor = Colors.RGB(Rnd(y(0),y(1)),Rnd(y(2),y(3)), Rnd(y(4),y(5)))
				End If
				Log(Job.GetString) ' Print the JSON response to the logs
				
			Case "Insertfacts":
			Case "DeleteFacts":
			Case "Displayfacts":
				Dim li As List
				li = parser.NextArray
				clvSaveFacts.Clear
				If li.Size = 0 Then
					Log("No Item")
				Else
					For i = 0 To li.Size - 1
						Dim map As Map
						map = li.Get(i)
					
						factsview = xui.CreatePanel("")
						factsview.SetLayoutAnimated(0, 0, 0, 100%x, 56dip)
						factsview.LoadLayout("DisplayFacts")
						clvSaveFacts.Add(factsview, "")
						
						factsContainer.Text = map.Get("facts")
						
					Next
				End If
#End Region

#Region Recipe
			Case "Fetch_APIRecipe":
				Dim quotes As List
				quotes = JSON.NextArray
				clvRecipe.Clear
				If quotes.Size > 0 Then
					' For simplicity, let's just display the first quote
					For i = 0 To quotes.Size - 1
					Dim quoteMap As Map
					quoteMap = quotes.Get(i)
						item_recipe = xui.CreatePanel("")
						item_recipe.SetLayoutAnimated(0,0,0,100%x,90%y)
						item_recipe.LoadLayout("RecipeItem")
						clvRecipe.Add(item_recipe,"")
						
					If quoteMap.ContainsKey("title") And quoteMap.ContainsKey("ingredients") And quoteMap.ContainsKey("servings") And quoteMap.ContainsKey("instructions") Then
						
						Title.Text = quoteMap.Get("title")
						Servings.Text = quoteMap.Get("servings")
						Ingredients.Text = quoteMap.Get("ingredients")
						Instruction.Text = quoteMap.Get("instructions")
			
					End If
					Next
					lblRecipe.Text = "Search Recipe"
					'saveRecipe.Visible = True
					Else
					'saveRecipe.Visible = False
					item_recipe = xui.CreatePanel("")
					item_recipe.SetLayoutAnimated(0,0,0,100%x,90%y)
					item_recipe.LoadLayout("RecipeItem")
					clvRecipe.Add(item_recipe,"")
						
					lblRecipe.Text = "Search Recipe"
					Title.Text = "No Recipe found!"
					Servings.Text = "try different keyword"
					Ingredients.Text = ""
					Instruction.Text = ""
				End If
				Log(Job.GetString) ' Print the JSON response to the logs
			
			Case "Empty_recipe":
				Dim li As List
				li = parser.NextArray
				clvSaveFacts.Clear
				If li.Size = 0 Then
					Log("No Item")
				Else
					For i = 0 To li.Size - 1
						Dim map As Map
						map = li.Get(i)
					
						recipeView = xui.CreatePanel("")
						recipeView.SetLayoutAnimated(0, 0, 0, 100%x, 56dip)
						recipeView.LoadLayout("Displayrecipe")
						clvRecipe.Add(recipeView, "")
						
						titleContainer.Text = map.Get("title")
						
					Next
				End If
			Case "ViewRecipe":
				Dim li As List
				li = parser.NextArray
				clvSaveFacts.Clear
				If li.Size = 0 Then
					Log("No Item")
				Else
					For i = 0 To li.Size - 1
						Dim map As Map
						map = li.Get(i)
						
						xui.MsgboxAsync(map.Get("title")&map.Get("serving")&map.Get("ingredient")&map.Get("instruction"),map.Get("title"))
						
					Next
				End If	
#End Region
		End Select
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
		'checks connection
		If Job.JobName = "Fetch_API" Then
			lblQuote.Text = "Connecting..."
			xui.MsgboxAsync("Internet Connection is lost","Offline")
			Return
		End If
		'checks server connection
		If Job.JobName = "Fetch_FetchedAPI" Then
			xui.MsgboxAsync("Internet Connection is lost","Offline")
			Return
		End If
		If Job.JobName = "Insert_FetchedAPI" Then
			xui.MsgboxAsync("Internet Connection is lost","Offline")
			Return
		End If
	
	End If
	Job.Release
End Sub


#End Region

#Region Quotes
Public Sub insert(category_text As String, quotes_text As String, author_text As String)
	Dim insertQ As HttpJob
	insertQ.Initialize("Insert_FetchedAPI",Me)
	insertQ.Download2(link,Array As String("action","Insert_FetchedAPI","quotes_text",quotes_text,"author_text",author_text,"category_text",category_text))
	Wait For (insertQ) JobDone(Job As HttpJob)
	If insertQ.Success Then
		Log("First Query was success")
		
		Dim fetchQ1 As HttpJob
		fetchQ1.Initialize("Fetch_FetchedAPI",Me)
		fetchQ1.Download2(link,Array As String("action","Fetch_FetchedAPI"))
		
	End If
End Sub

Private Sub spnCategory_ItemClick (Position As Int, Value As Object)
	Log(Value)
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("Internet Connection is lost","Offline")
		lblQuote.Text = "Connecting..."
		quote_text.Text = "Connection error"
		Return
	Else
		lblQuote.Text = "Generating..."
		quote_text.Text = "please wait"
		author.Text = ""
		category = spnCategory.GetItem(Position)
		Log("category: "&category)
	
		Dim Job As HttpJob
		Job.Initialize("Fetch_API",Me)
		Job.Download("https://api.api-ninjas.com/v1/quotes?category="&category)
		Job.GetRequest.SetHeader("X-Api-Key","Your-api-key")
	
		randomize.Visible = True
		save.Visible = True
	End If
End Sub

Private Sub randomize_Click
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("Internet Connection is lost","Offline")
		Return
	Else
		lblQuote.Text = "Generating..."
		quote_text.Text = "please wait"
		author.Text = ""
		Dim Job As HttpJob
		Job.Initialize("Fetch_API",Me)
		Job.Download("https://api.api-ninjas.com/v1/quotes?category="&category)
		Job.GetRequest.SetHeader("X-Api-Key","Your-api-key")
	End If
End Sub

Private Sub save_Click
	Log("quote: "&quote_text.Text)
	Log("author: "&author.Text)
	Log("category: "&category)
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("Server connection is lost","Offline")
		Return
	Else
		insert(category,quote_text.Text,author.Text)
		ToastMessageShow("Saved",False)
	End If
End Sub

Private Sub clvSaveQuotes_ItemClick (Index As Int, Value As Object)
	item_clicked = clvSaveQuotes.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sam = item_clicked.GetView(0).Text           'lblTitle is first pnlTitle View
	Log(sam)
	B4XPages.MainPage.View_Quotes.displayClickItem(sam)
	B4XPages.ShowPage("View_Quotes")
	B4XPages.GetManager.TransitionAnimationDuration = 0
End Sub

Private Sub clvSaveQuotes_ItemLongClick (Index As Int, Value As Object)
	Quoteclicked = clvSaveQuotes.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sam = Quoteclicked.GetView(0).Text           'lblTitle is first pnlTitle View
	Log(sam)
	Dim sf As Object = xui.Msgbox2Async("Would you like to Delete","Delete Quotes","Delete","","Cancel",Null)
	Wait For (sf) Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		
		Dim job As HttpJob
		job.Initialize("DeleteQuote",Me)
		job.Download2(link,Array As String("action","DeleteQuote","quotes",sam))
	
		Wait For (job) JobDone(job As HttpJob)
		If job.Success Then
			Dim fetchQ As HttpJob
			fetchQ.Initialize("Fetch_FetchedAPI",Me)
			fetchQ.Download2(link,Array As String("action","Fetch_FetchedAPI"))
		End If
		ToastMessageShow("Facts Deleted", False)
	End If
End Sub

#End Region

#Region Facts
Public Sub InsertFacts(fact As String)
	Dim job As HttpJob
	job.Initialize("Insertfacts",Me)
	job.Download2(link,Array As String("action","Insertfacts","fact",fact))
	
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim job1 As HttpJob
		job1.Initialize("Displayfacts",Me)
		job1.Download2(link,Array As String("action","Displayfacts"))
	End If
End Sub

Public Sub DeleteFacts(fact As String)
	Dim job As HttpJob
	job.Initialize("DeleteFacts",Me)
	job.Download2(link,Array As String("action","DeleteFacts","fact",fact))
	
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		Dim job1 As HttpJob
		job1.Initialize("Displayfacts",Me)
		job1.Download2(link,Array As String("action","Displayfacts"))
	End If
End Sub

Private Sub GenerateFacts_Click
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("Internet Connection is lost","Offline")
		Return
	Else
		lblFacts.Text = "Generating..."
		fact_text.Text = "please wait"

		Dim Job As HttpJob
		Job.Initialize("Fetch_APIFacts",Me)
		Job.Download("https://api.api-ninjas.com/v1/facts?limit=1")
		Job.GetRequest.SetHeader("X-Api-Key","Your-api-key")
		saveFacts.Visible = True
	End If
End Sub

Private Sub saveFacts_Click
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("Server connection is lost","Offline")
		Return
	Else
		InsertFacts(fact_text.Text)
		ToastMessageShow("Saved",False)
		Dim job1 As HttpJob
		job1.Initialize("Displayfacts",Me)
		job1.Download2(link,Array As String("action","Displayfacts"))
	End If
End Sub

Private Sub clvSaveFacts_ItemClick (Index As Int, Value As Object)
	factsClick = clvSaveFacts.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sam = factsClick.GetView(0).Text           'lblTitle is first pnlTitle View
	Log(sam)
	xui.MsgboxAsync(""&sam,"Facts")
End Sub
Private Sub clvSaveFacts_ItemLongClick (Index As Int, Value As Object)
	factsClick = clvSaveFacts.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	sam = factsClick.GetView(0).Text           'lblTitle is first pnlTitle View
	Log(sam)
	Dim sf As Object = xui.Msgbox2Async("Would you like to Delete","Delete Facts","Delete","","Cancel",Null)
	Wait For (sf) Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		
		Dim job As HttpJob
		job.Initialize("DeleteFacts",Me)
		job.Download2(link,Array As String("action","DeleteFacts","fact",sam))
	
		Wait For (job) JobDone(job As HttpJob)
		If job.Success Then
			Dim job1 As HttpJob
			job1.Initialize("Displayfacts",Me)
			job1.Download2(link,Array As String("action","Displayfacts"))
		End If
		ToastMessageShow("Facts Deleted", False)
	End If
End Sub
#End Region

#Region Recipe
'Public Sub InsertRecipe(title_recipe As String, serving_recipe As String, Ing_recipe As String, Ins_recipe As String)
'	Dim job As HttpJob
'	job.Initialize("InsertRecipe",Me)
'	job.Download2(link,Array As String("action","InsertRecipe","title_recipe",title_recipe,"serving_recipe",serving_recipe,"Ing_recipe",Ing_recipe,"Ins_recipe",Ins_recipe))
'	Wait For (job) JobDone(job As HttpJob)
'	If job.Success Then
'		Log("First Job was Success")
'		Dim job2 As HttpJob
'		job2.Initialize("displayRecipe",Me)
'		job2.Download2(link,Array As String("action","DisplayRecipe"))
'	End If
'End Sub

Private Sub SearchRecipe_Click
	Dim input As Boolean = txtRecipe.Text.Length > 0
	If ss.GetMyIP = "127.0.0.1" Then
		xui.MsgboxAsync("Internet Connection is lost","Offline")
		Return
	Else
		If input Then
			lblRecipe.Text = "Searching..."
			Dim Job As HttpJob
			Job.Initialize("Fetch_APIRecipe",Me)
			Job.Download("https://api.api-ninjas.com/v1/recipe?query="&txtRecipe.Text)
			Job.GetRequest.SetHeader("X-Api-Key","Your-api-key")
		Else 
			ToastMessageShow("empty field",False)		
		End If
	End If
End Sub

'Private Sub saveRecipe_Click
'	InsertRecipe(Title.Text,Servings.Text,Ingredients.Text,Instruction.Text)
'End Sub

Private Sub clvSaveRecipe_ItemClick (Index As Int, Value As Object)
	recipeClick = clvRecipe.GetPanel(Index).GetView(0)   'pnlTitle is First Item on Item layout
	recipeItemClick = recipeClick.GetView(0).Text           'lblTitle is first pnlTitle View
	Log(recipeItemClick)
	Log("First Job was Success")
	Dim job2 As HttpJob
	job2.Initialize("ViewRecipe",Me)
	job2.Download2(link,Array As String("action","ViewRecipe","clickedRecipe",recipeItemClick))
End Sub
#End Region