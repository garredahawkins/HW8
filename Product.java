package products;
public class Product
{
    public String item1;
    public String item2;
    public String item3;
    public String item4;
    public String item5;
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;
    
    public void ProductList()
    {
        this.item1 = "Orange Juice";
        this.itemDescription = "A nutrient-rich liquid";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }
    {
        this.item2 = "Eggs";
        this.itemDescription = "Eggs are a great source of protein, and also a great brain food!";
        this.itemPrice = 0;
    }
    {
        this.item3 = "Bread";
        this.itemDescription = "Bread is a key component for carbohydrates";
        this.itemPrice = 0;
    }
    {
        this.item4 = "Turkey";
        this.itemDescription = "Turkey is a key component for protein and fat";
        this.itemPrice = 0;
    }
    {
        this.item5 = "Chicken Breast";
        this.itemDescription = "Chicken is a vital source of of lean protein";
        this.itemPrice = 0;
    }
  
    public Product(String itemName, String itemDescription, int itemPrice, int itemQuantity)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
      
    public String getName()
    {
        return itemName;
    }
  
    public void setName(String itemName)
    {
        this.itemName = itemName;
    }
  
    public int getPrice()
    {
        return itemPrice;
    }
  
    public void setPrice(int itemPrice)
    {
        this.itemPrice = itemPrice;
    }
  
    public int getQuantity()
    {
        return itemQuantity;
    }
  
    public void setQuantity(int itemQuantity)
    {
        this.itemQuantity = itemQuantity;
    }
  
    public String getDescription()
    {
        return itemDescription;
    }
  
    public void setDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }
      
    public void printItemCost()
    {
        int quantityCost = (getPrice() * getQuantity());
          
        System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = $" + quantityCost);
    }
      
    public void printItemDescription()
    {
        System.out.println(getName() + ": " + getDescription());
    }
}
