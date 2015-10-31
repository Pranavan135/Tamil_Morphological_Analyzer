package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.io.IOLayer;
import com.org.morph.noun.BigramDetector;

/**
 * Created by megala on 7/9/15.
 * To check the functionality of the bigram checker
 */
public class BigramDetectorTest {
    public static void main(String[] args) {
        InitSystem.init();
        System.out.println(BigramDetector.isNoun("நல்ல"));
        System.out.println(BigramDetector.isNoun("புதிய"));
        System.out.println(BigramDetector.isNoun("பெரிய"));
        System.out.println(BigramDetector.isNoun("இராணுவ"));


    }
}
