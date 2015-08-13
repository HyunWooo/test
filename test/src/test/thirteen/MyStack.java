package test.thirteen;

import java.util.Arrays;

public class MyStack {
	private Object[] elements = null;
	private int size;
	private final int DEFAULT_INIT_CAPACITY = 4;
	
	public MyStack() {
		elements = new Object[DEFAULT_INIT_CAPACITY];
	}

	public void put(Object o) throws Exception {
		ensureCapacity();
		System.out.println("put 전 " +size);
		elements[size++] = o;
		System.out.println(elements[size-1]);
		System.out.println("put 후 " + size);
	}
	
	public Object pop() {
		if(size == 0) 
			throw new RuntimeException("stack is empty");
		System.out.println("pop메소드안 " +size);
		return elements[--size];
	}
	
	private void ensureCapacity() {
		if(elements.length == size){
			System.out.println("size가 " + size+"일때 ensureCapacity()들어옴");
			elements = Arrays.copyOf(elements, 2 * size + 1);
			System.out.println("바뀐건" + elements);
	
		}
	}
	@Override
	public String toString() {
		return "MyStack [elements=" + Arrays.toString(elements) + "]";
	}
	
	
}
