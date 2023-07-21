package exceptions;

class SobuuException extends Exception{
    public SobuuException(String string){
        super(string);
    }
}

public class CustomException {
    public static void main(String[] args) throws Exception {
        try{
            throw new SobuuException("Hello");
        } catch(SobuuException e){
            System.out.println("Default Parameters: " + e);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
