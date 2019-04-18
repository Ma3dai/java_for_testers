package ru.javatests.addressbook;


import org.testng.annotations.*;


public class CreateGroup extends TestBase {

  @Test
  public void testCreateGroup() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
