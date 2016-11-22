import java.util.Scanner;

public class OnlineStrore{
    String name;
    Product[] products = new Product[10];
    Order[] orders = new Order[10];
    int NumOfProducts=0;
    int numoders=0;
    OnlineStrore(String name) {
        this.name = name;
    }

    
    public void addProduct() {
    	Scanner input=new Scanner (System.in);
        System.out.print("Product Number: ");
        int aProductNum=input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name=input.nextLine();
        System.out.print("Product Price: ");
        double price=input.nextDouble();
        products[NumOfProducts]=new Product(aProductNum, name, price);
        NumOfProducts++;
        
    }

    
    public void productInfo() {
        for(int i=0; i< products.length; i++){
        	if(products[i]!=null){
        	System.out.println(i+". "+ products[i].getName()+" (No. "+ products[i].getProductNum()+") :"+ products[i].getUnitPrice());
        }
        }
    }

    
    public void makeOrder() {
        Scanner input= new Scanner(System.in);
    	System.out.print("Order Number: ");
    	int num=input.nextInt();
    	int orderNum=1;
    	while(orderNum!=0){
    	System.out.print("Type Product Number (0 to finish): ");
    	orderNum=input.nextInt();
    	boolean rightOrdrNum=false;
        for(int i=0; i<products.length; i++){
        	if(products[i].getProductNum() == orderNum ){
        		orders[numoders]= new Order(products[i]);
        		rightOrdrNum=true;}
        }
        if(!rightOrdrNum ){System.out.println("Error: Product "+orderNum+"does not exist.");}
    }
    	System.out.println("Order Info – Order Number: "+ num);
    	for(int i=0; i<orders.length; i++){
    		if(orders[i]!=null){
    			
    		}
    	}
    }
}
