B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private CustomListView1 As CustomListView
	Private Item_list As B4XView
	Private quote_text As Label
	Private lblQuote As Label
	Private author As Label
	Public Title As String = ""
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("View")
	Dim cs As CSBuilder
	cs.Initialize.Size(24).Color(xui.Color_White).Append("Quotes").Popall
	B4XPages.SetTitle(Me,cs)
End Sub

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
	If Job.Success = True Then
		
		Select Job.JobName

			Case "DisplayQuotes":
				Dim li As List
				li = parser.NextArray
				CustomListView1.Clear
				If li.Size = 0 Then
					Log("No Item")
				Else
					For i = 0 To li.Size - 1
						Dim map As Map
						map = li.Get(i)
					
						Item_list = xui.CreatePanel("")
						Item_list.SetLayoutAnimated(0, 0, 0, 100%x, 100%y)
						Item_list.LoadLayout("Item")
						CustomListView1.Add(Item_list, "")
						
						quote_text.Text = map.Get("quote")
						author.Text = map.Get("author")
						lblQuote.Text = map.Get("category")
						
					Next

				End If
				
		End Select
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
		'checks connection
		If res.Contains("") Then
			xui.MsgboxAsync("Internet Connection is lost","Offline")
			Return
		End If
	End If
	Job.Release
End Sub
#End Region
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
Public Sub displayClickItem(quotes As String)
	Dim job As HttpJob
	job.Initialize("DisplayQuotes",Me)
	job.Download2(B4XPages.MainPage.link,Array As String("action","DisplayQuotes","quotes",quotes))
End Sub