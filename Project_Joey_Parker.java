import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Joey_Parker
{
   public static void main(String[] args)
   {
      try
      {
         //declare variables for the Policy and the PolicyHolder
         int policyNumber, age;
         String providerName, firstName, lastName, smokingStatus;
         double height, weight;
         
         //Finds the PolicyInformation File and opens it
         File file = new File("PolicyInformation.txt");
         //Creating a Scanner object to read the file
         Scanner inputFile = new Scanner(file);
         //Creating an ArrayList to add Policies to
         ArrayList<Policy> policyList = new ArrayList<Policy>();
         //As long as the file has more lines to read, this while loop repeats
         while(inputFile.hasNext())
         {
            //Asks for Policy Number
            policyNumber = inputFile.nextInt();
            
            //Needed to prevent skipping after the use of nextInt()
            inputFile.nextLine();
            
            //Asks for Provider Name
            providerName = inputFile.nextLine();
            
            //Asks for Policyholder's First Name
            firstName = inputFile.nextLine();
            
            //Asks for Policyholder's Last Name
            lastName = inputFile.nextLine();
            
            //Asks for Policyholder's Age
            age = inputFile.nextInt();
            
            //Needed to prevent skipping after the use of nextInt()
            inputFile.nextLine();
            
            //Asks for Policyholder's Smoking Status
            smokingStatus = inputFile.nextLine();
            
            //Asks for Policyholder's Height
            height = inputFile.nextDouble();
            
            //Asks for Policyholder's Weight
            weight = inputFile.nextDouble();
            
            //Needed to prevent skipping after the use of nextInt()
            inputFile.nextLine();
            
            //Adds the newly created Policy to the policyList ArrayList
            Policy newPolicy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policyList.add(newPolicy);
         }
         
         //Closes the file as it will no longer be read from
         inputFile.close();
         
         //Used to track the number of smokers and non-smokers
         int numSmokers = 0;
         int numNonSmokers = 0;
         for(int i = 0; i < policyList.size(); i++)
         {
            System.out.println(policyList.get(i));
            if(policyList.get(i).getPolicyHolder().getSmokingStatus().equals("smoker"))
            {
               numSmokers++;
            }
            else
            {
               numNonSmokers++;
            }
         }
         
         System.out.println("There were " + Policy.getInstanceCount() + " Policy objects created.");
         //Prints out number of Smokers/Nonsmokers
         System.out.println("The number of policies with a smoker is: " + numSmokers);
         System.out.println("The number of policies with a non-smoker is: " + numNonSmokers);
      }
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}