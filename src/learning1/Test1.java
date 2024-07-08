import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


package learning1;

public class Test1 {
	
	
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			String name= "rahul";
			System.setProperty("webdriver.chrome.driver", "C://Automation//WebDrivers//chromedriver_win32//chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new  ChromeDriver(co);
			//System.setProperty("webdriver.edge.driver","C:\\Automation\\edge\\msedgedriver.exe");
			EdgeOptions eg = new EdgeOptions();
			//eg.addArguments("--remote-allow-origins=*");
		    //WebDriver driver = new EdgeDriver(eg);
		    //String password = getPassword(driver);
		    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		    driver.findElement(By.id("inputUsername")).sendKeys(name);
		    driver.findElement(By.name("inputPassword")).sendKeys(password);
		    driver.findElement(By.className("signInBtn")).click();
		    Thread.sleep(2000);

	}

	}

