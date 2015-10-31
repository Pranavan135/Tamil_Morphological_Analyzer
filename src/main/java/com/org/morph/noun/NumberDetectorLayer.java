package com.org.morph.noun;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by megala on 7/8/15.
 * To detect the numbers
 */
public class NumberDetectorLayer {
    private static List<NounEndingRule> numberRules;
    private static Logger log = Logger.getLogger(NumberDetectorLayer.class.getName());

    public static void init() {
        try {
            numberRules = new ArrayList<>();

            Scanner inFile = new Scanner(new File(new File("src/main/resources/num.txt").getCanonicalPath()));
            inFile.nextLine();

            while(inFile.hasNextInt()){

                int y = inFile.nextInt();
                String pattern = inFile.next();

                int patternSize = IOLayer.getTamil(pattern).size();
                numberRules.add(new NounEndingRule(patternSize+1,pattern,-1,y,patternSize));

            }
        }
        catch(IOException e){
            log.info("ERROR : "+ e.getMessage());
        }


    }

    /**
     * To check whether a given word is number
     * @param entities List of tamil characters of a word
     * @return true, if the word is a noun. false if a word do not satisfy the rules
     */
    public static boolean isNumber(List<TamilFontEntity> entities){
        for(NounEndingRule numberRule : numberRules) {

            if(satisfies(numberRule,entities))
                return true;
        }
        return false;
    }

    /**
     * To check whether a word satisfies a number rule
     * @param nounEndingRule Number rule to be checked
     * @param entities Word as a list of tamil characters
     * @return true if the particular word satisfies particular number rule
     */
    private static boolean satisfies(NounEndingRule nounEndingRule, List<TamilFontEntity> entities) {
        if(entities.size() >= nounEndingRule.getMinimumLength()) {

            ArrayList<TamilFontEntity> fPart = new ArrayList<>(entities);

            int min = nounEndingRule.getNumberOfLastCharactersToBeChecked();
            List<TamilFontEntity> temp = fPart.subList(entities.size() - min, entities.size());
            return nounEndingRule.checkPattern(temp) && (!nounEndingRule.isbeforePositionToBeChecked() || nounEndingRule.isXCoordinateMatches(fPart.get(fPart.size() - min - 1)) && nounEndingRule.isYCoordinateMatches(fPart.get(fPart.size() - min - 1)));
        }
        else
            return false;
    }


}
