package g1.Exercise;
public class Product {

		int id;  
	    String name;  
	    double price;
	    
	    public Product(int id, String name, double price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }
	    
	    @Override
	    public String toString() {
	    	return "Id " +id+ " Name " +name+ " Price " +price;
	    }
}
