package ru.yuko.java_learning.addressbook;

public class GroupData {
    private final String groupName;
    private final String groupHeader;
    private final String gropFouter;

    public GroupData(String groupName, String groupHeader, String gropFouter) {
        this.groupName = groupName;
        this.groupHeader = groupHeader;
        this.gropFouter = gropFouter;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public String getGropFouter() {
        return gropFouter;
    }
}
