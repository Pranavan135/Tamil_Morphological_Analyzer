package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.io.IOLayer;
import com.org.morph.noun.NounEndingPatternRules;
import com.org.morph.noun.NumberDetectorLayer;

/**
 * Created by megala on 7/8/15.
 * This class is used to check the numbers in th text
 */
public class NumberDetectionLayerTest {
    public static void main(String[] args){
        InitSystem.init();

        System.out.println(NumberDetectorLayer.isNumber(IOLayer.getTamil("ஒன்று")));
        System.out.println(NumberDetectorLayer.isNumber(IOLayer.getTamil("நூற்றுப்பத்து")));
        System.out.println(NumberDetectorLayer.isNumber(IOLayer.getTamil("இருபத்துநான்கு")));
        System.out.println(NumberDetectorLayer.isNumber(IOLayer.getTamil("நாண்கு")));
        System.out.println(NumberDetectorLayer.isNumber(IOLayer.getTamil("சத்து")));
        System.out.println(NumberDetectorLayer.isNumber(IOLayer.getTamil("ஐம்பத்திரண்டு")));
        System.out.println(NumberDetectorLayer.isNumber(IOLayer.getTamil("மூன்று")));

    }
}
