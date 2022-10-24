package generic;

class ClassName1<K, V> {
    private K first;    // K 타입(제네릭)
    private V second;   // V 타입(제네릭)

    void set(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }
}

public class TwoGeneric {
    public static void main(String[] args) {

        ClassName1<String, Integer> a = new ClassName1<String, Integer>();

        a.set("10", 10);

        System.out.println("first data : " + a.getFirst());
        // 변환된 변수의 타입 출력
        System.out.println("K Type : " + a.getFirst().getClass().getName());
        System.out.println();

        System.out.println("second data : " + a.getSecond());
        // 변환된 변수의 타입 출력
        System.out.println("V Type : " + a.getSecond().getClass().getName());
    }
}
