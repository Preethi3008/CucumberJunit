package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	static Actions a;
	static Robot r;
	static Sheet sheet;
	static File f;
	static Workbook w;

	public static void chromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void pageTitle() {
		System.out.println(driver.getTitle());
	}

	public static void pageUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void typeText(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void clickDouble(WebElement target) {
		a = new Actions(driver);
		a.doubleClick(target).perform();
	}

	public static void browserQuit() {
		driver.quit();
	}

	public static void tabClose() {
		driver.close();
	}

	public static void displayText(WebElement r) {
		System.out.println(r.getText());
	}

	public static void displayAttribute(WebElement name, String s) {
		System.out.println((name.getAttribute(s)));
	}

	public static void hoverto(WebElement tar) {
		a = new Actions(driver);
		a.moveToElement(tar);
	}

	public static void dAndD(WebElement frm, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(frm, des);
	}

	public static void enterKey(WebElement rgt) {
		a = new Actions(driver);
		a.contextClick(rgt);
	}

	public static void downPressBtn() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void printDate() {
		Date d = new Date();
		System.out.println(d);
	}

	public static void getExcelSheet(String path, String sheetName) throws IOException {
		f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		w = new XSSFWorkbook(fin);
		sheet = w.getSheet(sheetName);
	}

	public static String excelRead(int rowNo, int cellNo) throws IOException {

		getExcelSheet("D:\\Green\\eclipse-workspace\\Greenstech\\FrameworkAssignment\\MyData\\MyAdactinData.xls.xlsx",
				"MyAdactinData");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = "";
		int CellType = cell.getCellType();

		if (CellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			value = s.format(d);
		} else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void writeExcel(int row, int cell, String value) throws IOException {
		getExcelSheet("D:\\Green\\eclipse-workspace\\Greenstech\\FrameworkAssignment\\MyData\\MyAdactinData.xls.xlsx",
				"MyAdactinData");
		Row r = sheet.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
	}
}
