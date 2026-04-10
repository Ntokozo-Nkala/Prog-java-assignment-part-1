/*import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("=======PROFILE REGISTRATION======");
        String Name;
        Scanner inputDevice = new Scanner(System.in);
            System.out.print("Enter your username: ");
        Name = inputDevice.nextLine();
    
    if (checkUserName(Name)){
        System.out.println("Username successfully captured");
    } 
    else{
        System.out.println("Username is not correctly formatted; please ensure that your username conatins an underscore and is no more than five characters in length.");
    }
    }

    static boolean checkUserName(String Name){
            boolean hasUnderscore = Name.contains("_");
                boolean shortEnough = Name.length() <= 5;
        return hasUnderscore && shortEnough;
    }

   public class checkUserPassword{
        public static void main(String[] args){
            String password;
                   Scanner inputDevice = new Scanner(System.in);
                System.out.println("Enter your password: ");
                
             password = inputDevice.nextLine();
             if (checkUserPassword(password)){
                System.out.println("Password successfully captured.");
             }
            else {
                System.out.println("Passoword is not correctly formatted; please ensure that the passowrd contains at least eight characters, a capital letter, a number, and a special character.");
            }
    }
 }
    static boolean checkUserPassword(String password){
      boolean shortEnough = password.length() >= 8;
      boolean hasCapital = true;
      boolean hasNumber = true;
      boolean hasSpecialCharacter = true;
      return shortEnough && hasCapital && hasNumber && hasSpecialCharacter;
    }
}
    /* */