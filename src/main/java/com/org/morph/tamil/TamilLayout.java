package com.org.morph.tamil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by pranavan on 19/06/15.
 */
public class TamilLayout {

    /**
     * 18x12 tamil fonts
     */
    public static TamilFontEntity[][] tamilFontEntities = new TamilFontEntity[18][12];

    /**
     * 12 lives
     */
    public static TamilFontEntity[] lives = new TamilFontEntity[12];

    /**
     * 18 bodies
     */
    public static TamilFontEntity[] bodies = new TamilFontEntity[18];

    public static TamilFontEntity weapon;
    /**
     * the tamil letter map
     */
    public static HashMap<String, TamilFontEntity> tamilLetterMap = new HashMap<>();

    /**
     * live letters map
     */
    public static HashMap<String, TamilFontEntity> livesMap = new HashMap<>();

    /**
     * body letters map
     */
    public static HashMap<String, TamilFontEntity> bodiesMap = new HashMap<>();

    /**
     * list of tamil start letters of a tamil font
     * [க, ங, ச, ஞ, ட, ண, த, ந, ப, ம, ய, ர, ல, வ, ழ, ள, ற, ன, அ, ஆ, இ, ஈ, உ, ஊ, எ, ஏ, ஐ, ஒ, ஓ, ஃ]
     */
    public static List<String> startLetters = new ArrayList<>();

    /**
     * list of tamil end letters
     * [ள, ் , ா , ி , ீ , ு , ூ , ெ , ே , ை , ொ , ோ , ௌ ]
     */
    public static List<String> endLetters = new ArrayList<>();

    private static boolean initializer = false;

    public static void init() {
        if(!initializer) {
            init0(0);
            init1(1);
            init2(2);
            init3(3);
            init4(4);
            init5(5);
            init6(6);
            init7(7);
            init8(8);
            init9(9);
            init10(10);
            init11(11);
            init12(12);
            init13(13);
            init14(14);
            init15(15);
            init16(16);
            init17(17);
            initLives();
            initBodies();
            initAtomicParts();

            /**
             * putting 12x18 letters into the map
             */
            for (int i = 0; i < 18; i++) {
                for (int j = 0; j < 12; j++) {
                    tamilLetterMap.put(tamilFontEntities[i][j].toString(), tamilFontEntities[i][j]);
                }
            }

            /**
             * putting lives into maps
             */

            for (int i = 0; i < 12; i++) {
                tamilLetterMap.put(lives[i].toString(), lives[i]);
                livesMap.put(lives[i].toString(), lives[i]);
            }

            /**
             * putting bodies into maps
             */
            for (int i = 0; i < 18; i++) {
                tamilLetterMap.put(bodies[i].toString(), bodies[i]);
                bodiesMap.put(bodies[i].toString(), bodies[i]);
            }

            /**
             * weapon font
             */

            List<String> l = new ArrayList<>();
            l.add("ஃ");
            weapon = new TamilFontEntity(l, 100, false);
            tamilLetterMap.put(weapon.toString(), weapon);
            initializer = true;
        }

    }

    private static void initAtomicParts() {
        for (int i = 0; i < 18; i++) {
            startLetters.add(tamilFontEntities[i][0].toString());
        }

        for (int i = 0; i < 11; i++) {
            startLetters.add(lives[i].toString());
        }

        endLetters.add(String.valueOf(lives[11].getUnicodeList().get(1)));
        endLetters.add(bodies[0].getUnicodeList().get(1));

        for (int i = 1; i < 12; i++) {
            endLetters.add(tamilFontEntities[0][i].getUnicodeList().get(1));
        }
    }

