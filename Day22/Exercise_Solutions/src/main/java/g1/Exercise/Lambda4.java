package g1.Exercise;
import java.util.ArrayList;
import java.util.List;

public class Lambda4 {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  

	      list.forEach(
	    		  (n) -> System.out.println(n)
	    		  );
	}
}
