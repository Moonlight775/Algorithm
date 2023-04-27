package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Number1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        PriorityQueue<Word> que = new PriorityQueue<>();    // 우선순위 큐

        for (int i = M; i <= N; i++) {
            String str = "";    // 숫자를 영어로 변경하고 담을 변수

            if (i < 10) {       // 한 자리 숫자라면
                str = word[i];  // 숫자에 맞는 영어
            } else {    // 두 자리 숫자라면
                str += word[i / 10];    // 십의 자리에 맞는 영어
                str += " ";             // 공백
                str += word[i % 10];    // 일의 자리에 맞는 영어
            }

            que.add(new Word(str, i));  // 큐에 영어, 원본 숫자 인스턴스 추가
        }

        int count = 0;  // 10개씩 출력하기 위한 카운트
        while (!que.isEmpty()) {    // 큐가 비지 않았다면 반복
            Word w = que.poll();    // 큐 맨 앞에 있는 값 반환
            count++;
            sb.append(w.num).append(" ");
            if (count % 10 == 0) {  // 10개 출력 후 줄 바꿈
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }

    static class Word implements Comparable<Word> {
        int num;    // 정수
        String str; // 영어

        // 생성자
        Word(String str, int num) {
            this.num = num;
            this.str = str;
        }

        // 영어로 사전순 정렬
        @Override
        public int compareTo(Word o) {
            return str.compareTo(o.str);
        }
    }
}
