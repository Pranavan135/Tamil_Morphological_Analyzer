package com.org.morph.tamil;

import com.org.morph.io.IOLayer;

import java.util.List;

/**
 * Created by pranavan on 7/10/15.
 */
public class TamilWord {
    private String word;

    public TamilWord(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public List<TamilFontEntity> getTamilEnityList(){
        return IOLayer.getTamil(word);
    }
}
