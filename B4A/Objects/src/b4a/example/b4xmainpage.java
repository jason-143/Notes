package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _item_recipe = null;
public b4a.example.viewquotes _view_quotes = null;
public anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _ss = null;
public String _ip = "";
public String _link = "";
public anywheresoftware.b4a.objects.SpinnerWrapper _spncategory = null;
public String _category = "";
public b4a.example3.customlistview _clvmain = null;
public b4a.example3.customlistview _clvsavequotes = null;
public anywheresoftware.b4a.objects.TabStripViewPager _tabstrip1 = null;
public anywheresoftware.b4a.objects.TabStripViewPager _tabstrip2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _categorylist = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _item_clicked = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _quoteclicked = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltop = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmain = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblquote = null;
public anywheresoftware.b4a.objects.ButtonWrapper _save = null;
public anywheresoftware.b4a.objects.ButtonWrapper _randomize = null;
public anywheresoftware.b4a.objects.LabelWrapper _quote_text = null;
public anywheresoftware.b4a.objects.LabelWrapper _author = null;
public anywheresoftware.b4a.objects.LabelWrapper _authorcontainer = null;
public String _sam = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _factsview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _factsclick = null;
public anywheresoftware.b4a.objects.ButtonWrapper _savefacts = null;
public anywheresoftware.b4a.objects.ButtonWrapper _generatefacts = null;
public anywheresoftware.b4a.objects.LabelWrapper _fact_text = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfacts = null;
public b4a.example3.customlistview _clvsavefacts = null;
public anywheresoftware.b4a.objects.LabelWrapper _factscontainer = null;
public String _recipeitemclick = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _recipeclick = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _recipeview = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtrecipe = null;
public anywheresoftware.b4a.objects.LabelWrapper _instruction = null;
public anywheresoftware.b4a.objects.LabelWrapper _ingredients = null;
public anywheresoftware.b4a.objects.LabelWrapper _servings = null;
public anywheresoftware.b4a.objects.LabelWrapper _title = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblrecipe = null;
public b4a.example3.customlistview _clvrecipe = null;
public anywheresoftware.b4a.objects.LabelWrapper _titlecontainer = null;
public anywheresoftware.b4a.objects.ButtonWrapper _saverecipe = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 134;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 135;BA.debugLine="xui.MsgboxAsync(\"No internet\",\"Offline\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No internet"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 136;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 138;BA.debugLine="Log(\"Ip: \"&ss.GetMyIP)";
__c.LogImpl("1917509","Ip: "+_ss.GetMyIP(),0);
 };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 126;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 127;BA.debugLine="xui.MsgboxAsync(\"No internet\",\"Offline\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No internet"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 128;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 130;BA.debugLine="Log(\"Ip: \"&ss.GetMyIP)";
__c.LogImpl("1851973","Ip: "+_ss.GetMyIP(),0);
 };
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 72;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 73;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 74;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 75;BA.debugLine="SetActionBarColor(0xFF426192)";
_setactionbarcolor(((int)0xff426192));
 //BA.debugLineNum = 76;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 77;BA.debugLine="cs.Initialize.Size(24).Color(xui.Color_White).App";
_cs.Initialize().Size((int) (24)).Color(_xui.Color_White).Append(BA.ObjectToCharSequence("Notes")).PopAll();
 //BA.debugLineNum = 78;BA.debugLine="B4XPages.SetTitle(Me,cs)";
_b4xpages._settitle /*String*/ (ba,this,(Object)(_cs.getObject()));
 //BA.debugLineNum = 80;BA.debugLine="TabStrip1.LoadLayout(\"MainPage1\",\"Quote\")";
_tabstrip1.LoadLayout("MainPage1",BA.ObjectToCharSequence("Quote"));
 //BA.debugLineNum = 81;BA.debugLine="TabStrip1.LoadLayout(\"MainPage3\",\"Facts\")";
_tabstrip1.LoadLayout("MainPage3",BA.ObjectToCharSequence("Facts"));
 //BA.debugLineNum = 82;BA.debugLine="TabStrip1.LoadLayout(\"MainPage4\",\"Recipe\")";
_tabstrip1.LoadLayout("MainPage4",BA.ObjectToCharSequence("Recipe"));
 //BA.debugLineNum = 83;BA.debugLine="TabStrip1.LoadLayout(\"MainPage2\",\"Saved\")";
_tabstrip1.LoadLayout("MainPage2",BA.ObjectToCharSequence("Saved"));
 //BA.debugLineNum = 84;BA.debugLine="TabStrip2.LoadLayout(\"SubMainPage2\",\"         Sav";
_tabstrip2.LoadLayout("SubMainPage2",BA.ObjectToCharSequence("         Saved Quotes        "));
 //BA.debugLineNum = 85;BA.debugLine="TabStrip2.LoadLayout(\"SubMainPage3\",\"           S";
_tabstrip2.LoadLayout("SubMainPage3",BA.ObjectToCharSequence("           Saved Facts           "));
 //BA.debugLineNum = 88;BA.debugLine="View_Quotes.Initialize";
_view_quotes._initialize /*Object*/ (ba);
 //BA.debugLineNum = 89;BA.debugLine="B4XPages.AddPage(\"View_Quotes\",View_Quotes)";
_b4xpages._addpage /*String*/ (ba,"View_Quotes",(Object)(_view_quotes));
 //BA.debugLineNum = 90;BA.debugLine="B4XPages.GetPage(\"View_Quotes\")";
_b4xpages._getpage /*Object*/ (ba,"View_Quotes");
 //BA.debugLineNum = 92;BA.debugLine="ss.Initialize(0, \"\")";
_ss.Initialize(ba,(int) (0),"");
 //BA.debugLineNum = 93;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 94;BA.debugLine="xui.MsgboxAsync(\"No internet\",\"Offline\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("No internet"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 95;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 97;BA.debugLine="Log(\"Ip: \"&ss.GetMyIP)";
__c.LogImpl("1720921","Ip: "+_ss.GetMyIP(),0);
 };
 //BA.debugLineNum = 99;BA.debugLine="Ip = \"192.168.43.166\"";
_ip = "192.168.43.166";
 //BA.debugLineNum = 100;BA.debugLine="link = \"http:/\"& Ip &\"/Quotes/Quotes.php\"";
_link = "http:/"+_ip+"/Quotes/Quotes.php";
 //BA.debugLineNum = 102;BA.debugLine="ItemCategory";
_itemcategory();
 //BA.debugLineNum = 103;BA.debugLine="display";
