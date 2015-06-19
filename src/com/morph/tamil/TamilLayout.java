package com.morph.tamil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pranavan on 19/06/15.
 */
public class TamilLayout {

    public static TamilFontEntity[][] tamilFontEntities = new TamilFontEntity[18][12];

    public static void init(){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();
        List<String> list6 = new ArrayList<>();
        List<String> list7 = new ArrayList<>();
        List<String> list8 = new ArrayList<>();
        List<String> list9 = new ArrayList<>();
        List<String> list10 = new ArrayList<>();
        List<String> list11 = new ArrayList<>();
        List<String> list12 = new ArrayList<>();


        list1.add("க");
        tamilFontEntities[0][0] = new TamilFontEntity(list1,0,0);

        list2.add("க");
        list2.add("ா ");
        tamilFontEntities[0][1] = new TamilFontEntity(list2, 0, 1);

        list3.add("க");
        list3.add("ி ");
        tamilFontEntities[0][2] = new TamilFontEntity(list3, 0, 2);
    }

}
