public class BinarySearch {

   
    public static int iterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

   
    public static int recursive(int[] arr, int target) {
        return recursive(arr, target, 0, arr.length - 1);
    }

   
    private static int recursive(int[] arr, int target, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return recursive(arr, target, low, mid - 1);
        } else {
            return recursive(arr, target, mid + 1, high);
        }
    }
}
