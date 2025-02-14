import java.util.*;

public class StockMarketMinPrice {
    public static List<Integer> minStockPrices(int[] prices, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>(); // Monotonic deque to store indices

        for (int i = 0; i < prices.length; i++) {
            // Remove elements from front if they are out of window range
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements from back that are greater than current price
            while (!deque.isEmpty() && prices[deque.peekLast()] > prices[i]) {
                deque.pollLast();
            }

            // Add the current index to deque
            deque.offerLast(i);

            // Record the minimum when the first k elements are processed
            if (i >= k - 1) {
                result.add(prices[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices = {120, 110, 115, 100, 105, 98, 102};
        int k = 3;
        System.out.println(minStockPrices(prices, k)); // Output: [110, 100, 100, 98, 98]
    }
}
