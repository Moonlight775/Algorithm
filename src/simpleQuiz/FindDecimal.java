package simpleQuiz;

import java.util.Scanner;

public class FindDecimal {
	
	static int decimal(int n) {
		int cnt = 0;
		for (int i =1; i < n; i++) {
			if(n%i == 0) {
				cnt ++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("확인하실 숫자를 입력해주세요 : ");
		int n = sc.nextInt();
		
		if(decimal(n) == 1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
	}

}
