class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

public class CustomEx1{
    public static void main(String[] args) {
        try{
            int age = -10;

            if(age <= 0){
                throw new InvalidAgeException("Student must be at least 18 years old.");
            }
        }catch(InvalidAgeException e){
            System.out.print("Error : " + e.getMessage());
        }
    }
}