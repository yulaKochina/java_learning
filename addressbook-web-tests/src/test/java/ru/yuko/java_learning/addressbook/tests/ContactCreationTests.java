package ru.yuko.java_learning.addressbook.tests;

import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.appManager.GroupName;
import ru.yuko.java_learning.addressbook.model.ContactData;
import ru.yuko.java_learning.addressbook.model.GroupData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupHelper().isThereGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
    }
    String groupName = app.getGroupHelper().getNameGroup();
    app.getNavigationHelper().gotoPageAddNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Petr", "Petrovich", "Petrov", "Petka", "Petro_file", "PetroCo", "Petrov city, Petrovskaya street , 1/10", "10-10-10", "1023456789", "20-20-20", "30-30-30", "petro@mail.ru", "petya@yandex.ru", "petka@google.com", "www.petr.ru", "1", "June", "1990", "10", "July", "2000", "test11", "Petrov city, Petrovskaya street , 1/10", "10", "Add new contact"), new GroupName(groupName));
    app.getContactHelper().saveContact();
    app.getNavigationHelper().gotoPageHome();
  }

}
