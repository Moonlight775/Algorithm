package chap02;

public class Bubble {
        public static void main(String[] args) {
            boolean numbersSwitched = true;
            int[] numbers = {9,2,3,5,1,6,8};

            while(numbersSwitched){
                numbersSwitched = false;
                for(int i=0; i<numbers.length-1; i++){
                    if(numbers[i+1]<numbers[i]){
                        int temp = numbers[i+1];
                        numbers[i+1] = numbers[i];
                        numbers[i] = temp;
                        numbersSwitched=true;
                    }
                }
            }

            for(Integer num : numbers)
                System.out.print(num + " ");
        }
}
