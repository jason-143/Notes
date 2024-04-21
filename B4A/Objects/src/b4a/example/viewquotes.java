package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class viewquotes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.viewquotes");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.viewquotes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _item_list = null;
public anywheresoftware.b4a.objects.LabelWrapper _quote_text = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblquote = null;
public anywheresoftware.b4a.objects.LabelWrapper _author = null;
public String _title = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 19;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"View\")";
_root.LoadLayout("View",ba);
 //BA.debugLineNum = 21;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 22;BA.debugLine="cs.Initialize.Size(24).Color(xui.Color_White).App";
_cs.Initialize().Size((int) (24)).Color(_xui.Color_White).Append(BA.ObjectToCharSequence("Quotes")).PopAll();
 //BA.debugLineNum = 23;BA.debugLine="B4XPages.SetTitle(Me,cs)";
_b4xpages._settitle /*String*/ (ba,this,(Object)(_cs.getObject()));
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
 //BA.debugLineNum = 5;BA.debugLine="Private Item_list As B4XView";
_item_list = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private quote_text As Label";
_quote_text = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblQuote As Label";
_lblquote = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private author As Label";
_author = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Public Title As String = \"\"";
_title = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _displayclickitem(String _quotes) throws Exception{
b4a.example.httpjob _job = null;
 //BA.debugLineNum = 81;BA.debugLine="Public Sub displayClickItem(quotes As String)";
 //BA.debugLineNum = 82;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
 //BA.debugLineNum = 83;BA.debugLine="job.Initialize(\"DisplayQuotes\",Me)";
_job._initialize /*String*/ (ba,"DisplayQuotes",this);
 //BA.debugLineNum = 84;BA.debugLine="job.Download2(B4XPages.MainPage.link,Array As Str";
_job._download2 /*String*/ (_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._link /*String*/ ,new String[]{"action","DisplayQuotes","quotes",_quotes});
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public String  _jobdone(b4a.example.httpjob _job) throws Exception{
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
 //BA.debugLineNum = 27;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 28;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 29;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="Log(\"Back from Job:\" & Job.JobName)";
__c.LogImpl("12293763","Back from Job:"+_job._jobname /*String*/ ,0);
 //BA.debugLineNum = 31;BA.debugLine="Log(\"Response from server: \" & res)";
__c.LogImpl("12293764","Response from server: "+_res,0);
 //BA.debugLineNum = 33;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 34;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 36;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("12293769","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
 //BA.debugLineNum = 37;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 38;BA.debugLine="JSON.Initialize(res)";
_json.Initialize(_res);
 //BA.debugLineNum = 39;BA.debugLine="If Job.Success = True Then";
if (_job._success /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 41;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"DisplayQuotes")) {
case 0: {
 //BA.debugLineNum = 44;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 45;BA.debugLine="li = parser.NextArray";
_li = _parser.NextArray();
 //BA.debugLineNum = 46;BA.debugLine="CustomListView1.Clear";
_customlistview1._clear();
 //BA.debugLineNum = 47;BA.debugLine="If li.Size = 0 Then";
if (_li.getSize()==0) { 
 //BA.debugLineNum = 48;BA.debugLine="Log(\"No Item\")";
__c.LogImpl("12293781","No Item",0);
 }else {
 //BA.debugLineNum = 50;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step19 = 1;
final int limit19 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit19 ;_i = _i + step19 ) {
 //BA.debugLineNum = 51;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 52;BA.debugLine="map = li.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_li.Get(_i)));
 //BA.debugLineNum = 54;BA.debugLine="Item_list = xui.CreatePanel(\"\")";
_item_list = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 55;BA.debugLine="Item_list.SetLayoutAnimated(0, 0, 0, 100%x,";
_item_list.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 56;BA.debugLine="Item_list.LoadLayout(\"Item\")";
_item_list.LoadLayout("Item",ba);
 //BA.debugLineNum = 57;BA.debugLine="CustomListView1.Add(Item_list, \"\")";
_customlistview1._add(_item_list,(Object)(""));
 //BA.debugLineNum = 59;BA.debugLine="quote_text.Text = map.Get(\"quote\")";
_quote_text.setText(BA.ObjectToCharSequence(_map.Get((Object)("quote"))));
 //BA.debugLineNum = 60;BA.debugLine="author.Text = map.Get(\"author\")";
_author.setText(BA.ObjectToCharSequence(_map.Get((Object)("author"))));
 //BA.debugLineNum = 61;BA.debugLine="lblQuote.Text = map.Get(\"category\")";
_lblquote.setText(BA.ObjectToCharSequence(_map.Get((Object)("category"))));
 }
};
 };
 break; }
}
;
 }else {
 //BA.debugLineNum = 69;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("12293802","Error: "+_job._errormessage /*String*/ ,0);
 //BA.debugLineNum = 70;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage /*String*/ ),__c.True);
 //BA.debugLineNum = 72;BA.debugLine="If res.Contains(\"\") Then";
if (_res.contains("")) { 
 //BA.debugLineNum = 73;BA.debugLine="xui.MsgboxAsync(\"Internet Connection is lost\",\"";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Internet Connection is lost"),BA.ObjectToCharSequence("Offline"));
 //BA.debugLineNum = 74;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 77;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
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
