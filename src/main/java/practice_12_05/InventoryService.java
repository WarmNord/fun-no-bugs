package practice_12_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* InventoryService: Сервис для управления товарами на складе. Должен поддерживать операции добавления товара и извлечения товара по категории.
*
Управление товарными запасами:
Хранение товаров осуществляется в структуре Map<String, List<Product>>, где ключ - это категория товара.
Метод для добавления товара на склад. Если флаг isInventoryOpen равен false, операция добавления не должна выполняться.
Метод для получения товара по категории. Если в указанной категории нет товаров, должно выбрасываться исключение OutOfStockException.
*
* Работа с данными:
Использование Stream API для поиска и фильтрации товаров по категориям.
Фильтрация товаров по цене с использованием лямбда-выражений.
* */
public class InventoryService {
    private Map<String, List<Product>> products = new HashMap<>();

    public boolean isInventoryOpen() {
        return inventory;
    }

    public void setInventory(boolean inventory) {
        this.inventory = inventory;
    }

    private boolean inventory;

    InventoryService(boolean inventory) {
        this.inventory = inventory;
    }

    public synchronized void addProduct(Product product) {
        if (!isInventoryOpen()) {
            throw new RuntimeException("Добавление товара на склад на данный момент невозвожно");
        }

        products.computeIfAbsent(product.getCategory(), p -> new ArrayList<>()).add(product);
    }

    public synchronized List<Product> getProductsByCategory(String category) {
        if (!products.containsKey(category)) {
            throw new OutOfStockException("В указанной категории нет товаров");
        }

        return products.get(category);
    }

    public synchronized List<Product> getProductsByPrice(int price) {
        return products.values().stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() == price)
                .collect(Collectors.toList());
    }

    public boolean containsProduct(Product product) {
        return products.get(product.getCategory()).contains(product);
    }

    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService(true);

        Product p = new Product("table", 5, "wood");
        Product p1 = new Product("cloudberry", 10, "berries");
        Product p2 = new Product("floor", 20, "wood");
        Product p3 = new Product("brie", 15, "cheese");

        inventoryService.addProduct(p);
        inventoryService.addProduct(p1);
        inventoryService.addProduct(p2);
        inventoryService.addProduct(p3);

        inventoryService.getProductsByCategory("brie");
        inventoryService.getProductsByPrice(5).forEach(
                s -> System.out.println(s.getName())
        );


    }
}
