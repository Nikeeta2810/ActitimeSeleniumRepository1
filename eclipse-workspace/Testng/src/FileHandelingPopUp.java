import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileHandelingPopUp {

	public static void upLoadfile(String path) throws AWTException, InterruptedException {
    StringSelection ss=new StringSelection(path);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    Thread.sleep(3000);
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(3000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
	}
    public static void main(String[] args) throws AWTException, InterruptedException
    {
	 String filepath="C:\\Users\\admin\\Pictures\\Screenshots"	;
	 System.setProperty("WebDriver.chromedriver", "‪C:\\Users\\admin\\eclipse-workspace\\Testng\\resource\\chromedriver.exe");
	 WebDriver wb=new ChromeDriver();
	 wb.get("https://www.gmail.com");
	 wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 wb.findElement(By.id("identifierId")).sendKeys("nickgup9@gmail.com");
	 Actions act=new Actions(wb);
	 act.sendKeys(Keys.ENTER).perform();
	 wb.findElement(By.name("password")).sendKeys("nikeeta123");
	 act.sendKeys(Keys.ENTER).perform();
	 wb.findElement(By.xpath("//div[text()='COMPOSE']")).click();
	 wb.findElement(By.xpath("//div[@aria-label='Attach files']/div/div")).click();
	 upLoadfile(filepath);
	 act.sendKeys(Keys.ENTER).perform();
	}
}
