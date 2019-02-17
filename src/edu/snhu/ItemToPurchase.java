package edu.snhu;

import org.jetbrains.annotations.Contract;

public class ItemToPurchase {
   
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
   
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }
   
   @Contract(pure = true)
   public final String getItemName() {
      return itemName;
   }
   
   public void setItemPrice(int itemPrice) {
      this.itemPrice = itemPrice;
   }
   
   @Contract(pure = true)
   public final int getItemPrice() {
      return itemPrice;
   }
   
   public void setItemQuantity(int itemQuantity) {
      this.itemQuantity = itemQuantity;
   }
   
   public final int getItemQuantity() {
      return itemQuantity;
   }
   
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
}