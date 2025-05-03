package practice_12_05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryServiceTest {

    static InventoryService inventoryService;
    static Product p;
    static Product p1;
    static Product p2;
    static Product p3;

    @BeforeAll
    static void setUp() {
        inventoryService = new InventoryService(true);
        p = new Product("table", 5, "wood");
        p1 = new Product("cloudberry", 10, "berries");
        p2 = new Product("floor", 20, "wood");
        p3 = new Product("brie", 15, "cheese");
    }

    @Test
    void addProduct() {
        inventoryService.addProduct(p);
        assertTrue(inventoryService.containsProduct(p));
    }

    void addBadProduct() {
        inventoryService.setInventory(false);
        assertThrows(RuntimeException.class,
                () -> inventoryService.addProduct(p));
        inventoryService.setInventory(true);
    }

    @Test
    void getProductsByCategory() {
        List<Product> products = new ArrayList<>();
        products.add(p);
        inventoryService.addProduct(p);
        assertEquals(products,inventoryService.getProductsByCategory("wood"));

    }

    @Test
    void getProductsByPrice() {
        List<Product> products = new ArrayList<>();
        products.add(p);
        inventoryService.addProduct(p);
        assertEquals(products,inventoryService.getProductsByPrice(5));
    }
}