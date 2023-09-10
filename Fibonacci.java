public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int current = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = prev + current;
            prev = current;
            current = result;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 10; // Change this to the desired Fibonacci number you want to calculate
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}
