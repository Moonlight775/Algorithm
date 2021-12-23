package simpleQuiz;

import java.util.Scanner;

public class HowManyBag {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("설탕의 킬로그램 = ");
		int sugar = scanner.nextInt();
		
		if(sugar%5 == 0) {
			System.out.println("봉지의 개수 = " + sugar / 5);
			return;
		}else {
			int five = sugar / 5;
			for(int i = five; i > 0; i--) {
				int tempsugar = sugar-(i * 5);
				if (tempsugar %3 == 0) {
					System.out.println("봉지의 개수 = " + (i + (tempsugar / 3)));
					return;
				}
			}
		}
		if(sugar%3 == 0) {
			System.out.println("봉지의 개수 = " + sugar / 3);
		}else {
			System.out.println("봉지에 담기지 못한 설탕이 발생 : " + -1);
		}
		
	}

}
