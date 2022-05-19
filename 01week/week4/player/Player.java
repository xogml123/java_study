package week4.player;


public class Player {

    public LevelStrategy levelStrategy;

    public Player() {
        this.levelStrategy = new Level1Strategy();
    }

    public void play(int time) {
        levelStrategy.run();
        for(int i =0; i<time; i++) {
            levelStrategy.jump();
        }
        levelStrategy.turn();
    }
    public void upgradeLevel(LevelStrategy levelStrategy) {
        this.levelStrategy = levelStrategy;
    }
}
