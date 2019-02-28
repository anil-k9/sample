;$username = $CmdLIne[1]
;$password = $CmdLine[2]

WinWaitActive("the-internet.herokuapp.com/basic_auth - Google Chrome","","Intermediate D3D Window1")

If WinExists("the-internet.herokuapp.com/basic_auth - Google Chrome") Then

	ControlFocus("the-internet.herokuapp.com/basic_auth - Google Chrome","","Intermediate D3D Window1")

	Send("Test")
	Send("{TAB}")

	Send("Test")
	Send("{TAB}")

	Send("{TAB} {ENTER}")

EndIf