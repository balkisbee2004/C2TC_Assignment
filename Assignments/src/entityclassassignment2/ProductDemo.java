package entityclassassignment2;

public class ProductDemo {

	    public static void main(String[] args) {
	        Product p1 = new Product("Laptop", 201, 65000.0);
	        Product p2 = new Product("Smartphone", 202, 30000.0);
	        Product p3 = new Product("Tablet", 203, 20000.0);
	        Product p4 = new Product("Smartwatch", 204, 8000.0);

	        System.out.println("Product Details:");
	        p1.displayProduct();
	        p2.displayProduct();
	        p3.displayProduct();
	        p4.displayProduct();
	    }
	}


