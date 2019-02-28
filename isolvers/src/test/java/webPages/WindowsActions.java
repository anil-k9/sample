package webPages;

import java.io.IOException;

public class WindowsActions {
	
	public static void uploadFile(String path)
	{
		String workingDir = System.getProperty("user.dir");
		
		try
		{
			Runtime.getRuntime().exec("\""+workingDir+"\\src\\test\\resources\\autoIt\\upload.exe\" \""+workingDir+path+"\"");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
