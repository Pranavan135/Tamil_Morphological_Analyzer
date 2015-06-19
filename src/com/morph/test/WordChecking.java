package com.morph.test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by pranavan on 19/06/15.
 */
public class WordChecking {

    public static void main(String[] args) throws IOException{
//        File f=new File("read.txt");
//        Reader decoded=new InputStreamReader(new FileInputStream(f), StandardCharsets.UTF_8);
//        BufferedWriter bufferedWriter = new BufferedWriter (new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
//        char[] buffer = new char[1024];
//        int n;
//        StringBuilder build=new StringBuilder();
//        while(true){
//            n=decoded.read(buffer);
//            if(n<0){break;}
//            build.append(buffer,0,n);
//            bufferedWriter.write(buffer);
//        }

//        System.out.println(buffer);
//        String verse = buffer.toString();
        //System.out.println(build.charAt(0));
        //System.out.println(verse.charAt(1));
        //System.out.println(verse);


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
