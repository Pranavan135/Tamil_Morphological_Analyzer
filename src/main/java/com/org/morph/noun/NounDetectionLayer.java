package com.org.morph.noun;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;
import com.org.morph.test.IOChecking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by megala on 6/25/15.
 * Layer to detect the nouns in a text with the grammer rules and corpus
 */
public class NounDetectionLayer {
    private String word;
    private boolean isNoun;
    private List<TamilFontEntity> tamilLetters;

    /**
     * Constructs a noun detection layer for a particular word
     * @param word Word to check whether it is a noun or not
     */
    public NounDetectionLayer(String word){
        this.word = word;
        tamilLetters = IOLayer.getTamil(word);
    }

    /**
     * Checking the noun for patterns
     * noun + ஆளி
     * noun + இயல்
     * noun + காரன் / காரி
     * noun + தனம்
     * noun + துவம்
     * noun + இயம்
     * noun + ஆளன்
     */
    public void checkPatternNounPlusLatter() {

        if(tamilLetters.size() > 2) {

            ArrayList<TamilFontEntity> fPart =  new ArrayList<TamilFontEntity>(tamilLetters);
            List<TamilFontEntity> firstPart = fPart.subList(0,tamilLetters.size()-2);


            int x = tamilLetters.get(tamilLetters.size()-2).getxLocation();

            firstPart.add(TamilLayout.bodies[x]);

          //  System.out.println(tamilLetters.get(tamilLetters.size() - 1).equals(IOLayer.getTamil("ளி").get(0)));
            //System.out.println(tamilLetters.get(tamilLetters.size() - 2).getyLocation() == 1);

            if (tamilLetters.get(tamilLetters.size()-1).equals(IOLayer.getTamil("ளி").get(0)) && tamilLetters.get(tamilLetters.size()-2).getyLocation() == 1) {
                if (NounList.isNoun(firstPart)) {

                    isNoun = true;
                    return;
                }
            }

        }

        if(tamilLetters.size() >= 3){
            //System.out.println(tamilLetters.size());
          //  System.out.println(tamilLetters);
            List<TamilFontEntity> firstPart = tamilLetters.subList(tamilLetters.size()-3, tamilLetters.size());

            if(firstPart.equals(IOLayer.getTamil("காரன்"))){
                isNoun = true;
                return;
            }

        }
        if(tamilLetters.size() >= 2){
            List<TamilFontEntity> firstPart = tamilLetters.subList(tamilLetters.size()-2, tamilLetters.size());


            if(firstPart.equals(IOLayer.getTamil("காரி"))){
                isNoun = true;
                return;
            }

        }

    }

    public boolean isNoun(){
        return isNoun;
    }

    public static void main(String[] args){
        TamilLayout.init();
        NounDetectionLayer ndl = new NounDetectionLayer("தொழிலாளி");
        ndl.checkPatternNounPlusLatter();
        System.out.println(ndl.isNoun());
        NounDetectionLayer ndl2 = new NounDetectionLayer("பணக்காரி");
        ndl2.checkPatternNounPlusLatter();
        System.out.println(ndl2.isNoun());
        NounDetectionLayer ndl3 = new NounDetectionLayer("பணக்காரன்");
        ndl3.checkPatternNounPlusLatter();
        System.out.println(ndl3.isNoun());



    }
}
