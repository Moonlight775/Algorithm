package baekjoon;

public class Number4673 {

    static int[] arr = new int[10001];

    public static void main(String[] args) {

        for (int i=1; i<arr.length; i++) {
            if (sequence(i) <= 10000) {
                arr[sequence(i)]++;     // ex. i = 33이라 한다면 sum=39가 되어 index39 값이 +1된다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == 0) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int sequence(int number) {
        int sum = number;

        while (number != 0) {
            sum += number % 10;     // 각 자릿수 합
            number = number / 10;   // 일의 자리부터 끝까지 자릿수를 구하기 위해
        }

        return sum;
    }
}
