package simpleQuiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumAbsolutes {
	public static int solution(int[] absolutes, boolean[] signs) {
		int sum = 0;
		
		for (int i=0;i<absolutes.length;i++) {
			sum +=absolutes[i];
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수의 개수 : ");
		int size = sc.nextInt();
				
		int[] absolutes = new int[size];
		
		for (int i=0; i<size; i++) {
			System.out.print("임의의 정수를 입력하세요. : ");
			absolutes[i] = sc.nextInt();
		}
		
		boolean[] signs = new boolean[size];
		
		for ( int i=0; i<size; i++) {
			if(absolutes[i] > 0 ) {
				signs[i] = true;
			}else {
				signs[i] = false;
			}
		}
		
		System.out.println(solution(absolutes, signs));
//		System.out.println(Arrays.toString(absolutes));
		
	}

}
