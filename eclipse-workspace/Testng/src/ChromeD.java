import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeD {

	public static void main(String[] args) {
   System.setProperty("Webdriver.chromedriver", "‪C:\\Users\\admin\\eclipse-workspace\\Testng\\resource\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.amazon.in/");
	}

}
