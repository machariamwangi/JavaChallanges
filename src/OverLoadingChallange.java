public class OverLoadingChallange {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));

    }

    public  static  double convertToCentimeters(int heightInInches){

        return  heightInInches * 2.54;
    }
    public  static  double convertToCentimeters(int heightInFeet, int heightInInches){

       /** int inchesofHeight = heightInFeet * 12;

        double convertFeetToCentimeters = convertToCentimeters(inchesofHeight);
        double convertInchesToCentimeters = convertToCentimeters(heightInInches);
        return  convertFeetToCentimeters + convertInchesToCentimeters;
        **/

       return  convertToCentimeters((heightInFeet *12)+ heightInInches);
    }
}
