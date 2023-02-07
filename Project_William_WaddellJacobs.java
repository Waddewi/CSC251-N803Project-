import java.util.Scanner;//Import for the Scanner class to read keyboard inputs

public class Project_William_WaddellJacobs
{
   public static void main(String args[])
   {  
      //variable declarations
      int policyNumber, age;
      String providerName, name1, name2, smokingStatus;
      double height, weight;
      
      Scanner keyboard = new Scanner(System.in);//variable to read keyboard inputs
      
      //User Prompts for input
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      name1 = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      name2 = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status: ");
      smokingStatus = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height: ");
      height = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder's Weight: ");
      weight = keyboard.nextDouble();
      
      //Creating a object of the Policy class called P1
      Policy p1 = new Policy(policyNumber, age, height, weight, name1, name2, providerName, smokingStatus);
      
      p1.getInfo();
      
   }
}