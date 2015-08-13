package codility.lesson1_TimeComplexity;

/* Score : 100%
 * 
 * 1. 간단간단하게 로직을 생각해보자.. 있는그대로 작성해보기
 * 2. 올림인지, 반올림인지 잘 판단하기
 * 
 */
public class FrogJmp {
	public static void main(String[] args) {
		System.out.println(solution(10,31,10));
	}
	public static int solution(int X, int Y, int D) {
	    return (int)Math.ceil((double)(Y-X)/D);
	}
}
