package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemAlLayer;

/**
 * Created by megala on 7/28/15.
 * To test the ExtractNounStemAlLayer class functionality
 */
public class ExtractNounStemAlLayerTest {
    public static void main(String[] args) {
        InitSystem.init();

        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("மரத்தால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("பழங்களால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("பலாவால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("புடைவையால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("மலரால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("விண்ணால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("படகால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("நாயால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("நெய்யால்"));
        System.out.println(ExtractNounStemAlLayer.extractStemNounAl("மாட்டால்"));
    }
}
