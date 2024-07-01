package BasePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	public static Properties p;

	@BeforeMethod
	public void Open() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KAIPU VINOD REDDY\\eclipse-workspace\\KosmikHospitalManagementSystem\\MyDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\KAIPU VINOD REDDY\\eclipse-workspace\\KosmikHospitalManagementSystem\\src\\data\\java\\Data\\MyData");

		p = new Properties();

		p.load(fis);

	}

}
