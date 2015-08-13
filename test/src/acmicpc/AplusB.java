package acmicpc;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String num = sc.nextLine();
		
		for(int i=0; i<3; i+=2){
			int eachNo = Integer.parseInt(num.substring(i,i+1));
			sum += eachNo;
		}
		System.out.println(sum);
		sc.close();
	}
}
