public class DecimalToBinary {
    // binimal to binary
    public static int decToBin(int n) {
        int bin = 0, pow = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (int) (rem * Math.pow(10, pow));
            pow++;
            n = n / 2;
            
        }
        return bin;
    }

    public static void main(String[] args) {
        int result = decToBin(7);
        System.out.println(result);
    }
}
