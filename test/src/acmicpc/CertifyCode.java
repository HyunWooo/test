package acmicpc;

import java.util.Scanner;

public class CertifyCode {

	public static void main(String[] args){
	
		String prdNo;
		int eachNo  = 0;
		int sumOfEachNo = 0;
		Scanner scan = new Scanner(System.in);
		
		prdNo = scan.nextLine();
		scan.close();
		
		for(int num = 0; num<9; num+=2){
			eachNo = Integer.parseInt(prdNo.substring(num, num+1));
			sumOfEachNo += eachNo*eachNo;
		}
		
		System.out.println(sumOfEachNo%10);
		
	}
}
