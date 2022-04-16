package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, N, M);
        System.out.println(result);

    }

    static int search(int[] arr, int N, int M) {
        int result = 0;     // 3장의 카드 합

        for (int i=0; i<N-2; i++) {     // 3장을 고르므로 N-2까지만

            for (int j=i+1; j<N-1; j++) {   // 두 번째 카드는 첫 번째 카드 다음부터 N-1까지

                for (int k=j+1; k<N; k++) {     // 세 번째 카드는 두 번째 카드 다음부터 N까지
                    int tmp = arr[i] + arr[j] + arr[k];

                    if (M == tmp) {     // M과 같은 값이므로 더 이상의 로직은 무의미
                        return tmp;
                    }

                    if (result < tmp && tmp < M) {  // 그 전의 값 보다 크고 M보다 작다면 M과 근사치
                        result = tmp;
                    }
                }
            }
        }
        return result;
    }
}
