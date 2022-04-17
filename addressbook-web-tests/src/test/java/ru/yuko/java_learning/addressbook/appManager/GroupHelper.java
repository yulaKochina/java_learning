package ru.yuko.java_learning.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yuko.java_learning.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

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

    public void selectGroupCheckbox(int i) {
        wd.findElements(By.name("selected[]")).get(i).click();
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

    public String getNameGroup() {
        wd.findElement(By.linkText("groups")).click();
        click(By.xpath("//span[1]/input"));
        click(By.xpath("//input[6]"));
        return wd.findElement(By.name("group_name")).getAttribute( "value" );
    }

    public int getGroupCount() {
       return wd.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<GroupData>();
        List<WebElement> wbElements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element : wbElements) {
            String groupName = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData(id, groupName, null, null);
            groups.add(group);
        }
        return groups;
    }
}