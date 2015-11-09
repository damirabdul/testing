package tests;

import org.junit.*;
import org.openqa.selenium.*;

import util.SeleniumHelper;

public class RzdTests extends SeleniumHelper {

	protected final String baseUrl = "http://rzd.ru/";
	protected WebDriver driver;

	@AfterClass
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
