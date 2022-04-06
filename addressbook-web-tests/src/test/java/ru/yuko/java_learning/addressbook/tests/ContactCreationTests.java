package ru.yuko.java_learning.addressbook.tests;

import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoPageAddNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Petr", "Petrovich", "Petrov", "Petka", "Petro_file", "PetroCo", "Petrov city, Petrovskaya street , 1/10", "10-10-10", "1023456789", "20-20-20", "30-30-30", "petro@mail.ru", "petya@yandex.ru", "petka@google.com", "www.petr.ru", "1", "June", "1990", "10", "July", "2000", "Petrov city, Petrovskaya street , 1/10", "10", "Add new contact"));
    app.getContactHelper().saveContact();
    app.getNavigationHelper().gotoPageHome();
  }

}
