package com.company;

import java.util.Vector;

public class Advertiser extends BaseAdvertising {

    private String name;
    private static int totalClicks = 0;
    private static Vector<Integer> otherId = new Vector<>();

    public Advertiser(int id, String name) throws Exception {
        super(id);
        this.name = name;

        //check is ID uniq
        if (otherId.contains(id))
            throw new Exception("this ID is used.");
        else {
            otherId.add(id);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        return "you should input (id, name), then the counter will start from 0.";
    }

    @Override
    public String describeMe() {
        return "The information data of Advertiser";
    }

    @Override
    public void incClicks(){
        super.incClicks();
        totalClicks += 1;
    }

    public static int getTotalClicks(){
        return totalClicks;
    }
}
