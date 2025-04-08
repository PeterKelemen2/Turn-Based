package peti.dev.controller;

import java.util.HashMap;
import java.util.Random;

public class TurnController {
    private byte turn = 0;
    private Random rnd = new Random();

    public TurnController() {
    }

    public byte getTurn() {
        double r = rnd.nextDouble();  // 0.0 - 1.0
        byte currentTurn;
        if (r < 0.05) {
            currentTurn = 1; // Heal
        } else if (r < 0.25 + 0.05) {
            currentTurn = 2; // Combat
        } else {
            currentTurn = 3; // Walking
        }

        return currentTurn;
    }

    public void doTurn() {
        byte aux = turn;
        turn = getTurn();
        while (aux == turn && turn == 2) {
            turn = getTurn();
            System.out.println("New turn was selected!");
        }

        switch (turn) {
            case 1:
                System.out.println("Player is healed!");
                break;
            case 2:
                System.out.println("Player is attacked!");
                break;
            case 3:
                System.out.println("Player is walking!");
                break;
        }
    }

    public void testTurnChance(int nr) {
        long startTime = System.nanoTime();

        HashMap<Byte, Integer> turnMap = new HashMap<>();
        for (int i = 0; i < nr; i++) {
            byte result = getTurn();
            if (turnMap.containsKey(result)) {
                turnMap.put(result, turnMap.get(result) + 1);
            } else {
                turnMap.put(result, 1);
            }
        }

        long endTime = System.nanoTime();
        long timeTaken = (endTime - startTime) / 1_000_000;
        System.out.println("Testing took " + timeTaken + "ms");

        for (byte key : turnMap.keySet()) {
            System.out.println(key + " - " + (double) turnMap.get(key) / nr);
        }
    }
}
