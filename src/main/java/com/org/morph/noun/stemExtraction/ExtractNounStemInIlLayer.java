package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 7/9/2015.
 */
public class ExtractNounStemInIlLayer {
    /**
     * noun + இல்
     * noun + இன்
     * @return the stem of the noun
     */
    public static List<TamilFontEntity> extractNounStemInIl(String word) {
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        ArrayList<TamilFontEntity> letters;
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        if (tamilLetters.size() > 3) {
            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 3, tamilLetters.size());
            if (lastPart.equals(IOLayer.getTamil("த்தில்")) ||lastPart.equals(IOLayer.getTamil("த்தின்")) ) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                stem.add(IOLayer.getTamil("ம்").get(0));
                return stem;
            }
            else if (tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ற்றின்")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ட்டின்"))||tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ற்றில்")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ட்டில்")) ) {
                if (tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("காற்றில்"))||tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("காற்றின்"))) {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 2);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                    return stem;
                } else {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 3);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                    return stem;
                }
            }
            if(tamilLetters.get(tamilLetters.size() - 3).getyLocation() == 8)
            {
                stem = letters.subList(0, tamilLetters.size() - 2);
                return stem;
            }

        }
        if(tamilLetters.size()>2) {
            if (letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("வின்")) || letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("வில்"))) {
                stem = letters.subList(0, tamilLetters.size() - 2);
                return stem;
            }

            if (letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("கின்")) || letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("கில்")) || letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("சின்")) || letters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("சில்")) ||tamilLetters.subList(tamilLetters.size() - 2,tamilLetters.size()).equals(IOLayer.getTamil("பில்")) ||tamilLetters.subList(tamilLetters.size() - 2,tamilLetters.size()).equals(IOLayer.getTamil("பின்")) ||tamilLetters.subList(tamilLetters.size() - 2,tamilLetters.size()).equals(IOLayer.getTamil("தில்")) ||tamilLetters.subList(tamilLetters.size() - 2,tamilLetters.size()).equals(IOLayer.getTamil("தின்"))  ) {
                {
                    stem = letters.subList(0, tamilLetters.size() - 2);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                    return stem;
                }

            }

            int y = tamilLetters.get(tamilLetters.size() - 2).getyLocation();
            if (y == 2 && (letters.subList(tamilLetters.size() - 1, tamilLetters.size()).equals(IOLayer.getTamil("ன்")) || letters.subList(tamilLetters.size() - 1, tamilLetters.size()).equals(IOLayer.getTamil("ல்")))) {
                if (tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ன்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ய்").get(0))) {
                    stem = letters.subList(0, tamilLetters.size() - 2);
                    return stem;
                } else if(tamilLetters.get(tamilLetters.size() - 3).getyLocation() == 2)
                {
                    stem = letters.subList(0, tamilLetters.size() - 2);
                    return stem;
                }
                else
                {
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
