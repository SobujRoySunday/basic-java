package switchcase;

public class SwitchCaseExample {
    public static void main(String[] args) {
        // switch-case
        int number = 4;
        switch(number){                                             // checks the number variable and executes different codeblocks, depending upon the value
            case 1:
                System.out.println("Monday\n");
                break;
            case 2:
                System.out.println("Tuesday\n");
                break;
            case 3:
                System.out.println("Wednesday\n");
                break;
            case 4:
                System.out.println("Thursday\n");
                break;
            case 5:
                System.out.println("Friday\n");
                break;
            case 6:
                System.out.println("Saturday\n");
                break;
            case 7:
                System.out.println("Sunday\n");
                break;
            default:
                System.out.println("Unrecognised day\n");
                break;
        }
    }
}
