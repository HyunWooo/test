package codility.lesson2_CountingElements;



/* Score : 100%
 * 
 * 1. 총합구하기 for문대신에 => n*(n+1)/2
 * 2. 배열은 for문돌려서 초기화해주기
 * 
 * 3. 여러경우의 수를 생각해야된다.
 * 		총합은 같지만 순차수열은 아닌것(중복값이 있는것들...{1,2,3,4}와 {1,3,3,3})
 * 		배열길이보다 값이 큰 것들 ({4,3,2}) => 순차수열이 될 수가 없다.
 * 
 * 4. 중첩for문은 성능이 그냥 망이다 쓰면안된다.
 * 5. 배열의 길이, 생성배열의 길이 잘 체크하기
 */
public class PermCheck {
	public static void main(String[] args) {

		int[] A = {1,2,2};
		System.out.println(solution(A));
	}

	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        int length = A.length;
	        int cnt[] = new int[length];
	        int sumAll = length*(length+1)/2;
	        
	        for(int i = 0; i<length; i++){
	        	cnt[i]=0;
	        }
	        
	        for(int k = 0; k<length; k++){
	        	if(A[k]>length || length==0){
	        		return 0;
	        	}
	        	cnt[A[k]-1]++;
	        	if(cnt[A[k]-1]>1){
	        		return 0;
	        	}
	        	sumAll -= A[k];
        	}
	        if(sumAll==0){
	        	return 1;
	        }
	        return 0;
	    }
}
