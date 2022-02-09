package seleniumTestMethods;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import basemodel.BaseClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestScreenshotUsingAshot extends BaseClass {

public void screnshot2() throws IOException {
	
//System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
//WebDriver driver  = new ChromeDriver();	

driver.get("http://demo.guru99.com/test/guru99home/");


//driver.manage().window().maximize();
		
Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

ImageIO.write(screenshot.getImage(), "jpg", new File("C:\\Users\\jzo_0\\Pictures\\Saved Pictures\\ElementScreenshot.jpg"));

WebElement element = driver.findElement(By.xpath ("//*[@id=\"site-name\"]/a[1]/img"));

Screenshot screenshotElement= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver, element);
	
ImageIO.write(screenshotElement.getImage(), "jpg", new File("C:\\Users\\jzo_0\\Pictures\\Saved Pictures\\ElementScreenshot2.jpg"));


driver.get("http://demo.guru99.com/test/guru99home/");

WebElement logoElement = driver.findElement(By.xpath("//*[@id=\"site-name\"]/a[1]/img"));

Screenshot logoElementScreenshot = new AShot().takeScreenshot(driver, logoElement);
ImageIO.write(screenshotElement.getImage(), "jpg", new File("C:\\Users\\jzo_0\\Pictures\\Saved Pictures\\Guru99logo.png"));

// read the image to compare

BufferedImage expectedImage = ImageIO.read(new File("C:\\Users\\jzo_0\\Pictures\\Saved Pictures\\Guru99logo.png"));

BufferedImage actualImage = logoElementScreenshot.getImage();

// Create ImageDiffer object and call method makeDiff()

ImageDiffer imgDiff = new ImageDiffer();
ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);

if (diff.hasDiff() == true) {
    System.out.println("Images are same");

} else {
    System.out.println("Images are different");
}
driver.quit();


}
}