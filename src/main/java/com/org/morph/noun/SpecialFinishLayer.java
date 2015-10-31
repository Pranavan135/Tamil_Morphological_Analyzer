package com.org.morph.noun;

/**
 * Created by DELL on 2015-08-12.
 * This class is used to find some commonly used unfinished nouns
 * Example - மாவட்ட, மன்ற
 */
public class SpecialFinishLayer {

    /**
     * To get the original word from the unfinished nouns
     * @param word unfinished commonly occurring nouns
     * @return the full nouns of the unfinished words
     */
    public static String getOriginalWord(String word){
        if(word.endsWith("மாவட்ட")){
            return word+"ம்";
        }
        if(word.endsWith("மன்ற")) {
            return word+"ம்";
        }
        if(word.endsWith("மாவட்டம்")){
            return word;
        }
        if(word.endsWith("மன்றம்")) {
            return word;
        }
        return null;
    }
}
