package ext;

public class QSort {
    public static int[] qsort(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j)
        {
            while (i < j && arr[i] < pivot)
                i++;
            while (i < j && arr[j] > pivot)
                j--;

            if (i < j && arr[i] == arr[j])
                i++;
            else
            {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        if (start < i - 1)
            qsort(arr, start, i - 1);
        if (j + 1 < end)
            qsort(arr, j + 1, end);
        return arr;
    }
}
