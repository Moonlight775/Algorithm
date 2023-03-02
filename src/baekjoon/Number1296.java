package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();    // 연두의 이름
        int N = Integer.parseInt(br.readLine());    // 후보의 개수

        String[] teamName = new String[N];  // 팀 이름 배열

        // 팀 이름 배열 초기화
        for (int i = 0; i < N; i++) {
            teamName[i] = br.readLine();
        }

        Arrays.sort(teamName);  // 가장 높은 확률이 동일할 경우 사전순으로 앞선 경우를 출력하기 위해 정렬

        int max = 0;    // 가장 높은 확률
        int index = 0;  // 가장 높은 확률에 해당하는 인덱스

        // 수식에 따른 우승 확률 구하기
        for (int i = 0; i < N; i++) {
            int[] number = new int[4];

            calculate(name, number);
            calculate(teamName[i], number);

            int L = number[0];
            int O = number[1];
            int V = number[2];
            int E = number[3];

            int rate = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;   // 확률 수식

            if (rate > max) {   // 가장 높은 확률과 해당하는 인덱스를 구하기 위한 조건
                max = rate;
                index = i;
            }
        }

        System.out.println(teamName[index]);
    }

    // 4가지 변수의 값 계산
    public static void calculate(String name, int[] number) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'L') {
                number[0]++;
            } else if (name.charAt(i) == 'O') {
                number[1]++;
            } else if (name.charAt(i) == 'V') {
                number[2]++;
            } else if (name.charAt(i) == 'E') {
                number[3]++;
            }
        }
    }

}
