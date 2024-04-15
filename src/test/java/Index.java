import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/User/Downloads/21.index.html");
    }

    @Test
    public  void  tableTest(){
       WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }
    @Test
    public void cssLocators(){

        // by tag name
      WebElement button = wd.findElement(By.tagName("button"));
      WebElement button1 = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> a = wd.findElements(By.cssSelector("a"));
        WebElement input = wd.findElement(By.tagName("input"));

        WebElement element = wd.findElement(By.className("container"));
        WebElement element1= wd.findElement(By.cssSelector(".container"));

        List<WebElement> a1 = wd.findElements(By.className("nav-item"));
        List<WebElement> a2 = wd.findElements(By.cssSelector(".nav-item"));

        WebElement id = wd.findElement(By.id("nav"));
        WebElement id1 = wd.findElement(By.cssSelector("#nav"));

        WebElement  el1 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement  el6 = wd.findElement(By.cssSelector("[placeholder ^='Type']"));
        WebElement  el7 = wd.findElement(By.cssSelector("[placeholder $= 'name']"));
        WebElement  el8 = wd.findElement(By.cssSelector("[placeholder *= 'your']"));

        WebElement  el2 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement  el3 = wd.findElement(By.cssSelector("[name='surename']"));
        WebElement  el4 = wd.findElement(By.name("surename"));

        WebElement el5 = wd.findElement(By.linkText("Item 1"));
        WebElement el10 = wd.findElement(By.partialLinkText("m 1"));




    }
}
