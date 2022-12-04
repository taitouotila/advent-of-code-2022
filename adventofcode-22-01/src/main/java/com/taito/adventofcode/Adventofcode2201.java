/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.taito.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Taito
 */
public class Adventofcode2201 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("..\\.\\.\\material\\1.txt");
        Scanner scan = new Scanner(file);

        ArrayList<Integer> sums = new ArrayList<>();
        String line = "";
        int sum = 0;
        while (scan.hasNextLine()) {
            sum = Integer.valueOf(scan.nextLine());
            while (!(line = scan.nextLine()).isEmpty()) {
                if (scan.hasNextLine()) {
                    sum += Integer.valueOf(line);
                } else {
                    break;
                }
            }
            sums.add(sum);
        }
        Integer max = sums.stream()
                .mapToInt(s -> s)
                .max().getAsInt();
        System.out.println(max);
                
        Collections.sort(sums);
        Collections.reverse(sums);
        
        List<Integer> topThree = sums.stream()
                .limit(3).collect(Collectors.toList());
        int sumTopThree = 0;
        for (Integer n : topThree) {
            sumTopThree += n;
        }
        System.out.println(sumTopThree);
    }
}
