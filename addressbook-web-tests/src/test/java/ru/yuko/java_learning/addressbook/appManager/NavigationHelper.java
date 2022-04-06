package ru.yuko.java_learning.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    public void gotoPageHome() {
      wd.findElement(By.linkText("home")).click();
    }

    public void gotoPageAddNewContact() {
      wd.findElement(By.linkText("add new")).click();
    }
}
