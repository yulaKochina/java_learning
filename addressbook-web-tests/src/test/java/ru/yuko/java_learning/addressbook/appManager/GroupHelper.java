package ru.yuko.java_learning.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yuko.java_learning.addressbook.model.GroupData;

public class GroupHelper extends BaseHelper {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("groups"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        fieldFill(By.name("group_name"), groupData.getGroupName());
        fieldFill(By.name("group_header"), groupData.getGroupHeader());
        fieldFill(By.name("group_footer"), groupData.getGropFouter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }

    public void selectGroupCheckbox() {
        click(By.xpath("//span[1]/input"));
    }

    public void initGroupModification() {
        click(By.xpath("//input[6]"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupData groupData) {
        initGroupCreation();
        fillGroupForm(groupData);
        submitGroupCreation();
        returnToGroupPage();
    }

    public boolean isThereGroupPresent() {
        return isElementPresent(By.xpath("//span[1]/input"));

    }
}
