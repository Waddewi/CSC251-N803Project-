import java.util.Scanner;//Import for the Scanner class to read file inputs
import java.util.ArrayList;//Import for ArrayList
import java.io.*;//Import for File reading

public class Project_William_WaddellJacobs
{
   public static void main(String args[]) throws IOException
   {  
      //variable declarations
      int policyNumber, age;
      String providerName, name1, name2, smokingStatus;
      double height, weight;
      
      Scanner file = new Scanner(new File("PolicyInfo.txt"));
      ArrayList<Policy> info = new ArrayList<>(); //creating ArrayList to store Policy objects
      
      while(file.hasNext())//loop will read the file and create objects for everyone in the file
      {
         policyNumber = file.nextInt();
         file.nextLine();
         providerName = file.nextLine();
         name1 = file.nextLine();
         name2 = file.nextLine();
         age = file.nextInt();
         file.nextLine();
         smokingStatus = file.nextLine();
         height = file.nextDouble();
         weight = file.nextDouble();
         
         info.add(new Policy(policyNumber, age, height, weight, name1, name2, providerName, smokingStatus));
      }
      file.close();
      
   }
}