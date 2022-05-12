package week4.player;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.upgradeLevel(new Level2Strategy());
        player.play(2);
        player.upgradeLevel(new Level3Strategy());
        player.play(3);
    }
}
