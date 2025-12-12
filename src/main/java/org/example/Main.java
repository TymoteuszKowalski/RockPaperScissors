package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int totalScore = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                Round round = new Round(line);
                totalScore += round.calculateScore();
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
        }

        System.out.println("TOTAL SCORE: " + totalScore);
    }
}
