package main.java.com.tamil.morph.test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by pranavan on 19/06/15.
 */
public class WordChecking {

    public static void main(String[] args) throws IOException{

        String str = "\u0142o\u017Cy\u0142";
        System.out.println(str);
        System.out.println(str.length());

        final StringBuilder stringBuilder = new StringBuilder();
        InputStream inStream = new FileInputStream("read.txt");
        final InputStreamReader streamReader = new InputStreamReader(inStream, "UTF-8");
        final BufferedReader bufferedReader = new BufferedReader(streamReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line.toString());
            line = org.apache.commons.lang.StringEscapeUtils.unescapeJava(line);
            System.out.println(line);
            stringBuilder.append(line);
        }




    }
}
