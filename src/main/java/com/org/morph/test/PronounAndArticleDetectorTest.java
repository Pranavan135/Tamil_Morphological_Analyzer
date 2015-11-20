package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.noun.PronounAndArticleDetector;

/**
 * Created by DELL on 2015-08-06.
 * This class is used to test the functionality of the class Pronoun and article detector
 */
public class PronounAndArticleDetectorTest {
    public  static void main(String[] args){
        InitSystem.init();
        System.out.println(PronounAndArticleDetector.isArticle("அந்த"));
    }
}
