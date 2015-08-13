package test.one;

public class PhoneNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*PhoneNumber phone = new PhoneNumber("010", "3341", "3855"); //생성자는 초기화의 역할..
		System.out.println(phone);
		System.out.println(010);*/
		
		PhoneNumber secondPhone = new PhoneNumber(); 
		secondPhone.setLocalNumber("0101"); //get,set메소드를 사용하면 멤버 변수에 접근한다는 사실을 객체가 알 수 있다. 혹은 각 자리에 대한 유효성 검사가 병행될 수 있다.
		secondPhone.setFrontNumber("3341"); //데이터 변경의 역할...
		secondPhone.setEndNumber("3855");
		
		System.out.println(secondPhone);
	}

}
