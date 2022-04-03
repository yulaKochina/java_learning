package ru.yuko.java_learning.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    gotoPageAddNewContact();
    fillContactForm(new ContactData("Petr", "Petrovich", "Petrov", "Petka", "Petro_file", "PetroCo", "Petrov city, Petrovskaya street , 1/10", "10-10-10", "1023456789", "20-20-20", "30-30-30", "petro@mail.ru", "petya@yandex.ru", "petka@google.com", "www.petr.ru", "1", "June", "1990", "10", "July", "2000", "test11", "Petrov city, Petrovskaya street , 1/10", "10", "Add new contact"));
    saveContact();
    gotoPageHome();
  }

}
