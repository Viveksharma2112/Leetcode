import java.util.*;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;

        // 1) Total sum nikal lo
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int rem = (int)(total % p);

        // 2) Already divisible by p?
        if (rem == 0) {
            return 0;
        }

        // 3) Map: remainder -> last index jahan yeh remainder aaya
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // important: empty prefix ka remainder 0 at index -1

        long prefix = 0;
        int minLen = nums.length;

        // 4) Iterate and use prefix remainder
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int curr = (int)(prefix % p);

            // target = (curr - rem + p) % p  BUT bina shortcut ke
            int target = curr - rem;
            target = target % p;
            if (target < 0) {
                target += p;
            }

            // Agar pehle koi index hai jahan remainder == target tha
            if (map.containsKey(target)) {
                int prevIndex = map.get(target);
                int len = i - prevIndex;

                if (len < minLen) {
                    minLen = len;
                }
            }

            // Ab current remainder ka latest index store karo
            map.put(curr, i);
        }

        // Agar minLen kabhi update nahi hua toh answer -1
        if (minLen == nums.length) {
            return -1;
        } else {
            return minLen;
        }
    }
}
