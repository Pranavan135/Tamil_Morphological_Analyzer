package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemIrunthuLayer;

/**
 * Created by DELL on 2015-07-30.
 * To test the functionality of the ExtractNounStemIrunthuLayer class
 */
public class ExtractNounStemIrunthuLayerTest {
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("மரத்திலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("விண்ணிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("மலர்களிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("பலாவிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("காலியிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("ஆணிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("நாயிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("நெய்யிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("மாட்டிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("காற்றிலிருந்து"));
        System.out.println(ExtractNounStemIrunthuLayer.extractStemNounIrunthu("குரங்கிலிருந்து"));
    }
}
