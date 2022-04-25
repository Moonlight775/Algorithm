package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 단어의 개수

        String[] arr = new String[N];   // 단어를 담을 String 배열

        for(int i=0; i<N; i++) {
            arr[i] = br.readLine(); // 배열 초기화
        }

        Arrays.sort(arr, (e1, e2) -> {  // new Comparator<String>() {public int compare(String e1, String e2) {}}
            if (e1.length() == e2.length()) {       // 단어의 길이가 같으면
                return e1.compareTo(e2);            // 사전순으로 정렬
            } else {
                return e1.length() - e2.length();   // 길이가 짧은 것 부터
                // compare 메소드 리턴타입은 int형
                // e1 - e2가 양수라면 위치가 서로 바뀌게 된다. (ex. 2-1 = 1, e1이 크므로 순서를 바꾼다.)
                // 음수라면 위치가 바뀌지 않는다.
            }
        });

        System.out.println(arr[0]); // 정렬된 후의 첫 번째 인덱스 출력

        for (int i=1; i<N; i++) {   // 1부터 시작하는 이유는 i-1을 할 때 i가 0이라면 -1이 되어 ArrayIndexOutOfBounds 에러가 뜬다.
            if (!arr[i].equals(arr[i-1])) { // 같은 단어가 여러 번 입력된 경우 한번만 출력하기 위해
                System.out.println(arr[i]);
            }

        }
    }
}
