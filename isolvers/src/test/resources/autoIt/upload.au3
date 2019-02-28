$fileName = $CmdLIne[1]
WinWaitActive("Open","","Edit1")
ControlFocus("Open","","Edit1")
ControlSetText("Open","","Edit1",$fileName)
ControlClick("Open","","Button1")