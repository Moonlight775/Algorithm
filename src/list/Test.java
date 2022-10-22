package list;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        SLinkedList<Student> list = new SLinkedList<>();

        list.add(new Student("신치수", 92));
        list.add(new Student("김자겸", 70));
        list.add(new Student("이견", 98));
        list.add(new Student("허석", 66));

        list.sort(customComp);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // Comparable을 구현하지 않으면 해당 객체의 정렬 방법을 몰라 에러 발생
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
