package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        ArrayList<Character> list = new ArrayList<>();

        for (int i=0; i<str.length(); i++) {
            list.add(str.charAt(i));
        }

        int index = list.size();

        int M = Integer.parseInt(br.readLine());

        for (int i=0; i<M; i++) {
            String st = br.readLine();
            char ch = st.charAt(0);

            switch (ch) {
                case 'L' :
                    if (index > 0) {
                        index--;
                    }
                    else {
                        index = 0;
                    }
                    break;

                case 'D' :
                    if (index >= list.size()) {
                        index = list.size();
                    }
                    else {
                        index++;
                    }
                    break;

                case 'B' :
                    if (index > 0) {
                        list.remove(index-1);
                        index--;
                    }
                    break;

                case 'P' :
                    char c = st.charAt(2);

                    list.add(index, c);
                    index++;
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character val : list) {
            sb.append(val);
        }

        System.out.println(sb);
    }
}
