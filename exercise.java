public class exercise<Static> {
    public static void main(String[] args) {
        checkNumber(10);
        System.out.println(toMilesPerHour(12));
        printConversion(22);
        calcFeetAndInchesToCentimeters(-10, 1);
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        printMegaBytesAndKiloBytes(2500);
        System.out.println(isLeapYear(2200));
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("number is zero");
        }
    }

    //-----------------------------------------------------------------------------------
    //SPEED CONVERTER
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);//1 MILE=1.6km,1km=0.6
    }


    public static void printConversion(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            System.out.println("invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometresPerHour);
            System.out.println(kilometresPerHour + "km/h =" + milesPerHour + "mi/h");
        }
    }

    //METHOD OVERLOADING----------------------------------------------------------------------
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("invalid feet or inches parameter");
            return -1;
        }
        double centimeters = (feet * 10) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + "inches=" + centimeters + " cm");
        return centimeters;

    }

    //--------------------------------------------------------------------------------
    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;


        return hours + "h" + remainingMinutes + "m " + seconds + "s";

    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    /////////////////////barking dog
    //leap year
     public static boolean isLeapYear(int year) {
        if (year>=1 && year<=9999){
            return false;
        }
           else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                }
                return true;
            } else return false;
        }
        else return true;
    }



    //print mega bytes and kilo bytes
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if(kilobytes>0){
            int XX =kilobytes;
            int YY = kilobytes/1024;
            int ZZ = kilobytes%1024;
            System.out.println(XX +" KB " + YY +" MB " +  ZZ  +"  KB");
        } else
            System.out.println("invalid value");
    }
}


