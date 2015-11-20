package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemWithLayer;

/**
 * Created by DELL on 2015-07-30.
 *
 */
public class ExtractNounStemWithLayerTest {
    /**
     * Testing the each possibilities with (ஐ)
     * @param args
     */
    public static void main(String[] args){
        InitSystem.init();
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("விண்ணோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("அவனோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("மரத்தோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("கரங்களோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("புடைவையோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("பலாவோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("நாயோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("நெய்யோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("ஆணோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("குரங்கோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("பாம்போடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("மாட்டோடு"));
        System.out.println(ExtractNounStemWithLayer.ExtractNounStemWith("காற்றோடு"));


    }
}
