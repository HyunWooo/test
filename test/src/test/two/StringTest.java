package test.two;

public class StringTest {

	public static void main(String[] args) {
		  String a = "123";
		  String b = "123";

		  String a1 = new String("123");                    
		  String b1 = new String("123");

		  String a2 = String.valueOf("123"); 
		  String b2 = String.valueOf("123");

		  String a3 = "1"+"2"+"3";
		  String b3 = "123";

		 //추가
		  String a4 = "12";
		  String b4 = a4 + "3";
		  a4 = a4 + "3";

		  System.out.println(a==b);    //String은 Immutable, String pool에서 처리한다. 
		  										// jvm이 String 풀에 등록시키고 String b="머시기";와 같이 동일한 값이 다시 호출될 때는 풀에 등록된 값을 리턴해 줍니다.
												  /*Immutable 클래스는 생성 후 변경 불가능한 객체로서, String, Boolean, Integer, Float, Long 등등이 있습니다. 
												   * 여기서 주의할 점은 변경불가라는 것은 heap 영역에서의 변경불가라는 뜻입니다. 
												   * String a="a"; a="b"; 와 같이 재할당은 가능합니다. 
												   * 이는 a가 reference하고 있는 heap 영역의 객체가 바뀌는 것이지 heap영역에 있는 값이 바뀌는 것이 아닙니다.*/
	  	  System.out.println(a1==b1); //'=='는 두 객체가 동일한 객체인지(메모리상의 주소만 비교, 값비교는 안한다.)를 판별하는 연산자이기 때문에 false 리턴
		  System.out.println(a2==b2); //valueOf는 "123".toString을 반환 => 같은 pool         
		  System.out.println(a3==b3); //자바컴파일러가 String a3 = "1"+"2"+"3"; 부분을 String b3 = "123";으로 변경시켜버린다. 
		  										 //컴파일러가 소스코드를 "그대로" 컴파일하지 않기 때문에 나타나는 현상입니다.
		  //추가
		  System.out.println(a4==b4);
		 }
	
	
	
	
}
