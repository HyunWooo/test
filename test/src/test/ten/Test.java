package test.ten;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Product> sortList = new ArrayList<Product>();
	    sortList.add(new Product("가위",4,new BigDecimal(112312312)));
	    sortList.add(new Product("나침반",3,new BigDecimal(3332112)));
	    sortList.add(new Product("라면",1,new BigDecimal(4212112)));
	    sortList.add(new Product("다리미",2,new BigDecimal(5212112)));
	    
	    
	    Collections.sort(sortList);
	    
	    System.out.println("default : " + sortList);
	    
	    OrderPrice op = new OrderPrice();
	    OrderName on = new OrderName();
	    
	    Collections.sort(sortList, op);
	    System.out.println("by Price : " + sortList);
	    
	    Collections.sort(sortList, on);
	    System.out.println("by Name : " + sortList);
	    
	    
	}
}
