class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int maxPos = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[maxPos]) {
                    maxPos = j;
                }
            }

            if (arr[maxPos] > arr[i]) {
                char temp = arr[i];
                arr[i] = arr[maxPos];
                arr[maxPos] = temp;
                return Integer.parseInt(new String(arr));
            }
        }

        return num; 
    }
}