    private static void initBodies() {
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
        List<String> list13 = new ArrayList<>();
        List<String> list14 = new ArrayList<>();
        List<String> list15 = new ArrayList<>();
        List<String> list16 = new ArrayList<>();
        List<String> list17 = new ArrayList<>();
        List<String> list18 = new ArrayList<>();


        list1.add("க");
        list1.add("் ");
        bodies[0] = new TamilFontEntity(list1, 0, false);

        list2.add("ங");
        list2.add("் ");
        bodies[1] = new TamilFontEntity(list2, 1, false);

        list3.add("ச");
        list3.add("் ");
        bodies[2] = new TamilFontEntity(list3, 2, false);

        list4.add("ஞ");
        list4.add("் ");
        bodies[3] = new TamilFontEntity(list4, 3, false);

        list5.add("ட");
        list5.add("் ");
        bodies[4] = new TamilFontEntity(list5, 4, false);

        list6.add("ண");
        list6.add("் ");
        bodies[5] = new TamilFontEntity(list6, 5, false);

        list7.add("த");
        list7.add("் ");
        bodies[6] = new TamilFontEntity(list7, 6, false);

        list8.add("ந");
        list8.add("் ");
        bodies[7] = new TamilFontEntity(list8, 7, false);

        list9.add("ப");
        list9.add("் ");
        bodies[8] = new TamilFontEntity(list9, 8, false);

        list10.add("ம");
        list10.add("் ");
        bodies[9] = new TamilFontEntity(list10, 9, false);

        list11.add("ய");
        list11.add("் ");
        bodies[10] = new TamilFontEntity(list11, 10, false);

        list12.add("ர");
        list12.add("் ");
        bodies[11] = new TamilFontEntity(list12, 11, false);

        list13.add("ல");
        list13.add("் ");
        bodies[12] = new TamilFontEntity(list13, 12, false);

        list14.add("வ");
        list14.add("் ");
        bodies[13] = new TamilFontEntity(list14, 13, false);

        list15.add("ழ");
        list15.add("் ");
        bodies[14] = new TamilFontEntity(list15, 14, false);

        list16.add("ள");
        list16.add("் ");
        bodies[15] = new TamilFontEntity(list16, 15, false);

        list17.add("ற");
        list17.add("் ");
        bodies[16] = new TamilFontEntity(list17, 16, false);

        list18.add("ன");
        list18.add("் ");
        bodies[17] = new TamilFontEntity(list18, 17, false);
    }

    private static void initLives() {
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

        list1.add("அ");
        lives[0] = new TamilFontEntity(list1, 0, true);

        list2.add("ஆ");
        lives[1] = new TamilFontEntity(list2, 1, true);

        list3.add("இ");
        lives[2] = new TamilFontEntity(list3, 2, true);

        list4.add("ஈ");
        lives[3] = new TamilFontEntity(list4, 3, true);

        list5.add("உ");
        lives[4] = new TamilFontEntity(list5, 4, true);

        list6.add("ஊ");
        lives[5] = new TamilFontEntity(list6, 5, true);

        list7.add("எ");
        lives[6] = new TamilFontEntity(list7, 6, true);

        list8.add("ஏ");
        lives[7] = new TamilFontEntity(list8, 7, true);

        list9.add("ஐ");
        lives[8] = new TamilFontEntity(list9, 8, true);

        list10.add("ஒ");
        lives[9] = new TamilFontEntity(list10, 9, true);

        list11.add("ஓ");
        lives[10] = new TamilFontEntity(list11, 10, true);

        list12.add("ஒ");
        list12.add("ள");
        lives[11] = new TamilFontEntity(list12, 11, true);


    }

