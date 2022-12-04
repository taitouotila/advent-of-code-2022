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
public class Adventofcode2202 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("T:\\Projects\\taitouotila\\adventofcode-22\\material\\2.txt");
        Scanner scan = new Scanner(file);
        int score = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineSplit = line.split(" ");
            String opp = lineSplit[0];
            String me = lineSplit[1];
            String myChoice = "";

            if (opp.equals("A")) {
                if (me.equals("X")) {
                    me = "Z";
                } else if (me.equals("Y")) {
                    me = "X";
                } else if (me.equals("Z")) {
                    me = "Y";
                }
            }
            if (opp.equals("B")) {
                if (me.equals("X")) {
                    me = "X";
                } else if (me.equals("Y")) {
                    me = "Y";
                } else if (me.equals("Z")) {
                    me = "Z";
                }
            }
            if (opp.equals("C")) {
                if (me.equals("X")) {
                    me = "Y";
                } else if (me.equals("Y")) {
                    me = "Z";
                } else if (me.equals("Z")) {
                    me = "X";
                }
            }

            if (me.equals("X")) {
                score += 1;
                if (opp.equals("C")) {
                    score += 6;
                }
                if (opp.equals("A")) {
                    score += 3;
                }
            }
            if (me.equals("Y")) {
                score += 2;
                if (opp.equals("A")) {
                    score += 6;
                }
                if (opp.equals("B")) {
                    score += 3;
                }
            }
            if (me.equals("Z")) {
                score += 3;
                if (opp.equals("B")) {
                    score += 6;
                }
                if (opp.equals("C")) {
                    score += 3;
                }
            }
        }
        System.out.println(score);
    }
}
