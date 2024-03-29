import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends HelperBase{
    public HeaderPage(WebDriver driver) {
            super(driver);
    }

    public void clickOnHomeButtonOnHeader() throws InterruptedException {
        pause(5000);
        click(By.cssSelector("a [name=house]"));
        pause(5000);
        click(By.cssSelector("a [name=house]"));
    }

    protected void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[name=add]"));
    }
}
