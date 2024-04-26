package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Number10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        long[] arr = new long[N.length()];
        long sum = 0;   // 각 자리 수의 모든 합

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
            sum += arr[i];
        }

        Arrays.sort(arr);   // 오름차순 정렬

        // 각 자리 수의 합이 3의 배수여야 하고, 자리 수에 0이 있어야 한다.
        StringBuilder sb = new StringBuilder();
        if (sum % 3 == 0 && arr[0] == 0) {
            // 가장 큰 수를 만들어야 하므로 역으로 출력
            for (int i = N.length() - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }
        }
        else {
            sb.append(-1);
        }

        System.out.println(sb);
    }
}