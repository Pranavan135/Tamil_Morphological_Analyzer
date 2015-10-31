package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractNounStemInFromLayer;

/**
 * Created by megala on 7/29/15.
 * To test the functionality of the class ExtractNounStemInFromLayer class
 */
public class ExtractNounStemInFromLayerTest {
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("மரத்தினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("விண்ணினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("மலர்களினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("பலாவினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("காலியினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("செம்பினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("நாயினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("நெய்யினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("மாட்டினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("காற்றினிலிருந்து"));
        System.out.println(ExtractNounStemInFromLayer.extractStemNounInFrom("குரங்கினிலிருந்து"));

    }
}
