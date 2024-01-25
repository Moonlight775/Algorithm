package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 데이터 개수
        int K = Integer.parseInt(st.nextToken());   // K번째 수
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, N - 1, K - 1);
        System.out.println(arr[K - 1]);
    }

    public static void quickSort(int[] arr, int start, int end, int K) {
        if (start < end) {
            int pivot = findPivot(arr, start, end);

            if (pivot == K) return;     // K번째 수가 pivot이면 더 이상 구할 필요 없음
            else if (pivot > K) {       // K가 pivot보다 작으면 왼쪽 그룹만 정렬 수행
                quickSort(arr, start, pivot - 1, K);
            }
            else {
                quickSort(arr, pivot + 1, end, K);
            }
        }
    }

    public static int findPivot(int[] arr, int start, int end) {
        if (start + 1 == end) {
            if (arr[start] > arr[end]) {
                swap(arr, start, end);
            }
            return end;
        }

        int middle = (start + end) / 2;
        swap(arr, start, middle);       // 중앙값을 1번째로 요소로 이동
        int pivot = arr[start];
        int i = start + 1;
        int j = end;

        while (i <= j) {
            while (j >= start + 1 && pivot < arr[j]) {  // 피벗보다 작은 수가 나올 때까지 j--
                j--;
            }
            while (i <= end && pivot > arr[i]) {        // 피벗보다 큰 수가 나올 때까지 i++
                i++;
            }
            if (i <= j) {
                swap(arr, i++, j--);
            }
        }
        // 피벗 데이터를 나눠진 두 그룹의 경계 index에 저장
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
