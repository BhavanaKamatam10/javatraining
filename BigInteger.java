public class BigInteger {
    public static void main(String[] args){
        isProbablePrime(5);
    }
    public static void isProbablePrime(int n) {
       int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (n % i != 0) {
                count++;
                System.out.println("prime");
            } else {
                System.out.println(" not prime ");
            }
        }
    }
}