_display();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private item_recipe As B4XView";
_item_recipe = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public View_Quotes As viewQuotes";
_view_quotes = new b4a.example.viewquotes();
 //BA.debugLineNum = 14;BA.debugLine="Private ss As ServerSocket";
_ss = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public Ip As String = \"\"";
_ip = "";
 //BA.debugLineNum = 16;BA.debugLine="Public link As String";
_link = "";
 //BA.debugLineNum = 17;BA.debugLine="Private spnCategory As Spinner";
_spncategory = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private category As String";
_category = "";
 //BA.debugLineNum = 19;BA.debugLine="Private clvMain As CustomListView";
_clvmain = new b4a.example3.customlistview();
 //BA.debugLineNum = 20;BA.debugLine="Private clvSaveQuotes As CustomListView";
_clvsavequotes = new b4a.example3.customlistview();
 //BA.debugLineNum = 22;BA.debugLine="Private TabStrip1 As TabStrip";
_tabstrip1 = new anywheresoftware.b4a.objects.TabStripViewPager();
 //BA.debugLineNum = 23;BA.debugLine="Private TabStrip2 As TabStrip";
_tabstrip2 = new anywheresoftware.b4a.objects.TabStripViewPager();
 //BA.debugLineNum = 26;BA.debugLine="Private categorylist As B4XView";
_categorylist = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private item_clicked As B4XView";
_item_clicked = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Quoteclicked As B4XView";
_quoteclicked = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private PanelTop As Panel";
_paneltop = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private PanelMain As Panel";
_panelmain = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lblQuote As Label";
_lblquote = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private save As Button";
_save = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private randomize As Button";
_randomize = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private quote_text As Label";
_quote_text = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private author As Label";
_author = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private authorContainer As Label";
_authorcontainer = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Public sam As String";
_sam = "";
 //BA.debugLineNum = 41;BA.debugLine="Private factsview As B4XView";
_factsview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Public factsClick As B4XView";
_factsclick = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private saveFacts As Button";
_savefacts = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private GenerateFacts As Button";
_generatefacts = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private fact_text As Label";
_fact_text = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private lblFacts As Label";
_lblfacts = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private clvSaveFacts As CustomListView";
_clvsavefacts = new b4a.example3.customlistview();
 //BA.debugLineNum = 48;BA.debugLine="Private factsContainer As Label";
_factscontainer = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Public recipeItemClick As String";
_recipeitemclick = "";
 //BA.debugLineNum = 53;BA.debugLine="Private recipeClick As B4XView";
_recipeclick = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private recipeView As B4XView";
_recipeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private txtRecipe As EditText";
_txtrecipe = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private Instruction As Label";
_instruction = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private Ingredients As Label";
_ingredients = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private Servings As Label";
_servings = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private Title As Label";
_title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private lblRecipe As Label";
_lblrecipe = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private clvRecipe As CustomListView";
_clvrecipe = new b4a.example3.customlistview();
 //BA.debugLineNum = 62;BA.debugLine="Private titleContainer As Label";
