package generic;

class ClassName<E> {
    private E element;  // 제네릭 타입 변수

    void set(E element) {   // 제네릭 파라미터 메소드
        this.element = element;
    }

    E get() {   // 제네릭 타입 변환 메소드
        return element;
    }

    // 아래 메소드의 E 타입은 제네릭 클래스의 E타입과 다른 독립적인 타입이다.
    static <E> E genericMethod1(E o) {  // 제네릭 메소드
        return o;
    }

    <T> T genericMethod(T o) {  // 제네릭 메소드
        return o;
    }
}

public class Main {
    public static void main(String[] args) {
        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        // 반환된 변수의 타입 출력
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println();
        System.out.println("b data : " + b.get());
        // 반환된 변수의 타입 출력
        System.out.println("b E Type : " + b.get().getClass().getName());
        System.out.println();

        // static 제네릭 메소드1 Integer
        System.out.println("<E> returnType : " + ClassName.genericMethod1(3).getClass().getName());

        // static 제네릭 메소드1 String
        System.out.println("<E> returnType : " + ClassName.genericMethod1("ABCD").getClass().getName());

        // 제네릭 메소드 Integer
        System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());

        // 제네릭 메소드 Double
        System.out.println("<T> returnType : " + a.genericMethod(3.0).getClass().getName());

        // 제네릭 메소드 ClassName b
        System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());
    }
}
