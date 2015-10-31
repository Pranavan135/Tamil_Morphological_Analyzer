package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemUdanLayer;

/**
 * Created by DELL on 2015-07-30.
 * This class is used to test the ExtractNounStemUdanLayer class
 */
public class ExtractNounStemUdanLayerTest {
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("மரத்துடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("விண்ணுடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("அவனுடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("நாயுடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("நெய்யுடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("கமலியுடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("பலாவுடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("படகுடன்"));
        System.out.println(ExtractNounStemUdanLayer.ExtractNounStemUdan("மாட்டுடன்"));

    }
}
