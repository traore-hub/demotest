package PageOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageOM {

   @FindBy(xpath = "//div[contains(text(),'Utiliser un autre compte')]")
    private WebElement login;
private WebDriver driver;

    public PageOM(WebDriver driver) {
        driver = driver;
    }

    public void login(){
        login.click();
    }
}
