package com.org.morph.noun.stemExtraction;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to analysis the nouns end with Al markers
 * Created by Nilusija
 */

public class ExtractNounStemAlLayer {

    /**
     * Extract the stem noun from the word which affix with 3 rd proposition ஆல்
     * noun + ஆல்
     * @return stem of the noun as a TamilFontEntity list
     */

    public static List<TamilFontEntity> extractStemNounAl(String word) {
        List<TamilFontEntity> tamilLetters = IOLayer.getTamil(word);
        ArrayList<TamilFontEntity> letters;
        letters = new ArrayList<>(tamilLetters);
        List<TamilFontEntity> stem;

        if (tamilLetters.size() > 3) {
            List<TamilFontEntity> lastPart = letters.subList(tamilLetters.size() - 3, tamilLetters.size());
            if (lastPart.equals(IOLayer.getTamil("த்தால்"))) {
                stem = tamilLetters.subList(0, tamilLetters.size() - (lastPart.size()));
                stem.add(IOLayer.getTamil("ம்").get(0));
                return stem;

            } else if (tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ற்றால்")) || tamilLetters.subList(tamilLetters.size() - 3, tamilLetters.size()).equals(IOLayer.getTamil("ட்டால்"))) {
                if (tamilLetters.subList(tamilLetters.size() - 4, tamilLetters.size()).equals(IOLayer.getTamil("காற்றால்"))) {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 2);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                    return stem;
                } else {
                    stem = tamilLetters.subList(0, tamilLetters.size() - 3);
                    stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() - 2).getxLocation(), 4));
                    return stem;
                }
            }
        }
        if(tamilLetters.size()>2) {

            if (tamilLetters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("வால்"))) {
                stem = letters.subList(0, tamilLetters.size() - 2);
                return stem;
            } else if ((tamilLetters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("யால்"))) && tamilLetters.get(tamilLetters.size() - 3).getyLocation() == 1) {
                stem = letters.subList(0, tamilLetters.size() - 2);
                stem.add(IOLayer.getTamil("ய்").get(0));
                return stem;
            } else if ( tamilLetters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("யால்"))) {
                stem = letters.subList(0, tamilLetters.size() - 2);
                return stem;
            }

                int y = tamilLetters.get(tamilLetters.size() - 2).getyLocation();

            if (letters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("ல்").get(0))) {
                    if (y == 1 ) {
                        if (tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ண்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ல்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ன்").get(0)) || tamilLetters.get(tamilLetters.size() - 3).equals(IOLayer.getTamil("ய்").get(0))) {
                            stem = letters.subList(0, tamilLetters.size() - 2);
                            return stem;
                        } else if (tamilLetters.subList(tamilLetters.size() - 2,tamilLetters.size()).equals(IOLayer.getTamil("கால்")) || tamilLetters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("பால்")) || tamilLetters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("தால்")) || tamilLetters.subList(tamilLetters.size() - 2, tamilLetters.size()).equals(IOLayer.getTamil("சால்"))) {
                            stem = letters.subList(0, tamilLetters.size() - 2);
                            stem.add(TamilLayout.getEntity(tamilLetters.get(tamilLetters.size() -2 ).getxLocation(), 4));
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
        }
    return null;
    }

}
