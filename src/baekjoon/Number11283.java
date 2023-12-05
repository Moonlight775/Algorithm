package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11283 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c = br.readLine().charAt(0);	// 글자
		
		System.out.println((int)c - 44031);	// 조건에 맞추기 위해 유니코드 - 44031을 해준다.
	}
}