package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String octal = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i< octal.length(); i++) {     // 8진수는 범위가 0~7이므로 toBinaryString() 사용
            String binary = Integer.toBinaryString(octal.charAt(i)-'0');    // 10진수 -> 2진수 변환

            if (binary.length() == 2 && i != 0) {       // i=0은 맨 첫 자리 수인데 첫 자리 수는 1로 시작하여야 하므로 제외시켜 준다.
                binary = "0" + binary;                  // 8진수 -> 2진수 변환하면 3자리가 생성되어야 하므로 변환 후 2자리의 수라면 앞에 0을 추가
            }
            else if (binary.length() == 1 && i != 0) {  // 같은 이유로 변환 후 1자리인 경우 앞에 00을 추가
                binary = "00" + binary;
            }

            sb.append(binary);
        }

        System.out.println(sb);
    }
}
