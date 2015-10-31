package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;

import java.util.List;

/**
 * Created by DELL on 2015-07-31.
 * This is the class to test the cleaning task before doing the morph analysis
 */
public class CleanTaskTest {
    public static void main(String[] args) {
        InitSystem.init();
        String sentence = "நான் கோவிலுக்குப் போனேன். அவர்கள் என்னைப் பின்தொடர்ந்தார்கள். நானும் பயந்து கொண்டு அதே வழியால் பயணித்தேன்.";

        String[] words = sentence.split("\\s+");
        System.out.println(words.length);
        String cleanedWord = "";
        for(int index = 0; index < words.length-1; index++) {
            System.out.println(words[index].length());
            String temp = words[index].replaceAll("[.,]","");
            List<TamilFontEntity> tamilWord = IOLayer.getTamil(temp);
                System.out.println(tamilWord.size());
                System.out.println(tamilWord.get(tamilWord.size() - 1).getyLocation());

            if (!words[index].contains(".")&& tamilWord.get(tamilWord.size() - 1).getyLocation() == -1 && IOLayer.getTamil(words[index+1]).get(0).getxLocation() == tamilWord.get(tamilWord.size() - 1).getxLocation() ) {
                    tamilWord = tamilWord.subList(0, tamilWord.size() - 1);

                }

                cleanedWord += IOLayer.getText(tamilWord).toString() + " ";
        }
        cleanedWord += words[words.length-1];
        System.out.println("Cleaned word : " + cleanedWord);

    }
}
