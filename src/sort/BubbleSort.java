package sort;

public class BubbleSort {

    public static void bubble_sort(int[] a) {
        bubble_sort(a, a.length);
    }

    private static void bubble_sort(int[] a, int size) {
        // round는 배열 크기 - 1 만큼 진행됨
        for (int i = 1; i < size; i++) {

            boolean swapped = false;

            // 각 라운드 별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
            for (int j = 0; j < size - i; j++) {

                // 현재 원소가 다음 원소보다 클 경우 서로 원소의 위치를 교환
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }

            // 만약 swap된적이 없다면 이미 정렬되었다는 의미이므로 반복문을 종료
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}