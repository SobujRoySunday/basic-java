package exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0, j = 0;
        try{
            j = 8/i;
            System.out.println(j);
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j + " Byee!");

        // Object -> Throwable -> 1. Error, 2. Exception
        // 1. Error -> ThreadDeath, IOError, VirtualMachineError
        // 2. Exception -> RuntimeException, SQLException, IOException
        // RuntimeException -> uncheckedExceptions(ArithmeticException, NullPointerException)
        // OtherExceptions -> checkedExceptions
    }
}
