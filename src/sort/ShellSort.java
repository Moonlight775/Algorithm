package sort;

public class ShellSort {

    private final static int[] gap =
        { 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
        8858, 19930, 44842, 100894, 227011, 510774,
        1149241, 2585792, 5818032, 13090572, 29453787,
        66271020, 149109795, 335497038, 754868335, 1698453753};	// 갭을 담고있는 배열

    public static void shell_sort(int[] a) {
        shell_sort(a, a.length);
    }

    // 맨 처음 gap을 참조할 인덱스를 구하는 메소드
    private static int getGap(int length) {
        int index = 0;
        // 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
        int len = (int) (length / 2.25);

        while (gap[index] < len) {
            index++;
        }
        return index;
    }

    private static void shell_sort(int[] a, int size) {
        int gapIndex = getGap(size);

        // 갭이 1이 될 때까지 반복
        while (gapIndex >= 0) {
            int step = gap[gapIndex--];     // 현재 gap(step)

            /*
             * --- 삽입 정렬 과정 ---
             *
             * 각 부분리스트의 두 번째 원소의 인덱스부터 순회한다.
             * 예를 들어 step이 3일 때 arr[0], arr[1], arr[2] 는 이전 원소와 비교할 것이 없다.
             * 그러므로 step부터 순회한다.
             */
            for (int i = step; i < size; i++) {
                /*
                 * j는 target 원소가 되며 현재 원소(target) a[j]가 이전 원소 a[j - step] 보다
                 * 작을 때 까지 반복한다.
                 */
                for (int j = i; j >= step && a[j] < a[j - step]; j -= step) {
                    /*
                     * 현재(target) 원소의 인덱스(j)와 이전의 원소(j-step)의 인덱스에 있는
                     * 원소의 값을 교환한다.
                     */
                    swap(a, j, j - step);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

//    /**
//     * @param a     배열
//     * @param start 부분 배열의 첫 번째 원소 인덱스
//     * @param size  배열의 전체 크기
//     * @param gap   현재 gap
//     */
//    private static void insertion_sort(int[] a, int start, int size, int gap) {
//        // 부분 배열의 두 번째 원소부터 size까지 반복한다. (gap 값씩 건너뜀)
//        for (int i = start + gap; i < size; i += gap) {
//            int target = a[i];
//            int j = i - gap;
//
//            // 타겟 원소가 이전의 원소보다 작을 때 까지 반복
//            while (j >= start && target < a[j]) {
//                a[j + gap] = a[j];  // 이전 원소를 한 칸씩 뒤로 미룬다.
//                j -= gap;
//            }
//            /*
//             * 위 반복문에서 탈출하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
//             * 타겟 원소는 j번째 원소 뒤에 와야한다.
//             * 그러므로 타겟은 j + gap 에 위치하게 된다.
//             */
//            a[j + gap] = target;
//        }
//    }
}