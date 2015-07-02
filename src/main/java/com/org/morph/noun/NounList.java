package com.org.morph.noun;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Handles the reading of noun list
 */
public class NounList {
    private static String fileName;
    private static List<List<TamilFontEntity>> listOfNouns;

    static {
        fileName = "nounList.txt";
        listOfNouns = new ArrayList<>();

    }
    /**
     * To read the nounlist from file
     */
    public static void read(){
     try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                String noun = scanner.nextLine();

                listOfNouns.add(IOLayer.getTamil(noun));
            }
        } catch (FileNotFoundException e) {

        }
    }

    /**
     * To check whether a given data is a noun in the list
     * @param word List of tamil characters of a tamil word
     * @return true if it is in a noun list
     */
    public static boolean isNoun(List<TamilFontEntity> word){
       return listOfNouns.contains(word);
    }


    /**
     * To check whether a given word is a noun in the list
     * @param word Given word in String
     * @return true if it is in a noun list
     */
    public static boolean isNoun(String word){
        List<TamilFontEntity> tm = IOLayer.getTamil(word);
        return isNoun(IOLayer.getTamil(word));
    }

    public static void main(String[] args){
        TamilLayout.init();
        NounList.read();
        System.out.println(NounList.isNoun("அப்"));
        System.out.println(NounList.isNoun("அம்மா"));

    }

}
