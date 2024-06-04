import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[]arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] L = Arrays.copyOfRange(arr, 0, mid);
            int[] R = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(L);
            mergeSort(R);

            int i = 0, j = 0, k = 0;

            while (i < L.length && j < R.length) {
                if (L[i] < R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < L.length) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < R.length) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nilai = {5, 2, 9, 1, 5, 6};

        mergeSort(nilai);
        System.out.println("Hasil pengurutan dengan Merge-Sort: " + Arrays.toString(nilai));
    }
}