_titlecontainer = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private saveRecipe As Button";
_saverecipe = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _clvsavefacts_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Private Sub clvSaveFacts_ItemClick (Index As Int,";
 //BA.debugLineNum = 535;BA.debugLine="factsClick = clvSaveFacts.GetPanel(Index).GetView";
_factsclick = _clvsavefacts._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 536;BA.debugLine="sam = factsClick.GetView(0).Text           'lblTi";
_sam = _factsclick.GetView((int) (0)).getText();
 //BA.debugLineNum = 537;BA.debugLine="Log(sam)";
__c.LogImpl("11835011",_sam,0);
 //BA.debugLineNum = 538;BA.debugLine="xui.MsgboxAsync(\"\"&sam,\"Facts\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence(""+_sam),BA.ObjectToCharSequence("Facts"));
 //BA.debugLineNum = 539;BA.debugLine="End Sub";
return "";
}
public void  _clvsavefacts_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_clvSaveFacts_ItemLongClick rsub = new ResumableSub_clvSaveFacts_ItemLongClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_clvSaveFacts_ItemLongClick extends BA.ResumableSub {
public ResumableSub_clvSaveFacts_ItemLongClick(b4a.example.b4xmainpage parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.example.b4xmainpage parent;
int _index;
Object _value;
Object _sf = null;
int _result = 0;
b4a.example.httpjob _job = null;
b4a.example.httpjob _job1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 541;BA.debugLine="factsClick = clvSaveFacts.GetPanel(Index).GetView";
parent._factsclick = parent._clvsavefacts._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 542;BA.debugLine="sam = factsClick.GetView(0).Text           'lblTi";
parent._sam = parent._factsclick.GetView((int) (0)).getText();
 //BA.debugLineNum = 543;BA.debugLine="Log(sam)";
parent.__c.LogImpl("11900547",parent._sam,0);
 //BA.debugLineNum = 544;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Would you li";
_sf = parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("Would you like to Delete"),BA.ObjectToCharSequence("Delete Facts"),"Delete","","Cancel",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
 //BA.debugLineNum = 545;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, _sf);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 546;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 548;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 549;BA.debugLine="job.Initialize(\"DeleteFacts\",Me)";
_job._initialize /*String*/ (ba,"DeleteFacts",parent);
 //BA.debugLineNum = 550;BA.debugLine="job.Download2(link,Array As String(\"action\",\"Del";
_job._download2 /*String*/ (parent._link,new String[]{"action","DeleteFacts","fact",parent._sam});
 //BA.debugLineNum = 552;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 553;BA.debugLine="If job.Success Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 554;BA.debugLine="Dim job1 As HttpJob";
_job1 = new b4a.example.httpjob();
 //BA.debugLineNum = 555;BA.debugLine="job1.Initialize(\"Displayfacts\",Me)";
_job1._initialize /*String*/ (ba,"Displayfacts",parent);
 //BA.debugLineNum = 556;BA.debugLine="job1.Download2(link,Array As String(\"action\",\"D";
_job1._download2 /*String*/ (parent._link,new String[]{"action","Displayfacts"});
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 558;BA.debugLine="ToastMessageShow(\"Facts Deleted\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Facts Deleted"),parent.__c.False);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _clvsavequotes_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Private Sub clvSaveQuotes_ItemClick (Index As Int,";
 //BA.debugLineNum = 446;BA.debugLine="item_clicked = clvSaveQuotes.GetPanel(Index).GetV";
_item_clicked = _clvsavequotes._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 447;BA.debugLine="sam = item_clicked.GetView(0).Text           'lbl";
_sam = _item_clicked.GetView((int) (0)).getText();
 //BA.debugLineNum = 448;BA.debugLine="Log(sam)";
__c.LogImpl("11441795",_sam,0);
 //BA.debugLineNum = 449;BA.debugLine="B4XPages.MainPage.View_Quotes.displayClickItem(sa";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._view_quotes /*b4a.example.viewquotes*/ ._displayclickitem /*String*/ (_sam);
 //BA.debugLineNum = 450;BA.debugLine="B4XPages.ShowPage(\"View_Quotes\")";
_b4xpages._showpage /*String*/ (ba,"View_Quotes");
 //BA.debugLineNum = 451;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return "";
}
public void  _clvsavequotes_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_clvSaveQuotes_ItemLongClick rsub = new ResumableSub_clvSaveQuotes_ItemLongClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_clvSaveQuotes_ItemLongClick extends BA.ResumableSub {
public ResumableSub_clvSaveQuotes_ItemLongClick(b4a.example.b4xmainpage parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.example.b4xmainpage parent;
int _index;
Object _value;
Object _sf = null;
int _result = 0;
b4a.example.httpjob _job = null;
b4a.example.httpjob _fetchq = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 455;BA.debugLine="Quoteclicked = clvSaveQuotes.GetPanel(Index).GetV";
parent._quoteclicked = parent._clvsavequotes._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 456;BA.debugLine="sam = Quoteclicked.GetView(0).Text           'lbl";
parent._sam = parent._quoteclicked.GetView((int) (0)).getText();
 //BA.debugLineNum = 457;BA.debugLine="Log(sam)";
parent.__c.LogImpl("11507331",parent._sam,0);
 //BA.debugLineNum = 458;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Would you li";
_sf = parent._xui.Msgbox2Async(ba,BA.ObjectToCharSequence("Would you like to Delete"),BA.ObjectToCharSequence("Delete Quotes"),"Delete","","Cancel",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
 //BA.debugLineNum = 459;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, _sf);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 460;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 462;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 463;BA.debugLine="job.Initialize(\"DeleteQuote\",Me)";
_job._initialize /*String*/ (ba,"DeleteQuote",parent);
 //BA.debugLineNum = 464;BA.debugLine="job.Download2(link,Array As String(\"action\",\"Del";
_job._download2 /*String*/ (parent._link,new String[]{"action","DeleteQuote","quotes",parent._sam});
 //BA.debugLineNum = 466;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 467;BA.debugLine="If job.Success Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 468;BA.debugLine="Dim fetchQ As HttpJob";
_fetchq = new b4a.example.httpjob();
 //BA.debugLineNum = 469;BA.debugLine="fetchQ.Initialize(\"Fetch_FetchedAPI\",Me)";
_fetchq._initialize /*String*/ (ba,"Fetch_FetchedAPI",parent);
 //BA.debugLineNum = 470;BA.debugLine="fetchQ.Download2(link,Array As String(\"action\",";
_fetchq._download2 /*String*/ (parent._link,new String[]{"action","Fetch_FetchedAPI"});
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 472;BA.debugLine="ToastMessageShow(\"Facts Deleted\", False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Facts Deleted"),parent.__c.False);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 474;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _clvsaverecipe_itemclick(int _index,Object _value) throws Exception{
b4a.example.httpjob _job2 = null;
 //BA.debugLineNum = 599;BA.debugLine="Private Sub clvSaveRecipe_ItemClick (Index As Int,";
 //BA.debugLineNum = 600;BA.debugLine="recipeClick = clvRecipe.GetPanel(Index).GetView(0";
_recipeclick = _clvrecipe._getpanel(_index).GetView((int) (0));
 //BA.debugLineNum = 601;BA.debugLine="recipeItemClick = recipeClick.GetView(0).Text";
_recipeitemclick = _recipeclick.GetView((int) (0)).getText();
 //BA.debugLineNum = 602;BA.debugLine="Log(recipeItemClick)";
__c.LogImpl("12031619",_recipeitemclick,0);
 //BA.debugLineNum = 603;BA.debugLine="Log(\"First Job was Success\")";
__c.LogImpl("12031620","First Job was Success",0);
 //BA.debugLineNum = 604;BA.debugLine="Dim job2 As HttpJob";
_job2 = new b4a.example.httpjob();
 //BA.debugLineNum = 605;BA.debugLine="job2.Initialize(\"ViewRecipe\",Me)";
_job2._initialize /*String*/ (ba,"ViewRecipe",this);
 //BA.debugLineNum = 606;BA.debugLine="job2.Download2(link,Array As String(\"action\",\"Vie";
_job2._download2 /*String*/ (_link,new String[]{"action","ViewRecipe","clickedRecipe",_recipeitemclick});
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return "";
}
public void  _deletefacts(String _fact) throws Exception{
ResumableSub_DeleteFacts rsub = new ResumableSub_DeleteFacts(this,_fact);
rsub.resume(ba, null);
}
public static class ResumableSub_DeleteFacts extends BA.ResumableSub {
public ResumableSub_DeleteFacts(b4a.example.b4xmainpage parent,String _fact) {
this.parent = parent;
this._fact = _fact;
}
b4a.example.b4xmainpage parent;
String _fact;
b4a.example.httpjob _job = null;
b4a.example.httpjob _job1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 493;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 494;BA.debugLine="job.Initialize(\"DeleteFacts\",Me)";
_job._initialize /*String*/ (ba,"DeleteFacts",parent);
 //BA.debugLineNum = 495;BA.debugLine="job.Download2(link,Array As String(\"action\",\"Dele";
_job._download2 /*String*/ (parent._link,new String[]{"action","DeleteFacts","fact",_fact});
 //BA.debugLineNum = 497;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 498;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 499;BA.debugLine="Dim job1 As HttpJob";
_job1 = new b4a.example.httpjob();
 //BA.debugLineNum = 500;BA.debugLine="job1.Initialize(\"Displayfacts\",Me)";
_job1._initialize /*String*/ (ba,"Displayfacts",parent);
 //BA.debugLineNum = 501;BA.debugLine="job1.Download2(link,Array As String(\"action\",\"Di";
_job1._download2 /*String*/ (parent._link,new String[]{"action","Displayfacts"});
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _display() throws Exception{
b4a.example.httpjob _fetchq = null;
b4a.example.httpjob _job1 = null;
 //BA.debugLineNum = 151;BA.debugLine="Public Sub display";
 //BA.debugLineNum = 152;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 153;BA.debugLine="xui.MsgboxAsync(\"Server connection is lost\",\"Off";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Server connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 154;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 156;BA.debugLine="Dim fetchQ As HttpJob";
_fetchq = new b4a.example.httpjob();
 //BA.debugLineNum = 157;BA.debugLine="fetchQ.Initialize(\"Fetch_FetchedAPI\",Me)";
_fetchq._initialize /*String*/ (ba,"Fetch_FetchedAPI",this);
 //BA.debugLineNum = 158;BA.debugLine="fetchQ.Download2(link,Array As String(\"action\",\"";
_fetchq._download2 /*String*/ (_link,new String[]{"action","Fetch_FetchedAPI"});
 //BA.debugLineNum = 160;BA.debugLine="Dim job1 As HttpJob";
_job1 = new b4a.example.httpjob();
 //BA.debugLineNum = 161;BA.debugLine="job1.Initialize(\"Displayfacts\",Me)";
_job1._initialize /*String*/ (ba,"Displayfacts",this);
 //BA.debugLineNum = 162;BA.debugLine="job1.Download2(link,Array As String(\"action\",\"Di";
_job1._download2 /*String*/ (_link,new String[]{"action","Displayfacts"});
 };
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _generatefacts_click() throws Exception{
b4a.example.httpjob _job = null;
 //BA.debugLineNum = 505;BA.debugLine="Private Sub GenerateFacts_Click";
 //BA.debugLineNum = 506;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 507;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"O";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 508;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 510;BA.debugLine="lblFacts.Text = \"Generating...\"";
_lblfacts.setText(BA.ObjectToCharSequence("Generating..."));
 //BA.debugLineNum = 511;BA.debugLine="fact_text.Text = \"please wait\"";
_fact_text.setText(BA.ObjectToCharSequence("please wait"));
 //BA.debugLineNum = 513;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 514;BA.debugLine="Job.Initialize(\"Fetch_APIFacts\",Me)";
_job._initialize /*String*/ (ba,"Fetch_APIFacts",this);
 //BA.debugLineNum = 515;BA.debugLine="Job.Download(\"https://api.api-ninjas.com/v1/fact";
_job._download /*String*/ ("https://api.api-ninjas.com/v1/facts?limit=1");
 //BA.debugLineNum = 516;BA.debugLine="Job.GetRequest.SetHeader(\"X-Api-Key\",\"6O79o8H3eJ";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("X-Api-Key","6O79o8H3eJqGltJKcyvaDw==5z1gkJXvi9hpHZoX");
 //BA.debugLineNum = 517;BA.debugLine="saveFacts.Visible = True";
_savefacts.setVisible(__c.True);
 };
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 67;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public void  _insert(String _category_text,String _quotes_text,String _author_text) throws Exception{
ResumableSub_insert rsub = new ResumableSub_insert(this,_category_text,_quotes_text,_author_text);
rsub.resume(ba, null);
}
public static class ResumableSub_insert extends BA.ResumableSub {
public ResumableSub_insert(b4a.example.b4xmainpage parent,String _category_text,String _quotes_text,String _author_text) {
this.parent = parent;
this._category_text = _category_text;
this._quotes_text = _quotes_text;
this._author_text = _author_text;
}
b4a.example.b4xmainpage parent;
String _category_text;
String _quotes_text;
String _author_text;
b4a.example.httpjob _insertq = null;
b4a.example.httpjob _job = null;
b4a.example.httpjob _fetchq1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 379;BA.debugLine="Dim insertQ As HttpJob";
_insertq = new b4a.example.httpjob();
 //BA.debugLineNum = 380;BA.debugLine="insertQ.Initialize(\"Insert_FetchedAPI\",Me)";
_insertq._initialize /*String*/ (ba,"Insert_FetchedAPI",parent);
 //BA.debugLineNum = 381;BA.debugLine="insertQ.Download2(link,Array As String(\"action\",\"";
_insertq._download2 /*String*/ (parent._link,new String[]{"action","Insert_FetchedAPI","quotes_text",_quotes_text,"author_text",_author_text,"category_text",_category_text});
 //BA.debugLineNum = 382;BA.debugLine="Wait For (insertQ) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_insertq));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 383;BA.debugLine="If insertQ.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_insertq._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 384;BA.debugLine="Log(\"First Query was success\")";
parent.__c.LogImpl("11179654","First Query was success",0);
 //BA.debugLineNum = 386;BA.debugLine="Dim fetchQ1 As HttpJob";
_fetchq1 = new b4a.example.httpjob();
 //BA.debugLineNum = 387;BA.debugLine="fetchQ1.Initialize(\"Fetch_FetchedAPI\",Me)";
_fetchq1._initialize /*String*/ (ba,"Fetch_FetchedAPI",parent);
 //BA.debugLineNum = 388;BA.debugLine="fetchQ1.Download2(link,Array As String(\"action\",";
_fetchq1._download2 /*String*/ (parent._link,new String[]{"action","Fetch_FetchedAPI"});
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _insertfacts(String _fact) throws Exception{
ResumableSub_InsertFacts rsub = new ResumableSub_InsertFacts(this,_fact);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertFacts extends BA.ResumableSub {
public ResumableSub_InsertFacts(b4a.example.b4xmainpage parent,String _fact) {
this.parent = parent;
this._fact = _fact;
}
b4a.example.b4xmainpage parent;
String _fact;
b4a.example.httpjob _job = null;
b4a.example.httpjob _job1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 480;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 481;BA.debugLine="job.Initialize(\"Insertfacts\",Me)";
_job._initialize /*String*/ (ba,"Insertfacts",parent);
 //BA.debugLineNum = 482;BA.debugLine="job.Download2(link,Array As String(\"action\",\"Inse";
_job._download2 /*String*/ (parent._link,new String[]{"action","Insertfacts","fact",_fact});
 //BA.debugLineNum = 484;BA.debugLine="Wait For (job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 485;BA.debugLine="If job.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 486;BA.debugLine="Dim job1 As HttpJob";
_job1 = new b4a.example.httpjob();
 //BA.debugLineNum = 487;BA.debugLine="job1.Initialize(\"Displayfacts\",Me)";
_job1._initialize /*String*/ (ba,"Displayfacts",parent);
 //BA.debugLineNum = 488;BA.debugLine="job1.Download2(link,Array As String(\"action\",\"Di";
_job1._download2 /*String*/ (parent._link,new String[]{"action","Displayfacts"});
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _itemcategory() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub ItemCategory";
 //BA.debugLineNum = 142;BA.debugLine="spnCategory.AddAll(Array As String(\"age\", \"alone\"";
_spncategory.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"age","alone","amazing","anger","architecture","art","attitude","beauty","best","birthday","business","car","change","communication","computers","cool","courage","dad","dating","death","design","dreams","education","environmental","equality","experience","failure","faith","family","famous","fear","fitness","food","forgiveness","freedom","friendship","funny","future","god","good","government","graduation","great","happiness","health","history","home","hope","humor","imagination","inspirational","intelligence","jealousy","knowledge","leadership","learning","legal","life","love","marriage","medical","men","mom","money","morning","movies","success"}));
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.example.httpjob _job) throws Exception{
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.List _quotes = null;
anywheresoftware.b4a.objects.collections.Map _quotemap = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
int[] _y = null;
 //BA.debugLineNum = 168;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 169;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 170;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ ();
 //BA.debugLineNum = 171;BA.debugLine="Log(\"Back from Job:\" & Job.JobName)";
__c.LogImpl("11114115","Back from Job:"+_job._jobname /*String*/ ,0);
 //BA.debugLineNum = 172;BA.debugLine="Log(\"Response from server: \" & res)";
__c.LogImpl("11114116","Response from server: "+_res,0);
 //BA.debugLineNum = 174;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 175;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 177;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("11114121","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
 //BA.debugLineNum = 178;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 179;BA.debugLine="JSON.Initialize(res)";
_json.Initialize(_res);
 //BA.debugLineNum = 181;BA.debugLine="If res.Contains(\"Record_Exists\") Then 'Facts Inse";
if (_res.contains("Record_Exists")) { 
 //BA.debugLineNum = 182;BA.debugLine="ToastMessageShow(\"Facts already saved\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Facts already saved"),__c.False);
 };
 //BA.debugLineNum = 185;BA.debugLine="If Job.Success = True Then";
if (_job._success /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 187;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"Fetch_API","Insert_FetchedAPI","DeleteQuote","Fetch_FetchedAPI","Fetch_APIFacts","Insertfacts","DeleteFacts","Displayfacts","Fetch_APIRecipe","Empty_recipe","ViewRecipe")) {
case 0: {
 //BA.debugLineNum = 191;BA.debugLine="Dim quotes As List";
_quotes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 192;BA.debugLine="quotes = JSON.NextArray";
_quotes = _json.NextArray();
 //BA.debugLineNum = 194;BA.debugLine="If quotes.Size > 0 Then";
if (_quotes.getSize()>0) { 
 //BA.debugLineNum = 196;BA.debugLine="Dim quoteMap As Map";
_quotemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 197;BA.debugLine="quoteMap = quotes.Get(0)";
_quotemap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_quotes.Get((int) (0))));
 //BA.debugLineNum = 198;BA.debugLine="If quoteMap.ContainsKey(\"quote\") And quoteMap";
if (_quotemap.ContainsKey((Object)("quote")) && _quotemap.ContainsKey((Object)("author"))) { 
 //BA.debugLineNum = 199;BA.debugLine="quote_text.Text = quoteMap.Get(\"quote\")";
_quote_text.setText(BA.ObjectToCharSequence(_quotemap.Get((Object)("quote"))));
 //BA.debugLineNum = 200;BA.debugLine="author.Text = \"--- \"&quoteMap.Get(\"author\")";
_author.setText(BA.ObjectToCharSequence("--- "+BA.ObjectToString(_quotemap.Get((Object)("author")))));
 };
 //BA.debugLineNum = 202;BA.debugLine="lblQuote.Text = \"Generate quote\"";
_lblquote.setText(BA.ObjectToCharSequence("Generate quote"));
 };
 //BA.debugLineNum = 204;BA.debugLine="Log(Job.GetString) ' Print the JSON response t";
__c.LogImpl("11114148",_job._getstring /*String*/ (),0);
 break; }
