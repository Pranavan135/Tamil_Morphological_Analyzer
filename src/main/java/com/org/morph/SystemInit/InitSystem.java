package com.org.morph.SystemInit;

import com.org.morph.noun.NounEndingPatternRules;
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
    }
}
