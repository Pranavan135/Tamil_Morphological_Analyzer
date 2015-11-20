package com.org.morph.noun;

import com.org.morph.SystemInit.InitSystem;
import com.org.morph.io.IOLayer;
import com.org.morph.noun.stemExtraction.*;
import com.org.morph.tamil.TamilFontEntity;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by megala on 7/23/15.
 *
 * This is the main noun detection layer which integrates all the layers to detect the noun.
 */
public class MainNounDetetectionLayer {
    public static void main(String[] args) {
        InitSystem.init();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tamil text to analyze : ");

        PrintWriter writer;
        try {
            writer = new PrintWriter("src/main/resources/output.txt", "UTF-8");

            String sentence  = input.nextLine();

            String[] words = sentence.split("\\s+");


            String wordBefore = "";
            String outputSentence = "";
            String stemSentence = "";

            for(int index = 0; index < words.length; index++) {


                String temp = words[index].replaceAll("[.,]", "");

                if (isNumeric(temp)) {
                    outputSentence += words[index] + "<NUM> ";
                    stemSentence += words[index] + "<NUM> ";
                } else {
                    List<TamilFontEntity> tamilWord = IOLayer.getTamil(temp);

                    List<TamilFontEntity> cleanWord = tamilWord;


                    if (index != words.length - 1 && !words[index].contains(".") && tamilWord.get(tamilWord.size() - 1).getxLocation() != 9 &&tamilWord.get(tamilWord.size() - 1).getyLocation() == -1 && IOLayer.getTamil(words[index + 1]).get(0).getxLocation() == tamilWord.get(tamilWord.size() - 1).getxLocation()) {
                        cleanWord = tamilWord.subList(0, tamilWord.size() - 1);

                    }

                    String tempWord = IOLayer.getText(cleanWord).toString();

                    if (tempWord.length() > 0) {
                        if(words[index].contains(".")){
                            outputSentence += words[index] + "<VERB> ";
                            stemSentence += words[index] + "<VERB> ";
                        }
                        else {
                            List<TamilFontEntity> stem = detectStems(tempWord, wordBefore);
                            if (NumberDetectorLayer.isNumber(cleanWord)) {
                                outputSentence += words[index] + "<NUM> ";
                                stemSentence += words[index] + "<NUM> ";
                            } else if (PronounAndArticleDetector.isArticle(tempWord)) {
                                outputSentence += words[index] + "<ATL> ";
                                stemSentence += words[index] + "<ATL> ";
                            } else if (PronounAndArticleDetector.isProNoun(tempWord)) {
                                outputSentence += words[index] + "<PNN> ";
                                stemSentence += words[index] + "<PNN> ";
                            } else if (stem != null) {
                                outputSentence += words[index] + "<Noun> ";
                                stemSentence += IOLayer.getText(stem) + "<Noun> ";
                            } else {
                                stem = getNounStem(tempWord);
                                if (stem != null) {
                                    outputSentence += words[index] + "<Noun> ";
                                    stemSentence += IOLayer.getText(stem) + "<Noun> ";

                                }
                                else if(ExtractNounStemMLayer.extractStemNounM(tempWord) != null){
                                    List<TamilFontEntity> stemWithoutM = ExtractNounStemMLayer.extractStemNounM(tempWord);

                                    stemWithoutM = extractPluralStem(stemWithoutM);

                                    if(stemWithoutM.equals(IOLayer.getTamil(tempWord))){
                                        outputSentence += IOLayer.getText(stemWithoutM) + "<JOIN> ";
                                        stemSentence += IOLayer.getText(stemWithoutM) + "<JOIN> ";
                                    }
                                    else{
                                        outputSentence += IOLayer.getText(stemWithoutM) + "<NOUN> ";
                                        stemSentence += IOLayer.getText(stemWithoutM) + "<NOUN> ";
                                    }
                                }else {
                                    outputSentence += IOLayer.getText(cleanWord) + "<NOTDEFINED> ";
                                    stemSentence += IOLayer.getText(cleanWord) + "<NOTDEFINED> ";
                                }
                            }
                        }
                    }
                }
                wordBefore = words[index];

            }
            writer.println(stemSentence);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    /**
     * To get the stem by removing morph part
     * @param tempWord Word with the morph part
     * @return the noun stem in a word, null if it is not the word
     */
    public static List<TamilFontEntity> getNounStem(String tempWord) {

        /**
         * Go through each possible methods of extracting the stem
         */
        if(ExtractNounStemAlLayer.extractStemNounAl(tempWord) != null){
            List<TamilFontEntity> stemWithoutAl = ExtractNounStemAlLayer.extractStemNounAl(tempWord);
            return extractPluralStem(stemWithoutAl);
        }
        else if (ExtractNounStemBelongLayer.extractNounStemBelong(tempWord) != null) {
            List<TamilFontEntity> stemWithoutBelong = ExtractNounStemBelongLayer.extractNounStemBelong(tempWord);
            return extractPluralStem(stemWithoutBelong);
        }
        else if(ExtractNounStemIdamLayer.extractNounStemIdam(tempWord) != null){
            List<TamilFontEntity> stemWithoutIdam = ExtractNounStemIdamLayer.extractNounStemIdam(tempWord);
            return extractPluralStem(stemWithoutIdam);
        }
        else if(ExtractNounStemILayer.extractNounStemI(tempWord) != null) {
            List<TamilFontEntity> stemWithoutI = ExtractNounStemILayer.extractNounStemI(tempWord);
            return extractPluralStem(stemWithoutI);
        }
        else if(ExtractNounStemInFromLayer.extractStemNounInFrom(tempWord) != null){
            List<TamilFontEntity> stemWithoutInFrom = ExtractNounStemInFromLayer.extractStemNounInFrom(tempWord);
            return extractPluralStem(stemWithoutInFrom);
        }
        else if(ExtractNounStemInIlLayer.extractNounStemInIl(tempWord) != null){
            List<TamilFontEntity> stemWithoutInI1 = ExtractNounStemInIlLayer.extractNounStemInIl(tempWord);
            return extractPluralStem(stemWithoutInI1);
        }
        else if(ExtractNounStemIrunthuLayer.extractStemNounIrunthu(tempWord) != null){
            List<TamilFontEntity> stemWithoutIrunthu = ExtractNounStemIrunthuLayer.extractStemNounIrunthu(tempWord);
            return extractPluralStem(stemWithoutIrunthu);
        }
        else if(ExtractNounStemNathuLayer.extractNounStemNathu(tempWord) != null){
            List<TamilFontEntity> stemWithoutNathu = ExtractNounStemNathuLayer.extractNounStemNathu(tempWord);
            return extractPluralStem(stemWithoutNathu);
        }
        else if(ExtractNounStemUdanLayer.ExtractNounStemUdan(tempWord) != null){
            List<TamilFontEntity> stemWithoutUdan = ExtractNounStemUdanLayer.ExtractNounStemUdan(tempWord);
            return extractPluralStem(stemWithoutUdan);
        }
        else if(ExtractNounStemWithLayer.ExtractNounStemWith(tempWord) != null){
            List<TamilFontEntity> stemWithoutWith = ExtractNounStemWithLayer.ExtractNounStemWith(tempWord);
            return extractPluralStem(stemWithoutWith);
        }
        else if(ExtractNounStemUdaiyaLayer.ExtractNounStemUdaiya(tempWord) != null){
            List<TamilFontEntity> stemWithoutUdaiya = ExtractNounStemUdaiyaLayer.ExtractNounStemUdaiya(tempWord);
            return extractPluralStem(stemWithoutUdaiya);
        }
        else if(ExtractStemNounKuLayer.extractStemNounKu(tempWord) != null){
            List<TamilFontEntity> stemWithoutKu = ExtractStemNounKuLayer.extractStemNounKu(tempWord);
            return extractPluralStem(stemWithoutKu);
        }

        return null;
    }


    /**
     * To find out the stems
     * @param tempWord
     * @param beforeWord
     * @return stem if it is noun, null if it is not noun
     */
    public static List<TamilFontEntity> detectStems(String tempWord, String beforeWord) {
        List<TamilFontEntity> stemWithoutPlural = extractPluralStem(IOLayer.getTamil(tempWord));

        if(ExtractNounStemMaarLayer.extractNounStemMaar(IOLayer.getText(stemWithoutPlural).toString()) != null) {
            return ExtractNounStemMaarLayer.extractNounStemMaar(IOLayer.getText(stemWithoutPlural).toString());
        }
        else if(BigramDetector.isNoun(beforeWord)){
            return extractPluralStem(IOLayer.getTamil(tempWord));
        }
        else if(NounEndingPatternRules.isNoun(IOLayer.getTamil(tempWord))){
            return extractPluralStem(IOLayer.getTamil(tempWord));
        }
        else if(PluralStemDetectionLayer.extractStemFromPlural(tempWord) != null){
            return PluralStemDetectionLayer.extractStemFromPlural(tempWord);
        }
        else if(SpecialFinishLayer.getOriginalWord(tempWord) != null){
            return IOLayer.getTamil(SpecialFinishLayer.getOriginalWord(tempWord));
        }
            return null;
    }
    /**
     * To extract the stem from plural noun
     * @param word
     * @return the stem of the pural word
     */
    public static List<TamilFontEntity> extractPluralStem(List<TamilFontEntity> word){
        List<TamilFontEntity> value = PluralStemDetectionLayer.extractStemFromPlural(IOLayer.getText(word).toString());
        List<TamilFontEntity> stemWithoutPlural = (value == null) ? word : value;
        return stemWithoutPlural;
    }

    /**
     * To check whether the given string is a number
     * @param str
     * @return true if the given string is a number, false if not
     */
    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
