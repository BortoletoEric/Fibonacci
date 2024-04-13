import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        int result = fib(99);
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        JOptionPane.showMessageDialog(null, "Fibonacci: " + result + "\nTempo de execução: " + duration + "ms");
    }

    public static int fib(int n) {
        if (n <= 2) return 1;

        return fib(n - 1) + fib(n - 2);
    }
}