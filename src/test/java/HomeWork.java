import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
       wd = new ChromeDriver();
       wd.get("https://telranedu.web.app/login/");
    }

    @Test
    public  void cssLocators(){
        WebElement div = wd.findElement(By.tagName("div"));
        List<WebElement> list = wd.findElements(By.tagName("div"));

        WebElement a = wd.findElement(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.tagName("a"));

        WebElement h1 = wd.findElement(By.cssSelector("h1"));
        WebElement form = wd.findElement(By.cssSelector("form"));
        WebElement input = wd.findElement(By.tagName("input"));

        List<WebElement> list2 = wd.findElements(By.cssSelector("input"));

        WebElement button = wd.findElement(By.tagName("button"));
        List<WebElement> list3 = wd.findElements(By.cssSelector("button"));
    }

    @AfterClass
    public void postCondition(){
        wd.quit();
    }
}