case 1: {
 break; }
case 2: {
 break; }
case 3: {
 //BA.debugLineNum = 211;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 212;BA.debugLine="li = parser.NextArray";
_li = _parser.NextArray();
 //BA.debugLineNum = 213;BA.debugLine="clvSaveQuotes.Clear";
_clvsavequotes._clear();
 //BA.debugLineNum = 214;BA.debugLine="If li.Size = 0 Then";
if (_li.getSize()==0) { 
 //BA.debugLineNum = 215;BA.debugLine="Log(\"No Item\")";
__c.LogImpl("11114159","No Item",0);
 }else {
 //BA.debugLineNum = 217;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step37 = 1;
final int limit37 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
 //BA.debugLineNum = 218;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 219;BA.debugLine="map = li.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_li.Get(_i)));
 //BA.debugLineNum = 221;BA.debugLine="categorylist = xui.CreatePanel(\"\")";
_categorylist = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 222;BA.debugLine="categorylist.SetLayoutAnimated(0, 0, 0, 100%";
_categorylist.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (56)));
 //BA.debugLineNum = 223;BA.debugLine="categorylist.LoadLayout(\"displayAuthor\")";
_categorylist.LoadLayout("displayAuthor",ba);
 //BA.debugLineNum = 224;BA.debugLine="clvSaveQuotes.Add(categorylist, \"\")";
