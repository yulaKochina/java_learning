package ru.yuko.java_learning.addressbook;

public class AnniversaryDayData {
    private final String aday;
    private final String amonth;
    private final String ayear;

    public AnniversaryDayData(String aday, String amonth, String ayear) {
        this.aday = aday;
        this.amonth = amonth;
        this.ayear = ayear;
    }

    public String getAday() {
        return aday;
    }

    public String getAmonth() {
        return amonth;
    }

    public String getAyear() {
        return ayear;
    }
}
