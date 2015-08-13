package test.eight;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student();
		st.setName("장");
		st.setNo(1);
		
		Student st2 = (Student) st.clone();
		System.out.println(st2==st);//call by reference
		System.out.println(st2.equals(st));//call by value
		System.out.println(st2);
		System.out.println(st);
		System.out.println(st2.getName());
		System.out.println(st2.getNo());
		
		st2.setName("김");
		
		System.out.println(st2.getName());
		System.out.println(st.getName());
	}
}
