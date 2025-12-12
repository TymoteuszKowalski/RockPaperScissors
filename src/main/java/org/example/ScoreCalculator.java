package org.example;

public class ScoreCalculator {

    public static int getOutcomeScore(char opponent, char player) {

        if (opponent == player) {
            return 3;
        }

        if (player == 'X' && opponent == 'Z') return 6;
        if (player == 'Y' && opponent == 'X') return 6;
        if (player == 'Z' && opponent == 'Y') return 6;

        return 0;
    }
}