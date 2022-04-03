package ru.yuko.java_learning.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test11", "test22", "test33"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
