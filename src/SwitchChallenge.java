public class SwitchChallenge {
    public static void main(String[] args) {

        char som = 'A';
        switch (som){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Letter "+ som + " Was not found in the switch");
                break;
        }

    }


}
