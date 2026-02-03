class Solution {
public boolean isTrionic(int[] nums) {
int n = nums.length;
// Pointer p start karte hain
int p = 0;

// Step 1: Upar Chadho (Find Peak)
// Hum check kar rahe hain 'nums[p] < nums[p+1]'
// 'n - 2' isliye taki hum p+1 access kar sakein aur baad mein q ke liye jagah bache
while (p < n - 2 && nums[p] < nums[p + 1]) {
p++;
}

// Check: Kya hum thoda sa bhi upar gaye? 
if (p == 0) return false; 

// Step 2: Neeche Utro (Find Valley)
int q = p;
while (q < n - 1 && nums[q] > nums[q + 1]) {
q++;
}

// Check: Kya hum neeche utre? (q != p)
// Check: Kya hum end tak pahunch gaye? (q == n-1). Agar end pahunch gaye toh 3rd part ke liye jagah nahi bachi.
if (q == p || q == n - 1) return false;

// Step 3: Wapas Upar Chadho (Final Climb)
while (q < n - 1 && nums[q] < nums[q + 1]) {
q++;
}

// Final Check: Kya hum poora array traverse kar paye?
return q == n - 1;
}
}
