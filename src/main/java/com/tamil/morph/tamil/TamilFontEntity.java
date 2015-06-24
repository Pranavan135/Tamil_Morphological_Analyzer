package main.java.com.tamil.morph.tamil;

import java.util.List;

/**
 * Created by pranavan on 19/06/15.
 */
public class TamilFontEntity {
    private List<String> unicodeList;
    private int xLocation;
    private int yLocation;

    public TamilFontEntity(List<String> unicodeList, int xLocation, int yLocation){
        this.unicodeList = unicodeList;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public List<String> getUnicodeList() {
        return unicodeList;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void setUnicodeList(List<String> unicodeList) {
        this.unicodeList = unicodeList;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    @Override
    public String toString() {
        String str = "";

        for(String s : unicodeList){
            str = str + s;
        }
        return str;
    }
}
