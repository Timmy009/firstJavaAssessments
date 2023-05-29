public class ModeIndexFinder {
    public static void main(String[] args) {
        int [] arr = {3, 8, 4, 4, 3, 2, 7, 6, 8, 9};
        System.out.println(findModeIndex(arr));
    }
    public static int findModeIndex(int[] arr) {
        int n = arr.length;
        int maxCount = 0;
        int mode = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        if (mode == -1) {
            return -1; // Mode not found (shouldn't happen in a valid array)
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == mode) {
                return i;
            }
        }

        return -1; // Mode not found (shouldn't happen in a valid array)
    }
}
