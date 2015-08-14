package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 7/21/2015.
 */
public class ExtractNounStemUdanLayer {

    /**
     * noun + இடம்
     * @return the stem of the noun
     */
    public static List<TamilFontEntity> ExtractNounStemUdan(String word) {
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        ArrayList<TamilFontEntity> letters;
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        if (tamilLetters.size() > 4) {
            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 4, tamilLetters.size());
            if (lastPart.equals(IOLayer.getTamil("த்துடன்"))) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                stem.add(IOLayer.getTamil("ம்").get(0));
                return stem;
            }
            else if (tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("ற்றுடன்")) || tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("ட்டுடன்"))) {
                if (tamilLetters.subList(tamilLetters.size() - 5, tamilLetters.size()).equals(IOLayer.getTamil("காற்றுடன்"))) {
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
        if(tamilLetters.size()>3)
        {
            if ( letters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("வுடன்"))) {
                stem = letters.subList(0, tamilLetters.size() - 3);
                return stem;
            }
        }
        if(tamilLetters.size()>2) {
            if ( letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("டன்"))) {
                if (tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ன்").get(0)) || tamilLetters.get(tamilLetters.size() - 4).equals(IOLayer.getTamil("ய்").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 3);
                    return stem;
                } else if (tamilLetters.subList(tamilLetters.size() - 3,tamilLetters.size()).equals(IOLayer.getTamil("குடன்")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("புடன்")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("துடன்")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("சுடன்"))) {
                    stem = letters.subList(0, tamilLetters.size() - 2);
                    return stem;
                }
                else if(tamilLetters.get(tamilLetters.size() - 4).getyLocation() == 2)
                {
                    stem = letters.subList(0, tamilLetters.size() - 3);
                    return stem;
                }
                else
                {
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
