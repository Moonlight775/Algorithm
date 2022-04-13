package baekjoon;

import java.util.Scanner;

public class Number2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 가로 금
        int M = sc.nextInt();   // 세로 금

        System.out.println(N * M -1);

        // NxM이라면 우선 (N-1)만큼 행을 쪼개준다. (가로 금은 N-1개 있다.)
        // 그 후 N개로 나뉘어진 초콜릿을 M개로 나누기 위해서, 열을 Nx(M-1) 만큼 쪼개준다.
        // (M-1)만 쪼갠다면 N개로 나뉘어진 초콜릿 중 1덩어리만 쪼개는 것. 즉, N을 곱해주어야한다.
        // 최종적으로는 N-1 + Nx(M-1) = NxM-1 이라는 수식이 나온다.
    }
}