package com.org.morph.noun;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by megala on 7/9/15.
 * This class is used to detect the noun based on its previous word
 */
public class BigramDetector {
    private static List<String> previousWordList;

    /**
     * Initialization of possible previous words before a noun
     */
    public static void init() {
        previousWordList = new ArrayList<>();
        previousWordList.add("நல்ல");
        previousWordList.add("புதிய");
        previousWordList.add("பழைய");
    }

    /**
     * To check whether the current word is noun based on the previous word
     * @param previousWord Previous word to the current word in the sentecne
     * @return true if the current word is noun based on the previous word, unless false
     */
    public static boolean isNoun(String previousWord) {
        if(previousWordList.contains(previousWord))
            return true;
        else {
            List<TamilFontEntity> tamilWord = IOLayer.getTamil(previousWord);

            if(tamilWord.size() == 0){
                return false;
            }
            if(tamilWord.get(tamilWord.size()-1).getxLocation() == 0){
                return true;
            }
            else
                return false;
        }

    }
}
