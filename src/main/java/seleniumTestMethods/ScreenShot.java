package seleniumTestMethods;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import basemodel.BaseClass;

import org.apache.commons.io.FileUtils;
import java.io.File;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;


public class ScreenShot extends BaseClass{
    public final String DRIVER_PATH = "Drivers/chromedriver";
    public final String DRIVER_TYPE = "webdriver.chrome.driver";
   // public WebDriver driver;
    public final String BASE_URL = "https://www.bbc.com/";
    public final String FILE_PATH = "C:\\Users\\jzo_0\\Pictures\\Saved Pictures\\screenshot1.png";
    public final String IMAGE_PATH = "//*[@id=\"page\"]/section[3]/div/ul/li[1]/div/div[2]/h3/a";

    /*  @BeforeTest
   public void beforeTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications","--ignore-certificate-errors","--disable-extensions");
        System.setProperty(DRIVER_TYPE,DRIVER_PATH);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }*/

    @Test (priority = 0)
    public void TakeScreenShot() throws Exception {
    	 driver.get(BASE_URL);
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(FILE_PATH);
        FileUtils.copyFile(SrcFile, DestFile);
    }

    @Test (priority = 1)
    public void TakeScreenShotAllPage() throws Exception{
        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\jzo_0\\Pictures\\Saved Pictures\\screenshot3.png"));
    }

    @Test (priority = 2)
    public void OneElementScreenShot() throws Exception{
        WebElement oneImage = driver.findElement(By.xpath(IMAGE_PATH));
        File sourceFile = oneImage.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("C:\\Users\\jzo_0\\Pictures\\Saved Pictures\\screenshot4.png"));
    }

    @AfterClass
    public void CloseDriver(){
        driver.close();

    }
}