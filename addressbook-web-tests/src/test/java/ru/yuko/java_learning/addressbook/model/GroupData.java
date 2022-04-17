package ru.yuko.java_learning.addressbook.model;

import java.util.Objects;

public class GroupData {
    private int id;
    private final String groupName;
    private final String groupHeader;
    private final String gropFouter;

    public GroupData(String groupName, String groupHeader, String gropFouter) {
        this.id = 0;
        this.groupName = groupName;
        this.groupHeader = groupHeader;
        this.gropFouter = gropFouter;
    }
    public GroupData(int id, String groupName, String groupHeader, String gropFouter) {
        this.id = id;
        this.groupName = groupName;
        this.groupHeader = groupHeader;
        this.gropFouter = gropFouter;
    }

    public int getId() {  return id;    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return id == groupData.id && Objects.equals(groupName, groupData.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName);
    }
}