_clvsavequotes._add(_categorylist,(Object)(""));
 //BA.debugLineNum = 226;BA.debugLine="authorContainer.Text = map.Get(\"category\")";
_authorcontainer.setText(BA.ObjectToCharSequence(_map.Get((Object)("category"))));
 }
};
 };
 break; }
case 4: {
 //BA.debugLineNum = 233;BA.debugLine="Dim quotes As List";
_quotes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 234;BA.debugLine="quotes = JSON.NextArray";
_quotes = _json.NextArray();
 //BA.debugLineNum = 236;BA.debugLine="If quotes.Size > 0 Then";
if (_quotes.getSize()>0) { 
 //BA.debugLineNum = 238;BA.debugLine="Dim quoteMap As Map";
_quotemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 239;BA.debugLine="quoteMap = quotes.Get(0)";
_quotemap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_quotes.Get((int) (0))));
 //BA.debugLineNum = 240;BA.debugLine="If quoteMap.ContainsKey(\"fact\") Then";
if (_quotemap.ContainsKey((Object)("fact"))) { 
 //BA.debugLineNum = 241;BA.debugLine="fact_text.Text = quoteMap.Get(\"fact\")";
_fact_text.setText(BA.ObjectToCharSequence(_quotemap.Get((Object)("fact"))));
 };
 //BA.debugLineNum = 243;BA.debugLine="lblFacts.Text = \"Generate Facts\"";
_lblfacts.setText(BA.ObjectToCharSequence("Generate Facts"));
 //BA.debugLineNum = 244;BA.debugLine="Dim y(6) As Int = Array As Int(0,256,0,128,0,";
