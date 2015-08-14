package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2/1/1980.
 */
public class ExtractNounStemIrunthuLayer {
    private List<TamilFontEntity> tamilLetters;

    /**
     * Extract the noun from the 4 th proposition
     * noun + இருந்து
     * @return stem of the noun as a list
     */
    public static List<TamilFontEntity> extractStemNounIrunthu(String word) {
        ArrayList<TamilFontEntity> letters;
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        if(tamilLetters.size()>6) {
            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 6, tamilLetters.size());
            if (lastPart.equals(IOLayer.getTamil("த்திலிருந்து"))) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                stem.add(IOLayer.getTamil("ம்").get(0));
                return stem;
            }
            else if (tamilLetters.subList(tamilLetters.size() - 6, tamilLetters.size()).equals(IOLayer.getTamil("ற்றிலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 6, tamilLetters.size()).equals(IOLayer.getTamil("ட்டிலிருந்து"))) {
                if (tamilLetters.subList(tamilLetters.size() - 7, tamilLetters.size()).equals(IOLayer.getTamil("காற்றிலிருந்து"))) {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 5);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 5).getxLocation(), 4));
                    return stem;
                } else {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 6);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 5).getxLocation(), 4));
                    return stem;
                }
            }
        }
        if(tamilLetters.size()>5)
        {
            if( tamilLetters.subList(tamilLetters.size() -5 , tamilLetters.size()).equals(IOLayer.getTamil("விலிருந்து")) ) {
                stem = letters.subList(0, tamilLetters.size() -5);
                return stem;
            } else if ( tamilLetters.subList(tamilLetters.size() - 5,tamilLetters.size()).equals(IOLayer.getTamil("யிலிருந்து")) && tamilLetters.get(tamilLetters.size() -6).getyLocation() == 1)
            {
                stem = letters.subList(0, tamilLetters.size()-5);
                stem.add(IOLayer.getTamil("ய்").get(0));
                return stem;
            }
            else if ( tamilLetters.subList(tamilLetters.size() - 5,tamilLetters.size()).equals(IOLayer.getTamil("யிலிருந்து")))
            {
                stem = letters.subList(0, tamilLetters.size()-5);
                return stem;
            }

            int y = tamilLetters.get(tamilLetters.size() - 5).getyLocation();
            if (y == 2 && (letters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("லிருந்து")))) {
                if (tamilLetters.get(tamilLetters.size() - 6).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 6).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 6).equals(IOLayer.getTamil("ன்").get(0)) || tamilLetters.get(tamilLetters.size() - 6).equals(IOLayer.getTamil("ய்").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 5);
                    return stem;
                }else if (tamilLetters.subList(tamilLetters.size() - 5,tamilLetters.size()).equals(IOLayer.getTamil("கிலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 5, tamilLetters.size()).equals(IOLayer.getTamil("பிலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 5, tamilLetters.size()).equals(IOLayer.getTamil("திலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 5, tamilLetters.size()).equals(IOLayer.getTamil("சிலிருந்து"))) {
                    stem = letters.subList(0, tamilLetters.size() - 5);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() -5 ).getxLocation(), 4));
                    return stem;
                }
                else {
                    int x = tamilLetters.get(tamilLetters.size() - 5).getxLocation();
                    stem = letters.subList(0, tamilLetters.size() - 5);
                    stem.add(TamilLayout.bodies[x]);
                    return stem;
                }

            }
        }
        return  null;
    }


}
