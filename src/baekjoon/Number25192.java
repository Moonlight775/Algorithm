package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Number25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 채팅방 기록 수
        int count = 0;  // 곰곰티콘 사용 횟수

        HashSet<String> set = new HashSet<>();

        while (N-- > 0) {
            String str = br.readLine();

            // ENTER의 경우 새로운 사람의 입장으로, 채팅창의 리셋으로 보면 된다.
            // set에 삽입된 데이터의 크기는 곰곰티콘의 사용 횟수와 같으므로 count에 추가 후 리셋
            if (str.equals("ENTER")) {
                count += set.size();
                set.clear();
            }
            // ENTER가 아니라면 유저의 닉네임이 주어지므로 set에 닉네임 추가
            // ENTER 이후에 같은 닉네임이 여러 개라도 1개만 카운트해야 하므로 Hashset 사용
            else {
                set.add(str);
            }
        }

        count += set.size();

        System.out.println(count);
    }
}