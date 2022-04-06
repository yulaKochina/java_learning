package ru.yuko.java_learning.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTests extends TestBase {

  @Test
  public void testDeleteGroupTests()  {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroupChekbox();
    app.getGroupHelper().deleteGroup();
  }
}
