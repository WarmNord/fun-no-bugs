package practice01.practice_03;

public class GameSettings {
    /*Поля:
static int maxPlayers — максимальное количество игроков (общее для всех игр).
final String gameName — название игры.
int currentPlayers — текущее количество игроков.

Реализуйте:
Конструктор для инициализации gameName и начального количества игроков.
Статический метод setMaxPlayers(int newMax) для изменения максимального количества игроков.
Метод addPlayer(), который увеличивает текущее количество игроков на 1, если не превышен maxPlayers.
Метод printGameStatus(), который выводит название игры, текущее количество игроков и максимальное количество.

В методе main:
Создайте 2 игры, установите разные начальные параметры.
Измените максимальное количество игроков для всех игр.
Добавьте игроков в каждую игру и выведите её статус.*/

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    String getGameName() {
        return this.gameName;
    }

    int getCurrentPlayers() {
        return currentPlayers;
    }

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }

    void addPlayer() {
        if (this.currentPlayers < maxPlayers) {
            this.currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("название игры: " + getGameName() + ", текущее количество игроков: " + getCurrentPlayers() + ", максимальное количество: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Mario", 1);
        GameSettings game2 = new GameSettings("Spyro", 3);
        maxPlayers = 5;
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();
    }
}
