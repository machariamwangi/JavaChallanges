public class SwitchState {
    public static void main(String[] args) {
          int switchValue = 5;

        switch(switchValue){
            case 1:
                //code for value ==x
                System.out.println("Value was 1");
                break;// the will let the execution move outside the switch block
            case 2:
                //code for value
                System.out.println("Value is 2");
                break;
            default:
                //code for value not equal to x or y
                System.out.println("Values is not 1 or 2");
        }

    }

}
