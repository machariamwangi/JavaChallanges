public class ForLoopMiniChallenge {
    public static void main(String[] args) {
            ///Using for statement , call the calculateInterest Method with the dollar amount 100.
            /// And  this time, use the Interest rates between 7.5 and 10, but increment by a quarter of a % each time , meaning 0.25%

           for (double rate = 7.5;  rate <= 10; rate += 0.25)
           {
               double interestAmount = calculateInterest(100.0 , rate);
               System.out.println("100 at " + rate + "% Interest  = " + interestAmount);
           }
    }

    //calculate Interest method
    public  static  double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
