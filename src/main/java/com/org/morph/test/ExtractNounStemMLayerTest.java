package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemMLayer;

/**
 * Created by DELL on 2015-08-05.
 *
 * This class is used to test the functionality of the class ExtractNounStemMLayer
 */
public class ExtractNounStemMLayerTest {
    public static void main(String[] args){
        InitSystem.init();

        System.out.println(ExtractNounStemMLayer.extractStemNounM("மரமும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("விண்ணும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("கமலனும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("நெய்யும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("கரங்களும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("அவனும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("பலாவும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("பட்டாசும்"));
        System.out.println(ExtractNounStemMLayer.extractStemNounM("மாடும்"));

    }
}
