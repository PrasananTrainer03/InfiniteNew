package g1.Exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda6 {

	public static void main(String[] args) {
			
			List<Product> list=new ArrayList<Product>();  
         
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",25000f));  
	        list.add(new Product(3,"Keyboard",300f));  
	        list.add(new Product(2,"Dell Mouse",150f));
	        
	        Collections.sort(list,(p1,p2)->{
	        	return p1.name.compareTo(p2.name);
	        });
	        
	        System.out.println("First List");
	        for(Product p : list){
	        	System.out.println(p);
	        }
	        
	        Collections.sort(list,(p1,p2)->{
	        	return (int) (p1.price-p2.price);
	        });

	        System.out.println("Second List");
	        for(Product p : list){
	        	System.out.println(p);
	        }
	        
	        
	}
}
