package list;

public class Test {
    public static void main(String[] args) {
        SLinkedList<Student> list = new SLinkedList<>();

        list.add(new Student("신치수", 92));
        list.add(new Student("김자겸", 70));
        list.add(new Student("이견", 98));
        list.add(new Student("허석", 66));

        list.sort();

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return "이름 : " + name + "\t성적 : " + score;
    }

    @Override
    public int compareTo(Student o) {
        return o.score - this.score;
    }
}
