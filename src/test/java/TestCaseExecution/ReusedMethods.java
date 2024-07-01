package TestCaseExecution;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ReusedMethods extends ExecutionClass {

	public WebElement xp(String d) {
		return driver.findElement(By.xpath(p.getProperty(d)));
	}

	public void sleep(int a) throws InterruptedException {
		int r = 1000 * a;
		Thread.sleep(r);
	}

	public void Screenshot(String a) throws IOException, InterruptedException {
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File t = new File("C:\\Users\\KAIPU VINOD REDDY\\Pictures\\Evidence\\" + a + ".jpeg");

		sleep(2);

		FileHandler.copy(s, t);

	}

	public void drpdown(String a, String details) throws InterruptedException {

		WebElement drp = xp(a);
		// sleep(2);
		Select s = new Select(drp);
		s.selectByVisibleText(details);

	}
}
