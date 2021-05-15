import java.util.Scanner;

class Fib{
    static int fibonacci(int N) {
        if (N == 0)	return 0;
        if (N == 1)	return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
        }

public class B10870 {
    public static void main(String[] args) {
        Fib A=new Fib();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        System.out.println(A.fibonacci(N));
    }
}

