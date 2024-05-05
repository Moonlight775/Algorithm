package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Number9625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        Num num = new Num(0, 1);

        ArrayList list = new ArrayList();

        list.add(num);

        for (int i = 1; i < K; i++) {
            Num n1 = (Num) list.get(i - 1);
            int a = n1.getA();
            int b = n1.getB();

            num = new Num(b, a + b);
            list.add(num);
        }

        Num result = (Num) list.get(K - 1);

        System.out.print(result.getA() + " " + result.getB());
    }
}

class Num {
    private int A;
    private int B;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    Num() {

    }

    Num(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public String toString() {
        return A + " " + B;
    }
}