package org.example;
import java.util.HashMap;
import java.util.Scanner;

//   (rev - 28.11.2024 1:00)

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        boolean running = true;
        while (running) {
            inventory.printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                // розказати за -> чому не : ( оператор break НЕ ПОТРІБЕН)  з
                case 1 -> {
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
                    inventory.addProduct(product, quantity);
                }
            }
        }
    }
}