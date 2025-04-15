package peti.dev.controller;

import peti.dev.model.Enemy;
import peti.dev.model.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CombatController {
    private Player player;
    //    private ArrayList<Enemy> asdasd;
    private ArrayList<Enemy> enemyList;

    private boolean isPlayersTurn;

    public CombatController(Player player, ArrayList<Enemy> enemyList) {
        this.player = player;
        this.enemyList = enemyList;
        Random rnd = new Random();
        this.isPlayersTurn = rnd.nextBoolean();
    }

    public CombatController() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Enemy> getEnemyList() {
        return enemyList;
    }

    public void setEnemyList(ArrayList<Enemy> enemyList) {
        this.enemyList = enemyList;
    }

    public boolean isPlayersTurn() {
        return isPlayersTurn;
    }

    public void setPlayersTurn(boolean playersTurn) {
        isPlayersTurn = playersTurn;
    }

    public void doTurn() {
        if (isPlayersTurn) {
            System.out.println("List of enemies:");
            for (int i = 0; i < enemyList.size() - 1; i++) {
                System.out.println(i + " - " + enemyList.get(i));
            }
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();
            System.out.println(option);
        } else {
            enemyList.getFirst().attack(player);
        }

        isPlayersTurn = !isPlayersTurn;
    }

//    public void playCombat(){
//        while
//    }
}
