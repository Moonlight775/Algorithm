package simpleQuiz;

public class RandomLotto {
    public static void main(String[] args) {
        int[] ball = new int[6];
        System.out.print("로또 번호는 ");
        for (int i=0; i<ball.length; i++) {
            ball[i] = (int)(Math.random()*45)+1;

            System.out.print(ball[i]);
            if (i != ball.length-1) {
                System.out.print(",");
            }
        }
    }
}
