package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemInIlLayer;

/**
 * Created by DELL on 2015-07-30.
 * To test the functionality of the class ExtractNounStemInIlLayer class
 */
public class ExtractNounStemInILayerTest {
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("மரத்தில்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("விண்ணில்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("அவனில்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("நாயில்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("நெய்யில்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("கமலியில்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("பலாவில்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("மரத்தின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("விண்ணின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("அவளின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("நாயின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("நெய்யின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("கமலியின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("பலாவின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("பட்டாசின்"));
        System.out.println(ExtractNounStemInIlLayer.extractNounStemInIl("மாட்டின்"));

    }
}
