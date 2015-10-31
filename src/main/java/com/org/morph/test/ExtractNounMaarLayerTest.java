package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemMaarLayer;

/**
 * Created by DELL on 2015-07-30.
 *
 * This class is used to test the functionality of the class ExtractNounMaarLayer
 */
public class ExtractNounMaarLayerTest {

    /**
     * Exract stem இடம் in Tamil
     * @param args
     */
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemMaarLayer.extractNounStemMaar("தாய்மார்"));
        System.out.println(ExtractNounStemMaarLayer.extractNounStemMaar("தேவிமார்"));
    }
}
