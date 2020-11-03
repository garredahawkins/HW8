import java.util.ArrayList;
import java.util.Scanner;

import products.ProductList;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ProductList> cartItems = new ArrayList<>();
  
    public ShoppingCart()
    {
        this.customerName = "none";
        this.currentDate = "November 2, 2020";
    }
  
    public ShoppingCart(String customerName, String currentDate)
    {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }
  
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
  
    public String getCustomerName()
    {
        return customerName;
    }
  
    public void setDate(String currentDate)
    {
        this.currentDate = currentDate;
    }
  
    public String getDate()
    {
        return currentDate;
    }
  
    public void addItem(Product item) //HAVING TROUBLE PASSING OBJECT THROUGH A PARAMETER
    {
        cartItems.add(item);
    }
  
    public void removeItem(String itemName)
    {
  
        for (int i = 0; i < cartItems.size(); ++i)
        {
            Product item = cartItems.get(i);
            if (itemName.equals(item.getName()))
            {
                cartItems.remove(i);
            } else
            {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
  
    }
  
    public void modifyItem(Product item, String itemName) //FIX!! default values for if statement
    {
        for (int i = 0; i < cartItems.size(); ++i)
        {
            item = cartItems.get(i);
            if (itemName.equals(item.getName()))
            {
                cartItems.get(i).setName("");
                cartItems.get(i).setDescription("");
                cartItems.get(i).setPrice(20);
                cartItems.get(i).setQuantity(5);
            } else
            {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
    }
  
    public int getNumItemsInCart()
    {
        int quantity = 0;
        for (int i = 0; i < cartItems.size(); ++i)
        {
            quantity += cartItems.get(i).getQuantity();
        }
        return quantity;
    }
  
    public int getCostOfCart()
    {
        int costOfCart = 0;
        for (int i = 0; i < cartItems.size(); ++i)
        {
            costOfCart += cartItems.get(i).getPrice();
        }
        return costOfCart;
    }
  
    public void printTotal() 
    {
        for(int i = 0; i < cartItems.size(); i++)
        {
            cartItems.get(i).printItemCost();
        }
        System.out.println("Total: $" + getCostOfCart());
    }
  
    public void printDescription()
    {
        for (int i = 0; i < cartItems.size(); ++i)
        {
            cartItems.get(i).printItemDescription();
        }
    }
    public void Product() {
	}
    public static void printMenu(ShoppingCart cart)
    {
        System.out.println("MENU\na - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("\nChoose an option: ");
  
    }


}
