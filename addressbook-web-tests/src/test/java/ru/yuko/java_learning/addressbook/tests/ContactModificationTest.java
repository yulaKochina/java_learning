package ru.yuko.java_learning.addressbook.tests;

import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{
    @Test
    public void testContactModification(){
        app.getNavigationHelper().gotoPageHome();
        if(! app.getContactHelper().isThereContactPresent()){
            app.getNavigationHelper().gotoPageAddNewContact();
            app.getContactHelper().creationContact(new ContactData("Petr", "Petrovich", "Petrov", "Petka", "Petro_file", "PetroCo", "Petrov city, Petrovskaya street , 1/10", "10-10-10", "1023456789", "20-20-20", "30-30-30", "petro@mail.ru", "petya@yandex.ru", "petka@google.com", "www.petr.ru", "1", "June", "1990", "10", "July", "2000", "Petrov city, Petrovskaya street , 1/10", "10", "Add new contact"));
            app.getNavigationHelper().gotoPageHome();
        }
        app.getContactHelper().initModificationContact();
        app.getContactHelper().fillContactForm(new ContactData("Vasya", "Pavlovichh", "Pupkov", "Vaska", "V_file", "VascoCo", "Vasya city, Pervaya street , 10/10", "100-0-100", "1427456789", "30-30-30", "40-30-30", "vasya@mail.ru", "vasya@yandex.ru", "vasya@google.com", "www.vasya.ru", "10", "July", "1991", "11", "June", "2001", "Test city, Testovaya street , 10/10", "11", "Modification contact"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoPageHome();
    }
}
