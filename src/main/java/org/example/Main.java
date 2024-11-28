package org.example;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            prinyMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //inventory.addProduct();



            }
        }
    }

    //   (rev - 28.11.2024 1:00)
    public static void prinyMenu() {
        System.out.println("menu: ");
        System.out.println("1. Add the product"); // реалізовано
        System.out.println("2. Update the quantity"); // реалізовано
        System.out.println("3. Delete the product");// реалізовано
        System.out.println("4. show product quantity"); // реалізовано
        System.out.println("5. Show products");
        System.out.println("6. Product with the highest quantity");
        System.out.println("7. Exit");
    }
}