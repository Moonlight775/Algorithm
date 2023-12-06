package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5717 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());	// 남자 친구의 수
			int F = Integer.parseInt(st.nextToken());	// 여자 친구의 수
			
			if (M == 0 && F == 0) break;
			
			sb.append(M + F).append('\n');	// 남자, 여자 친구의 합
		}
		
		System.out.println(sb);
	}
}