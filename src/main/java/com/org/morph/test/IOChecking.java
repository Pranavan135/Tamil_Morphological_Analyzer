package com.org.morph.test;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IOChecking {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("lives.txt"));

        String line = scanner.nextLine().trim();

        while(line != null){
            System.out.print(line.length() + " ");
            for(int i = 0 ; i < line.length() ; i++){
                System.out.print(line.charAt(i) + " ");
            }

            System.out.println();
            if(scanner.hasNext())
                line = scanner.nextLine();
            else
                break;
        }

    }
}
