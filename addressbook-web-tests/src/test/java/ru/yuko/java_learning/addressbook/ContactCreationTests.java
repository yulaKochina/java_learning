package ru.yuko.java_learning.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreationTests {
  private WebDriver wb;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
    wb = new ChromeDriver();
    wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wb.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  @Test
  public void testContactCreation() throws Exception {

    wb.findElement(By.linkText("add new")).click();
    wb.findElement(By.name("firstname")).click();
    wb.findElement(By.name("firstname")).clear();
    wb.findElement(By.name("firstname")).sendKeys("Petr");
    wb.findElement(By.name("middlename")).click();
    wb.findElement(By.name("middlename")).clear();
    wb.findElement(By.name("middlename")).sendKeys("Petrovich");
    wb.findElement(By.name("lastname")).click();
    wb.findElement(By.name("lastname")).clear();
    wb.findElement(By.name("lastname")).sendKeys("Petrov");
    wb.findElement(By.name("lastname")).click();
    wb.findElement(By.name("nickname")).click();
    wb.findElement(By.name("nickname")).clear();
    wb.findElement(By.name("nickname")).sendKeys("Petka");
    wb.findElement(By.name("title")).click();
    wb.findElement(By.name("title")).clear();
    wb.findElement(By.name("title")).sendKeys("Petro_file");
    wb.findElement(By.name("company")).click();
    wb.findElement(By.name("company")).clear();
    wb.findElement(By.name("company")).sendKeys("PetroCo");
    wb.findElement(By.name("address")).click();
    wb.findElement(By.name("address")).clear();
    wb.findElement(By.name("address")).sendKeys("Petrov city, Petrovskaya street , 1/10");
    wb.findElement(By.name("home")).click();
    wb.findElement(By.name("home")).clear();
    wb.findElement(By.name("home")).sendKeys("10-10-10");
    wb.findElement(By.name("mobile")).click();
    wb.findElement(By.name("mobile")).clear();
    wb.findElement(By.name("mobile")).sendKeys("1023456789");
    wb.findElement(By.name("work")).click();
    wb.findElement(By.name("work")).clear();
    wb.findElement(By.name("work")).sendKeys("20-20-20");
    wb.findElement(By.name("fax")).click();
    wb.findElement(By.name("fax")).clear();
    wb.findElement(By.name("fax")).sendKeys("30-30-30");
    wb.findElement(By.name("email")).click();
    wb.findElement(By.name("email")).clear();
    wb.findElement(By.name("email")).sendKeys("petro@mail.ru");
    wb.findElement(By.name("email2")).click();
    wb.findElement(By.name("email2")).clear();
    wb.findElement(By.name("email2")).sendKeys("petya@yandex.ru");
    wb.findElement(By.name("email3")).click();
    wb.findElement(By.name("email3")).clear();
    wb.findElement(By.name("email3")).sendKeys("petka@google.com");
    wb.findElement(By.name("homepage")).click();
    wb.findElement(By.name("homepage")).clear();
    wb.findElement(By.name("homepage")).sendKeys("www.petr.ru");
    wb.findElement(By.name("bday")).click();
    new Select(wb.findElement(By.name("bday"))).selectByVisibleText("1");
    wb.findElement(By.name("bmonth")).click();
    new Select(wb.findElement(By.name("bmonth"))).selectByVisibleText("June");
    wb.findElement(By.name("byear")).click();
    wb.findElement(By.name("byear")).clear();
    wb.findElement(By.name("byear")).sendKeys("1990");
    wb.findElement(By.name("aday")).click();
    new Select(wb.findElement(By.name("aday"))).selectByVisibleText("10");
    wb.findElement(By.name("amonth")).click();
    new Select(wb.findElement(By.name("amonth"))).selectByVisibleText("July");
    wb.findElement(By.name("ayear")).click();
    wb.findElement(By.name("ayear")).clear();
    wb.findElement(By.name("ayear")).sendKeys("2000");
    wb.findElement(By.name("new_group")).click();
    new Select(wb.findElement(By.name("new_group"))).selectByVisibleText("test11");
    wb.findElement(By.name("address2")).click();
    wb.findElement(By.name("address2")).clear();
    wb.findElement(By.name("address2")).sendKeys("Petrov city, Petrovskaya street , 1/10");
    wb.findElement(By.name("phone2")).click();
    wb.findElement(By.name("phone2")).clear();
    wb.findElement(By.name("phone2")).sendKeys("10");
    wb.findElement(By.name("notes")).click();
    wb.findElement(By.name("notes")).clear();
    wb.findElement(By.name("notes")).sendKeys("Add new contact");
    wb.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    wb.findElement(By.linkText("home")).click();

  }

  private void logout() {
    wb.findElement(By.linkText("Logout")).click();
  }

  private void login(String username, String password) {
    wb.findElement(By.name("user")).click();
    wb.findElement(By.name("user")).clear();
    wb.findElement(By.name("user")).sendKeys(username);
    wb.findElement(By.name("pass")).click();
    wb.findElement(By.name("pass")).clear();
    wb.findElement(By.name("pass")).sendKeys(password);
    wb.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    logout();
    wb.quit();
  }
}
