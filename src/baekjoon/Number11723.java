package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Number11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());    // 수행해야 하는 연산의 수

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String calculation = st.nextToken();  // 연산
            int x;   // 연산을 행할 수

            switch (calculation) {
                case "add" :
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;

                case "remove" :
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;

                case "check" :
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "toggle" :
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        set.remove(x);
                    }
                    else {
                        set.add(x);
                    }
                    break;

                case "all" :
                    for (int j=1; j<21; j++) {
                        set.add(j);
                    }
                    break;

                case "empty" :
                    set.clear();
                    break;
            }

        }

        System.out.println(sb);
        br.close();
    }

}
