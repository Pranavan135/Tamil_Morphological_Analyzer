package com.org.morph.noun;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by megala on 7/15/15.
 *
 * This class is used to detect the plural word and get the stem out of the plural word
 */
public class PluralStemDetectionLayer {
    private static Logger log = Logger.getLogger(PluralStemDetectionLayer.class.getName());

    public static List<TamilFontEntity>  extractStemFromPlural(String word) {
        List<TamilFontEntity> tamilWord = IOLayer.getTamil(word);

        if(tamilWord.size() >2) {
            List<TamilFontEntity> lastPart = tamilWord.subList(tamilWord.size() - 2, tamilWord.size());
            List<TamilFontEntity> stem = tamilWord.subList(0, tamilWord.size()-2);

            if(lastPart.equals(IOLayer.getTamil("கள்"))) {

                if(tamilWord.size() > 3) {
                    TamilFontEntity f = tamilWord.get(tamilWord.size()-3);
                            if(f.equals(IOLayer.getTamil("ர்").get(0))&& !(tamilWord.get(tamilWord.size()-4).equals(IOLayer.getTamil("மா").get(0)))&& tamilWord.get(tamilWord.size()-4).getyLocation() == 1){
                                return null;
                            }
                            else if(f.equals(IOLayer.getTamil("ங்").get(0))) {
                                stem = tamilWord.subList(0, tamilWord.size()-3);
                                stem.add(IOLayer.getTamil("ம்").get(0));
                                return stem;
                            }
                            else if(f.equals(IOLayer.getTamil("க்").get(0))) {
                                stem = tamilWord.subList(0, tamilWord.size()-3);
                                return stem;
                            }
                            else  if(f.equals(IOLayer.getTamil("ர்").get(0))&& tamilWord.get(tamilWord.size()-4).equals(IOLayer.getTamil("மா").get(0))){
                                stem = tamilWord.subList(0, tamilWord.size()-2);
                                return stem;
                            }
                            else if(f.equals(IOLayer.getTamil("ர்").get(0))) {
                                stem = tamilWord.subList(0, tamilWord.size()-3);
                                stem.add(IOLayer.getTamil("ன்").get(0));
                                return stem;
                            }

                    return stem;
                }
            }
        }
        return null;

    }



}
