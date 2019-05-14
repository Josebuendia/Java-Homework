package mainfile;

public class Homeworkq1class4 {
	
	//data members
	private String productID;
	private String name;
	private double price;
	private int quantityInStock;
	
	//methods
	public Product(){
		//empty constructor
	}
	
	public Product(String pd, String nm, double pr, int qis){
		productID = pd;
		name = nm;
		price = pr;
		quantityInStock = qis;
	}
	
	public String getProductID(){
		return getproductID;
	}
	public void setProductID(String pd){
		productID = pd;
	}
	
	public String getname(){
		return name;
	}
	public void setname(String nm){
		productID = nm ;
	}
	
	public void setPrice(double pr){
		price = pr;
	}
	
	public int getQuantityInStock(){
		return quantityInStock;
	}
	public void setQuantityInStock(int qis){
		quantityInStock = qis;
	}
	
	public void display(){
		System.out.println("productID: " + productID);
		System.out.println("Name: " + name);
		System.out.println("price: " + salary);
		System.out.println("quantityInStock: " + quantityInStock);
	}

}
	
}
