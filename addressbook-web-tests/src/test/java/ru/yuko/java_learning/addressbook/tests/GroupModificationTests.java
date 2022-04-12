package ru.yuko.java_learning.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        if(!app.getGroupHelper().isThereGroupPresent()){
            app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
        }
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroupCheckbox();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("PROTO", "olol", "kabuki"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }
}
