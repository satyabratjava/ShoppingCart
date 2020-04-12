package CartItems;

public class Productname {
	  String itemName;
	   int itemPrice;
	    int itemQuantity;
	    public Productname() {
	        this.itemName = "";
	        this.itemPrice = 0;
	        this.itemQuantity = 0;
	    }
	
	public Productname(String itemName,
	   int itemPrice,
	    int itemQuantity)
	{
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.itemQuantity=itemQuantity;
		
	}
	public void printItemCost() {
	       int subtotal = itemQuantity * itemPrice;
	       System.out.println(itemName + " " + itemQuantity + " * " + itemPrice + " = " + subtotal);
	   }

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Override
	public String toString() {
		return "Productname [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQuantity=" + itemQuantity
				+ "]";
	}
	
}