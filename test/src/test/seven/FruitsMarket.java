package test.seven;

public class FruitsMarket {

   /* public final static int APPLE = 1;
    public final static int ORANGE = 2;
    public final static int BANANA = 3;

    public String buyFruits(int fruitsType) {
          if(fruitsType == 1) return "사과";
          if(fruitsType == 2) return "오렌지";
          if(fruitsType == 3) return "바나나";
          return "없음";
    }*/
	
	public enum Fruits{
		APPLE,
		ORANGE,
		BANANA;
	}
	
	public String buyFruits(Fruits fruit){
		switch(fruit){
		case APPLE : return "사과";
		case ORANGE : return "오렌지";
		case BANANA : return "바나나";
		default : return "없음";
		}
	}
}
