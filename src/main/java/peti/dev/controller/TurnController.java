package peti.dev.controller;

import java.util.HashMap;
import java.util.Random;

enum Turn {
    IDLE,
    WALKING,
    HEAL,
    COMBAT
}

public class TurnController {
    private Turn turn = Turn.IDLE;
    private Random rnd = new Random();

    public TurnController() {
    }

    public Turn getTurn() {
        double r = rnd.nextDouble();  // 0.0 - 1.0
        Turn currentTurn;
        if (r < 0.05) {
            currentTurn = Turn.HEAL; // Heal
        } else if (r < 0.25 + 0.05) {
            currentTurn = Turn.COMBAT; // Combat
        } else {
            currentTurn = Turn.WALKING; // Walking
        }

        return currentTurn;
    }

    public void doTurn() {
        Turn aux = turn;
        turn = getTurn();
        while (aux == turn && turn == Turn.COMBAT) {
            turn = getTurn();
            System.out.println("New turn was selected!");
        }

        switch (turn) {
            case Turn.HEAL:
                System.out.println("Player is healed!");
                break;
            case Turn.COMBAT:
                System.out.println("Player is attacked!");
                break;
            case Turn.WALKING:
                System.out.println("Player is walking!");
                break;
        }
    }

    public void testTurnChance(int nr) {
        long startTime = System.nanoTime();

        HashMap<Turn, Integer> turnMap = new HashMap<>();
        for (int i = 0; i < nr; i++) {
            Turn result = getTurn();
            if (turnMap.containsKey(result)) {
                turnMap.put(result, turnMap.get(result) + 1);
            } else {
                turnMap.put(result, 1);
            }
        }

        long endTime = System.nanoTime();
        long timeTaken = (endTime - startTime) / 1_000_000;
        System.out.println("Testing took " + timeTaken + "ms");

        for (Turn key : turnMap.keySet()) {
            System.out.println(key + " - " + (double) turnMap.get(key) / nr);
        }
    }
}
