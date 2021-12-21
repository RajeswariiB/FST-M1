package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[1]/div[1]/img"));
		String b = a.getAttribute("src");
		System.out.println("URL of the Header Image is : " +b);
		driver.quit();
	}

}
