package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Number10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Person[] p = new Person[N];     // Person 객체를 담을 배열

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int age = Integer.parseInt(st.nextToken());     // 나이
            String name = st.nextToken();   // 이름

            p[i] = new Person();    // 객체 생성
            p[i].setAge(age);       // 나이 초기화
            p[i].setName(name);     // 이름 초기화
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;     // 나이순으로 정렬
            }
        });

        for (Person i : p) {
            sb.append(i);
        }

        System.out.println(sb);

    }

    static class Person {
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {  // 출력될 문자열을 지정
            return age + " " + name + "\n";
        }
    }
}
