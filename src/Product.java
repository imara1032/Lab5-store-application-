
// Head comment here!

public class Product {
    int productNum;
    String name;
    double unitPrice;

    // Constructor
    // ...
    public Product(int aProductNum, String aName, double aPrice){
    	productNum=aProductNum;
    	name= aName;
    	unitPrice=aPrice;
    	
    }
    public Product(Product a){
    this.productNum=a.productNum;
    this.name=a.name;
    this.unitPrice=a.unitPrice;
    }
    public void countProductNum(){
    	productNum++;
    }
    public int getProductNum() {
        return productNum;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }


    // More methods ...

}
