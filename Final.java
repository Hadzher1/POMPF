class Final {
    package FinalProject.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

    public class SkilloLogo {
        public static final String PAGE_URL = "http://training.skillo-bg.com:4300/posts/all";
        private final WebDriver driver;
        public SkilloLogo(WebDriver driver) {
            this.driver = driver;
        }
        private WebElement skilloLogo(){
            return driver.findElement(By.id("homeIcon"));
        }
        public void clickOnSkilloIcon(){
            skilloIcon().click();

        }
