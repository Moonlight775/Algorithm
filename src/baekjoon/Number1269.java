package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Number1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A_num = Integer.parseInt(st.nextToken());   // 집합 A 원소의 개수
        int B_num = Integer.parseInt(st.nextToken());   // 집합 B 원소의 개수

        HashSet<Integer> A_Set = new HashSet<>();
        HashSet<Integer> B_Set = new HashSet<>();

        // 입력된 숫자를 원소로 하는 집합 A 초기화
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<A_num; i++) {
            A_Set.add(Integer.parseInt(st.nextToken()));
        }

        // 입력된 숫자를 원소로 하는 집합 B 초기화
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<B_num; i++) {
            B_Set.add(Integer.parseInt(st.nextToken()));
        }

        int A_count = 0;    // A-B 원소의 개수
        int B_count = 0;    // B-A 원소의 개수

        Iterator<Integer> A_iter = A_Set.iterator();    // 집합 A Set을 Iterator에 담기
        while (A_iter.hasNext()) {
            if (!B_Set.contains(A_iter.next())) {       // A-B, A 원소를 기준으로 책정 되므로 A iterator에 담긴 것을 비교
                A_count++;  // 겹치는 것이 없을 경우 개수 플러스
            }
        }

        Iterator<Integer> B_iter = B_Set.iterator();    // 집합 B Set을 Iterator에 담기
        while (B_iter.hasNext()) {
            if (!A_Set.contains(B_iter.next())) {       // B-A, B 원소를 기준으로 책정 되므로 B iterator에 담긴 것을 비교
                B_count++;
            }
        }

        System.out.println(A_count + B_count);
    }
}
