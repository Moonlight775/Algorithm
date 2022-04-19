package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9]; // 모든 난쟁이의 배열
        int sum = 0;    // 모든 난쟁이 키의 합

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());   // 입력된 값 배열에 초기화
            sum += arr[i];
        }

        for (int i=0; i<8; i++) {   // 두 개의 수를 뽑아 쓰므로 조건 범위는 9가 아닌 8로 한다.

            for (int j=i+1; j<9; j++) {     // 마찬가지로 조건 범위는 8이다.
                if (sum - arr[i] - arr[j] == 100) {     // 모든 난쟁이 키의 합에서 특정 2개의 수를 빼서 100이 된다면 그 2명을 제외한 7명이 일곱 난쟁이가 된다.
                    arr[i] = 0;     // 가짜 난쟁이를 0으로 초기화
                    arr[j] = 0;     // 가짜 난쟁이를 0으로 초기화
                    Arrays.sort(arr);   // 오름차순이 되도록 정렬

                    for (int k=0; k<9; k++) {   // 일곱 난쟁이를 출력하기 위한 for문
                        if (arr[k] != 0) {      // 가짜 난쟁이를 0으로 초기화 했으므로 0이 아닌 값을 출력
                            System.out.println(arr[k]);
                        }
                    }   // k for문 종료
                return;     // 일곱 난쟁이를 구했으므로 종료
                }   // if문 종료
            }   // j for문 종료

        }   // i for문 종료

    }
}
