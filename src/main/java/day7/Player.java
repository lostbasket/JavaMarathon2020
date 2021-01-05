package day7;

public class Player {

    public static int countPlayers;
    private int stamina;
    private int MAX_STAMINA = 100;
    private int MIN_STAMINA = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    public static int getCountPlayers() {
        System.out.println(countPlayers);
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {

        if (stamina == 0) {
            return;
        }
        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        switch (countPlayers) {
            case 0:
            case 1:
                System.out.println("На поле еще есть " + (6 - countPlayers) + " свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("На поле еще есть " + (6 - countPlayers) + " свободных места");
                break;
            case 5:
                System.out.println("На поле еще есть " + (6 - countPlayers) + " свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
                break;
        }

    }
}
