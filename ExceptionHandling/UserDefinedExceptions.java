package ExceptionHandling;

public class UserDefinedExceptions{
    public static void main(String[]args){
        int age = 17;
        try {
            Register.checkAge(age);
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
    }
}

class Register{
    public static void checkAge(int age) throws UnderAgeException{
        if (age < 18) {
            throw new UnderAgeException();
        }
    }
}

class UnderAgeException extends Exception{

}
