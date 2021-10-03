package com.company;

public class BaseAdvertising {
    private int id;
    private int clicks;
    private int views;

    public BaseAdvertising() {}
    public BaseAdvertising(int id) {
        this.id = id;
        this.clicks = 0;
        this.views = 0;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void incClicks() {
        this.clicks += 1;
    }

    public void incViews() {
        this.views += 1;
    }

    public String describeMe() {
        return "My duty";
    }
}
