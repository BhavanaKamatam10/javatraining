public class prime {
    public static void main(String[] args){
        isProbablePrime(5);
    }
       public static void isProbablePrime(int n){
        int count = 0 ;
        for (int i=1; i<=100;i++){
            if (i % n != 0) {
               count++;
                System.out.println("prime");
                break;
            }
            else {
                System.out.println(" not prime ");
            }
        }
       }
}
