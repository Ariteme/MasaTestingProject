import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    SessionHelper session;
    BoardHelper board;
    TeamHelper team;
    HeaderPage header;
    WebDriver driver;

    public BoardHelper getBoard() {
        return board;
    }

    public TeamHelper getTeam() {
        return team;
    }

    public HeaderPage getHeader() {
        return header;
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected void init() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://trello.com");
        session = new SessionHelper(driver);
        board = new BoardHelper(driver);
        team = new TeamHelper(driver);
        header = new HeaderPage(driver);
        session.login("ariteme2@mail.ru", "asdqwe1234567890");
    }


    protected void stop() {
        driver.quit();
    }


    public SessionHelper getSession() {
        return session;
    }
}
