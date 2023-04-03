public class MethodOverLoading {
    public static void main(String[] args) {
       int newScore =  calculateScore("Tim", 20);
       System.out.println("new score is "+ newScore);
       calculateScore(75);
       calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
      System.out.println("Player " + playerName + " Scored " +  score + " Points");
      return  score * 1000;
    }

    public static int calculateScore( int score) {
        System.out.println("UnNamed Player Scored " +  score + " Points");
        return  score * 1000;
    }
    public static int calculateScore( ) {
        System.out.println("No Player Name , No Player Score");
        return  0;
    }
}
