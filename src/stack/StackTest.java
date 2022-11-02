package stack;

import java.util.Comparator;

public class StackTest {
    public static void main(String[] args) {
        Stack<Student> stack = new Stack<>();

        stack.push(new Student("이중섭", 95));
        stack.push(new Student("박영철", 74));
        stack.push(new Student("최신숙", 99));
        stack.push(new Student("최동하", 66));

        stack.sort(customComp); // Comparator를 넘겨준다.

        for (Object a : stack.toArray()) {
            System.out.println(a);
        }
    }

    // 사용자 설정 comparator(비교기)
    static Comparator<Student> customComp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.score - o1.score;
        }
    };
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return "이름 : " + name + "\t성적 : " + score;
    }
}
