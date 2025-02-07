class prgm1 {
    public static void main(String[] args) {
        double min = Double.MAX_VALUE;
        double secondMin = Double.MAX_VALUE;
        double[] a = {12.5, 9.5, 1, 19.5, 56.8};

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Second smallest number: " + secondMin);
    }
}


