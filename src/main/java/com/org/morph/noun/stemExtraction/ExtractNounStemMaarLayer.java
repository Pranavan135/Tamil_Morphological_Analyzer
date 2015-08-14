package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 7/18/2015.
 */
public class ExtractNounStemMaarLayer {
    /**
     * noun + இடம்
     * @return the stem of the noun
     */
    public static List<TamilFontEntity> extractNounStemMaar(String word) {
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        ArrayList<TamilFontEntity> letters;
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        if (tamilLetters.size() > 2) {
            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 2, tamilLetters.size());

            if (lastPart.equals(IOLayer.getTamil("மார்"))) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                return stem;
            }
        }
    return null;
    }

}
