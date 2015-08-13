package codility.lesson1_TimeComplexity;

/* Score : 100%
 * 
 * 1. 있는 그대로 로직 생각해보기
 * 2. 중첩 for문 쓰지말자
 * 
 * 
 */
public class PermMissingElem {
	public static void main(String[] args) {

		int[] A = {5,2,1,3};
		System.out.println(solution(A));
		
	}

	public static int solution(int[] A) {
        // write your code in Java SE 8
        
        int allSum =  0;
//        for(int i = 1; i<=A.length+1; i++){
//            allSum += i;
//        }
        allSum = (A.length+1)*(A.length+2)/2;
        
        for(int j = 0; j<A.length; j++){
            allSum -= A[j];    
        }
        
        return allSum;
    }
	
}
