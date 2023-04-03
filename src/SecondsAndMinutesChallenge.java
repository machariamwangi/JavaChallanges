public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); //First Case
        System.out.println(getDurationString(-65, 45)); //Second case
        System.out.println(getDurationString(65, 145)); //Second case\

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }

        public static String getDurationString(int seconds){
       //return  'XXh YYm ZZs' where xx is hours and yy is minutes and zz is seconds
         //Two-step approach  to get hours
            if(seconds < 0){
                return  "Invalid Data for seconds("+ seconds + "), Must be a positive interger value";
            }

            return  getDurationString(seconds / 60,seconds % 60);
    }
    public static String getDurationString(int minutes ,int seconds){
         //return  'XXh YYm ZZs' where xx is hours and yy is minutes and zz is seconds
        if(minutes < 0){
            return  "Invalid Data for minutes("+ minutes + "), Must be a positive interger value";
        }

        if(seconds <= 0 || seconds >= 59){
            return  "Invalid Data for seconds("+ seconds + "), Must be between 0 and 59";
        }
        int hours  = minutes /60;
        int  remainingMinutes = minutes % 60;
        return  hours + "h" + remainingMinutes + "m" + seconds + "s";
    }
}
