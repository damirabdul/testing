package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class FindJobTest extends RzdTests {
	
	@Test
	public void findJob() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.linkText("Работа в РЖД")).click();
		driver.findElement(By.name("name")).sendKeys("Машинист");
		driver.findElement(By.cssSelector("td.tar > input[type=\"image\"]"))
				.click();
	}

}
