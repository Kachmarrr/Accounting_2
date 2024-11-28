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

    public void addProduct(String product, int quantity) {
        inventory.put(product, inventory.getOrDefault(product,0) + quantity);
        System.out.println("product added: " + product);
    }

    public void updateProduct(String product, int quantity) {
        if (inventory.containsKey(product)) {
            inventory.put(product, inventory.get(product) + quantity);
            System.out.println("product updated: " + product);
        }
        else {
            System.out.println("product not found" + product);
        }
    }

    public void removeProduct(String product) {
        if (inventory.containsKey(product)) {
            inventory.remove(product);
            System.out.println("product removed: " + product);
        }
        else {
            System.out.println("product not found" + product);
        }
    }

    public void showProductQuantity(String product) {
        if (inventory.containsKey(product)) {
            System.out.println("product quantity" + product + inventory.get(product));
        }
        else {
            System.out.println("product not found" + product);
        }
    }

    public void showAllProducts() {
        System.out.println("All products:");
        for (String product : inventory.keySet()) {
            System.out.println(product);
        }
    }


















}
