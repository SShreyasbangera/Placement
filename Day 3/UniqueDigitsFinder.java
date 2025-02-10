public class UniqueDigitsFinder {
    
    // Function to find unique digits without using collections
    public static void findUniqueDigits(int[] numbers) {
        boolean[] digitPresent = new boolean[10]; // Array to track digits 0-9
        
        for (int num : numbers) {
            while (num > 0) {
                digitPresent[num % 10] = true; // Mark the digit as present
                num /= 10;
            }
        }
        
        System.out.print("[");
        boolean first = true;
        for (int i = 0; i < 10; i++) {
            if (digitPresent[i]) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 4444, 666};
        findUniqueDigits(numbers);
    }
}