_y = new int[]{(int) (0),(int) (256),(int) (0),(int) (128),(int) (0),(int) (256)};
 //BA.debugLineNum = 245;BA.debugLine="fact_text.TextColor = Colors.RGB(Rnd(y(0),y(1";
_fact_text.setTextColor(__c.Colors.RGB(__c.Rnd(_y[(int) (0)],_y[(int) (1)]),__c.Rnd(_y[(int) (2)],_y[(int) (3)]),__c.Rnd(_y[(int) (4)],_y[(int) (5)])));
 };
 //BA.debugLineNum = 247;BA.debugLine="Log(Job.GetString) ' Print the JSON response t";
__c.LogImpl("11114191",_job._getstring /*String*/ (),0);
 break; }
case 5: {
 break; }
case 6: {
 break; }
case 7: {
 //BA.debugLineNum = 252;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 253;BA.debugLine="li = parser.NextArray";
_li = _parser.NextArray();
 //BA.debugLineNum = 254;BA.debugLine="clvSaveFacts.Clear";
_clvsavefacts._clear();
 //BA.debugLineNum = 255;BA.debugLine="If li.Size = 0 Then";
if (_li.getSize()==0) { 
 //BA.debugLineNum = 256;BA.debugLine="Log(\"No Item\")";
__c.LogImpl("11114200","No Item",0);
 }else {
 //BA.debugLineNum = 258;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step70 = 1;
final int limit70 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
 //BA.debugLineNum = 259;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 260;BA.debugLine="map = li.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_li.Get(_i)));
 //BA.debugLineNum = 262;BA.debugLine="factsview = xui.CreatePanel(\"\")";
_factsview = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 263;BA.debugLine="factsview.SetLayoutAnimated(0, 0, 0, 100%x,";
_factsview.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (56)));
 //BA.debugLineNum = 264;BA.debugLine="factsview.LoadLayout(\"DisplayFacts\")";
_factsview.LoadLayout("DisplayFacts",ba);
 //BA.debugLineNum = 265;BA.debugLine="clvSaveFacts.Add(factsview, \"\")";
_clvsavefacts._add(_factsview,(Object)(""));
 //BA.debugLineNum = 267;BA.debugLine="factsContainer.Text = map.Get(\"facts\")";
_factscontainer.setText(BA.ObjectToCharSequence(_map.Get((Object)("facts"))));
 }
};
 };
 break; }
case 8: {
 //BA.debugLineNum = 275;BA.debugLine="Dim quotes As List";
_quotes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 276;BA.debugLine="quotes = JSON.NextArray";
_quotes = _json.NextArray();
 //BA.debugLineNum = 277;BA.debugLine="clvRecipe.Clear";
_clvrecipe._clear();
 //BA.debugLineNum = 278;BA.debugLine="If quotes.Size > 0 Then";
if (_quotes.getSize()>0) { 
 //BA.debugLineNum = 280;BA.debugLine="For i = 0 To quotes.Size - 1";
{
final int step85 = 1;
final int limit85 = (int) (_quotes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit85 ;_i = _i + step85 ) {
 //BA.debugLineNum = 281;BA.debugLine="Dim quoteMap As Map";
_quotemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 282;BA.debugLine="quoteMap = quotes.Get(i)";
_quotemap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_quotes.Get(_i)));
 //BA.debugLineNum = 283;BA.debugLine="item_recipe = xui.CreatePanel(\"\")";
_item_recipe = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 284;BA.debugLine="item_recipe.SetLayoutAnimated(0,0,0,100%x,90";
_item_recipe.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (90),ba));
 //BA.debugLineNum = 285;BA.debugLine="item_recipe.LoadLayout(\"RecipeItem\")";
_item_recipe.LoadLayout("RecipeItem",ba);
 //BA.debugLineNum = 286;BA.debugLine="clvRecipe.Add(item_recipe,\"\")";
_clvrecipe._add(_item_recipe,(Object)(""));
 //BA.debugLineNum = 288;BA.debugLine="If quoteMap.ContainsKey(\"title\") And quoteMap";
if (_quotemap.ContainsKey((Object)("title")) && _quotemap.ContainsKey((Object)("ingredients")) && _quotemap.ContainsKey((Object)("servings")) && _quotemap.ContainsKey((Object)("instructions"))) { 
 //BA.debugLineNum = 290;BA.debugLine="Title.Text = quoteMap.Get(\"title\")";
_title.setText(BA.ObjectToCharSequence(_quotemap.Get((Object)("title"))));
 //BA.debugLineNum = 291;BA.debugLine="Servings.Text = quoteMap.Get(\"servings\")";
_servings.setText(BA.ObjectToCharSequence(_quotemap.Get((Object)("servings"))));
 //BA.debugLineNum = 292;BA.debugLine="Ingredients.Text = quoteMap.Get(\"ingredients";
_ingredients.setText(BA.ObjectToCharSequence(_quotemap.Get((Object)("ingredients"))));
 //BA.debugLineNum = 293;BA.debugLine="Instruction.Text = quoteMap.Get(\"instruction";
_instruction.setText(BA.ObjectToCharSequence(_quotemap.Get((Object)("instructions"))));
 };
 }
};
 //BA.debugLineNum = 297;BA.debugLine="lblRecipe.Text = \"Search Recipe\"";
_lblrecipe.setText(BA.ObjectToCharSequence("Search Recipe"));
 }else {
 //BA.debugLineNum = 301;BA.debugLine="item_recipe = xui.CreatePanel(\"\")";
_item_recipe = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 302;BA.debugLine="item_recipe.SetLayoutAnimated(0,0,0,100%x,90%";
_item_recipe.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (90),ba));
 //BA.debugLineNum = 303;BA.debugLine="item_recipe.LoadLayout(\"RecipeItem\")";
_item_recipe.LoadLayout("RecipeItem",ba);
 //BA.debugLineNum = 304;BA.debugLine="clvRecipe.Add(item_recipe,\"\")";
_clvrecipe._add(_item_recipe,(Object)(""));
 //BA.debugLineNum = 306;BA.debugLine="lblRecipe.Text = \"Search Recipe\"";
_lblrecipe.setText(BA.ObjectToCharSequence("Search Recipe"));
 //BA.debugLineNum = 307;BA.debugLine="Title.Text = \"No Recipe found!\"";
_title.setText(BA.ObjectToCharSequence("No Recipe found!"));
 //BA.debugLineNum = 308;BA.debugLine="Servings.Text = \"try different keyword\"";
_servings.setText(BA.ObjectToCharSequence("try different keyword"));
 //BA.debugLineNum = 309;BA.debugLine="Ingredients.Text = \"\"";
