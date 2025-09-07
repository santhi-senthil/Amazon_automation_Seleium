package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Launch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

        WebDriver d = new ChromeDriver();
        String old=d.getWindowHandle();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // open amazon
        d.get("https://www.amazon.in/");
        
        d.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();

        // Search  Dairy Milk
        WebElement search = d.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Dairy Milk");
        search.sendKeys(Keys.ENTER);

        // Click on product 
        WebElement product = d.findElement(
            By.linkText("Cadbury Dairy Milk Silk Oreo Chocolate Bars, 58.5 g")
        );
        product.click();

        //windowhandles and select quantity
        
        Set<String>current=d.getWindowHandles();
        
        for (String v : current) {
			if(!v.equals(old)) {
				d.switchTo().window(v);
			}
		}
        
        WebElement quantity = d.findElement(By.id("quantity"));
        Select s = new Select(quantity);
        s.selectByValue("2");

        // Close dropdown by clicking outside (like title)
        d.findElement(By.id("productTitle")).click();
        
        
        //add to cart

        
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
        WebElement addToCart = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button"))
        );

        addToCart.click();
        
        //switch to old and clcik all 
        d.close();
        d.switchTo().window(old);
        
        
        d.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
        
        //mobiles & computer
        
        d.findElement(By.linkText("Mobiles, Computers")).click();
     
        d.findElement(By.xpath("//div[@id='hmenu-close-icon']")).click();
        
        List<WebElement>count=d.findElements(By.tagName("a"));
        System.out.println(count.size());
        
        for (WebElement w : count) {
			System.out.println(w.getText());
		}
        
        
        
        }
}
