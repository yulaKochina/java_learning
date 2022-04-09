package ru.yuko.java_learning.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.yuko.java_learning.addressbook.model.AnniversaryDayData;
import ru.yuko.java_learning.addressbook.model.BirthDatData;
import ru.yuko.java_learning.addressbook.model.ContactData;

public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void saveContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        fieldFill(By.name("firstname"), contactData.getFirstName());
        fieldFill(By.name("middlename"), contactData.getMiddleName());
        fieldFill(By.name("lastname"), contactData.getLastName());
        fieldFill(By.name("nickname"), contactData.getNickName());
        fieldFill(By.name("title"), contactData.getTitle());
        fieldFill(By.name("company"), contactData.getCompany());
        fieldFill(By.name("address"), contactData.getAddress());
        fieldFill(By.name("home"), contactData.getHomePhone());
        fieldFill(By.name("mobile"), contactData.getMobilePhone());
        fieldFill(By.name("work"), contactData.getWorkPhone());
        fieldFill(By.name("fax"), contactData.getFaxPhone());
        fieldFill(By.name("email"), contactData.getEmail());
        fieldFill(By.name("email2"), contactData.getEmail2());
        fieldFill(By.name("email3"), contactData.getEmail3());
        fieldFill(By.name("homepage"), contactData.getHomePage());
        birthDayData(new BirthDatData(contactData.getBday(), contactData.getBmonth(), contactData.getByear()));
        anniversaryDayDAta(new AnniversaryDayData(contactData.getAday(), contactData.getAmonth(), contactData.getAyear()));
        fieldFill(By.name("address2"), contactData.getAddress2());
        fieldFill(By.name("phone2"), contactData.getHomePhone2());
        fieldFill(By.name("notes"), contactData.getNotes());
    }

    public void anniversaryDayDAta(AnniversaryDayData anniversaryDayData) {
        click(By.name("aday"));
        new Select(wd.findElement(By.name("aday"))).selectByVisibleText(anniversaryDayData.getAday());
        click(By.name("amonth"));
        new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(anniversaryDayData.getAmonth());
        fieldFill(By.name("ayear"), anniversaryDayData.getAyear());
    }

    public void birthDayData(BirthDatData birthDatData) {
        click(By.name("bday"));
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(birthDatData.getBday());
        click(By.name("bmonth"));
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(birthDatData.getBmonth());
        fieldFill(By.name("byear"), birthDatData.getByear());
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void contactDelete() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void acceptDelete() {
        acceptDel();
    }

    public void initModificationContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[22]"));
    }
}
