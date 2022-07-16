package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number17363 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];
        char[][] result = new char[M][N];

        for (int i=0; i<arr.length; i++) {
            String str = br.readLine();
            for (int j=0; j<arr[0].length; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result[0].length; j++) {
                result[i][j] = arr[j][result.length-1-i];

                switch (result[i][j]) {
                    case '-' :
                        result[i][j] = '|';
                        break;
                    case '|' :
                        result[i][j] = '-';
                        break;
                    case '/' :
                        result[i][j] = '\\';
                        break;
                    case '\\' :
                        result[i][j] = '/';
                        break;
                    case '^' :
                        result[i][j] = '<';
                        break;
                    case '<' :
                        result[i][j] = 'v';
                        break;
                    case 'v' :
                        result[i][j] = '>';
                        break;
                    case '>' :
                        result[i][j] = '^';
                        break;
                }
            }
        }

        for (char[] i : result) {
            for (char j: i) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
