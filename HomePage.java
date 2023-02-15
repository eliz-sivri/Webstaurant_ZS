import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webstaurantstore.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement src = driver.findElement(By.id("searchval"));
		src.sendKeys("stainless work table");
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div/button")).click();
		
		List <WebElement> tablelist = driver.findElements(By.xpath("//*[@id=\"details\"]/a[2]"));
		int numoftlist = tablelist.size();
		
		for (int i = 0; i < tablelist.size(); i++) {
			//String elementText = tablelist.get(i).getText(); 
			 System.out.println(tablelist); 
			 
			           
                	
            }
		System.out.println("Number of the products has the word 'Table' in its title :" + numoftlist );
		
		WebElement lastPage = driver.findElement(By.xpath("//*[@id=\"paging\"]/nav/ul/li[7]/a"));
		lastPage.click();
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	
		js.executeScript("window.scrollBy(0,4900)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  // all page scroll
		
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"ProductBoxContainer\"]/div[4]/form/div/div/input[2]"));
		cart.click();
		Thread.sleep(5000);
		
		WebElement cart2 = driver.findElement(By.xpath("//*[@id=\"watnotif-wrapper\"]/div/p/div[2]/div[2]/a[1]"));
		cart2.click();
		Thread.sleep(2000);
		
		WebElement ecart = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[1]/div/button"));
		ecart.click();
		Thread.sleep(2000);
		
		WebElement ecart2 = driver.findElement(By.xpath("//*[@id=\"td\"]/div[10]/div/div/div/footer/button[1]"));
		ecart2.click();
		
		
		Thread.sleep(2000);
		driver.close();
		}
}
		