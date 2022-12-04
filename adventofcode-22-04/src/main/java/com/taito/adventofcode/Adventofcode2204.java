/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.taito.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Taito
 */
public class Adventofcode2204 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("..\\.\\.\\material\\4.txt");
        Scanner scan = new Scanner(file);
        String line = "";
        int count = 0;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            String[] sections = line.split(",");
            String[] s1 = sections[0].split("-");
            int s1n1 = Integer.valueOf(s1[0]);
            int s1n2 = Integer.valueOf(s1[1]);
            String[] s2 = sections[1].split("-");
            int s2n1 = Integer.valueOf(s2[0]);
            int s2n2 = Integer.valueOf(s2[1]);
            ArrayList<Integer> s1Nums = new ArrayList<>();
            while (s1n1 <= s1n2) {
                s1Nums.add(s1n1);
                s1n1++;
            }
            ArrayList<Integer> s2Nums = new ArrayList<>();
            while (s2n1 <= s2n2) {
                s2Nums.add(s2n1);
                s2n1++;
            }
            boolean match = false;
            if (s1Nums.size() > s2Nums.size()) {
                match = s2Nums.stream()
                        .anyMatch(n -> s1Nums.contains(n));
//                match = s1Nums.containsAll(s2Nums);
            } else {
                match = s1Nums.stream()
                        .anyMatch(n -> s2Nums.contains(n));
//                match = s2Nums.containsAll(s1Nums);
            }
            if (match) {
                count++;
            }
        }
        System.out.println(count);
    }
}