_ingredients.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 310;BA.debugLine="Instruction.Text = \"\"";
_instruction.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 312;BA.debugLine="Log(Job.GetString) ' Print the JSON response t";
__c.LogImpl("11114256",_job._getstring /*String*/ (),0);
 break; }
case 9: {
 //BA.debugLineNum = 315;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 316;BA.debugLine="li = parser.NextArray";
_li = _parser.NextArray();
 //BA.debugLineNum = 317;BA.debugLine="clvSaveFacts.Clear";
_clvsavefacts._clear();
 //BA.debugLineNum = 318;BA.debugLine="If li.Size = 0 Then";
if (_li.getSize()==0) { 
 //BA.debugLineNum = 319;BA.debugLine="Log(\"No Item\")";
__c.LogImpl("11114263","No Item",0);
 }else {
 //BA.debugLineNum = 321;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step119 = 1;
final int limit119 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit119 ;_i = _i + step119 ) {
 //BA.debugLineNum = 322;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 323;BA.debugLine="map = li.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_li.Get(_i)));
 //BA.debugLineNum = 325;BA.debugLine="recipeView = xui.CreatePanel(\"\")";
_recipeview = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 326;BA.debugLine="recipeView.SetLayoutAnimated(0, 0, 0, 100%x,";
_recipeview.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (56)));
 //BA.debugLineNum = 327;BA.debugLine="recipeView.LoadLayout(\"Displayrecipe\")";
_recipeview.LoadLayout("Displayrecipe",ba);
 //BA.debugLineNum = 328;BA.debugLine="clvRecipe.Add(recipeView, \"\")";
_clvrecipe._add(_recipeview,(Object)(""));
 //BA.debugLineNum = 330;BA.debugLine="titleContainer.Text = map.Get(\"title\")";
_titlecontainer.setText(BA.ObjectToCharSequence(_map.Get((Object)("title"))));
 }
};
 };
 break; }
case 10: {
 //BA.debugLineNum = 335;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 336;BA.debugLine="li = parser.NextArray";
_li = _parser.NextArray();
 //BA.debugLineNum = 337;BA.debugLine="clvSaveFacts.Clear";
_clvsavefacts._clear();
 //BA.debugLineNum = 338;BA.debugLine="If li.Size = 0 Then";
if (_li.getSize()==0) { 
 //BA.debugLineNum = 339;BA.debugLine="Log(\"No Item\")";
__c.LogImpl("11114283","No Item",0);
 }else {
 //BA.debugLineNum = 341;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step136 = 1;
final int limit136 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit136 ;_i = _i + step136 ) {
 //BA.debugLineNum = 342;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 343;BA.debugLine="map = li.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_li.Get(_i)));
 //BA.debugLineNum = 345;BA.debugLine="xui.MsgboxAsync(map.Get(\"title\")&map.Get(\"se";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence(BA.ObjectToString(_map.Get((Object)("title")))+BA.ObjectToString(_map.Get((Object)("serving")))+BA.ObjectToString(_map.Get((Object)("ingredient")))+BA.ObjectToString(_map.Get((Object)("instruction")))),BA.ObjectToCharSequence(_map.Get((Object)("title"))));
 }
};
 };
 break; }
}
;
 }else {
 //BA.debugLineNum = 352;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("11114296","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 353;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage /*String*/ ),__c.True);
 //BA.debugLineNum = 355;BA.debugLine="If Job.JobName = \"Fetch_API\" Then";
if ((_job._jobname /*String*/ ).equals("Fetch_API")) { 
 //BA.debugLineNum = 356;BA.debugLine="lblQuote.Text = \"Connecting...\"";
_lblquote.setText(BA.ObjectToCharSequence("Connecting..."));
 //BA.debugLineNum = 357;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 358;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 361;BA.debugLine="If Job.JobName = \"Fetch_FetchedAPI\" Then";
if ((_job._jobname /*String*/ ).equals("Fetch_FetchedAPI")) { 
 //BA.debugLineNum = 362;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 363;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 365;BA.debugLine="If Job.JobName = \"Insert_FetchedAPI\" Then";
if ((_job._jobname /*String*/ ).equals("Insert_FetchedAPI")) { 
 //BA.debugLineNum = 366;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 367;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 371;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return "";
}
public String  _randomize_click() throws Exception{
b4a.example.httpjob _job = null;
 //BA.debugLineNum = 417;BA.debugLine="Private Sub randomize_Click";
 //BA.debugLineNum = 418;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 419;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"O";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 420;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 422;BA.debugLine="lblQuote.Text = \"Generating...\"";
_lblquote.setText(BA.ObjectToCharSequence("Generating..."));
 //BA.debugLineNum = 423;BA.debugLine="quote_text.Text = \"please wait\"";
_quote_text.setText(BA.ObjectToCharSequence("please wait"));
 //BA.debugLineNum = 424;BA.debugLine="author.Text = \"\"";
_author.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 425;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 426;BA.debugLine="Job.Initialize(\"Fetch_API\",Me)";
_job._initialize /*String*/ (ba,"Fetch_API",this);
 //BA.debugLineNum = 427;BA.debugLine="Job.Download(\"https://api.api-ninjas.com/v1/quot";
_job._download /*String*/ ("https://api.api-ninjas.com/v1/quotes?category="+_category);
 //BA.debugLineNum = 428;BA.debugLine="Job.GetRequest.SetHeader(\"X-Api-Key\",\"6O79o8H3eJ";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("X-Api-Key","6O79o8H3eJqGltJKcyvaDw==5z1gkJXvi9hpHZoX");
 };
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return "";
}
public String  _save_click() throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Private Sub save_Click";
 //BA.debugLineNum = 433;BA.debugLine="Log(\"quote: \"&quote_text.Text)";
__c.LogImpl("11376257","quote: "+_quote_text.getText(),0);
 //BA.debugLineNum = 434;BA.debugLine="Log(\"author: \"&author.Text)";
__c.LogImpl("11376258","author: "+_author.getText(),0);
 //BA.debugLineNum = 435;BA.debugLine="Log(\"category: \"&category)";
__c.LogImpl("11376259","category: "+_category,0);
 //BA.debugLineNum = 436;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 437;BA.debugLine="xui.MsgboxAsync(\"Server connection is lost\",\"Off";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Server connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 438;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 440;BA.debugLine="insert(category,quote_text.Text,author.Text)";
_insert(_category,_quote_text.getText(),_author.getText());
 //BA.debugLineNum = 441;BA.debugLine="ToastMessageShow(\"Saved\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Saved"),__c.False);
 };
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return "";
}
public String  _savefacts_click() throws Exception{
b4a.example.httpjob _job1 = null;
 //BA.debugLineNum = 521;BA.debugLine="Private Sub saveFacts_Click";
 //BA.debugLineNum = 522;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 523;BA.debugLine="xui.MsgboxAsync(\"Server connection is lost\",\"Off";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Server connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 524;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 526;BA.debugLine="InsertFacts(fact_text.Text)";
_insertfacts(_fact_text.getText());
 //BA.debugLineNum = 527;BA.debugLine="ToastMessageShow(\"Saved\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Saved"),__c.False);
 //BA.debugLineNum = 528;BA.debugLine="Dim job1 As HttpJob";
_job1 = new b4a.example.httpjob();
 //BA.debugLineNum = 529;BA.debugLine="job1.Initialize(\"Displayfacts\",Me)";
_job1._initialize /*String*/ (ba,"Displayfacts",this);
 //BA.debugLineNum = 530;BA.debugLine="job1.Download2(link,Array As String(\"action\",\"Di";
_job1._download2 /*String*/ (_link,new String[]{"action","Displayfacts"});
 };
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return "";
}
public String  _searchrecipe_click() throws Exception{
boolean _input = false;
b4a.example.httpjob _job = null;
 //BA.debugLineNum = 577;BA.debugLine="Private Sub SearchRecipe_Click";
 //BA.debugLineNum = 578;BA.debugLine="Dim input As Boolean = txtRecipe.Text.Length > 0";
_input = _txtrecipe.getText().length()>0;
 //BA.debugLineNum = 579;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 580;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"O";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 581;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 583;BA.debugLine="If input Then";
if (_input) { 
 //BA.debugLineNum = 584;BA.debugLine="lblRecipe.Text = \"Searching...\"";
_lblrecipe.setText(BA.ObjectToCharSequence("Searching..."));
 //BA.debugLineNum = 585;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 586;BA.debugLine="Job.Initialize(\"Fetch_APIRecipe\",Me)";
_job._initialize /*String*/ (ba,"Fetch_APIRecipe",this);
 //BA.debugLineNum = 587;BA.debugLine="Job.Download(\"https://api.api-ninjas.com/v1/rec";
_job._download /*String*/ ("https://api.api-ninjas.com/v1/recipe?query="+_txtrecipe.getText());
 //BA.debugLineNum = 588;BA.debugLine="Job.GetRequest.SetHeader(\"X-Api-Key\",\"6O79o8H3e";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("X-Api-Key","6O79o8H3eJqGltJKcyvaDw==5z1gkJXvi9hpHZoX");
 }else {
 //BA.debugLineNum = 590;BA.debugLine="ToastMessageShow(\"empty field\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("empty field"),__c.False);
 };
 };
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return "";
}
public String  _setactionbarcolor(int _color) throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4j.object.JavaObject _window = null;
 //BA.debugLineNum = 107;BA.debugLine="Public Sub SetActionBarColor(Color As Int)";
 //BA.debugLineNum = 108;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 110;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 111;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
 //BA.debugLineNum = 112;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 113;BA.debugLine="cd.Initialize(Color, 0)";
