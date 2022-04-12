package ru.yuko.java_learning.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.GroupData;

public class DeleteGroupTests extends TestBase {

  @Test
  public void testDeleteGroupTests()  {
    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupHelper().isThereGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
    }
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroupCheckbox();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before-1);
  }
}
