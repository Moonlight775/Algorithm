package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Number5568 {

    private static int n;
    private static String[] card;
    private static final HashSet<String> set = new HashSet<>();
    private static boolean[] v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());    // 카드의 개수
        int k = Integer.parseInt(br.readLine());    // 선택한 카드의 개수
        card = new String[n];   // 카드의 값을 담을 배열
        v = new boolean[n];     // 카드를 뽑았는지 아닌지 판단할 배열

        for (int i = 0; i < n; i++) {
            card[i] = br.readLine();
        }

        selectCard(k, "");

        System.out.println(set.size());
    }

    private static void selectCard(int cnt, String cur) {
        if (cnt == 0) {     // 카드를 모두 뽑았다면
            set.add(cur);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!v[i]) {
                v[i] = true;
                selectCard(cnt-1, cur+card[i]);
                v[i] = false;
            }
        }
    }
}