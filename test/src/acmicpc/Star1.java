package acmicpc;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String s = "*";
		
		int num = scan.nextInt();
		for(int i=0; i<num; i++){
			System.out.println(s);
			s += "*";
		}
		scan.close();
	}
}
