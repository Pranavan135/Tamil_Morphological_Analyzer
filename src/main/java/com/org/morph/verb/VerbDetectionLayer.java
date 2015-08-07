package com.org.morph.verb;

import com.org.morph.io.IOLayer;
import com.org.morph.tamil.TamilFontEntity;
import com.org.morph.tamil.TamilLayout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pranavan on 8/6/15.
 * The layer detects whether a word is a verb
 */
public class VerbDetectionLayer {
    private List<TamilFontEntity> word;
    private List<TamilFontEntity> endingLetters;

    public VerbDetectionLayer(String s) throws IOException {
        endingLetters = new ArrayList<>();
        word = IOLayer.getTamil(s);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/main/resources/EndingLetters.txt")));

        String line = bufferedReader.readLine();

        while (line != null) {
            if (line.length() > 1)
                endingLetters.add(TamilLayout.tamilLetterMap.get(line + " "));
            else
                endingLetters.add(TamilLayout.tamilLetterMap.get(line));
            line = bufferedReader.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        TamilLayout.init();

        VerbDetectionLayer verbDetectionLayer = new VerbDetectionLayer("வந்தார்கள்.");
        System.out.println(verbDetectionLayer.isVerb());

        verbDetectionLayer.setWord("வந்தன.");
        System.out.println(verbDetectionLayer.isVerb());

        verbDetectionLayer.setWord("வந்தது.");
        System.out.println(verbDetectionLayer.isVerb());

        verbDetectionLayer.setWord("வந்தான் .");
        System.out.println(verbDetectionLayer.isVerb());
    }

    public boolean isVerb() {
        if (word.size() >= 2 && word.get(word.size() - 1).toString().equalsIgnoreCase(".")) {
            TamilFontEntity last = word.get(word.size() - 2);

            for (TamilFontEntity tamilFontEntity : endingLetters) {
                if (last.equals(tamilFontEntity)) {
                    return true;
                }
            }

        }

        return false;
    }

    public void setWord(String s) {
        word = new ArrayList<>();
        word = IOLayer.getTamil(s);
    }
}
