package Basic;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        fibonacci(num);
    }

    private static void fibonacci(int num) {
        int a = 0;
        int b = 1;

        System.out.print( a + " " + b + " ");
        for( int i = 2; i <=num ; i++){
            int next = a + b;
            a = b;
            b = next;
            System.out.print( next + " ");

        }

    }
}
