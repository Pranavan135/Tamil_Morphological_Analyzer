package com.org.morph.io;

import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pranavan on 22/06/15.
 */
public class IOLayer {

    /**
     * if we input the tamil text from a file
     * @param text
     * @return list of Tamil fonts in the text
     */
    public static List<TamilFontEntity> getTamil(String text){
        List<TamilFontEntity> tamilFontEntities = new ArrayList<>();

        for(int i = 0 ; i < text.length() ; i++){

            String s1 = String.valueOf(text.charAt(i));

            if(TamilLayout.startLetters.contains(s1) && i + 1 < text.length()){
                String s2 = String.valueOf(text.charAt(i+1));

                if(TamilLayout.endLetters.contains(s2 + " ")){
                    tamilFontEntities.add(TamilLayout.tamilLetterMap.get(s1 + s2 + " "));
                    i = i + 1;
                }

                else {
                   tamilFontEntities.add(TamilLayout.tamilLetterMap.get(s1));
                }
            } else {
                tamilFontEntities.add(new TamilFontEntity(s1));
            }
        }
        return tamilFontEntities;
    }

    /** change list of TamilFontEntity to tamil text
     * @param list
     * @return string of tamil text
     */
    public static StringBuilder getText(List<TamilFontEntity> list){
        StringBuilder stringBuilder = new StringBuilder();

        for(TamilFontEntity tamilFontEntity : list){
            if(tamilFontEntity.isTamilLetter())
                stringBuilder.append(tamilFontEntity.toString().trim());
            else
                stringBuilder.append(tamilFontEntity.toString());
        }

        return stringBuilder;
    }

    public static void main(String[] args) {
        /**
         * sample tests
         */
        TamilLayout.init();
        String text1 = "நான் கடைக்கு போனேன்";
        String text2 = "நான் கடைக்கு நடந்து கடைக்கு போனேன்";

        List<TamilFontEntity> tamilFontEntities1 = getTamil(text1);
        System.out.println(tamilFontEntities1.size());

        List<TamilFontEntity> tamilFontEntities2 = getTamil(text2);
        System.out.println(tamilFontEntities2.size());

        System.out.println(TamilLayout.startLetters);
        System.out.println(TamilLayout.endLetters);

        System.out.println(getText(tamilFontEntities1).toString());
        System.out.println(getText(tamilFontEntities2).toString());

    }
}
