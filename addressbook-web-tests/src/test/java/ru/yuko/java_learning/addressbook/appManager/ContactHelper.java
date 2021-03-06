package ru.yuko.java_learning.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.yuko.java_learning.addressbook.model.AnniversaryDayData;
import ru.yuko.java_learning.addressbook.model.BirthDatData;
import ru.yuko.java_learning.addressbook.model.ContactData;
import ru.yuko.java_learning.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void saveContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData, GroupName groupName) {
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
        selectGroup(new GroupName(groupName.getGroupName()));
        fieldFill(By.name("address2"), contactData.getAddress2());
        fieldFill(By.name("phone2"), contactData.getHomePhone2());
        fieldFill(By.name("notes"), contactData.getNotes());
    }

    private void selectGroup(GroupName groupName) {
        if(groupName.getGroupName() != null){
            click(By.name("new_group"));
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(groupName.getGroupName());
        }
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

    public void creationContact(ContactData contactData, GroupName groupName) {
        fillContactForm(contactData,groupName);
        saveContact();
    }

    public boolean isThereContactPresent() {
        return isElementPresent(By.xpath("//img[@alt='Edit']"));
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> webElements = wd.findElements(By.xpath("//*[@id='maintable']/tbody/tr[@name='entry']"));
        for (WebElement element : webElements) {
            List<WebElement> cells = element.findElements(By.tagName("td"));
                String contactLastName = cells.get(1).getText();
                String contactFirstName = cells.get(2).getText();
                int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
                ContactData contact = new ContactData(id, contactFirstName, null, contactLastName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                contacts.add(contact);

        }
        return contacts;
    }

    public void selectContactCheckbox(int i) {
        wd.findElements(By.name("selected[]")).get(i).click();
    }
}
