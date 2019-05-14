package mainclass;

public class ProductMain {


		Product p1 = new ProductMain(Mainclass);
		p1.display();

Product p2 = new Product("123-145-7", "Toshiba TV", 349.0, 10);

Product[] myProduct = {new Product(123-145-7, "Siemens Phone", 500.0, 10),
				new Product(123-145-2, "Toshiba Radio", 600.0, 6),
				new Product(123-145-7, "Toshiba Remote Control", 15.0, 20),
				new Product(123-145-7, "Toshiba Stereo", 45.0, 45),
				new Product(123-145-7, "Toshiba Laptop",60.0,50),
				new Product(123-145-7, "Toshiba DVD Player",56.0,56),
				new Product(123-145-7, "Toshiba Memory Stick",56.0,45),
				new Product(123-145-7, "Toshiba Speakers",56.0, 45),
				new Product(123-145-7, "Toshiba Phones",45.0, 50),
				new Product(123-145-7, "Toshiba Memory Stick",45.0, 50), 
				p1};

for (int i=0; i<myProduct.length; i++){
	Product[i].display();
	System.out.println("myProduct");
}

}

}