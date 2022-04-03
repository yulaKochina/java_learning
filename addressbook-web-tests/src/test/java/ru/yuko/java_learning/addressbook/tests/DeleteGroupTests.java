package ru.yuko.java_learning.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTests extends TestBase {

  @Test
  public void testDeleteGroupTests()  {
    app.selectGroupChekbox();
    app.deleteGroup();
  }
}
