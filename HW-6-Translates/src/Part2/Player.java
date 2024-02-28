package Part2;

public class Player {
    static int MAX_STAMINA = 100;
    static int MIN_STAMINA = 0;
    static int countPlayers = 0;

    private int stamina;

    public Player() {
        this.stamina = (int) ((Math.random() * (100 - 90) + 90));
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        this.stamina--;
    }

    static public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) +
                    " свободных мест.");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}
