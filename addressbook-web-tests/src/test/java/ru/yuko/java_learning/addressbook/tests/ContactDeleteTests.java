package ru.yuko.java_learning.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeleteTests extends TestBase {

    @Test
    public void testContactDelete(){
        app.getNavigationHelper().gotoPageHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().contactDelete();
        app.getContactHelper().acceptDelete();
        app.getNavigationHelper().gotoPageHome();

    }
}