_cd.Initialize(_color,(int) (0));
 //BA.debugLineNum = 114;BA.debugLine="jo.RunMethodJO(\"getActionBar\", Null).RunMethod(\"s";
_jo.RunMethodJO("getActionBar",(Object[])(__c.Null)).RunMethod("setBackgroundDrawable",new Object[]{(Object)(_cd.getObject())});
 //BA.debugLineNum = 116;BA.debugLine="If p.SdkVersion >= 21 Then";
if (_p.getSdkVersion()>=21) { 
 //BA.debugLineNum = 117;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 118;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
 //BA.debugLineNum = 119;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
 //BA.debugLineNum = 120;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
 //BA.debugLineNum = 121;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
 //BA.debugLineNum = 122;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(Colo";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_color)});
 };
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _spncategory_itemclick(int _position,Object _value) throws Exception{
b4a.example.httpjob _job = null;
 //BA.debugLineNum = 393;BA.debugLine="Private Sub spnCategory_ItemClick (Position As Int";
 //BA.debugLineNum = 394;BA.debugLine="Log(Value)";
__c.LogImpl("11245185",BA.ObjectToString(_value),0);
 //BA.debugLineNum = 395;BA.debugLine="If ss.GetMyIP = \"127.0.0.1\" Then";
if ((_ss.GetMyIP()).equals("127.0.0.1")) { 
 //BA.debugLineNum = 396;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"O";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 397;BA.debugLine="lblQuote.Text = \"Connecting...\"";
_lblquote.setText(BA.ObjectToCharSequence("Connecting..."));
 //BA.debugLineNum = 398;BA.debugLine="quote_text.Text = \"Connection error\"";
_quote_text.setText(BA.ObjectToCharSequence("Connection error"));
 //BA.debugLineNum = 399;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 401;BA.debugLine="lblQuote.Text = \"Generating...\"";
_lblquote.setText(BA.ObjectToCharSequence("Generating..."));
 //BA.debugLineNum = 402;BA.debugLine="quote_text.Text = \"please wait\"";
_quote_text.setText(BA.ObjectToCharSequence("please wait"));
 //BA.debugLineNum = 403;BA.debugLine="author.Text = \"\"";
_author.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 404;BA.debugLine="category = spnCategory.GetItem(Position)";
_category = _spncategory.GetItem(_position);
 //BA.debugLineNum = 405;BA.debugLine="Log(\"category: \"&category)";
__c.LogImpl("11245196","category: "+_category,0);
 //BA.debugLineNum = 407;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 408;BA.debugLine="Job.Initialize(\"Fetch_API\",Me)";
_job._initialize /*String*/ (ba,"Fetch_API",this);
 //BA.debugLineNum = 409;BA.debugLine="Job.Download(\"https://api.api-ninjas.com/v1/quot";
_job._download /*String*/ ("https://api.api-ninjas.com/v1/quotes?category="+_category);
 //BA.debugLineNum = 410;BA.debugLine="Job.GetRequest.SetHeader(\"X-Api-Key\",\"6O79o8H3eJ";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("X-Api-Key","6O79o8H3eJqGltJKcyvaDw==5z1gkJXvi9hpHZoX");
 //BA.debugLineNum = 412;BA.debugLine="randomize.Visible = True";
_randomize.setVisible(__c.True);
 //BA.debugLineNum = 413;BA.debugLine="save.Visible = True";
_save.setVisible(__c.True);
 };
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((b4a.example.httpjob) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
