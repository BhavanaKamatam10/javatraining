public class exers5 {
    public static void main(String[] args) {
        printNumberInWord(7);
        System.out.println(isPalindrome(121));
        System.out.println( sumFirstAndLastDigit(572));
        System.out.println(getEvenDigitSum(227));
        System.out.println(sumEven(1,7));
        System.out.println((isPerfectNumber(6)));
        System.out.println(hasSharedDigit(12,23));
        System.out.println((hasSameAsLastDigit(9,99,999)));
    }

    //1.NUMBER IN WORD
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    //NUMBER PALINDROME
    public static int isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        if (number <= 0) {
            return number;

        }
        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;

        }
        return reverse;
    }

    //FIRST AND LAST DIGIT SUM

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit =0;
        int lastDigit = 0;
        int sum =0;
        if (number < 0) {
            return -1;

        }lastDigit=number%10;
        while(number>10) {
            number = number / 10;
        }
            firstDigit = number;
            sum = firstDigit + lastDigit;
            return sum;
        }

        //EVEN DIGIT SUM
      public static boolean getEvenDigitSum(int num){
       int sum=0;
      if (num <0){
          return false;
        }
      if(num %2 == 0){
          return true;
      }
       else return false;
      }

      public static int sumEven(int j, int k){
        int sum = 0;
        for(int i=j;i<=k;i++){
            if(getEvenDigitSum(i) == true)
                sum += i;
        }
        return sum;
      }


      //PERFECT NUMBER
      public static boolean isPerfectNumber(int number) {
          int i = 0;
          int sum = 0;
          int n = 0;
          if (number < 1) {
              return false;
          }
          for (i = 1; i <= n; i++) {
              if (n % i == 0) {

                  sum = sum + i;
              }
          }
          if (sum == n) {
              return true;
          }
          else return false;
      }

      //SHARED DIGIT
      public static boolean hasSharedDigit(int num1,int num2){
        int range=0;
        int i=0;

        if(range != 0){
            return false;
        }
        for(i=10;i<100;i++){

        }
         return true;
      }

      //LAST DIGIT CHECKER

    public static boolean hasSameAsLastDigit(int num1,int num2,int num3){

        int num =0;
        int lastDigit = 0;
        int i=0;
        if(num < 0){
            return false;
        }
        lastDigit=num%10;
        while(num>10) {
            num= num/ 10;
        }
        for(i=10;i<=1000;i++){

        }

        return true;

    }
    }













