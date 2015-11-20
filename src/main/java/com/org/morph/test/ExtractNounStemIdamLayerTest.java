package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemIdamLayer;

/**
 * Created by megala on 7/29/15.
 */
public class ExtractNounStemIdamLayerTest {
    /**
     * Exract stem இடம் in Tamil
     * @param args
     */
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("மரத்திடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("விண்ணிடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("அவனிடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("நாயிடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("நெய்யிடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("கமலியிடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("பலாவிடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("படகிடம்"));
        System.out.println(ExtractNounStemIdamLayer.extractNounStemIdam("மாட்டிடம்"));


    }
}
