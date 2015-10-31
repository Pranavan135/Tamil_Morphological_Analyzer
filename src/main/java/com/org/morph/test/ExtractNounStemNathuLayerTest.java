package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemNathuLayer;

/**
 * Created by DELL on 2015-07-30.
 * This class is used to test the class ExtractNounNathuLayer
 */
public class ExtractNounStemNathuLayerTest {
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemNathuLayer.extractNounStemNathu("மரத்தது"));
        System.out.println(ExtractNounStemNathuLayer.extractNounStemNathu("விண்ணது"));
        System.out.println(ExtractNounStemNathuLayer.extractNounStemNathu("அவனது"));
        System.out.println(ExtractNounStemNathuLayer.extractNounStemNathu("நாயது"));
        System.out.println(ExtractNounStemNathuLayer.extractNounStemNathu("மாட்டது"));
        System.out.println(ExtractNounStemNathuLayer.extractNounStemNathu("நெய்யது"));
        System.out.println(ExtractNounStemNathuLayer.extractNounStemNathu("படகது"));

    }
}
