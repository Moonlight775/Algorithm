package chap01;

import java.util.Scanner;

public class QuizMax4 {
	
	public static void main(String[] args) {
		//1. max4
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a : "); int a = scanner.nextInt();
		System.out.println("b : "); int b = scanner.nextInt();
		System.out.println("c : "); int c = scanner.nextInt();
		System.out.println("d : "); int d = scanner.nextInt();
		System.out.println("max = " + Max4(a, b, c, d));
	}

	static int Max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
}
