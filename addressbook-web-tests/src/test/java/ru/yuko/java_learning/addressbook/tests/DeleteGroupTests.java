package ru.yuko.java_learning.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.GroupData;

import java.util.List;

public class DeleteGroupTests extends TestBase {

  @Test
  public void testDeleteGroupTests()  {
    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupHelper().isThereGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
    }
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroupCheckbox(before.size()-1);
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size()-1);

    before.remove(before.size()-1);
      Assert.assertEquals(after, before);
  }
}
