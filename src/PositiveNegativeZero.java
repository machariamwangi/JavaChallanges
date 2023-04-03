public class PositiveNegativeZero {
    public static void main(String[] args) {
            checkNumber(5);
            checkNumber(0);
            checkNumber(-8);
    }
    public static  void checkNumber(int number){
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0 ){
            System.out.println("Negative");
        }else if (number == 0){
            System.out.println("Zero");
        }

        System.out.println((number > 0) ? "Positive": ((number < 0) ? "Negative": "Zero"));
    }
}
