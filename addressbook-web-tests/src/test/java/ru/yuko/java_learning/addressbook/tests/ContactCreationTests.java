package ru.yuko.java_learning.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.appManager.GroupName;
import ru.yuko.java_learning.addressbook.model.ContactData;
import ru.yuko.java_learning.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupHelper().isThereGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
    }
    String groupName = app.getGroupHelper().getNameGroup();
    app.getNavigationHelper().gotoPageHome();
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().gotoPageAddNewContact();
    ContactData contact = new ContactData("Petr", "Petrovich", "Petrov", "Petka", "Petro_file", "PetroCo", "Petrov city, Petrovskaya street , 1/10", "10-10-10", "1023456789", "20-20-20", "30-30-30", "petro@mail.ru", "petya@yandex.ru", "petka@google.com", "www.petr.ru", "1", "June", "1990", "10", "July", "2000", "test11", "Petrov city, Petrovskaya street , 1/10", "10", "Add new contact");
    app.getContactHelper().creationContact(contact, new GroupName(groupName));
    app.getNavigationHelper().gotoPageHome();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size()+1);

    contact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) ->Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}
