package ru.yuko.java_learning.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before+1);
  }

}
