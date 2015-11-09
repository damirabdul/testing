package tests;

import org.junit.Test;
import org.openqa.selenium.By;
public class ShowTicketTest extends RzdTests {
	
	
	@Test
	public void testShowTickets() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("name0")).sendKeys("Казань");
		driver.findElement(By.id("name1")).sendKeys("Москва");
		driver.findElement(By.id("name0")).click();
		driver.findElement(By.cssSelector("div.station")).click();
		driver.findElement(By.id("name1")).click();
		driver.findElement(By.xpath("//div[7]/div[2]")).click();
		driver.findElement(By.id("Submit")).click();
	}


}
