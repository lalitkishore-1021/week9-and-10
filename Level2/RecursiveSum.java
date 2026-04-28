import java.util.Scanner;

public class RecursiveSum {

    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Recursive = " + recursiveSum(n));
        System.out.println("Formula = " + formulaSum(n));
    }
}