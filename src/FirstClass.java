public class FirstClass {
    public static void main(String[] args) {
            System.out.println("Hello World!");
        int playerPosition = 2;
        String playerName = "Time";
        displayHighScorePosition(playerName, playerPosition);
          //method  two

        int scoreTest1 = 1500;
        int scoreTest2 = 1000;
        int scoreTest3 = 500;
        int scoreTest4 = 100;
        int scoreTest5 = 25;

        System.out.println(calculateHighScorePosition(scoreTest1));
        System.out.println(calculateHighScorePosition(scoreTest2));
        System.out.println(calculateHighScorePosition(scoreTest3));
        System.out.println(calculateHighScorePosition(scoreTest4));
        System.out.println(calculateHighScorePosition(scoreTest5));
    }


    public static void displayHighScorePosition(String playerName,int playerPosition) {

        System.out.println(playerName + " Managed to get into position "+ playerPosition + " on the high score list");

    }
 public  static  int calculateHighScorePosition(int playerScore){

        if(playerScore >= 1000){
           return  1;
        } else if (playerScore >= 500 ) {
           return  2;
        } else if (playerScore >= 100 ) {
           return  3;
        }else {
            return  4;
        }
 }

}
