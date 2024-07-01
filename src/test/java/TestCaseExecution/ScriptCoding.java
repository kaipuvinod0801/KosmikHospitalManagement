package TestCaseExecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ScriptCoding extends ReusedMethods {

	public void login() {
		driver.get(p.getProperty("URL"));

		xp("XUN").sendKeys(p.getProperty("UN"));

		xp("XPWD").sendKeys(p.getProperty("PWD"));

		xp("XSUB").click();

	}

	public void perminentRegistrationforoneperson() throws InterruptedException, IOException, AWTException {
		xp("XREG").click();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\KAIPU VINOD REDDY\\eclipse-workspace\\KosmikHospitalManagementSystem\\src\\data\\java\\Data\\Hospital.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet sht = w.getSheet("Regestration");

		String PatientCategory = sht.getRow(1).getCell(0).getStringCellValue();
		String Title = sht.getRow(1).getCell(1).getStringCellValue();
		String FirstName = sht.getRow(1).getCell(2).getStringCellValue();
		String LastName = sht.getRow(1).getCell(3).getStringCellValue();
		int DOB = (int) sht.getRow(1).getCell(4).getNumericCellValue();
		int Age = (int) sht.getRow(1).getCell(5).getNumericCellValue();
		String Gender = sht.getRow(1).getCell(6).getStringCellValue();
		String Marital = sht.getRow(1).getCell(7).getStringCellValue();
		String Religion = sht.getRow(1).getCell(8).getStringCellValue();
		String Primary = sht.getRow(1).getCell(9).getStringCellValue();
		String Relation = sht.getRow(1).getCell(10).getStringCellValue();
		String PatientIndentifier = sht.getRow(1).getCell(11).getStringCellValue();
		String PAN = sht.getRow(1).getCell(12).getStringCellValue();
		String Nationality = sht.getRow(1).getCell(13).getStringCellValue();
		String vip = sht.getRow(1).getCell(14).getStringCellValue();
		String education = sht.getRow(1).getCell(15).getStringCellValue();
		String occupation = sht.getRow(1).getCell(16).getStringCellValue();
		String Blood = sht.getRow(1).getCell(17).getStringCellValue();
		String citizen = sht.getRow(1).getCell(18).getStringCellValue();
		String SeniorProof = sht.getRow(1).getCell(19).getStringCellValue();
		String Address = sht.getRow(1).getCell(20).getStringCellValue();
		int phone = (int) sht.getRow(1).getCell(21).getNumericCellValue();
		String country = sht.getRow(1).getCell(22).getStringCellValue();
		int zip = (int) sht.getRow(1).getCell(23).getNumericCellValue();
		String path = sht.getRow(1).getCell(24).getStringCellValue();

		drpdown("XPC", PatientCategory);
		drpdown("XTITLE", Title);
		drpdown("XREL", Relation);
		drpdown("XPATIDE", PatientIndentifier);
		drpdown("XNAT", Nationality);
		drpdown("XVIP", vip);
		drpdown("XEDU", education);
		drpdown("XOCC", occupation);
		drpdown("XBGRP", Blood);
		drpdown("XGEN", Gender);
		drpdown("XSTATUS", Marital);
		drpdown("XRELG", Religion);
		drpdown("XPLANG", Primary);
		drpdown("XCITZ", citizen);
		drpdown("XPRF", SeniorProof);

		xp("XFIRST").sendKeys(FirstName);
		xp("XLAST").sendKeys(LastName);
		xp("XDOB").sendKeys(String.valueOf(DOB));
		xp("XAGE").sendKeys(String.valueOf(Age));
		xp("XID").sendKeys(String.valueOf(PAN));
		xp("XADD").sendKeys(Address);
		xp("XPHN").sendKeys(String.valueOf(phone));
		xp("XZIP").sendKeys(String.valueOf(zip));

		Actions a = new Actions(driver);

		a.moveToElement(xp("XPHOTO")).click().perform();

		StringSelection photo = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photo, null);

		sleep(2);

		Robot R = new Robot();

		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);

		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);

		R.keyPress(KeyEvent.VK_ENTER);

		R.keyRelease(KeyEvent.VK_ENTER);

		drpdown("XCTRY", country);

		sleep(2);

		R.keyPress(KeyEvent.VK_TAB);

		R.keyRelease(KeyEvent.VK_TAB);

		R.keyPress(KeyEvent.VK_ENTER);

		R.keyRelease(KeyEvent.VK_ENTER);

		sleep(2);

		Alert alt = driver.switchTo().alert();

		alt.accept();

	}

	public void perminentRegistrationformultipleperson() throws InterruptedException, IOException, AWTException {

		xp("XREG").click();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\KAIPU VINOD REDDY\\eclipse-workspace\\KosmikHospitalManagementSystem\\src\\data\\java\\Data\\Hospital.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet sht = w.getSheet("Regestration");

		// System.out.println(sht.getLastRowNum());

		for (int i = 1; i <= sht.getLastRowNum(); i++) {

			String PatientCategory = sht.getRow(i).getCell(0).getStringCellValue();
			String Title = sht.getRow(i).getCell(1).getStringCellValue();
			String FirstName = sht.getRow(i).getCell(2).getStringCellValue();
			String LastName = sht.getRow(i).getCell(3).getStringCellValue();
			int DOB = (int) sht.getRow(i).getCell(4).getNumericCellValue();
			int Age = (int) sht.getRow(i).getCell(5).getNumericCellValue();
			String Gender = sht.getRow(i).getCell(6).getStringCellValue();
			String Marital = sht.getRow(i).getCell(7).getStringCellValue();
			String Religion = sht.getRow(i).getCell(8).getStringCellValue();
			String Primary = sht.getRow(i).getCell(9).getStringCellValue();
			String Relation = sht.getRow(i).getCell(10).getStringCellValue();
			String PatientIndentifier = sht.getRow(i).getCell(11).getStringCellValue();
			String PAN = sht.getRow(i).getCell(12).getStringCellValue();
			String Nationality = sht.getRow(i).getCell(13).getStringCellValue();
			String vip = sht.getRow(i).getCell(14).getStringCellValue();
			String education = sht.getRow(i).getCell(15).getStringCellValue();
			String occupation = sht.getRow(i).getCell(16).getStringCellValue();
			String Blood = sht.getRow(i).getCell(17).getStringCellValue();
			String citizen = sht.getRow(i).getCell(18).getStringCellValue();
			String SeniorProof = sht.getRow(i).getCell(19).getStringCellValue();
			String Address = sht.getRow(i).getCell(20).getStringCellValue();
			int phone = (int) sht.getRow(i).getCell(21).getNumericCellValue();
			String country = sht.getRow(i).getCell(22).getStringCellValue();
			int zip = (int) sht.getRow(i).getCell(23).getNumericCellValue();
			String path = sht.getRow(i).getCell(24).getStringCellValue();

			Screenshot("BeforeEnteringDetails" + FirstName);

			drpdown("XPC", PatientCategory);
			drpdown("XTITLE", Title);
			drpdown("XREL", Relation);
			drpdown("XPATIDE", PatientIndentifier);
			drpdown("XNAT", Nationality);
			drpdown("XVIP", vip);
			drpdown("XEDU", education);
			drpdown("XOCC", occupation);
			drpdown("XBGRP", Blood);
			drpdown("XGEN", Gender);
			drpdown("XSTATUS", Marital);
			drpdown("XRELG", Religion);
			drpdown("XPLANG", Primary);
			drpdown("XCITZ", citizen);
			drpdown("XPRF", SeniorProof);

			xp("XFIRST").sendKeys(FirstName);
			xp("XLAST").sendKeys(LastName);
			xp("XDOB").sendKeys(String.valueOf(DOB));
			xp("XAGE").sendKeys(String.valueOf(Age));
			xp("XID").sendKeys(String.valueOf(PAN));
			xp("XADD").sendKeys(Address);
			xp("XPHN").sendKeys(String.valueOf(phone));
			xp("XZIP").sendKeys(String.valueOf(zip));

			Actions a = new Actions(driver);

			a.moveToElement(xp("XPHOTO")).click().perform();

			StringSelection photo = new StringSelection(path);

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photo, null);

			sleep(3);

			Robot R = new Robot();

			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_V);

			R.keyRelease(KeyEvent.VK_CONTROL);
			R.keyRelease(KeyEvent.VK_V);

			R.keyPress(KeyEvent.VK_ENTER);

			R.keyRelease(KeyEvent.VK_ENTER);

			drpdown("XCTRY", country);

			Screenshot("AfterEnteringDetails" + FirstName);

			sleep(2);

			R.keyPress(KeyEvent.VK_TAB);

			R.keyRelease(KeyEvent.VK_TAB);

			R.keyPress(KeyEvent.VK_ENTER);

			R.keyRelease(KeyEvent.VK_ENTER);

			sleep(2);

			Alert alt = driver.switchTo().alert();

			System.out.println(alt.getText());

			alt.accept();

		}

	}

	public void editoneEmployees() throws InterruptedException, IOException, AWTException {

		xp("XREG").click();
		sleep(2);

		xp("XREGLIST").click();
		driver.findElement(
				By.cssSelector("table:nth-child(2)>tbody:nth-child(1)>tr:nth-child(1)>td:nth-child(10)>a:nth-child(1)"))
				.click();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\KAIPU VINOD REDDY\\eclipse-workspace\\KosmikHospitalManagementSystem\\src\\data\\java\\Data\\Hospital.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet sht = w.getSheet("EditDetails");

		String PatientCategory = sht.getRow(1).getCell(0).getStringCellValue();
		String Title = sht.getRow(1).getCell(1).getStringCellValue();
		String Gender = sht.getRow(1).getCell(6).getStringCellValue();
		String Marital = sht.getRow(1).getCell(7).getStringCellValue();
		String Religion = sht.getRow(1).getCell(8).getStringCellValue();
		String Primary = sht.getRow(1).getCell(9).getStringCellValue();
		String Relation = sht.getRow(1).getCell(10).getStringCellValue();
		String PatientIndentifier = sht.getRow(1).getCell(11).getStringCellValue();
		String Nationality = sht.getRow(1).getCell(13).getStringCellValue();
		String vip = sht.getRow(1).getCell(14).getStringCellValue();
		String education = sht.getRow(1).getCell(15).getStringCellValue();
		String occupation = sht.getRow(1).getCell(16).getStringCellValue();
		String Blood = sht.getRow(1).getCell(17).getStringCellValue();
		String citizen = sht.getRow(1).getCell(18).getStringCellValue();
		String SeniorProof = sht.getRow(1).getCell(19).getStringCellValue();
		String country = sht.getRow(1).getCell(22).getStringCellValue();
		String Email = sht.getRow(1).getCell(25).getStringCellValue();
		String address2 = sht.getRow(1).getCell(26).getStringCellValue();

		drpdown("XPC1", PatientCategory);
		drpdown("XTITLE", Title);
		drpdown("XREL", Relation);
		drpdown("XPATIDE", PatientIndentifier);
		drpdown("XNAT", Nationality);
		drpdown("XVIP", vip);
		drpdown("XEDU", education);
		drpdown("XOCC", occupation);
		drpdown("XBGRP", Blood);
		drpdown("XGEN", Gender);
		drpdown("XSTATUS", Marital);
		drpdown("XRELG", Religion);
		drpdown("XPLANG", Primary);
		drpdown("XCITZ", citizen);
		drpdown("XPRF", SeniorProof);

		xp("XEMAIL").click();

		xp("XEMAIL").clear();

		xp("XEMAIL").sendKeys(Email);

		xp("XADDRESS2").sendKeys(address2);

		sleep(2);

		Robot R = new Robot();

		drpdown("XCTRY", country);

		sleep(2);

		R.keyPress(KeyEvent.VK_TAB);

		R.keyRelease(KeyEvent.VK_TAB);

		R.keyPress(KeyEvent.VK_ENTER);

		R.keyRelease(KeyEvent.VK_ENTER);

		sleep(2);

		xp("XUPDATE").click();

//		Alert alt = driver.switchTo().alert();
//
//		alt.accept();

	}

	public void editmultipleEmployees() throws InterruptedException, IOException, AWTException {

		xp("XREG").click();
		sleep(2);

		// xp("XREGLIST").click();

		int c = 1;

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\KAIPU VINOD REDDY\\eclipse-workspace\\KosmikHospitalManagementSystem\\src\\data\\java\\Data\\Hospital.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet sht = w.getSheet("EditDetails");

		for (int j = 2; j <= 10; j++) {

			try {

				xp("XREGLIST").click();

				driver.findElement(By.cssSelector("table:nth-child(" + j
						+ ")>tbody:nth-child(1)>tr:nth-child(1)>td:nth-child(10)>a:nth-child(1)")).click();

				String PatientCategory = sht.getRow(c).getCell(0).getStringCellValue();
				String Title = sht.getRow(c).getCell(1).getStringCellValue();
				String Gender = sht.getRow(c).getCell(6).getStringCellValue();
				String Marital = sht.getRow(c).getCell(7).getStringCellValue();
				String Religion = sht.getRow(c).getCell(8).getStringCellValue();
				String Primary = sht.getRow(c).getCell(9).getStringCellValue();
				String Relation = sht.getRow(c).getCell(10).getStringCellValue();
				String PatientIndentifier = sht.getRow(c).getCell(11).getStringCellValue();
				String Nationality = sht.getRow(c).getCell(13).getStringCellValue();
				String vip = sht.getRow(c).getCell(14).getStringCellValue();
				String education = sht.getRow(c).getCell(15).getStringCellValue();
				String occupation = sht.getRow(c).getCell(16).getStringCellValue();
				String Blood = sht.getRow(c).getCell(17).getStringCellValue();
				String citizen = sht.getRow(c).getCell(18).getStringCellValue();
				String SeniorProof = sht.getRow(c).getCell(19).getStringCellValue();
				String country = sht.getRow(c).getCell(22).getStringCellValue();
				String Email = sht.getRow(c).getCell(25).getStringCellValue();
				String address2 = sht.getRow(c).getCell(26).getStringCellValue();

				c += 1;

				drpdown("XPC1", PatientCategory);
				drpdown("XTITLE", Title);
				drpdown("XREL", Relation);
				drpdown("XPATIDE", PatientIndentifier);
				drpdown("XNAT", Nationality);
				drpdown("XVIP", vip);
				drpdown("XEDU", education);
				drpdown("XOCC", occupation);
				drpdown("XBGRP", Blood);
				drpdown("XGEN", Gender);
				drpdown("XSTATUS", Marital);
				drpdown("XRELG", Religion);
				drpdown("XPLANG", Primary);
				drpdown("XCITZ", citizen);
				drpdown("XPRF", SeniorProof);

				xp("XEMAIL").click();

				xp("XEMAIL").clear();

				xp("XEMAIL").sendKeys(Email);

				xp("XADDRESS2").click();

				xp("XADDRESS2").clear();

				xp("XADDRESS2").sendKeys(address2);

				sleep(2);

				Robot R = new Robot();

				drpdown("XCTRY", country);

				sleep(2);

				R.keyPress(KeyEvent.VK_TAB);

				R.keyRelease(KeyEvent.VK_TAB);

				R.keyPress(KeyEvent.VK_ENTER);

				R.keyRelease(KeyEvent.VK_ENTER);

				sleep(2);

				xp("XUPDATE").click();

				sleep(2);

				Alert a = driver.switchTo().alert();
				a.accept();
			} 
			catch (Exception e) {
				
			}
//			
//			Actions A=new Actions(driver);
//			
//			A.moveToElement(xp("XREGLIST")).click().perform();

		}
	}

}
