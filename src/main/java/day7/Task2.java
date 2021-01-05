package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int a = 90 + (int) (Math.random() * 11);

        Player player1 = new Player(a);
        Player player2 = new Player(a);
        Player player3 = new Player(a);
        Player player4 = new Player(a);
        Player player5 = new Player(a);
        Player player6 = new Player(a);

        Player.info();

        Player player7 = new Player(a);

        Player.getCountPlayers();

        for (int i = 0; i < a; i++) {
            player1.run();
        }

        Player.getCountPlayers();

        Player.info();
    }
}
