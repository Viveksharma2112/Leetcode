import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. Agar array khali hai ya 1 hi element hai, wahi return kardo
        if (intervals.length <= 1) return intervals;

        // 2. Sorting: Start time (a[0]) ke hisaab se sort karein
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        
        // Pehle interval ko current maan lo
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1]; // Current ka khatam hone ka time
            int nextStart = interval[0]; // Agle ka shuru hone ka time
            int nextEnd = interval[1];   // Agle ka khatam hone ka time

            if (nextStart <= currentEnd) { 
                // OVERLAP HAI: Merge karo
                // End time badhakar dono mein se jo max hai wo kar do
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // OVERLAP NAHI HAI: Naya interval shuru karo
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        // List ko wapas 2D array mein convert karke return karo
        return result.toArray(new int[result.size()][]);
    }
}