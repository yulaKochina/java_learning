package ru.yuko.java_learning.addressbook;

import org.testng.annotations.Test;

public class DeleteGroupTests extends TestBase{

  @Test
  public void testDeleteGroupTests()  {
    selectGroupChekbox();
    deleteGroup();
  }
}
