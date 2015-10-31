package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Extracting the noun stem from 2 nd preposition (ஐ)
 * created by Nilusija
 */

public class ExtractNounStemILayer {

    /**
     * Extract the stem noun from the word which affix with 2 nd proposition ஐ
     * noun + ஐ
     * @return stem of the noun as a TamilFontEntity list
     */

    public static List<TamilFontEntity> extractNounStemI(String word) {
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        ArrayList<TamilFontEntity> letters;
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        int y = tamilLetters.get(tamilLetters.size()-1).getyLocation();

        if(tamilLetters.size()>=2 && y==8) {

            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 2, tamilLetters.size());

            if (lastPart.equals(IOLayer.getTamil("த்தை"))) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                stem.add(IOLayer.getTamil("ம்").get(0));
                return stem;
            }
           else if (tamilLetters.subList(tamilLetters.size()-2, tamilLetters.size()).equals(IOLayer.getTamil("ற்றை")) || tamilLetters.subList(tamilLetters.size()-2, tamilLetters.size()).equals(IOLayer.getTamil("ட்டை")) ) {
                if (tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("காற்றை"))) {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 1);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 1).getxLocation(), 4));
                    return stem;
                } else {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 2);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 1).getxLocation(), 4));
                    return stem;
                }
            }

              else  if (tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("ய்").get(0)) || tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("ன்").get(0)) || tamilLetters.get(tamilLetters.size() - 2).getyLocation() == 8) {
                    stem = letters.subList(0, tamilLetters.size() - 1);
                    return stem;
                } else if (tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("கை").get(0)) || tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("சை").get(0)) || tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("பை").get(0)) || tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("தை").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 1);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 1).getxLocation(), 4));
                    return stem;
                } else if ((tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("யை").get(0))) && tamilLetters.get(tamilLetters.size() - 2).getyLocation() == 1) {
                    int x = tamilLetters.get(tamilLetters.size() - 1).getxLocation();
                    stem = letters.subList(0, tamilLetters.size() - 1);
                    stem.add(TamilLayout.bodies[x]);
                    return stem;
                } else if (tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("வை").get(0)) || tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("யை").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 1);
                    return stem;
                } else {

                    int x = tamilLetters.get(tamilLetters.size() - 1).getxLocation();
                    stem = letters.subList(0, tamilLetters.size() - 1);
                    stem.add(TamilLayout.bodies[x]);
                    return stem;
                }
            }

   return null;

    }



}
