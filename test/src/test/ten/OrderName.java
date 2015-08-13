package test.ten;

import java.util.Comparator;

public class OrderName implements Comparator<Product>{

	@Override
    public int compare(Product prd1, Product prd2) {
        return prd1.getPrdName().compareTo(prd2.getPrdName());
    }
}
