/*import java.util.Scanner;

public class test {
   String userName;
   String passowrd;
   String cellPhone;
   String firstName;
   String lastName;


    public static void main(String[] args){
        System.out.println("=======PROFILE REGISTRATION======");
        //String Name;
        Scanner inputDevice = new Scanner(System.in);
            System.out.print("Enter your username: ");
        userName = inputDevice.nextLine();
    
    if (checkUserName(userName)){
        System.out.println("USERNAME SUCCESSFULLY CAPTURED.");
    } 
    else{
        System.out.println("USERNAME IS NOT CORRECTLY FORMATTED; PLEASE ENSURE THAT YOUR USERNAME CONTAINS AN UNDERSCORE AND IS NO MORE THAN FIVE CHARACTERS IN LENGTH.");
    }

                //String password;
                System.out.print("Enter your password: ");
             password = inputDevice.nextLine();
             if (checkUserPassword(password)){
                System.out.println("PASSWORD CAPTURED SUCCESSFULLY.");
             }
            else {
                System.out.println("PASSOWORD IS NOT CORRECTLY FORMATTED; PLEASE ENSURE THAT THE PASSOWRD CONTAINS AT LEAST EIGHT CHARACTERS, A CAPITAL LETTER, A NUMBER, AND A SPECIAL CHARACTER.");
            }
    }
    static boolean checkUserName(String username){
            boolean hasUnderscore = Name.contains("_");
                boolean shortEnough = Name.length() <= 5;
        return hasUnderscore && shortEnough;
    }
 
    public class checkUserPassword{
        public static void main(String[] args){
            String password;
                   Scanner inputDevice = new Scanner(System.in);
                System.out.print("Enter your password: ");
                
             password = inputDevice.nextLine();
             
             if (checkUserPassword(password)){
                System.out.println("PASSWORD CAPTURED SUCCESSFULLY.");
             }
            else {
                System.out.println("PASSOWORD IS NOT CORRECTLY FORMATTED; PLEASE ENSURE THAT THE PASSOWRD CONTAINS AT LEAST EIGHT CHARACTERS, A CAPITAL LETTER, A NUMBER, AND A SPECIAL CHARACTER.");
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