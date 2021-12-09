package chap01;

public class Sequence12 {

	public static void main(String[] args) {
		int a = 1;	// 1st
		int b = 2;	// 2st
		int c = 0;	// 3st = 1st + 2st
		int sum = 0; // 수열의 합저장
		
		c = a + b;
		sum = b;
		a = b;
		b = c;
		
		while(c<400000) {
			c = a + b;
			
			if(c%2 == 0) {
				sum += c; // 짝수만
			}
			a = b;
			b = c;
		}
		System.out.println("sum = " + sum);
	}

}
