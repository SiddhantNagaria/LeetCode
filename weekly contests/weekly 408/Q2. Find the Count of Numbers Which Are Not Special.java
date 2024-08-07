// Q2. Find the Count of Numbers Which Are Not Special
// Medium
// 5 pt.

// You are given 2 positive integers l and r. For any number x, all positive divisors of x 
// except x are called the proper divisors of x.
// A number is called special if it has exactly 2 proper divisors. For example:
// The number 4 is special because it has proper divisors 1 and 2.
// The number 6 is not special because it has proper divisors 1, 2, and 3.
// Return the count of numbers in the range [l, r] that are not special.
// Example 1:
// Input: l = 5, r = 7
// Output: 3
// Explanation:
// There are no special numbers in the range [5, 7].
// Example 2:
// Input: l = 4, r = 16
// Output: 11
// Explanation:
// The special numbers in the range [4, 16] are 4 and 9.
// Constraints:
// 1 <= l <= r <= 109


class Solution {

    public int nonSpecialCount(int l, int r) {
        int count = r - l + 1;

        // Iterate over the range [2, sqrt(r)]
        for (int i = 2; i * i <= r; i++) {
            // Check if i is a prime number
            if (isPrime(i)) {
                // If the square of i is in the range [l, r], decrement the count
                if (i * i >= l && i * i <= r) {
                    count--;
                }
            }
        }

        return count;
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
