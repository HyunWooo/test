package codility.lesson1_TimeComplexity;

/* Score : 83%
 * 
 * 1. 절대값쓰는 문제는 음수도 꼭 테스트해보기
 * 2. 절대값 괄호 조심하기
 * 3. for문 초기값 0인지 1인지 잘 판단하기
 * 4. 문제의 값만 돌아간다고 잘된다고 생각하지말자... 처음에 8%
 * 
 */
public class TapeEquilibrium {

	public static void main(String[] args) {

		int[] A = {1000,-1000};
		
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int length = A.length;
	    int sumAll = 0;
	    int eachAdd = A[0];
	    
	    
	    for(int i=0; i<length; i++){
	        sumAll += A[i];    
	    }
	    sumAll -= A[0];
	    int minimumRs = Math.abs(eachAdd-sumAll);
	    
	    
	    for(int j=1; j<length; j++){
	        eachAdd += A[j];
	        sumAll -= A[j];
	        int temp = Math.abs(eachAdd-sumAll);
	        
	        if(minimumRs > temp && temp>0){
	            minimumRs = temp;
	        }
	    }
	    
	    return minimumRs;
	}
}
