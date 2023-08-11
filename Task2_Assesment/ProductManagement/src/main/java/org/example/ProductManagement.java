package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    private static ArrayList<Product> products = new ArrayList<>();
    private static int idCounter = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Product Management System");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Edit Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        Product product = new Product(idCounter++, name, price);
        products.add(product);
        System.out.println("Product added successfully.");
    }

    private static void listProducts() {
        System.out.println("List of Products:");
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }

    private static void editProduct() {
        System.out.print("Enter the ID of the product to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product foundProduct = null;
        for (Product product : products) {
            if (product.getId() == id) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct != null) {
            System.out.print("Enter new product name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new product price: ");
            double newPrice = scanner.nextDouble();

            foundProduct.setName(newName);
            foundProduct.setPrice(newPrice);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found with the given ID.");
        }
    }

    private static void removeProduct() {
        System.out.print("Enter the ID of the product to remove: ");
        int id = scanner.nextInt();

        Product foundProduct = null;
        for (Product product : products) {
            if (product.getId() == id) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct != null) {
            products.remove(foundProduct);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found with the given ID.");
        }
    }
}

