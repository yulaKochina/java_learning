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
    gotoPageAddNewContact();
    fillContactForm(new ContactData("Petr", "Petrovich", "Petrov", "Petka", "Petro_file", "PetroCo", "Petrov city, Petrovskaya street , 1/10", "10-10-10", "1023456789", "20-20-20", "30-30-30", "petro@mail.ru", "petya@yandex.ru", "petka@google.com", "www.petr.ru", "1", "June", "1990", "10", "July", "2000", "test11", "Petrov city, Petrovskaya street , 1/10", "10", "Add new contact"));
    saveContact();
    gotoPageHome();
  }

  private void gotoPageHome() {
    wb.findElement(By.linkText("home")).click();
  }

  private void saveContact() {
    wb.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void fillContactForm(ContactData contactData) {
    wb.findElement(By.name("firstname")).click();
    wb.findElement(By.name("firstname")).clear();
    wb.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    wb.findElement(By.name("middlename")).click();
    wb.findElement(By.name("middlename")).clear();
    wb.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
    wb.findElement(By.name("lastname")).click();
    wb.findElement(By.name("lastname")).clear();
    wb.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    wb.findElement(By.name("lastname")).click();
    wb.findElement(By.name("nickname")).click();
    wb.findElement(By.name("nickname")).clear();
    wb.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
    wb.findElement(By.name("title")).click();
    wb.findElement(By.name("title")).clear();
    wb.findElement(By.name("title")).sendKeys(contactData.getTitle());
    wb.findElement(By.name("company")).click();
    wb.findElement(By.name("company")).clear();
    wb.findElement(By.name("company")).sendKeys(contactData.getCompany());
    wb.findElement(By.name("address")).click();
    wb.findElement(By.name("address")).clear();
    wb.findElement(By.name("address")).sendKeys(contactData.getAddress());
    wb.findElement(By.name("home")).click();
    wb.findElement(By.name("home")).clear();
    wb.findElement(By.name("home")).sendKeys(contactData.getHomePhone());
    wb.findElement(By.name("mobile")).click();
    wb.findElement(By.name("mobile")).clear();
    wb.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhone());
    wb.findElement(By.name("work")).click();
    wb.findElement(By.name("work")).clear();
    wb.findElement(By.name("work")).sendKeys(contactData.getWorkPhone());
    wb.findElement(By.name("fax")).click();
    wb.findElement(By.name("fax")).clear();
    wb.findElement(By.name("fax")).sendKeys(contactData.getFaxPhone());
    wb.findElement(By.name("email")).click();
    wb.findElement(By.name("email")).clear();
    wb.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wb.findElement(By.name("email2")).click();
    wb.findElement(By.name("email2")).clear();
    wb.findElement(By.name("email2")).sendKeys(contactData.getEmail2());
    wb.findElement(By.name("email3")).click();
    wb.findElement(By.name("email3")).clear();
    wb.findElement(By.name("email3")).sendKeys(contactData.getEmail3());
    wb.findElement(By.name("homepage")).click();
    wb.findElement(By.name("homepage")).clear();
    wb.findElement(By.name("homepage")).sendKeys(contactData.getHomepage());
    birthDayData(new BirthDatData(contactData.getBday(), contactData.getBmonth(), contactData.getByear()));
    anniversaryDayDAta(new AnniversaryDayData(contactData.getAday(), contactData.getAmonth(), contactData.getAyear()));
    selectGroup(contactData.getGroup());
    wb.findElement(By.name("address2")).click();
    wb.findElement(By.name("address2")).clear();
    wb.findElement(By.name("address2")).sendKeys(contactData.getAddress2());
    wb.findElement(By.name("phone2")).click();
    wb.findElement(By.name("phone2")).clear();
    wb.findElement(By.name("phone2")).sendKeys(contactData.getHomephone2());
    wb.findElement(By.name("notes")).click();
    wb.findElement(By.name("notes")).clear();
    wb.findElement(By.name("notes")).sendKeys(contactData.getNotes());
  }

  private void selectGroup(String group) {
    wb.findElement(By.name("new_group")).click();
    new Select(wb.findElement(By.name("new_group"))).selectByVisibleText(group);
  }

  private void anniversaryDayDAta(AnniversaryDayData anniversaryDayData) {
    wb.findElement(By.name("aday")).click();
    new Select(wb.findElement(By.name("aday"))).selectByVisibleText(anniversaryDayData.getAday());
    wb.findElement(By.name("amonth")).click();
    new Select(wb.findElement(By.name("amonth"))).selectByVisibleText(anniversaryDayData.getAmonth());
    wb.findElement(By.name("ayear")).click();
    wb.findElement(By.name("ayear")).clear();
    wb.findElement(By.name("ayear")).sendKeys(anniversaryDayData.getAyear());
  }

  private void birthDayData(BirthDatData birthDatData) {
    wb.findElement(By.name("bday")).click();
    new Select(wb.findElement(By.name("bday"))).selectByVisibleText(birthDatData.getBday());
    wb.findElement(By.name("bmonth")).click();
    new Select(wb.findElement(By.name("bmonth"))).selectByVisibleText(birthDatData.getBmonth());
    wb.findElement(By.name("byear")).click();
    wb.findElement(By.name("byear")).clear();
    wb.findElement(By.name("byear")).sendKeys(birthDatData.getByear());
  }

  private void gotoPageAddNewContact() {
    wb.findElement(By.linkText("add new")).click();
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
