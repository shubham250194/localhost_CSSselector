import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:100");
		driver.manage().window().maximize();
		
		System.out.println("build execution started");
		
		driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("select[name='login_theme']")).sendKeys("orange");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		
		driver.findElement(By.linkText("New Lead")).click();
		driver.findElement(By.cssSelector("select[name='salutationtype']")).sendKeys("Mr.");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("shubham");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("tilkar");
		driver.findElement(By.cssSelector("input[name='company']")).sendKeys("Infi");
		driver.findElement(By.cssSelector("input[name='designation']")).sendKeys("engineer");
		driver.findElement(By.cssSelector("input[name='designation']")).sendKeys("ENGINEER");
		driver.findElement(By.cssSelector("select[name='leadsource']")).sendKeys("Partner");
		driver.findElement(By.cssSelector("select[name='industry']")).sendKeys("Construction");
		driver.findElement(By.cssSelector("input[name='annualrevenue']")).sendKeys("2500000");
		driver.findElement(By.cssSelector("input[name='noofemployees']")).sendKeys("44");
		driver.findElement(By.cssSelector("input[name='yahooid']")).sendKeys("baby@yahoo.com");
		driver.findElement(By.cssSelector("textarea[name='lane']")).sendKeys("A-sector vasant vihar");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("madhya pradesh");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("tilkarshubham@gmail.com");
		driver.findElement(By.cssSelector("input[name='mobile']")).sendKeys("9617818817");
		driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.google.com");
		driver.findElement(By.cssSelector("select[name='leadstatus']")).sendKeys("Qualified");
		driver.findElement(By.cssSelector("input[name='code']")).sendKeys("4560140");
		driver.findElement(By.cssSelector("input[name='country']")).sendKeys("india");
		driver.findElement(By.cssSelector("select[name='rating']")).sendKeys("Active");
		driver.findElement(By.cssSelector("input[value='U']")).click();
		driver.findElement(By.cssSelector("select[name='assigned_user_id']")).sendKeys("admin");
		driver.findElement(By.cssSelector("textarea[name='description']")).sendKeys("great things take time");
		driver.findElements(By.cssSelector("input[name='button']")).get(2).click();
		
		System.out.println("build success");
		driver.close();
		
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		
		
	}

}
