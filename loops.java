public class loops {
    public static void main(String[] args) {

        isPrime(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop" + i + "hello!");
        }}

//------------------------------------------------------------------------
       public static boolean isPrime(int n) {

        int count = 0;
        for (int i = 1; i < 10; i++) {
            if (i%n != 0) {
                count++;
                System.out.println("number" + i + "is a prime number");
            }
            if (count == 3) {
                    System.out.println("exit for the loop");
                    break;
                }

        }
    return true;}
        //---------------------------------------------------------------------------
       /* int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found Number=" + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("sum = " + sum);*/

        //while loops
       /* int count = 6;
        while (count !=6){
            System.out.println("count value is" + count);
            count++;
        }
        for( int i=6;i!=6;i++){
            System.out.println("count value is" + count);
        }

        count =6;
        do{
            System.out.println("count value is " + count);
            count++;

            if(count>100){
                break;
            }
        }while(count !=6);*/

      /* int num = 4;
        int finishNumber = 20;
        while (num <= finishNumber){
            num++;
            if ((! methods.isEvenNumber(num))){
                continue;
            }
        }
        System.out.println("even number" +num);*/
    }



