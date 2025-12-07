class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<String>() {
         
            public int compare(String a, String b) {
                String ab = a + b; 
                String ba = b + a;

                return ba.compareTo(ab);
            }
        });

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}
