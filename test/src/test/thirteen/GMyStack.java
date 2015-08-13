package test.thirteen;

import java.util.Arrays;

public class GMyStack<E> {
	private E[] elements = null;
	private int size;
	private final int DEFAULT_INIT_CAPACITY = 4;
	
	public GMyStack() {
		elements = (E[])new Object[DEFAULT_INIT_CAPACITY];
	}

	public void put(E o) throws Exception {
		ensureCapacity();
		elements[size++] = o;
	}
	
	public E  pop() {
		if(size == 0) 
			throw new RuntimeException("stack is empty");
		return elements[--size];
	}
	
	private void ensureCapacity() {
		if(elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
}
