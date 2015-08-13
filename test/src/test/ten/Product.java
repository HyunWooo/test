package test.ten;

import java.math.BigDecimal;

public class Product  implements Comparable <Product>{

	String prdName;
	long prdNo;
	BigDecimal prdPrice;
	
	
	
	public Product(String prdName, long prdNo, BigDecimal prdPrice) {
		super();
		this.prdName = prdName;
		this.prdNo = prdNo;
		this.prdPrice = prdPrice;
	}


	@Override
    public int compareTo(Product other) {
        if (this.prdNo == other.prdNo) return 0;
        if (this.prdNo > other.prdNo) return 1;
        if (this.prdNo < other.prdNo) return -1;
        return 0;
    }


	public String getPrdName() {
		return prdName;
	}


	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}


	public long getPrdNo() {
		return prdNo;
	}


	public void setPrdNo(long prdNo) {
		this.prdNo = prdNo;
	}


	public BigDecimal getPrdPrice() {
		return prdPrice;
	}


	public void setPrdPrice(BigDecimal prdPrice) {
		this.prdPrice = prdPrice;
	}


	@Override
	public String toString() {
		return "Product [prdName=" + prdName + ", prdNo=" + prdNo
				+ ", prdPrice=" + prdPrice + "]";
	}

	/*@Override
	public int compare(Integer o1, Integer o2){
		// 역순정렬
		if(o1>o2){ 
			return -1;
		}
		else if(o1<o2){
			return 1;
		}
		else {
			return 0;
		}
		
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1); //위의 if 문을 조건삼항 연산자로 대체
	}*/
	
	
 }

