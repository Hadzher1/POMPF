package FinalProject.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class Logo {
    public static final String PAGE_URL = "http://training.skillo-bg.com:4300/posts/all";
    private final WebDriver driver;

    public SkilloLogo(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement skilloLogo() {
        return driver.findElement(By.id("homeIcon"));
    }

    public void clickOnSkilloIcon() {
        skilloLogo().click();
    }
}
