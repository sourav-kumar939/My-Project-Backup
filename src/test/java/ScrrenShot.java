import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScrrenShot {

	public static void screenShot(WebDriver driver) {
		Date date= new Date();
		String time=date.toString().replace(":", "-").replace(" ", "-");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D:/ScreenShot/"+time+".jpg"));
			System.out.println("Screenshot Taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
