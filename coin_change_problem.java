//coin change problem in java using greedy approach

import java.util.Arrays;

public class CoinChangeGreedy {
    public static int minCoins(int[] coins, int amount) {
        Arrays.sort(coins);  // Sort coins in ascending order
        int coinCount = 0;

        // Traverse from the largest coin to the smallest
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                coinCount++;
            }
        }

        // If the amount becomes 0, return the coin count; otherwise, it's not possible
        return amount == 0 ? coinCount : -1;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10};
        int amount = 27;

        int result = minCoins(coins, amount);
        if (result != -1) {
            System.out.println("Minimum coins required: " + result);
        } else {
            System.out.println("Change cannot be made with the given denominations.");
        }
    }
}
