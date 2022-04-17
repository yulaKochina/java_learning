package ru.yuko.java_learning.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        if(!app.getGroupHelper().isThereGroupPresent()){
            app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
        }
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroupCheckbox(before.size()-1);
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData(before.get(before.size()-1).getId(), "1", "1", "1");//("PROTO", "olol", "kabuki");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size()-1);
        before.add(group);
        Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));

    }
}
