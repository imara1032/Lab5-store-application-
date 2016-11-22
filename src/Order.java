
// Head comment

public class Order {
    int orderNum;
    double totalPrice;
    Product[] items = new Product[10];


    // Constructor ...
    public Order(Product a){
    	items[orderNum]= a;
    	totalPrice= totalPrice+ a.getUnitPrice();
    	orderNum++;
    }
    public double getTotal(){
    return totalPrice;
    }
    // Other methods ...
}