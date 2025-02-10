public class PostfixSumCalculator{ 
    // Function to compute postfix sum of fuel consumption array
    public static int[] computePostfixSum(int[] fuel) {
        int m = fuel.length;
        int[] postfixSum = new int[m];
        
        if (m == 0) return postfixSum;
        
        postfixSum[m - 1] = fuel[m - 1];
        for (int i = m - 2; i >= 0; i--) {
            postfixSum[i] = postfixSum[i + 1] + fuel[i];
        }
        
        return postfixSum;
    }
    
    public static void main(String[] args) {
        int[] fuel = {5, 10, 3, 7, 8};
        int[] postfixSum = computePostfixSum(fuel);
        
        System.out.print("PostfixSum[] = [");
        for (int i = 0; i < postfixSum.length; i++) {
            System.out.print(postfixSum[i] + (i < postfixSum.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}