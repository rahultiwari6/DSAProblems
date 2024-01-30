

public class checkSorted {

    public static void main(String args[]) {
        int arr[] = {3, 4, 5, 6, 7}, n = 5;

        System.out.println(isSorted(arr, n));
    }
    static boolean isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }


}
