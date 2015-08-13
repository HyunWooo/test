package test.thirteen;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyStack st = new MyStack();
		
		st.put(1);
		st.put(3);
		st.put(5);
		st.put(6);
		st.put(8);
		
		System.out.println("pop!! "+ st.pop());
		System.out.println("pop!! "+ st.pop());
		st.put(4);
		System.out.println("pop!! "+ st.pop());
	}

}
