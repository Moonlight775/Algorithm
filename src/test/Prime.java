package test;

import java.util.ArrayList;

public class Prime {
    public static ArrayList<Integer> list;
    public static ArrayList<Integer> list2;
    public static ArrayList<Integer> list3;

    public static void main(String[] args) {
        int N = 10000;

        for (int i=0; i<5; i++) {
            System.out.println("Prime Number less than or equal to " + N);

            list = new ArrayList<>();   // list 초기화
            make_prime1(N);
            list.clear();               // list 비우기

            list2 = new ArrayList<>();  // list 초기화
            make_prime2(N);
            list2.clear();              // list 비우기

            list3 = new ArrayList<>();  // list 초기화
            make_prime3(N);
            list3.clear();              // list 비우기

            System.out.println();
            if (i%2 == 0) {
                N *= 5;
            }
            else {
                N *= 2;
            }
        }
    }

    // 방법 1 : N 이하의 모든 소수
    public static long make_prime1(int number) {
        final long start = System.nanoTime();
        boolean TrueFalse;  // true: 소수, false : 소수 아님

        for (int i=3; i<=number; i++) {     // 2는 소수이므로 3부터 시작
            // 0과 1은 소수가 아니므로 스킵
            TrueFalse = true;
            for (int j=2; j<number; j++) {
                if (i%j == 0) {     // 소수가 아닐 경우 종료
                    TrueFalse = false;
                    break;
                }
            }

            if (TrueFalse) {    // 위 반복문에서 약수를 갖고 있지 않은 경우 소수다.
                list.add(i);
            }
        }
        final long end = System.nanoTime();
        System.out.println("run1 : " + (end - start) * 1e-9 + " sec"); // 1e-9 = 1*10^9, 1n (nano)
        return end - start;
    }

    public static long make_prime2(int number) {
        final long start = System.nanoTime();
        boolean TrueFalse;  // true : 소수, false : 소수 아님

        for (int i=3; i<=number; i++) {     // 2는 소수이므로 3부터 시작
            // 0과 1은 소수가 아니므로 스킵
            TrueFalse = true;
            for (int j=2; j<=Math.sqrt(number); j++) {
                if (i%j == 0) {     // 소수가 아닐경우 종료료
                    TrueFalse = false;
                    break;
               }
            }

            if (TrueFalse) {    // 위 반복문에서 약수를 갖고 있지 않은 경우 소수다.
                list2.add(i);
            }
        }
        final long end = System.nanoTime();
        System.out.println("run2 : " + (end-start) * 1e-9 + " sec");
        return end - start;
    }

    public static long make_prime3(int number) {
        final long start = System.nanoTime();
        boolean[] check = new boolean[number+1];    // true: 소수 아님, false : 소수
        check[0] = check[1] = true;

        for (int i=2; i<=Math.sqrt(number); i++) {  // 0과 1은 소수가 아니므로 스킵
            if (check[i]) {
                continue;   // 소수가 아닐 경우 스킵
            }

            for (int j=i*i; j<number; j=j+i) {
                check[j] = true;
            }
        }

        for (int i=0; i< check.length; i++) {
            if (!check[i]) {    // 소수(false)인 경우 list3에 추가
                list3.add(i);
            }
        }
        final long end = System.nanoTime();
        System.out.println("run3 : " + (end-start) * 1e-9 + " sec");
        return end - start;
    }
}
