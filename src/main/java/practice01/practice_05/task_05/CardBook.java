package practice01.practice_05.task_05;

public class CardBook {
    private User user;
    private boolean isAvalable;

    CardBook() {
        this.isAvalable = true;
    }

    void setUser(User user) {
        this.user = user;
    }

    void deleteUser(User user) {
        this.user = null;
    }

    public void setAvalable(boolean avalable) {
        this.isAvalable = avalable;
    }

    boolean getIsAvalable() {
        return this.isAvalable;
    }

}
