package simpleQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++) {

            String[] str = br.readLine().split(" ");

            int repeat = Integer.parseInt(str[0]);
            String word = str[1];

            for(int j=0; j<word.length(); j++) {
                for(int k=0; k<repeat; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }

}
