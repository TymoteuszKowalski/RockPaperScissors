package org.example;

public class Round {

    private char opponentShape;
    private char playerShape;

    public Round(String line) {
        this.opponentShape = Shape.opponentToShape(line.charAt(0));
        this.playerShape = line.charAt(2);
    }

    public int calculateScore() {
        int shapeScore = Shape.getShapeScore(playerShape);
        int outcomeScore = ScoreCalculator.getOutcomeScore(opponentShape, playerShape);
        return shapeScore + outcomeScore;
    }
}
