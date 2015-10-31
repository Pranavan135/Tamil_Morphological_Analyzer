package com.org.morph.SystemInit;

import com.org.morph.noun.BigramDetector;
import com.org.morph.noun.NounEndingPatternRules;
import com.org.morph.noun.NumberDetectorLayer;
import com.org.morph.noun.PronounAndArticleDetector;
import com.org.morph.noun.stemExtraction.ExtractNounStemMLayer;
import com.org.morph.tamil.TamilLayout;

/**
 * Created by megala on 7/4/15.
 * This class is used to initialize the system at the startup.
 * Initialization of static classes happens here
 */
public class InitSystem {
    public static void init() {
        TamilLayout.init();
        NounEndingPatternRules.init();
        PronounAndArticleDetector.init();
        NumberDetectorLayer.init();
        BigramDetector.init();
        ExtractNounStemMLayer.init();
    }
}
