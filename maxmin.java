import java.util.Scanner;

public class maxmin {
    public static void main(String[] args){
        Scanner scanner =new Scanner (System.in);
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       boolean first = true;
        System.out.println(" Enter Number : ");
        while(true){
            boolean isAnAnt = scanner.hasNextInt();

            if(isAnAnt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            } else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("max : " + max +  " min : " + min );
    }
}
