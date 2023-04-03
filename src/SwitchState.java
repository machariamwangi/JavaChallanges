public class SwitchState {
    public static void main(String[] args) {
          int switchValue = 5;

        switch (switchValue) {
            case 1 ->
                //code for value ==x
                    System.out.println("Value was 1");
// the will let the execution move outside the switch block
            case 2 ->
                //code for value
                    System.out.println("Value is 2");
            default ->
                //code for value not equal to x or y
                    System.out.println("Values is not 1 or 2");
        }

        String month = "APRIL";
        System.out.println(month + " Is in the " + getQuarter(month) + " quarter");

    }

    public  static  String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield  badResponse;
            }
        };
    }

}
