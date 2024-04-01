package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Number8979 {

    static class Nation implements Comparable<Nation> {
        private final int name;
        private final int gold;
        private final int silver;
        private final int bronze;
        private int rank;

        public Nation(int name, int gold, int silver, int bronze) {     // 생성자
            super();

            this.name = name;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rank = 1;  // 첫 순위
        }

        // 같은 메달 수라면 금, 은, 동 순으로 비교
        @Override
        public int compareTo(Nation o) {
            if (this.gold == o.gold) {
                if (this.silver == o.silver) {
                    return o.bronze - this.bronze;
                }
                else {
                    return o.silver - this.silver;
                }
            }
            else {
                return o.gold - this.gold;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 국가의 수
        int k = Integer.parseInt(st.nextToken());   // 등수를 알고 싶은 국가

        List<Nation> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            int name = Integer.parseInt(st.nextToken());    // 국가를 나타내는 정수
            int gold = Integer.parseInt(st.nextToken());    // 금메달의 수
            int silver = Integer.parseInt(st.nextToken());  // 은메달의 수
            int bronze = Integer.parseInt(st.nextToken());  // 동메달의 수

            Nation nation = new Nation(name, gold, silver, bronze);
            list.add(nation);
        }

        Collections.sort(list);

        for (int i = 1; i < n; i++) {
            // 국가 두 개씩 비교해서 rank 정함
            Nation originN = list.get(i-1);
            Nation nextN = list.get(i);

            if (originN.gold == nextN.gold &&
                originN.silver == nextN.silver &&
                originN.bronze == nextN.bronze) {

                nextN.rank = originN.rank;
            }
            else {
                nextN.rank = i + 1;
            }
        }

        list.stream().filter(t -> t.name == k).map(t -> t.rank).forEach(System.out::println);
    }
}