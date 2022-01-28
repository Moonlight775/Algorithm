package simpleQuiz;

import java.util.Arrays;
import java.util.HashSet;

public class FindSumNumber {
	
	public static int solution (int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return 45 - sum;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {5,8,4,0,6,7,9};
		
		System.out.println(solution(arr));
	}

}
