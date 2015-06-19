package com.morph.tamil;

import java.util.List;

/**
 * Created by pranavan on 19/06/15.
 */
public class TamilFontEntity {
    private List<Character> charList;
    private int xLocation;
    private int yLocation;

    public TamilFontEntity(List<Character> charList, int xLocation, int yLocation){
        this.charList = charList;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public List<Character> getCharList() {
        return charList;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void setCharList(List<Character> charList) {
        this.charList = charList;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }
}
