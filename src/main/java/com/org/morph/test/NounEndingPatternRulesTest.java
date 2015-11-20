package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.io.IOLayer;
import com.org.morph.noun.NounEndingPatternRules;

/**
 * Created by megala on 7/4/15.
 */
public class NounEndingPatternRulesTest {
    public static void main(String[] args){
        InitSystem.init();

        System.out.println(NounEndingPatternRules.isNoun(IOLayer.getTamil("முதலாளி")));
        System.out.println(NounEndingPatternRules.isNoun(IOLayer.getTamil("பொருளியல்")));
        System.out.println(NounEndingPatternRules.isNoun(IOLayer.getTamil("கடைக்காரன்")));
        System.out.println(NounEndingPatternRules.isNoun(IOLayer.getTamil("தனம்")));
        System.out.println(NounEndingPatternRules.isNoun(IOLayer.getTamil("சமத்துவம்")));
        System.out.println(NounEndingPatternRules.isNoun(IOLayer.getTamil("எழுத்தாளன்")));
        System.out.println(NounEndingPatternRules.isNoun(IOLayer.getTamil("ஆட்சி")));
    }
}
