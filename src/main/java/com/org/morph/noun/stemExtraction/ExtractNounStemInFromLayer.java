package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
* This class is used to analysis the nouns end with னிலிருந்து
* Created by Nilusija
 */

public class ExtractNounStemInFromLayer {

    /**
     * Extract the stem noun from the word which affix with இன் + இல் + இருந்து
     * noun + இன் + இல் + இருந்து
     * @return stem of the noun as a TamilFontEntity list
     */

    public static List<TamilFontEntity> extractStemNounInFrom(String word) {
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        ArrayList<TamilFontEntity> letters;
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        if(tamilLetters.size()>7) {
            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 7, tamilLetters.size());
            if (lastPart.equals(IOLayer.getTamil("த்தினிலிருந்து"))) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                stem.add(IOLayer.getTamil("ம்").get(0));
                return stem;
            }
            else if (tamilLetters.subList(tamilLetters.size() - 7, tamilLetters.size()).equals(IOLayer.getTamil("ற்றினிலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 7, tamilLetters.size()).equals(IOLayer.getTamil("ட்டினிலிருந்து"))) {
                if (tamilLetters.subList(tamilLetters.size() - 8, tamilLetters.size()).equals(IOLayer.getTamil("காற்றினிலிருந்து"))) {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 6);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 6).getxLocation(), 4));
                    return stem;
                } else {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 7);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 7).getxLocation(), 4));
                    return stem;
                }
            }
        }
        if(tamilLetters.size()>6)
        {
            if( tamilLetters.subList(tamilLetters.size() -6 , tamilLetters.size()).equals(IOLayer.getTamil("வினிலிருந்து")) ) {
                stem = letters.subList(0, tamilLetters.size() -6);
                return stem;
            } else if ( tamilLetters.subList(tamilLetters.size() - 6,tamilLetters.size()).equals(IOLayer.getTamil("யினிலிருந்து")) && tamilLetters.get(tamilLetters.size() -7).getyLocation() == 1)
            {
                stem = letters.subList(0, tamilLetters.size()-6);
                stem.add(IOLayer.getTamil("ய்").get(0));
                return stem;
            }
            else if ( tamilLetters.subList(tamilLetters.size() - 6,tamilLetters.size()).equals(IOLayer.getTamil("யினிலிருந்து")))
            {
                stem = letters.subList(0, tamilLetters.size()-6);
                return stem;
            }

            if ( (letters.subList(tamilLetters.size() - 5, tamilLetters.size()).equals(IOLayer.getTamil("னிலிருந்து")))) {
                if (tamilLetters.get(tamilLetters.size() - 7).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 7).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 7).equals(IOLayer.getTamil("ன்").get(0)) || tamilLetters.get(tamilLetters.size() - 7).equals(IOLayer.getTamil("ய்").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 6);
                    return stem;
                }else if (tamilLetters.subList(tamilLetters.size() - 6,tamilLetters.size()).equals(IOLayer.getTamil("கினிலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 6, tamilLetters.size()).equals(IOLayer.getTamil("பினிலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 6, tamilLetters.size()).equals(IOLayer.getTamil("தினிலிருந்து")) || tamilLetters.subList(tamilLetters.size() - 6, tamilLetters.size()).equals(IOLayer.getTamil("சினிலிருந்து"))) {
                    stem = letters.subList(0, tamilLetters.size() - 6);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() -6 ).getxLocation(), 4));
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
