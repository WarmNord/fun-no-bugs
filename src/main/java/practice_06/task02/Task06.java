package practice_06.task02;

import java.util.HashSet;

public class Task06 {

    /*
    * 6. Управление друзьями пользователя
Требуется хранить связи между пользователями в социальной сети, где каждый пользователь может быть связан с несколькими другими.
    * */
}

class User {
    private HashSet<User> friends;

    private int id;
    private String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
        this.friends = new HashSet<>();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
            System.out.println("Добавлен друг " + user.getName() + " " + user.getId());
        }
    }

    void showFriends() {
        System.out.println("Друзья " + getName() + ":");
        friends.forEach(
                user -> {
                    System.out.println(user.getName() + " " + user.getId());
                }
        );
    }

    public static void main(String[] args) {
        User user = new User(1, "Маша");
        User user2 = new User(10, "Коля");
        User user3 = new User(23, "Игорь");
        User user4 = new User(55, "Катя");

        user.addFriend(user2);
        user.addFriend(user3);
        user.addFriend(user4);
        user.addFriend(user2);

        user.showFriends();

    }
}
