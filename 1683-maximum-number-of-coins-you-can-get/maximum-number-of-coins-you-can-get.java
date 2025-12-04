class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int right = piles.length - 1;
        int left = 0;
        int sum = 0;

        int rounds = piles.length / 3;  // you pick this many times

        while (rounds > 0) {

            // Alice picks largest
            right--;

            // You pick second-largest
            sum += piles[right];
            right--;

            // Bob picks smallest
            left++;

            rounds--;
        }

        return sum;
    }
}
