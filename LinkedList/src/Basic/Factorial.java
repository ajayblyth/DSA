package Basic;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        factorial(number);

    }
    public static void factorial(int num){
        int result = 1;
        for(int i = 1; i <= num; i ++){
            result *= i;
        }
        System.out.println(result);
    }
}
