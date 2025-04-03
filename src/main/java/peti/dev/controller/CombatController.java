package peti.dev.controller;

import peti.dev.model.Enemy;
import peti.dev.model.Player;

import java.util.Random;

public class CombatController {
    private Player player;
    private Enemy[] enemyArray;

    private boolean isPlayersTurn;

    public CombatController(Player player, Enemy[] enemyArray) {
        this.player = player;
        this.enemyArray = enemyArray;
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

    public Enemy[] getEnemyArray() {
        return enemyArray;
    }

    public void setEnemyArray(Enemy[] enemyArray) {
        this.enemyArray = enemyArray;
    }

    public boolean isPlayersTurn() {
        return isPlayersTurn;
    }

    public void setPlayersTurn(boolean playersTurn) {
        isPlayersTurn = playersTurn;
    }

    public void doTurn() {
        if (isPlayersTurn) {
            player.attack(enemyArray[0]);
        } else {
            enemyArray[0].attack(player);
        }

        isPlayersTurn = !isPlayersTurn;
    }
}
