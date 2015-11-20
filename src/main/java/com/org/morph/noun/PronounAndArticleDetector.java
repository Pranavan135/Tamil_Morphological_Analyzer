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
 * This class is used to identify the articles and pronouns in a given text
 */
public class PronounAndArticleDetector {
    private static List<List<TamilFontEntity>> pronounList;
    private static List<List<TamilFontEntity>> articleList;
    private static Logger log = Logger.getLogger(PronounAndArticleDetector.class.getName());

    /**
     * This method is used to initialize the necessary variables and add a list of pronouns and articles
     */
    public static void init() {
        try {
            pronounList = new ArrayList<>();
            articleList = new ArrayList<>();
            Scanner inFile = new Scanner(new File(new File("src/main/resources/pronouns.txt").getCanonicalPath()));
            inFile.nextLine();
            while(inFile.hasNext()) {
                pronounList.add(IOLayer.getTamil(inFile.next()));
            }

            inFile = new Scanner(new File(new File("src/main/resources/articles.txt").getCanonicalPath()));
            inFile.nextLine();
            while(inFile.hasNext()) {
                articleList.add(IOLayer.getTamil(inFile.next()));
            }

        }
        catch(IOException e){
            log.info("EEROR : "+e.getMessage());
        }

    }

    /**
     * To check whether the given word is a pronoun
     * @param word The tamil word to be checked
     * @return true, if the given word is pronoun, false if the given word is not pronoun
     */
    public static boolean isProNoun(String word) {
        for(List<TamilFontEntity> proNoun : pronounList){
            if(IOLayer.getText(proNoun).toString().equals(word))
                return true;
        }
        return false;
    }

    /**
     * To check whether the given word is an article
     * @param word The tamil word to be checked
     * @return true, if the given word is article, false if the given word is not article
     */
    public static boolean isArticle(String word) {
        for(List<TamilFontEntity> article : articleList){
            if(IOLayer.getText(article).toString().equals(word))
                return true;
        }
        return false;
    }
}
