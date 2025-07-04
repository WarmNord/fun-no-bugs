package practice_12_01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import practice01.practice_12_01.EntityManager;
import practice01.practice_12_01.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EntityManagerTest {

    private static EntityManager<User> eManager;
    static User u = new User("Will", 15, true);
    static User u1 = new User("Bill", 34, true);
    static User u2 = new User("Paul", 25, false);
    static User u3 = new User("April", 10, true);

    @BeforeAll
    static void setUp() {
        eManager = new EntityManager<>();
        eManager.addEntity(u);
        eManager.addEntity(u1);
        eManager.addEntity(u2);
        eManager.addEntity(u3);
    }

    @Test
    void addEntity() {
        EntityManager<User> eManager = new EntityManager<>();
        User u = new User("addEntity", 15, true);
        eManager.addEntity(u);
        assertTrue(eManager.getAllEntities().contains(u));
    }

    @Test
    void remove() {
        EntityManager<User> eManager = new EntityManager<>();
        User u = new User("remove", 15, true);
        eManager.addEntity(u);
        eManager.remove(u);
        assertFalse(eManager.getAllEntities().contains(u));
    }

    @Test
    void getAllEntities() {
        EntityManager<User> eManager = new EntityManager<>();
        User u = new User("getAllEntities", 15, true);
        eManager.addEntity(u);
        List<User> eCopy = eManager.getAllEntities();
        assertTrue(eManager.getAllEntities().containsAll(eCopy));
    }

    @Test
    void filterByAgeRange() {
        List<User> filterAge = eManager.filterByAgeRange(5, 16);
        assertTrue(filterAge.contains(u));
        assertTrue(filterAge.contains(u3));
    }

    @Test
    void filterByName() {
        List<User> filterName = eManager.filterByName("Bill");
        assertTrue(filterName.contains(u1));
    }

    @Test
    void filterByActive() {
        List<User> filterActive = eManager.filterByActive(false);
        assertTrue(filterActive.contains(u2));
    }
}