    private static void init0(int index) {
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
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("க");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("க");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("க");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("க");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("க");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("க");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("க");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("க");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("க");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("க");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("க");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);

    }

    private static void init1(int index) {
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


        list1.add("ங");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ங");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ங");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ங");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ங");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ங");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ங");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ங");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ங");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ங");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ங");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ங");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init2(int index) {
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


        list1.add("ச");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ச");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ச");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ச");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ச");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ச");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ச");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ச");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ச");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ச");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ச");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ச");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);


    }

    private static void init3(int index) {
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


        list1.add("ஞ");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ஞ");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ஞ");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ஞ");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ஞ");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ஞ");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ஞ");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ஞ");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ஞ");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ஞ");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ஞ");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ஞ");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init4(int index) {
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


        list1.add("ட");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ட");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ட");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ட");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ட");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ட");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ட");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ட");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ட");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ட");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ட");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ட");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init5(int index) {
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


        list1.add("ண");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ண");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ண");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ண");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ண");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ண");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ண");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ண");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ண");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ண");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ண");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ண");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init6(int index) {
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


        list1.add("த");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("த");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("த");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("த");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("த");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("த");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, 0, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("த");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, 0, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("த");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, 0, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("த");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, 0, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("த");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, 0, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("த");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, 0, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("த");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, 0, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init7(int index) {
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


        list1.add("ந");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ந");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ந");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ந");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ந");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ந");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ந");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ந");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ந");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ந");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ந");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ந");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init8(int index) {
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


        list1.add("ப");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ப");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ப");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ப");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ப");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ப");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ப");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ப");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ப");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ப");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ப");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ப");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init9(int index) {
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


        list1.add("ம");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ம");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ம");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ம");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ம");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ம");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ம");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ம");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ம");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ம");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ம");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ம");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init10(int index) {
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


        list1.add("ய");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ய");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ய");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ய");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ய");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ய");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ய");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ய");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ய");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ய");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ய");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ய");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init11(int index) {
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


        list1.add("ர");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ர");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ர");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ர");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ர");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ர");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ர");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ர");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ர");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ர");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ர");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ர");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init12(int index) {
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


        list1.add("ல");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ல");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ல");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ல");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ல");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ல");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ல");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ல");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ல");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ல");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ல");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ல");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init13(int index) {
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


        list1.add("வ");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("வ");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("வ");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("வ");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("வ");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("வ");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("வ");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("வ");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("வ");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("வ");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("வ");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("வ");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init14(int index) {
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


        list1.add("ழ");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ழ");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ழ");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ழ");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ழ");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ழ");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ழ");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ழ");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ழ");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ழ");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ழ");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ழ");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init15(int index) {
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


        list1.add("ள");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ள");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ள");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ள");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ள");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ள");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ள");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ள");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ள");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ள");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ள");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ள");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init16(int index) {
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


        list1.add("ற");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ற");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ற");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ற");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ற");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ற");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ற");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ற");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ற");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ற");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ற");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ற");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    private static void init17(int index) {
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


        list1.add("ன");
        tamilFontEntities[index][0] = new TamilFontEntity(list1, index, 0);
        System.out.print(tamilFontEntities[index][0] + " ");

        list2.add("ன");
        list2.add("ா ");
        tamilFontEntities[index][1] = new TamilFontEntity(list2, index, 1);
        System.out.print(tamilFontEntities[index][1] + " ");

        list3.add("ன");
        list3.add("ி ");
        tamilFontEntities[index][2] = new TamilFontEntity(list3, index, 2);
        System.out.print(tamilFontEntities[index][2] + " ");

        list4.add("ன");
        list4.add("ீ ");
        tamilFontEntities[index][3] = new TamilFontEntity(list4, index, 3);
        System.out.print(tamilFontEntities[index][3] + " ");

        list5.add("ன");
        list5.add("ு ");
        tamilFontEntities[index][4] = new TamilFontEntity(list5, index, 4);
        System.out.print(tamilFontEntities[index][4] + " ");

        list6.add("ன");
        list6.add("ூ ");
        tamilFontEntities[index][5] = new TamilFontEntity(list6, index, 5);
        System.out.print(tamilFontEntities[index][5] + " ");

        list7.add("ன");
        list7.add("ெ ");
        tamilFontEntities[index][6] = new TamilFontEntity(list7, index, 6);
        System.out.print(tamilFontEntities[index][6] + " ");

        list8.add("ன");
        list8.add("ே ");
        tamilFontEntities[index][7] = new TamilFontEntity(list8, index, 7);
        System.out.print(tamilFontEntities[index][7] + " ");

        list9.add("ன");
        list9.add("ை ");
        tamilFontEntities[index][8] = new TamilFontEntity(list9, index, 8);
        System.out.print(tamilFontEntities[index][8] + " ");

        list10.add("ன");
        list10.add("ொ ");
        tamilFontEntities[index][9] = new TamilFontEntity(list10, index, 9);
        System.out.print(tamilFontEntities[index][9] + " ");

        list11.add("ன");
        list11.add("ோ ");
        tamilFontEntities[index][10] = new TamilFontEntity(list11, index, 10);
        System.out.print(tamilFontEntities[index][10] + " ");

        list12.add("ன");
        list12.add("ௌ ");
        tamilFontEntities[index][11] = new TamilFontEntity(list12, index, 11);
        System.out.println(tamilFontEntities[index][11]);
    }

    public static TamilFontEntity getEntity(int x, int y){
        return tamilFontEntities[x][y];
    }

}
