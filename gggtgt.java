public class gggtgt {
    public static void main (String[] args){
        int result = 1+2;//1+2=3
        System.out.println("1+2=" +result);
        int previousResult = result;
        System.out.println(previousResult);

        //3-1=2;
        //3*2=6;
        //6/3=2;
        //4%3=1;
        //--------------------------------------------------------------------

        result++;//1+1=2;
        System.out.println("1+1= "+result);

        result--;//2-1=1;
        System.out.println("2-1= "+result);

        //result=result+2;
        result +=2;//1+2=3;
        System.out.println("1+2= "+result);

        //result=result*10;
        result*=10;//3*10=30
        System.out.println("3*10= "+result);

        //result=result/3;
        result/=3;//30/3=10
        System.out.println("30/3= "+result);

        //result=result-2;
        result-=2;//10-2=8;
        System.out.println("10-2= "+result);
        //---------------------------------------------------

        boolean isAlien =false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!  ");
            System.out.println("Bhavana");
        }
        int topScore = 80;
        if (topScore <100) {
            System.out.println("Mr.Nik");
        }
        int secTopScore = 60;
        if((topScore > secTopScore) && (topScore <100)){ //AND operator
            System.out.println("Bhavana Kamatam");
        }
        //-------------------------------------------------------------------------------
        //Logical OR operator
        if ((topScore > 90)|| (secTopScore<=90)){
            System.out.println("Ajay Kamatam");
        }

        int newValue=50;
        if (newValue == 50){    //equalto operator
            System.out.println("Bhav");
        }

         boolean isBus = false;//aasigned operator
        if(isBus = true){
            System.out.println("Prabhas");
        }
        isBus = true;
        boolean wasBus = isBus? true:false;
        if (wasBus){
            System.out.println("wasBus is true");
        }
         int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient ==20?true:false;
        System.out.println(isEighteenOrOver);

        //------------------------------------------------------------------------
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue +  mySecondValue * 100.00d;
        System.out.println("MyValuesTotal=" +myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder =" + theRemainder);
        boolean isNoRemainder = (theRemainder == 0)? true:false;
        System.out.println("isNoremainder = " +isNoRemainder);
        if(!isNoRemainder)
            System.out.println("Bhavana Kamatam ");

        //------------------------------------------------------------------
        int myVariable=50;
        myVariable++;
        myVariable--;
        System.out.println("this is test");
        System.out.println("this is" + " another" + " still more");

        boolean gameOver = true;
        int score=5000;
        int levelCompleted=5;
        int bonus=100;
        if (gameOver==true){
            int finalScore=score + (levelCompleted * bonus);
            System.out.println("your final score was"  +  finalScore);

       //---------------------------------------------------------------------------
            //methods
            /*public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
                boolean gameOver = true;
                int score=5000;
                int levelCompleted=5;
                int bonus=100;
                if (gameOver==true){
                    int finalScore=score + (levelCompleted * bonus);
                    System.out.println("your final score was" +  finalScore);

                }*/
        }

    }
}
