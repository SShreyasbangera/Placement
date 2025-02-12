import java.util.Random;
import java.util.PriorityQueue;

public class KthClosestTemperature {
    public static int findKthClosest(int[] readings, int target, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Math.abs(b - target) - Math.abs(a - target));
        
        for (int reading : readings) {
            maxHeap.offer(reading);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] readings = {72, 75, 68, 80, 74};
        int target = 73;
        int k = 2;
        System.out.println(findKthClosest(readings, target, k)); // Output: 74
    }
}
