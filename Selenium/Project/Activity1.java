package Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		String a = driver.getTitle();
		System.out.println("Title of the page is " +a);
		String b = "SuiteCRM";
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Page title matches to string SuiteCRM");
		}
		else {
				System.out.println("Page title doesn't match to string SuiteCRM");
				
		}
		
		driver.quit();
	
	
	}

}
