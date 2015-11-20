package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.PluralStemDetectionLayer;

/**
 * Created by DELL on 2015-08-06.
 * To test the functionality of the class PluralStemDetectionLayer
 */
public class PluralStemDetectionLayerTest {

    public static void main(String[] args) {
        InitSystem.init();

        System.out.println(PluralStemDetectionLayer.extractStemFromPlural("அவர்கள்"));
        System.out.println(PluralStemDetectionLayer.extractStemFromPlural("மரங்கள்"));
        System.out.println(PluralStemDetectionLayer.extractStemFromPlural("பூக்கள்"));
        System.out.println(PluralStemDetectionLayer.extractStemFromPlural("மனிதர்கள்"));
        System.out.println(PluralStemDetectionLayer.extractStemFromPlural("தாய்மார்கள்"));
    }
}
