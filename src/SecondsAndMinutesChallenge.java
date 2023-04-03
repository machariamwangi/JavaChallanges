public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); //First Case
        System.out.println(getDurationString(65, 45)); //Second case
    }

        public static String getDurationString(int seconds){
       //return  'XXh YYm ZZs' where xx is hours and yy is minutes and zz is seconds
         //Two-step approach  to get hours
            int minutes = seconds / 60;
            int hours  = minutes /60;
            int  remainingMinutes = minutes % 60;
            int remainingSeconds =   seconds % 60;
            return  hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";
    }
    public static String getDurationString(int minutes ,int seconds){
         //return  'XXh YYm ZZs' where xx is hours and yy is minutes and zz is seconds
        int hours  = minutes /60;
        int  remainingMinutes = minutes % 60;
        int remainingSeconds =   seconds % 60;
        return  hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";
    }
}
