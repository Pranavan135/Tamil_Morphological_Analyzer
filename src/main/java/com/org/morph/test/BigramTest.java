package com.org.morph.test;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.io.IOLayer;

/**
 * Created by megala on 7/9/15.
 */
public class BigramTest {
    public static void main(String[] args) {
        InitSystem.init();
        String s ="நல்ல பிள்ளை";
        System.out.println(s.split("\\s+")[0]);
        System.out.println(IOLayer.getTamil("நல்ல பிள்ளை"));
    }
}
