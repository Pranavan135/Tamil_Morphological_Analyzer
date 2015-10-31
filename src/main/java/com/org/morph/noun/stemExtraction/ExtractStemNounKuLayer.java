package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2/1/1980.
 */
public class ExtractStemNounKuLayer {
    /**
     * Extract the noun from the 4 th proposition
     * *noun + கு
     * @return stem of the noun as a list
     */
    public static List<TamilFontEntity> extractStemNounKu(String word) {
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        ArrayList<TamilFontEntity> letters;
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        if (tamilLetters.size() > 4) {
            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 4, tamilLetters.size());
            if (lastPart.equals(IOLayer.getTamil("த்துக்கு"))) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                stem.add(IOLayer.getTamil("ம்").get(0));
                return stem;

            }
            else if (tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("ற்றுக்கு")) || tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("ட்டுக்கு"))) {
                if (tamilLetters.subList(tamilLetters.size() - 5, tamilLetters.size()).equals(IOLayer.getTamil("காற்றுக்கு"))) {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 3);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 3).getxLocation(), 4));
                    return stem;
                } else {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 4);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 3).getxLocation(), 4));
                    return stem;
                }
            }
        }
        if (tamilLetters.size() > 3) {

            if ( letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("க்கு"))) {
                System.out.println(letters.subList(tamilLetters.size() - 2, tamilLetters.size()));
                if (tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ய்").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 2);
                    return stem;
                }
            }
            if( (tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("வுக்கு"))) ) {
            stem = letters.subList(0, tamilLetters.size() - 3);
            return stem;
             }

            int y = tamilLetters.get(tamilLetters.size() - 3).getyLocation();

            if (y == 4 && letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("க்கு"))) {
                if (tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ன்").get(0)) || tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ய்").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 3);
                    return stem;
                }else if (tamilLetters.subList(tamilLetters.size() - 3,tamilLetters.size()).equals(IOLayer.getTamil("குக்கு")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("புக்கு")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("துக்கு")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("சுக்கு"))) {
                    stem = letters.subList(0, tamilLetters.size() - 2);
                    return stem;
                } else if (letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("க்கு"))) {

                    int x = tamilLetters.get(tamilLetters.size() - 3).getxLocation();
                    stem = letters.subList(0, tamilLetters.size() - 3);
                    stem.add(TamilLayout.bodies[x]);
                    return stem;
                }
            }
        }
        return null;
    }


}
