package org.example;

public class Shape {

    public static int getShapeScore(char shape) {
        if (shape == 'X') return 1;
        if (shape == 'Y') return 2;
        if (shape == 'Z') return 3;
        return 0;
    }

    public static char opponentToShape(char opponent) {
        if (opponent == 'A') return 'X';
        if (opponent == 'B') return 'Y';
        if (opponent == 'C') return 'Z';
        return ' ';
    }
}
