package com.morph.test;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class UTFTesting {
    public static void main(String[] args) throws IOException{
        Locale locale = new Locale("ta", "TA");
        Scanner scanner = new Scanner(new File("read.txt"), "UTF-8");
        scanner.useLocale(locale);

        //String line = scanner.nextLine().trim();

        System.out.println(scanner.next().charAt(3));

    }
}
