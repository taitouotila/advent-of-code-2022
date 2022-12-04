/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.taito.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Taito
 */
public class Adventofcode2203 {

    public static void firstPart() throws FileNotFoundException {
        File file = new File("T:\\Projects\\taitouotila\\adventofcode-22\\material\\3.txt");
        Scanner scan = new Scanner(file);

        String alphabet = ".abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String line = "";
        String equal = "";
        int sum = 0;

        while (scan.hasNextLine()) {
            Boolean broke = false;
            line = scan.nextLine();
            int mid = line.length() / 2;
            String[] parts = {line.substring(0, mid), line.substring(mid)};

            char[] parts1 = parts[0].toCharArray();
            char[] parts2 = parts[1].toCharArray();

            for (char c1 : parts1) {
                for (char c2 : parts2) {
                    if (c1 == c2) {
                        equal += c2;
                        broke = true;
                        break;
                    }
                }
                if (broke == true) {
                    break;
                }
            }
        }
        System.out.println(equal);
        for (int i = 0; i < equal.length(); i++) {
            sum += alphabet.indexOf(equal.charAt(i));
        }
        System.out.println(sum);
    }

    public static void secondPart() throws FileNotFoundException {
        File file = new File("T:\\Projects\\taitouotila\\adventofcode-22\\material\\3.txt");
        Scanner scan = new Scanner(file);

        String alphabet = ".abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String line1 = "";
        String line2 = "";
        String line3 = "";
        String equal = "";
        int sum = 0;

        while (scan.hasNextLine()) {
            Boolean broke = false;
            line1 = scan.nextLine();
            line2 = scan.nextLine();
            line3 = scan.nextLine();

            char[] line1c = line1.toCharArray();
            char[] line2c = line2.toCharArray();
            char[] line3c = line3.toCharArray();

            for (char c1 : line1c) {
                for (char c2 : line2c) {
                    for (char c3 : line3c) {
                        if (c1 == c2 && c1 == c3 && c2 == c3) {
                            equal += c1;
                            broke = true;
                            break;
                        }
                    }
                    if (broke == true) {
                        break;
                    }
                }
                if (broke == true) {
                    break;
                }
            }
        }
        System.out.println(equal);
        for (int i = 0; i < equal.length(); i++) {
            sum += alphabet.indexOf(equal.charAt(i));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws FileNotFoundException {
        firstPart();
        secondPart();
    }
}
