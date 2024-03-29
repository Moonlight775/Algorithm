package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2804 {

    static int row = 0;
    static int col = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] str1 = st.nextToken().toCharArray();
        char[] str2 = st.nextToken().toCharArray();
        char[][] arr = new char[str2.length][str1.length];

        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str1.length; j++) {
                arr[i][j] = '.';
            }
        }

        findCross(str1, str2);

        for (int i = 0; i < str1.length; i++) {
            arr[row][i] = str1[i];
        }

        for (int i = 0; i < str2.length; i++) {
            arr[i][col] = str2[i];
        }

        for (char[] a : arr) {
            for (char b : a) {
                System.out.print(b);
            }
            System.out.println();
        }

    }

    public static void findCross(char[] str1, char[] str2) {
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    row = j;
                    col = i;
                    return;
                }
            }
        }
    }
}