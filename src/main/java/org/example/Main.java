package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        boolean running = true;
        inventory.printMenu();
        while (running) {
            // питання по виводу, яе не засмічувати консоль

            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера після nextInt()

            switch (choice) {
                // розказати за -> чому не : ( оператор break НЕ ПОТРІБЕН)
                case 1 -> { //rev
                    System.out.print("Enter product name: ");
                    String product = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(product, quantity);
                }
                case 2 -> {
                    System.out.println("Enter product name: ");
                    String product = scanner.nextLine();
                    System.out.print("Enter A NEW product quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.updateProduct(product, quantity);
                }
                case 3 -> { //rev
                    System.out.println("Enter product name: ");
                    String product = scanner.nextLine();
                    inventory.removeProduct(product);
                }
                case 4 -> { //rev
                    System.out.println("Enter product name: ");
                    String product = scanner.nextLine();
                    inventory.showProductQuantity(product);
                }
                case 5 -> {
                    inventory.showAllProducts();
                }
                case 6 -> {
                    inventory.showMostAbundantProduct();
                }
                case 7 -> {
                    running = false;
                }
            }
        }
    }
}
