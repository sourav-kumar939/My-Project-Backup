package TestNGDemo.Library;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Utility {
	
	public static void CaptureScreenshot(WebDriver driver) throws Exception {
		
		
		// 1. For File type
		Date currentdate=new Date();
		String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/"+screenshotfilename+".png"));
		System.out.println("Screenshot saved successfully");
		
		// 2. For BASE64 type
//		String base64=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr=Base64.getDecoder().decode(base64);
//		FileOutputStream fos= new FileOutputStream(new File("./ScreenShots/"+screenshotfilename+".jpeg"));
//		fos.write(byteArr);
//		fos.close();
		
		// 3. For Byte type
//		byte[] byteArr=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//		FileOutputStream fos= new FileOutputStream(new File("./ScreenShots/"+screenshotfilename+".jpg"));
//		fos.write(byteArr);
//		fos.close();
	}
	
	public static void CaptureScreenshot_providingName(WebDriver driver, String screenshotName) throws Exception{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/"+screenshotName+".png"));
		System.out.println("Screenshot saved successfully");
		
		
	}

}
