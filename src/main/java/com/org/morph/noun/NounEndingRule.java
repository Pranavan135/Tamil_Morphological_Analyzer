package com.org.morph.noun;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;

import java.util.List;

/**
 * Created by megala on 7/3/15.
 * This class keeps the details of a single noun rule which is used find out the nouns based on its endings
 */
public class NounEndingRule {
    // Minimum length of the word required
    private int minimumLength;
    // Ending pattern to be checked
    private String pattern;
    // The x coordinate of the letter before the pattern
    private int xCoordinateBefore;
    // The y coordinate of the letter before the pattern
    private int yCoordinateBefore;
    // The number of tamil characters in the pattern
    private int numberOfLastCharactersToBeChecked;

    /**
     * This constructs a noun rule
     * @param minimumLength Minimum length of the word
     * @param pattern Pattern to be checked at the end of the word
     * @param x X coordinate of the letter before the pattern
     * @param y Y coordinate of the letter before the pattern
     * @param numberOfLastCharactersToBeChecked Number of characters in the pattern
     */
    public NounEndingRule(int minimumLength, String pattern, int x, int y, int numberOfLastCharactersToBeChecked){
        this.minimumLength = minimumLength;
        this.pattern = pattern;
        xCoordinateBefore = x;
        yCoordinateBefore = y;
        this.numberOfLastCharactersToBeChecked = numberOfLastCharactersToBeChecked;

    }

    /**
     * To get the minimum length of the word required to check this pattern
     * @return the minimum length of the word
     */
    public int getMinimumLength() {
        return minimumLength;
    }

    /**
     * Number of tamil characters in the last pattern
     * @return the number of tamil characters in the pattern to be checked
     */
    public int getNumberOfLastCharactersToBeChecked() {
        return numberOfLastCharactersToBeChecked;
    }

    /**
     * Checks whether the given word satisfies the specific pattern
     * @param tamilWord Tamil word to be checked
     * @return true if the word satisfies the given pattern, otherwise false
     */
    public boolean checkPattern(List<TamilFontEntity> tamilWord) {
        return IOLayer.getTamil(pattern).equals(tamilWord);
    }

    /**
     * Checks whether the x coordinate of the letter before the pattern matches with the the given character`s x coordinate
     * @param tamilCharacter Tamil character to be checked
     * @return true if the x coordinate matches, false otherwise
     */
    public boolean isXCoordinateMatches(TamilFontEntity tamilCharacter) {
        return xCoordinateBefore == -1 || xCoordinateBefore == tamilCharacter.getxLocation();
    }

    /**
    * Checks whether the y coordinate of the letter before the pattern matches with the the given character`s y coordinate
    * @param tamilCharacter Tamil character to be checked
    * @return true if the y coordinate matches, false otherwise
    */
    public boolean isYCoordinateMatches(TamilFontEntity tamilCharacter) {
        return yCoordinateBefore == -1 || yCoordinateBefore == tamilCharacter.getyLocation();
    }

    /**
     * This method checks whether the this rule requires to select the before character of the pattern
     * @return true if it need to be checked otherwise false
     */
    public boolean isbeforePositionToBeChecked(){
        return !(xCoordinateBefore == -1 && yCoordinateBefore == -1);
    }

}
