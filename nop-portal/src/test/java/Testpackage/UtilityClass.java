package Testpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
	static WebDriver driver;
	public void excelsheet() throws EncryptedDocumentException, IOException {
		String path="D:\\New folder";
		FileInputStream file= new FileInputStream(path);
		
		String value=WorkbookFactory.create(file).getSheet("testdata").getRow(2).getCell(3).getStringCellValue();
		System.out.println(value);
		
	}
	
	public void screenshot() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\majog\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		
		
		
		
	}
	public static String timestamp() {
		return new SimpleDateFormat("YY_MM_dd_HH_mm_ss").format(new Date());
	}
	
	public static void TakeScreenshot(String fileName) throws IOException {
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("E:\\" + fileName+" .jpg"+" "+ timestamp()));
		
	}

}


