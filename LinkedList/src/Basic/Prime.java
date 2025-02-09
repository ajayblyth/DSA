package Basic;

public class Prime {
    public static void main(String[] args) {
        int num = 7;
        Prime prime = new Prime();
        var prime1 = prime.isPrime(num);
        if (prime1){
            System.out.println(" is prime");
        }
        else {
            System.out.println(" not prime" );
        }
    }
    public boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
