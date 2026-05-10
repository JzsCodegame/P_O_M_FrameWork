package basemodel;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class BaseClass {

	public static WebDriver driver;
	public static WebDriver driver_firefox;
	public static WebDriver edgedriver;
	public static String BaseUrl;
	public static String colorStreet;
	public static WebDriverWait Ex;
	public static JavascriptExecutor js1;
		@BeforeSuite()
			public void config() {
				
				String browser = System.getProperty("browser", "chrome").trim().toLowerCase();
				if ("edge".equals(browser)) {
					WebDriverManager.edgedriver().setup();
					EdgeOptions edgeOptions = new EdgeOptions();
					String edgeBinary = resolveEdgeBinary();
					if (edgeBinary != null) {
						edgeOptions.setBinary(edgeBinary);
					}
					driver = new EdgeDriver(edgeOptions);
				} else {
					WebDriverManager.chromedriver().setup();
					// Configure only the browser used by this suite to avoid failing on
					// unnecessary driver downloads in restricted network environments.
					ChromeOptions options = new ChromeOptions();
					String chromeBinary = resolveChromeBinary();
					if (chromeBinary != null) {
						options.setBinary(chromeBinary);
					}
					driver = new ChromeDriver(options);
				}
		//edgedriver = new EdgeDriver();
		//driver_firefox = new FirefoxDriver();
		//driver_firefox = new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
	    //System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		BaseUrl = "http://automationpractice.com/index.php";
		colorStreet= "https://www.colorstreet.com/home/account/register";
	    js1 = (JavascriptExecutor) driver;
		
		
	}
	
	@BeforeTest(groups={"A","B"})
	public void setup() {
              // System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
             //driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	      
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Ex =new WebDriverWait(driver, 10);
	}
	
		@AfterSuite(alwaysRun = true)
		public void teardown() {
		if (driver != null) {
			driver.quit();
		}
		}
		
		private String resolveChromeBinary() {
			String binaryFromProperty = System.getProperty("chrome.binary");
			if (isFilePresent(binaryFromProperty)) {
				return binaryFromProperty;
			}
			String binaryFromEnv = System.getenv("CHROME_BIN");
			if (isFilePresent(binaryFromEnv)) {
				return binaryFromEnv;
			}
			String[] macCandidates = new String[] {
					"/Applications/Google Chrome.app/Contents/MacOS/Google Chrome",
					"/Applications/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing",
					"/Applications/Chromium.app/Contents/MacOS/Chromium"
			};
			for (String candidate : macCandidates) {
				if (isFilePresent(candidate)) {
					return candidate;
				}
			}
			return null;
		}
		
		private boolean isFilePresent(String path) {
			return path != null && !path.trim().isEmpty() && new File(path).exists();
		}
		
		private String resolveEdgeBinary() {
			String binaryFromProperty = System.getProperty("edge.binary");
			if (isFilePresent(binaryFromProperty)) {
				return binaryFromProperty;
			}
			String binaryFromEnv = System.getenv("EDGE_BIN");
			if (isFilePresent(binaryFromEnv)) {
				return binaryFromEnv;
			}
			String[] macCandidates = new String[] {
					"/Applications/Microsoft Edge.app/Contents/MacOS/Microsoft Edge",
					"/Applications/Microsoft Edge Beta.app/Contents/MacOS/Microsoft Edge Beta",
					"/Applications/Microsoft Edge Dev.app/Contents/MacOS/Microsoft Edge Dev"
			};
			for (String candidate : macCandidates) {
				if (isFilePresent(candidate)) {
					return candidate;
				}
			}
			return null;
		}
		
	}
