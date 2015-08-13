package codility.lesson2_CountingElements;

import java.util.Arrays;

/*
 * Write a function:

int solution(int A[], int N);

that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

For example, given:

  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
the function should return 5.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */

/* Score : 100%
 * 
 * 1. 이건 안되는데라고 생각하지 말고 찾아봐라 => 정렬안되는줄...
 * 
 */
public class MissingInteger {

	public static void main(String[] args) {

		int[] A = {-1,4,1,3};
		System.out.println(solution(A));
		
	}

	public static int solution(int[] A) {
        // write your code in Java SE 8
		Arrays.sort(A);
		int min = 1;
		
		for(int i : A){
			if(i>-1 && i == min){
				min++;
			}
		}
		
		return min;
	}
	
	
	public static int solutions(int[] A) {
        // write your code in Java SE 8
		int length = A.length;
		int max = A[0];
		int k = 1;
		
		for(int i = 0; i<length; i++){
			if(max<A[i]){
				max = A[i];
			}
		}
		
		for(int i = (length-1); i >= 0; i--){
			if((max-k) == A[i]){
				k += 1;
				i = (length);
			}
		}
		
		if(max-k <= 0){
			return 1;
		}
		return max-k;
	}
		
			
			
}
	
