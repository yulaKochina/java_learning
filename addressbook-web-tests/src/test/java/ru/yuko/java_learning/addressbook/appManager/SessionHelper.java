package ru.yuko.java_learning.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        fieldFill(By.name("user"), username);
        fieldFill(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }

    public void logout() {
        click(By.linkText("Logout"));
    }
}
