package simpleQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DivideOne {
	public static int solution(int n) {
		int x = 0;
		for (int i=1; i<n; i++) {
			if (n%i == 1) {
				x = i;
				break;
			}
		}
		return x;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "범위에 맞지 않은 수 입니다. 다시 입력해주세요.";
		int n = Integer.parseInt(br.readLine());
		if (n >= 3 && n <= 1000000) {
			bw.write("가장 작은 x는 " + String.valueOf(solution(n)));
			bw.newLine();
			bw.write(String.valueOf(n));
			bw.flush();
			bw.close();
		} else {
//			bw.write(str);
			System.out.println(str);
		}
	}
}
