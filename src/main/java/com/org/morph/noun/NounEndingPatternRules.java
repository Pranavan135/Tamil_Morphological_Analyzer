package com.org.morph.noun;

import com.org.morph.tamil.TamilFontEntity;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

/**
 * Created by megala on 7/3/15.
 * This class deals with the set of rules to identify the noun based on its Ending
 */
public class NounEndingPatternRules {
    // List of noun rules that used to find the nouns
    private static ArrayList<NounRule> nounRuleList;
    private static Logger log = Logger.getLogger(NounEndingPatternRules.class.getName());

    /**
     * Initialize the static variables
     */
    public static void init() {
        try {
            Scanner fileInput = new Scanner(new File(new File("src/main/resources/nounPattern.format").getCanonicalPath()));
            nounRuleList = new ArrayList<>();
            fileInput.nextLine();

            while(fileInput.hasNext()){
                int minLength = fileInput.nextInt();
                int lCharacters = fileInput.nextInt();
                String pattern = fileInput.next();


                int bCharacters = fileInput.nextInt();
                int x = -1;
                int y = -1;
                if(bCharacters > 0){
                    x = fileInput.nextInt();
                    y = fileInput.nextInt();
                }
                nounRuleList.add(new NounRule(minLength, pattern, x, y, lCharacters));
            }
        }
        catch(IOException e) {
            log.info("ERROR : " +e.getMessage());
        }
    }

    /**
     * To check whether a given word is noun
     * @param entities List of tamil characters of a word
     * @return true, if the word is a noun. false if a word do not satisfy the rules
     */
    public static boolean isNoun(List<TamilFontEntity> entities){
        for(NounRule nounRule : nounRuleList) {
            if(satisfies(nounRule,entities))
                return true;
        }
        return false;
    }

    /**
     * To check whethera word satisfies
     * @param nounRule Noun rule to be checked
     * @param entities Word as a list of tamil characters
     * @return true if the particular word satisfies particular noun rule
     */
    private static boolean satisfies(NounRule nounRule, List<TamilFontEntity> entities) {
        if(entities.size() >= nounRule.getMinimumLength()){
            ArrayList<TamilFontEntity> fPart =  new ArrayList<>(entities);

            int min = nounRule.getNumberOfLastCharactersToBeChecked();
            List<TamilFontEntity> temp = fPart.subList(entities.size()-min,entities.size());
            if(nounRule.checkPattern(temp))
                return !nounRule.isbeforePositionToBeChecked() || nounRule.isXCoordinateMatches(fPart.get(fPart.size() - min - 1)) && nounRule.isYCoordinateMatches(fPart.get(fPart.size() - min - 1));
            else
                return false;
        }
        else
            return false;
    }


}
