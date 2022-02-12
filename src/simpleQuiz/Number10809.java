package simpleQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toLowerCase();

        for (char c='a'; c<='z'; c++) {
            System.out.print(str.indexOf(c) + " ");
        }

//        int[] arr = new int[26];
//
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = -1;
//        }
//
//        String str = br.readLine();
//        str = str.toLowerCase();
//
//        for (int i=0; i<str.length(); i++) {
//            char alp = str.charAt(i);
//            if(arr[alp - 'a'] == -1) {
//                arr[alp - 'a'] = i;
//            }
//        }
//
//        for (int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

    }
}
