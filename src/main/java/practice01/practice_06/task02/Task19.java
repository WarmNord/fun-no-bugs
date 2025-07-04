package practice01.practice_06.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task19 {



    public static void main(String[] args) {
        Player player = new Player("asd", 500);
        Player player2 = new Player("bvbvn", 56);
        Player player3 = new Player("fgfd", 1);
        Player player4 = new Player("asdfdfgad", 5);
        Player player5 = new Player("assad", 23);

        Player.getChampion();

    }
    /*
    *
    * 19. Система рейтингов
Вам нужно хранить список игроков с их рейтингами, чтобы быстро находить игрока с самым высоким рейтингом.
    * */
}

class Player {

    static private ArrayList<Player> players = new ArrayList<>();

    String name;
    int score;

    String getName() {
        return this.name;
    }

    int getScore() {
        return this.score;
    }

    Player(String name, int score) {
        this.name = name;
        this.score = score;
        players.add(Player.this);
    }

    static void getChampion() {
        Collections.sort(players, Comparator.comparingInt(Player::getScore));
        System.out.println("Игрок с самым высоким рейтингом " +players.getLast().getScore() + " имя " + players.getLast().getName() );
    }
}
