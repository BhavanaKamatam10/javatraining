public class methods {
    public static void main(String[] args) {
       boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println(isEvenNumber(5));
       // System.out.println(sumDigitNumber(125));
        calculateScore(true, 800, levelCompleted, bonus);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was" + finalScore);
        }
    }

    public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
            //boolean gameOver = true;
           // int score=5000;
           // int levelCompleted=5;
            // int bonus=100;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your final score was" + finalScore);
            return finalScore;
        }
         return -1;


    }
    public static boolean isEvenNumber(int num){
        if((num%2) == 0){
            return true;
        }else{
            return false;
        }

        //DIGIT SUM CHALLENGE
       /* public static int sumDigitNumber(int number){
            if(number<10){
                return -1;
            }
        }
        int sum=0;
        while(number>0){
            int digit number%10;
            sum += digit;
            number /= 10;
        }
        return sum;*/
    }
}

