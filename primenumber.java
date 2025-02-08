class primenumber {
    // Function to check if a number is prime
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
   
    // Function to reverse the digits of a number
    int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // Function to check if a number is a twisted prime
    int isTwistedPrime(int N) {
        if (isPrime(N)) {
            int reversedN = reverseNumber(N);
            if (isPrime(reversedN)) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 13;
        int result = solution.isTwistedPrime(N);
        System.out.println("Is " + N + " a twisted prime? " + (result == 1 ? "Yes" : "No"));
    }
}