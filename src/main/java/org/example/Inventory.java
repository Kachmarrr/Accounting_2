package org.example;

import java.util.HashMap;

public class Inventory {

    private HashMap<String, Integer> inventory;

    // чи можна вважати це конструктором ?
    public Inventory() {
        inventory = new HashMap<>();
        inventory.put("bread", 11);
        inventory.put("cake", 52);
        inventory.put("cheese", 23);
    }

    public void printMenu() {
        System.out.println("menu: ");
        System.out.println("1. Add the product"); // реалізовано
        System.out.println("2. Update the quantity"); // реалізовано
        System.out.println("3. Delete the product");// реалізовано
        System.out.println("4. show product quantity"); // реалізовано
        System.out.println("5. Show products");// реалізовано (30.11)
        System.out.println("6. Product with the highest quantity");
        System.out.println("7. Exit");
    }

    public void addProduct(String product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
        System.out.println("product added: " + product);
    }

    public void updateProduct(String product, int quantity) {
        if (inventory.containsKey(product)) {
            inventory.put(product, inventory.get(product) + quantity);
            System.out.println("product updated: " + product);
        } else {
            System.out.println("product not found" + product);
        }
    }

    public void removeProduct(String product) {
        if (inventory.containsKey(product)) {
            inventory.remove(product);
            System.out.println("product removed: " + product);
        } else {
            System.out.println("product not found" + product);
        }
    }

    public void showProductQuantity(String product) {
        if (inventory.containsKey(product)) {
            System.out.println("product quantity" + product + inventory.get(product));
        } else {
            System.out.println("product not found" + product);
        }
    }

    public void showAllProducts() {
        System.out.println("All products:");
        if (inventory.size() < 0) {
            System.out.println("No products found");
        } else {
            System.out.println("Products:");
            // поставити по цьому питання, саме по forEach, чому ми використовуюємо stream, але в нас немає ArrayList і синтаксис так само запитати
            inventory.forEach((product, quantity) -> System.out.println("-" + product + ": " + quantity));
        }
    }

    public void showMostAbundantProduct() {
        //запитати за isEmpty звідки це ?
        if (inventory.isEmpty()) {
            System.out.println("No products found");
            // чи потрібен тут return;
        }


    }


}