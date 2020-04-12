package CartItems;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
	ArrayList<Productname> cartItems = new ArrayList<Productname>();
	 public ShoppingCart() {
	      // cartItems = new ArrayList<>();
	 }
	 public void addItem(Productname Productname) {
	       if (cartItems != null) {
	           cartItems.add(Productname);
	       }
	   }
	 public void removeItem(String itemName) {
		 
		
	       if (cartItems != null) {
	           for (Productname Productname1 : cartItems) {
	               if (Productname1.getItemName().equals(itemName)) {
	                   cartItems.remove(Productname1);
	                   return;
	               }
	               System.out.println("Item not found in cart. Nothing removed.");
	           }
	       }
	   }
	 
	 public void modifyItem(Productname ProductnameProductname) {
	       boolean itemFound = false;
	       if (cartItems != null) {
	           for (Productname item1 : cartItems) {
	               if (item1.getItemName().equals(ProductnameProductname.getItemName())) {
	                   itemFound = true;
	                   if (ProductnameProductname.getItemQuantity() != 0) {
	                       item1.setItemQuantity(ProductnameProductname.getItemQuantity());
	                   } 
	                   if (ProductnameProductname.getItemPrice() != 0) {
	                       item1.setItemPrice(ProductnameProductname.getItemPrice());
	                   }
	               }
	           }
	       }    
	 }
	 
	 public int getNumItemsInCart() {
	       int totalQuantity = 0;
	       if (cartItems != null) {
	           for (Productname Productname : cartItems) {
	               totalQuantity += Productname.getItemQuantity();
	           }
	       }
	       return totalQuantity;
	   }
	 public int getCostOfCart() {
	       int totalCostOfCart = 0;
	       if (cartItems != null) {
	           for (Productname Productname : cartItems) {
	               totalCostOfCart += (Productname.getItemQuantity() *Productname.getItemPrice());
	           }
	       }
	       return totalCostOfCart;
	   }
	 public void printTotal() {
	       if (cartItems == null || cartItems.size() == 0) {
	           System.out.println("SHOPPING CART IS EMPTY.");
	           return;
	       }
	       System.out.println("Number of Items: " + getNumItemsInCart());
	 
	       for (Productname Productname: cartItems) {
	    	   Productname.printItemCost();
	       }
	       System.out.println("Total::" + getCostOfCart());
	   }
	
	}

