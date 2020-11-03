import java.util.Scanner;
import products.ProductList;

public class ShoppingDriver
{
  
    private static Scanner input;
 
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        input = new Scanner(System.in);
  
        System.out.println("Please Type In Your Name:");
        cart.setCustomerName(input.nextLine());
        System.out.println("Please Enter Today's Date:");
        cart.setDate(input.nextLine());
        System.out.println("");
        System.out.println("Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getDate());
  
        String choice = "item";
        do
        {
            ShoppingCart.printMenu(cart);
            System.out.print("Here are the products we have to offer:");
            switch (choice)
            {
                case "Products":
                    ProductList item = new ProductList();
                    cart.Product();
                    break;
                case "Remove Item": 
                    System.out.println("Enter item name:");
                    cart.removeItem(input.nextLine());
                    break;
                case "Number of items":
                    cart.getNumItemsInCart();
                    break;
                case "Checkout":
                    cart.getCostOfCart();
                    break;
                case "Ice":
                    cart.printTotal();
                    break;
            }
            choice = input.nextLine().toLowerCase();
        } while (choice != "item");
    }
}