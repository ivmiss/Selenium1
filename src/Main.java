
import framework.Helper;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Main {

    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://bvtest.school.cubes.rs/login");
        
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        
       WebElement passwordField = driver.findElement(By.name("password"));
       passwordField.sendKeys("cubesqa");
       
       WebElement loginButton = driver.findElement(By.className("btn-primary"));
       loginButton.click();
       
       WebElement categoriesLink = driver.findElement(By.linkText("Categories"));
       categoriesLink.click();
       
       WebElement addCategoryButton = driver.findElement(By.className("pull-right"));
       addCategoryButton.click();
       
       WebElement titleCategoriesField = driver.findElement(By.id("title"));
       titleCategoriesField.sendKeys(Helper.getRandomText());
       
       WebElement saveCategoriesButton = driver.findElement(By.id("save-category-button"));
       saveCategoriesButton.click();
       
       WebElement regionsLink = driver.findElement(By.linkText("Regions"));
       regionsLink.click();
       
       WebElement addRegionsButton = driver.findElement(By.xpath("//*[@id=\"app-layout\"]/div[1]/div/div/div/div[1]/a"));
       addRegionsButton.click();
       
       WebElement titleRegionsField = driver.findElement(By.id("title"));
       titleRegionsField.sendKeys("prIVM");
       
       WebElement saveRegionsButton = driver.findElement(By.id("save-region-button"));
       saveRegionsButton.click();
       
//       WebElement portalsLink = driver.findElement(By.linkText("Portals"));
//       portalsLink.click();
       
       WebElement navBar = driver.findElement(By.className("navbar-nav"));
       List<WebElement> liTags = navBar.findElements(By.tagName("li"));
       liTags.get(4).click();
       
       WebDriverWait wait = new WebDriverWait(driver, 10);
       WebElement addPortalButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
       addPortalButton.click();
       
//       WebElement addPortalsButton = driver.findElement(By.xpath("//*[@id=\"app-layout\"]/div[1]/div/div/div/div[1]/a"));
//       addPortalsButton.click();
       
       WebElement titlePortalsField = driver.findElement(By.id("title"));
       titlePortalsField.sendKeys("primerIVM");
       
       WebElement urlPortalsField = driver.findElement(By.id("url"));
       urlPortalsField.sendKeys("http://test.rs");
       
       WebElement savePortalsButton = driver.findElement(By.id("save-portal-button"));
       savePortalsButton.click();
       
       
       Thread.sleep(7000);
        driver.quit();
       
    }
    
}
