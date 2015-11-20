package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemBelongLayer;

/**
 * Created by megala on 7/28/15.
 * To test the functionality of ExtractNounStemBelongLayer class
 */
public class ExtractNounStemBelongLayerTest {
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemBelongLayer.extractNounStemBelong("மரத்தினது"));
        System.out.println(ExtractNounStemBelongLayer.extractNounStemBelong("விண்ணினது"));
        System.out.println(ExtractNounStemBelongLayer.extractNounStemBelong("அவனினது"));
        System.out.println(ExtractNounStemBelongLayer.extractNounStemBelong("நாயினது"));
        System.out.println(ExtractNounStemBelongLayer.extractNounStemBelong("மாட்டினது"));
        System.out.println(ExtractNounStemBelongLayer.extractNounStemBelong("நெய்யினது"));
        System.out.println(ExtractNounStemBelongLayer.extractNounStemBelong("படகினது"));
    }
}
