import java.util.Locale;

public class Switch {
    public static void main(String[] args) {

       /* printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);*/
        printDayOfTheWeek(6);
       // printDayOfTheWeek(0);


        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3:
                System.out.println("value was 3");
                break;

            default:
                System.out.println("value was anything");
                break;

        }
        //------------------------------------------------------------------------

        char charValue = 'D';
        switch (charValue) {
            case 'A':
                System.out.println("A was not found");
                break;

            case 'B':
                System.out.println("B was not found");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println(charValue  + " was found");
                break;
            default:
                System.out.println("could not find A,B,C,D, or E");
        }
//---------------------------------------------------------------------------
        String day = "friday";
        switch (day.toUpperCase()) {
            case "sunday":
                System.out.println("sun");
                break;

            case "friday":
                System.out.println("fri");
                break;

            case "wednesday":
                System.out.println("wed");
                break;
            default:
                System.out.println("not sure");
        }

    }

    //------------------------------------------------------------------
    public static void printDayOfTheWeek(int day) {
        switch (day) {

            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("invalid day");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;


        }

      /* public static void  printDayOfTheWeek(int day){
            if (day == 0) {
                System.out.println("Sunday");
            } else if (day == 1) {
                System.out.println("Monday");
                else if (day == 2) {
                    System.out.println("Tuesday");

            }
            }
        }*/


    }
}
