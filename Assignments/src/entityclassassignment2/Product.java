package entityclassassignment2;

public class Product {

	    public String productName;
	    public int productId;
	    public double price;

	    public Product(String productName, int productId, double price) {
	        this.productName = productName;
	        this.productId = productId;
	        this.price = price;
	    }

	    public void displayProduct() {
	        System.out.println("Product Name: " + productName);
	        System.out.println("Product ID: " + productId);
	        System.out.println("Price: ₹" + price);
	        System.out.println("-------------------------");
	    }
	}




