package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Number1620 {

    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 포켓몬의 개수
        int M = Integer.parseInt(st.nextToken());   // 문제의 개수

        String[] name = new String[N+1];    // 문제로 숫자가 입력 되었을 때 key값을 찾기 위한 배열

        for (int i=1; i<=N; i++) {
            String str = br.readLine();
            map.put(str, i);  // 입력받은 문자열을 key로 하고, value는 1부터 1씩 증가하는 map
            name[i] = str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            String str = br.readLine();     // 문제로 받는 문자열
            if (isNumber(str)) {    // 숫자를 입력받았다면
                int num = Integer.parseInt(str);
                sb.append(name[num]).append('\n');
            }
            else {  // 문자를 입력받았다면
                sb.append(map.get(str)).append('\n');
            }
        }

        System.out.println(sb);
    }

    // 숫자인지 문자열인지 판단
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
