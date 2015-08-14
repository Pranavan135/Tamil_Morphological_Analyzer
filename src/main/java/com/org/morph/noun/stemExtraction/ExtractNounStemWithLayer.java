package com.org.morph.noun.stemExtraction;
import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by user on 7/14/2015.
 */
public class ExtractNounStemWithLayer {
        /**
         * Extract the noun from the  proposition (ஒடு)
         * @return stem of the noun as a list
         */
        public static List<TamilFontEntity> ExtractNounStemWith(String word) {
            List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
            ArrayList<TamilFontEntity> letters;
            letters = new ArrayList<>(tamilLetters);
            List<TamilFontEntity> stem;

            int y = tamilLetters.get(tamilLetters.size()-2).getyLocation();

            if(tamilLetters.size()>=2) {
                if (y == 10 && tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("டு").get(0))) {

                    List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 3, tamilLetters.size());

                    if (lastPart.equals(IOLayer.getTamil("த்தோடு"))) {
                        stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                        stem.add(IOLayer.getTamil("ம்").get(0));
                        return stem;
                    } else if (tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ற்றோடு")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ட்டோடு"))) {
                        if (tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("காற்றோடு"))) {
                            stem = tamilLetters.subList(0, tamilLetters.size() - 2);
                            stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                            return stem;
                        } else {
                            stem = tamilLetters.subList(0, tamilLetters.size() - 3);
                            stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                            return stem;
                        }
                    } else if (tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ய்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ன்").get(0))) {
                        stem = letters.subList(0, tamilLetters.size() - 2);
                        return stem;
                    } else if (tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("கோ").get(0)) || tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("சோ").get(0)) || tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("போ").get(0)) || tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("தோ").get(0))) {
                        stem = letters.subList(0, tamilLetters.size() - 2);
                        stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                        return stem;
                    } else if ((tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("யோ").get(0))) && tamilLetters.get(tamilLetters.size() - 3).getyLocation() == 1) {
                        int x = tamilLetters.get(tamilLetters.size() - 2).getxLocation();
                        stem = letters.subList(0, tamilLetters.size() - 2);
                        stem.add(TamilLayout.bodies[x]);
                        return stem;
                    } else if (tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("வோ").get(0)) || tamilLetters.get(tamilLetters.size() - 2).equals(IOLayer.getTamil("யோ").get(0))) {
                        stem = letters.subList(0, tamilLetters.size() - 2);
                        return stem;
                    } else {

                        int x = tamilLetters.get(tamilLetters.size() - 2).getxLocation();
                        stem = letters.subList(0, tamilLetters.size() - 2);
                        stem.add(TamilLayout.bodies[x]);
                        return stem;
                    }
                }
            }
            return null;

        }



}
