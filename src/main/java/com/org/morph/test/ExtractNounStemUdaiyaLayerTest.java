package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemUdaiyaLayer;

/**
 * Created by DELL on 2015-08-05.
 */
public class ExtractNounStemUdaiyaLayerTest {

    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemUdaiyaLayer.ExtractNounStemUdaiya("மரத்துடைய"));


    }
}
