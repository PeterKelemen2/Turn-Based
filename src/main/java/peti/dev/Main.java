package peti.dev;

import peti.dev.controller.CombatController;
import peti.dev.controller.TurnController;
import peti.dev.model.Enemy;
import peti.dev.model.Entity;
import peti.dev.model.Player;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long cycleTime = 1000;

        Entity entity = new Entity("sad");
//        System.out.println(entity);

        Player player = new Player("player", 10, 1);
        System.out.println(player);

        Enemy enemy = new Enemy("enemy", 4, 1);
//        System.out.println(enemy);

//        player.attack(enemy);
//        CombatController combatController = new CombatController(player, new Enemy[]{enemy});

//        TurnController turnController = new TurnController(player);

        Enemy lvl4 = new Enemy("SADASDD", 4);
        System.out.println(lvl4);

        player.levelUp();
        System.out.println(player);


//        while (true) {
//            long startTime = System.nanoTime();
////            System.out.println("Start: " + startTime);
//
////            combatController.doTurn();
//            turnController.doTurn();
//
//            long endTime = System.nanoTime();
////            System.out.println("End: " + endTime);
//
//            long timeTaken = (endTime - startTime) / 1_000_000;
//            System.out.println("Cycle took " + timeTaken + "ms");
//
//            if (timeTaken < cycleTime) {
//                Thread.sleep(cycleTime - timeTaken);
//            }
//        }
    }
}