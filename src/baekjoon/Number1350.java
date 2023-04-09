package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 파일의 개수
        long count = 0; // 클러스터 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        long cluster = Integer.parseInt(br.readLine()); // 클러스터의 크기

        for (int i = 0; i < N; i++) {
            long file = Integer.parseInt(st.nextToken());

            if (file == 0) continue;    // 파일 크기가 0이라면 저장이 필요 없으므로 스킵

            count += file / cluster;
            // 정확히 나누어 떨어지지 않는다면 나머지를 메꾸기위해 클러스터가 1개 더 필요하므로 추가로 +1
            if (file % cluster != 0) {
                count++;
            }
        }

        System.out.println(cluster * count);
    }
}