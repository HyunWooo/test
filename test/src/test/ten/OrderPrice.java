package test.ten;

import java.util.Comparator;

public class OrderPrice implements Comparator<Product>{

	@Override
    public int compare(Product prd1, Product prd2) {
        if (prd1.prdPrice.compareTo(prd2.prdPrice) == 0) return 0;
        if (prd1.prdPrice.compareTo(prd2.prdPrice) == 1) return 1;
        if (prd1.prdPrice.compareTo(prd2.prdPrice) == -1) return -1;
        return 0;
    }
	
}
