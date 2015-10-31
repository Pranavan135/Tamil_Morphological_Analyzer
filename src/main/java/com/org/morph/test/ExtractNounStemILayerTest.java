package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemILayer;

/**
 * Created by megala on 7/29/15.
 * To test the functionality of the class ExtractNounStermILayer
 */
public class ExtractNounStemILayerTest {

    /**
     * Testing the each possibilities with (ஐ)
     * @param args
     */
    public static void main(String[] args){
        InitSystem.init();
        System.out.println(ExtractNounStemILayer.extractNounStemI("விண்ணை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("அவனை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("மரத்தை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("கரங்களை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("புடைவையை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("பலாவை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("நாயை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("நெய்யை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("ஆணை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("குரங்கை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("பாம்பை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("மாட்டை"));
        System.out.println(ExtractNounStemILayer.extractNounStemI("காற்றை"));

    }
}
