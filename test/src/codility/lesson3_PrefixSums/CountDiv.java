package codility.lesson3_PrefixSums;

/*
 * Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Assume that:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).
Copyright 2009–2015 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */


/*Score : 100%
 * 
 * 1. 0은 모든 수의 배수이다.!!!!!!!!!!!!!!!!!!!
 * 2. 1은 모든 수의 약수이다.
 * 
 */
public class CountDiv {

	public static void main(String[] args) {

		System.out.println(solution(0, 11, 5));
	}

	public static int solution(int A, int B, int K) {
		return (A == 0 ? B/K+1 : B/K-(A-1)/K); //Score 100%
		//return B/K - A/K + (A % K == 0 ? 1 : 0); //Score 100%
    }
	
}
