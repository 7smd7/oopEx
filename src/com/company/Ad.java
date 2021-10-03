package com.company;

import java.util.Vector;

public class Ad extends BaseAdvertising{
    private static Vector<Integer> otherId = new Vector<>();
    private String title;
    private String imgUrl;
    private String link;
    private Advertiser advertiser;

    public Ad(int id, String title, String imgUrl, String link, Advertiser advertiser) throws Exception {
        super(id);
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
        this.advertiser = advertiser;

        //check is ID uniq
        if (otherId.contains(id))
            throw new Exception("this ID is used.");
        else {
            otherId.add(id);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAdvertiser(Advertiser advertiser){
        this.advertiser = advertiser;
    }

    @Override
    public void incClicks(){
        super.incClicks();
        this.advertiser.incClicks();
    }

    @Override
    public void incViews(){
        super.incViews();
        this.advertiser.incViews();
    }

    @Override
    public String describeMe(){
        return "The information data of Ad";
    }
}
