package edu.snhu;

import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      System.out.println("Item 1");
      askItemName(item1);
      askItemPrice(item1);
      askItemQuantity(item1);
      System.out.println("");
      System.out.println("Item 2");
      scnr.nextLine();
      askItemName(item2);
      askItemPrice(item2);
      askItemQuantity(item2);
      printShoppingCart();
   }
   
   private static void askItemName(ItemToPurchase item) {
      System.out.println("Enter the item name: ");
      String name = scnr.nextLine();
      item.setItemName(name);
   }
   
   private static void askItemPrice(ItemToPurchase item) {
      System.out.println("Enter the item price: ");
      int price = scnr.nextInt();
      item.setItemPrice(price);
   }
   
   private static void askItemQuantity(ItemToPurchase item) {
      System.out.println("Enter the item quantity: ");
      int quantity = scnr.nextInt();
      item.setItemQuantity(quantity);
   }
   
   private static void printShoppingCart() {
      System.out.println("TOTAL COST");
      System.out.println("" + item1.getItemName() + " " + item1.getItemQuantity() + " @ $" + item1.getItemPrice() + " = $" + (item1.getItemQuantity() * item1.getItemPrice()));
      System.out.println("" + item2.getItemName() + " " + item2.getItemQuantity() + " @ $" + item2.getItemPrice() + " = $" + (item2.getItemQuantity() * item2.getItemPrice()));
      System.out.println("");
      System.out.println("Total: $" + ((item1.getItemQuantity() * item1.getItemPrice()) + (item2.getItemQuantity() * item2.getItemPrice())));
   }
   
   private static Scanner scnr = new Scanner(System.in);
   private static ItemToPurchase item1 = new ItemToPurchase();
   private static ItemToPurchase item2 = new ItemToPurchase();
}
