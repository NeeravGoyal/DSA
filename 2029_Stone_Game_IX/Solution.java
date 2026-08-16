class Solution {
    public boolean stoneGameIX(int[] stones) {

        int[] cnt = new int[3];

        // Count numbers based on their remainder when divided by 3
        for (int x : stones) {
            cnt[x % 3]++;
        }

        int c0 = cnt[0];
        int c1 = cnt[1];
        int c2 = cnt[2];

        // If number of multiples of 3 is even
        if (c0 % 2 == 0) {
            return c1 > 0 && c2 > 0;
        }

        // If number of multiples of 3 is odd
        return Math.abs(c1 - c2) > 2;
    }
}
