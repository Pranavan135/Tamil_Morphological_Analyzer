package com.org.morph.io;

import com.org.morph.tamil.TamilFontEntity;

import java.util.List;

/**
 * Created by pranavan on 22/06/15.
 */
public class IOLayer {
    /**
     * need to implement
     * @param text
     * @return
     */
    public static List<TamilFontEntity> getTamil(String text){
        return null;
    }

    /**
     * @param list
     * @return
     */
    public static StringBuilder getText(List<TamilFontEntity> list){
        StringBuilder stringBuilder = new StringBuilder();

        for(TamilFontEntity tamilFontEntity : list){
            stringBuilder.append(tamilFontEntity.toString());
        }

        return stringBuilder;
    }
}
