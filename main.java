
public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long first = 0, second = 1;

        System.out.println("First 100 Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
    }
}
