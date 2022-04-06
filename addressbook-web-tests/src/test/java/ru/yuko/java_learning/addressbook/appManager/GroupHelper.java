package ru.yuko.java_learning.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yuko.java_learning.addressbook.model.GroupData;

public class GroupHelper {
    private WebDriver wd;

    public GroupHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void returnToGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    public void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getGropFouter());
    }

    public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
    }

    public void deleteGroup() {
      wd.findElement(By.name("delete")).click();
    }

    public void selectGroupChekbox() {
      wd.findElement(By.xpath("//span[1]/input")).click();
    }
}
