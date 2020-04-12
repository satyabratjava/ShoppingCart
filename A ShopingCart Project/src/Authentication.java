import java.util.Scanner;

import CartItems.Productname;
import CartItems.ShoppingCart;
import Com.ShoppingCart.Exceptions.InvalidMobileNumberException;
import Com.ShoppingCart.Exceptions.InvalidUserNamePasswordException;
import Com.ShoppingCart.Exceptions.PassowrdMissMatchException;

public class Authentication {
	static String pass;
	static String mobile;
	static String name;
	static String mail;
	
	 void  UserAdminlogin(String name,String pass)
	{
		}
	
	public void UserAdminSignUp(String name,String pass,String mobile,String mail)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("enter passowrd");
		pass=sc.next();
		if(pass.length()<8)
		{
			try {
				throw new  Com.ShoppingCart.Exceptions.InvalidPassowrdException ("The password length should be 8 ");
			} catch ( Com.ShoppingCart.Exceptions.InvalidPassowrdException  e) 
			{
				e.printStackTrace();
			}
		}
		else
		System.out.println("enter mobile number");
		mobile=sc.next();
		if(mobile.length()<10)
		{
			try
			{
				throw new InvalidMobileNumberException("the mobile number should be 10 digit");
			}
			catch(InvalidMobileNumberException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("SignUp Successful");
		
	}
	void ForgetPasssowrd(String pass,String mail,String pass1)
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your mail/UserName");
			mail=sc.next();
			System.out.println("enter a passowrd");
			pass=sc.next();
			if(pass.length()<8)
			
					try {
						throw new  Com.ShoppingCart.Exceptions.InvalidPassowrdException ("The password length should be 8 ");
					} catch ( Com.ShoppingCart.Exceptions.InvalidPassowrdException  e) 
					{
						e.printStackTrace();
					}	
			
			System.out.println("comfirm passowrd");
			pass1=sc.next();
			if(pass1.equals(pass))
			{
				System.out.println("Passowrd reset successfully");
			}
			else
				try
			{
					throw new PassowrdMissMatchException ("passowrd Miss Match::Passowrd should be same");
			}
			catch(PassowrdMissMatchException e)
			{
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		Authentication a = new Authentication();
		
	    Scanner sc = new Scanner(System.in);
	String ans;
	do
	{
	System.out.println("1.login"+"\n"+"2.signup"+"\n"+"3.forgotpassowrd");
	System.out.println("------------------enter your choice-------------------");
	int ch = sc.nextInt();
	
	switch(ch)
	{
	case 1:
		a.UserAdminlogin(name, pass);
		
		
		Scanner sc2 = new Scanner (System.in);
		System.out.println("Enter User Name");
		name=sc2.next();
		System.out.println("Enter Passowrd");
		pass=sc2.next();
		if(name.equals(name="Satya") && pass.equals(pass="System") || name.equals(name="Admin") && pass.equals(pass="ADMIN") )
		{
			System.out.println("Welcome User");
			System.out.println("Press 1 - To Add Item To Cart");
			ShoppingCart  cart = new ShoppingCart();
		    Scanner sc1 = new Scanner(System.in);
		    int ch11=sc2.nextInt();
		               switch (ch11) {
		               case 1: 
		                    String name;
		                    int price, qty;
		                    System.out.println("---ADD ITEM TO CART---");
		                    System.out.println("--Enter Item name--:");
		                    name = sc1.nextLine().trim().toString();
		                    System.out.println("--Enter Item price--:");
		                    price = sc1.nextInt();
		                    sc1.nextLine();
		                    System.out.println("--Enter Item quantity:");
		                    qty = sc1.nextInt();
		            Productname productname = new Productname(name, qty, price);
					cart.addItem(productname);
						    System.out.println("----------showing Cart-------------");
						    cart.printTotal(); 
						    System.out.println("---------Update Cart--------------");
						    String itemName2;
		                    int itemQty2;
		                    System.out.println("CHANGE ITEM QUANTITY");
		                    System.out.println("Enter item name:");
		                    itemName2 = sc1.next().trim().toString();
		                    System.out.println("Enter the new quantity:");
		                    itemQty2 = sc1.nextInt();
		                  // sc1.nextLine().trim().charAt(0);
		              Productname item = new Productname(itemName2, itemQty2, 0);
		              cart.modifyItem(item);
		                     System.out.println("----------Showing Cart After Updating-------------");
		                     cart.printTotal();	
		                     String itemToRemove;
					         System.out.println("---------REMOVE ITEM FROM CART----------");
					         System.out.println("Enter name of item to remove:");
					         itemToRemove = sc1.next().trim().toString();
						     cart.removeItem(itemToRemove);
				     System.out.println("----------Showing Cart After Remove-------------");
				     cart.printTotal();
		                   break;
		               }  
		}
			else if(name.equals(name="Admin") && pass.equals(pass="ADMIN"))
			{
				System.out.println("Wecome Admin");
				System.out.println("Press 1 - To Add Item");
				ShoppingCart  cart = new ShoppingCart();
			    Scanner sc1 = new Scanner(System.in);
			    int ch11=sc2.nextInt();
			               switch (ch11) {
			               case 1: 
			                   String name;
			                   int price, qty;
			                   System.out.println("---ADD ITEM---");
			                   System.out.println("--Enter Item name--:");
			                   name = sc1.nextLine().trim().toString();
			                   System.out.println("--Enter Item price--:");
			                   price = sc1.nextInt();
			                   sc1.nextLine();
			                   System.out.println("--Enter Item quantity:");
			                   qty = sc1.nextInt();
			             Productname productname = new Productname(name, qty, price);
			             cart.addItem(productname);
							   String itemToRemove;
							   System.out.println("---------REMOVE ITEM----------");
					           System.out.println("Enter name of item to remove:");
					           itemToRemove = sc1.next().trim().toString();
						       cart.removeItem(itemToRemove);
						  System.out.println("---------- After Removeving-------------");
						  cart.printTotal();
				          break;
			               }
			}
			else
				try {
					throw new InvalidUserNamePasswordException("Invalid UserName or Passowrd");
				} catch (InvalidUserNamePasswordException e) {
					e.printStackTrace();
				}	
	break;
	case 2: 
		System.out.println("1.Enter as a ADMIN");
		System.out.println("2.Enter as a USER");
		int ch1=sc.nextInt();
		switch(ch1)
		{
		case 1:
			a.UserAdminSignUp( name, pass, mobile, mail);
			break;
		case 2:
			a.UserAdminSignUp( name, pass, mobile,mail);
		break;
		}
		
	break;
	case 3:
		String pass1 = null;
		a.ForgetPasssowrd(pass, mail, pass1);
	}
	System.out.println("Press :YES: to continue if not press :NO:");
	 ans=sc.next();
	 if(ans.equals("no"))
	 break;
	}
	while(ans.equals("yes"));

	}
}
