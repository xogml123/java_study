package week4.player;


public class Player {

    public LevelStrategy levelStrategy;

    public Player() {
        this.levelStrategy = new Level1Strategy();
    }

    public void jump() {
        levelStrategy.jump();
    }
    public void run() {
        levelStrategy.run();
    }
    public void turn() {
        levelStrategy.turn();
    }
    public void play(int time) {
        run();
        for(int i =0; i<time; i++) {
            jump();
        }
        turn();
    }
    public void upgradeLevel(LevelStrategy levelStrategy) {
        this.levelStrategy = levelStrategy;
    }
}
