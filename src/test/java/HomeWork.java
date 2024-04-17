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
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login/");
    }

    @Test
    public void cssLocators() {
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

    @Test
    public void cssLocators1() {
        //By.id
        WebElement div = wd.findElement(By.id("root"));
        WebElement div2 = wd.findElement(By.cssSelector("#root"));


        //By.class
        WebElement el = wd.findElement(By.className("active"));
        WebElement el1 = wd.findElement(By.cssSelector(".active"));

        //By.name
      //  WebElement el3 = wd.findElement(By.name("type"));

        //By.attribute
        WebElement el4 = wd.findElement(By.cssSelector("[name='email']"));

        //start
        WebElement el6 = wd.findElement(By.cssSelector("[type ^= 'su']"));

        //end
        WebElement el9 = wd.findElement(By.cssSelector("[type *= 'it']"));

        //contain
        WebElement el10 = wd.findElement(By.cssSelector("[name $= 'rd']"));

    }
@Test
public void xpassLocators(){
    //By.id
    WebElement div1 = wd.findElement(By.xpath("//*[@id='root']"));
    //By.class
    WebElement el2 = wd.findElement(By.xpath("//*[@class='active']"));
    //By.name
    WebElement el8 =wd.findElement(By.xpath("//*[text()='HOME']"));
    //By.attribute
    WebElement el5 = wd.findElement(By.xpath("//*[@name='email']"));
    //start
    WebElement el7 = wd.findElement(By.xpath("//*[starts-with(@type, 'sub')]"));
    //contain
    WebElement el11 = wd.findElement(By.xpath("//*[contains(@class, 'ti')]"));
}
    @AfterClass
    public void postCondition() {
        wd.quit();
    }
}
