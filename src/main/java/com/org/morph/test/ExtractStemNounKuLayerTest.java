package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.stemExtraction.ExtractStemNounKuLayer;

/**
 * Created by DELL on 2015-08-05.
 * This class is used to test the functionality of the class ExtractStemNounKuLayer
 */
public class ExtractStemNounKuLayerTest {

    public static void main(String[] args){
        InitSystem.init();
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("மரத்துக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("விண்ணுக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("கமலனுக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("நெய்க்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("கரங்களுக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("அவனுக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("கோவிலுக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("பட்டாசுக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("மாட்டுக்கு"));
        System.out.println(ExtractStemNounKuLayer.extractStemNounKu("இலங்கைக்கு"));

    }
}

