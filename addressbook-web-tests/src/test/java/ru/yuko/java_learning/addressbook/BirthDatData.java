package ru.yuko.java_learning.addressbook;

public class BirthDatData {
    private final String bday;
    private final String bmonth;
    private final String byear;

    public BirthDatData(String bday, String bmonth, String byear) {
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }
}
