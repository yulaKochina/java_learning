package ru.yuko.java_learning.addressbook.tests;

import org.testng.annotations.Test;
import ru.yuko.java_learning.addressbook.model.GroupData;

public class DeleteGroupTests extends TestBase {

  @Test
  public void testDeleteGroupTests()  {
    app.getNavigationHelper().gotoGroupPage();
    if(!app.getGroupHelper().isThereGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("test11", "test22", "test33"));
    }
    app.getGroupHelper().selectGroupCheckbox();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnToGroupPage();
  }
}
