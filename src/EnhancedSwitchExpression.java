public class EnhancedSwitchExpression {

    public static void main(String[] args) {
        int day = 0;
        printDayOfWeek(day);
        printWeekDay(day);

    }

    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> {yield "Monday";} //we use yield when we want to do some calculations/evaluation before returning a value
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Day of the week Not Found";
        };
      System.out.println(day + " Stand for  "+ dayOfTheWeek);
    }

    public  static  void printWeekDay(int day){
        String dayOfTheWeek = "";
        if(day == 0){
            dayOfTheWeek = "Sunday";
        } else if (day == 1) {
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        }else if (day == 4) {
            dayOfTheWeek = "Thursday";
        }else if (day == 5) {
            dayOfTheWeek = "Friday";
        }else if (day == 6) {
            dayOfTheWeek = "Saturday";
        }else  {
            dayOfTheWeek = "Day of the week not found";
        }
        System.out.println(day + " Stand for  "+ dayOfTheWeek);
    }
}
