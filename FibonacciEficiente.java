import javax.swing.JOptionPane;

public class FibonacciEficiente {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int result = fib(99);
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        JOptionPane.showMessageDialog(null, "Fibonacci: " + result + "\nTempo de execução: " + duration + "ms");
    }

    public static int fib(int n) {
        if (n <= 2) return 1;
        int[] memo = new int[n];
        memo[0] = memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }
}