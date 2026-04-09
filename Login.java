import java.util.Scanner;

public class Login{
public String firstName;
public String lastName;
public String userName;
public String password;
public String cellPhoneNumber;

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your first name: ");
String firstName = scanner.nextLine();

System.out.print("Enter your Last name: ");
String lastName = scanner.nextLine();

System.out.print("Enter your username: ");
String userName = scanner.nextLine();

System.out.print("Enter your password: ");
String password = scanner.nextLine();

System.out.print("Enter your cell phone number: ");
String cellPhoneNumber = scanner.nextLine();

System.out.println("\nYour information has been successfully saved: ");
System.out.println("Name:" + firstName);
System.out.println("Last name:" + lastName);
System.out.println("Username:" + userName);
System.out.println("Password: " + password);
System.out.println("Cell phone number: " + cellPhoneNumber);

}

public boolean checkUserName(String Name){
boolean hasUnderscore = userName.contains("_");
boolean shortEnough = userName.length() <= 5;
if(hasUnderscore && shortEnough){
System.out.println("Username successfully captured");
}
return hasUnderscore && shortEnough;
}

public boolean checkUserPasswordComplexity(String password){
boolean shortEnough = password.length() < 8;
boolean hasCapital = true;
boolean hasNumber = true;
boolean hasSpecialCharacter = true;
if(shortEnough && hasCapital && hasNumber && hasSpecialCharacter ){
  System.out.println("Password successfully captured");
}
return shortEnough && hasCapital && hasNumber && hasSpecialCharacter;
}

public boolean checkCellPhoneNumber(String cellPhoneNumber){
String phoneNumberRegex = "^\\+27[0-9]{9}$";
if(cellPhoneNumber.matches(phoneNumberRegex)){
  System.out.println("Cell phone number successfully added");
}
return cellPhoneNumber.matches(phoneNumberRegex);
}

public String registerUser(String userName, String password, String cellPhoneNumber){
  if(checkUserName(userName) && checkUserPasswordComplexity(password)){
    System.out.println("You have been registered successfully");
  }
    if(!checkUserName(userName)){
    System.out.println("USERNAME IS NOT CORRECTLY FORMATTED; PLEASE ENSURE THAT YOUR UUSERNAME CONTAINS AN UNDERSCORE AND IS NO MORE THAN FIVE CHARACTERS IN LENGTH.");
}

if(!checkUserPasswordComplexity(password)){
   System.out.println("PASSWORD IS NOT CORRECTLT FORMATTED; PLEASE ENSURE THAT THE PASSWORD CONATINS ATA LEAST EIGHT CHARACTERS, A CAPITAL LETTER, A NUMBER, AND A SPECIAL CHARACTER.");
}
    if(!checkCellPhoneNumber(cellPhoneNumber)){
       System.out.println("CELL PHONE NUMBER INCORRECTLY FORMATTED OR DOES NOT CONTAIN INTERNATIONAL CODE.");
    }
  return "REGISTRATION FAILED"; 
}
}
