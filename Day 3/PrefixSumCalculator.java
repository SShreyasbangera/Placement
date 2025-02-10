public class PrefixSumCalculator {
    
    // Function to compute prefix sum of sales array
    public static int[] computePrefixSum(int[] sales) {
        int n = sales.length;
        int[] prefixSum = new int[n];
        
        if (n == 0) return prefixSum;
        
        prefixSum[0] = sales[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + sales[i];
        }
        
        return prefixSum;
    }
    
    public static void main(String[] args) {
        int[] sales = {10, 20, 15, 30, 25};
        int[] prefixSum = computePrefixSum(sales);
        
        System.out.print("PrefixSum[] = [");
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + (i < prefixSum.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}