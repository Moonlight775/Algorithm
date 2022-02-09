package simpleQuiz;

public class CountEight {
    public static void main(String[] args) {
        int start = 1;
        int finish = 10000;
        int count = 0;

        for (int i=start; i<=finish; i++ ) {
            int tmp = i;

            while(tmp > 0) {
                if(tmp%10 == 8) {   // tmp를 10으로 나눈 나머지가 8인지 확인
                    count++;
                }
//                System.out.println(tmp /= 10);
                tmp /= 10;  // tmp를 10으로 나눈다

            }
        }
        System.out.println(start + "~" + finish + "중에 8의 수는 " + count);
    }
}
