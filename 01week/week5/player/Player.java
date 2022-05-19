package week5.player;

import week4.player.Level1Strategy;
import week4.player.LevelStrategy;

public class Player {

    public PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public void play(int time) {
        level.go(time);
    }



    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }
}
