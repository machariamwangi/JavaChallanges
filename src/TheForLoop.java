public class TheForLoop {
    public static void main(String[] args) {
            for (int counter = 0; counter <= 10; counter ++){
                System.out.println(counter);
            }

            for (double rate = 2.0; rate <= 5.0; rate++){
                double interestAmount = calculateInterest(10000.0 , rate);
                System.out.println("10,000 at " + rate + "% Interest  = " + interestAmount);
            }

            //System.out.println("10,000 at 2% interest - " + calculateInterest(10000, 2.0));
           // System.out.println("10,000 at 2% interest - " + calculateInterest(10000, 3.0));
            //System.out.println("10,000 at 2% interest - " + calculateInterest(10000, 4.0));
    }

    public  static  double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
