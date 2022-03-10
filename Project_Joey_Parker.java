import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Joey_Parker
{
   public static void main(String[] args)
   {
      try
      {
         //Finds the PolicyInformation File and opens it
         File file = new File("PolicyInformation.txt");
         //Creating a Scanner object to read the file
         Scanner inputFile = new Scanner(file);
         //Creating an ArrayList to add Policies to
         ArrayList<Policy> policyList = new ArrayList<Policy>();
         //As long as the file has more lines to read, this while loop repeats
         while(inputFile.hasNext())
         {
            //creating a Policy Object
            Policy newPolicy = new Policy();
            
            //Asks for Policy Number
            newPolicy.setPolicyNumber(inputFile.nextInt());
            
            //Needed to prevent skipping after the use of nextInt()
            inputFile.nextLine();
            
            //Asks for Provider Name
            newPolicy.setProviderName(inputFile.nextLine());
            
            //Asks for Policyholder's First Name
            newPolicy.setFirstName(inputFile.nextLine());
            
            //Asks for Policyholder's Last Name
            newPolicy.setLastName(inputFile.nextLine());
            
            //Asks for Policyholder's Age
            newPolicy.setAge(inputFile.nextInt());
            
            //Needed to prevent skipping after the use of nextInt()
            inputFile.nextLine();
            
            //Asks for Policyholder's Smoking Status
            newPolicy.setSmokingStatus(inputFile.nextLine());
            
            //Asks for Policyholder's Height
            newPolicy.setHeight(inputFile.nextDouble());
            
            //Asks for Policyholder's Weight
            newPolicy.setWeight(inputFile.nextDouble());
            
            //Needed to prevent skipping after the use of nextInt()
            inputFile.nextLine();
            
            //Adds the newly created Policy to the policyList ArrayList
            policyList.add(newPolicy);
         }
         
         //Closes the file as it will no longer be read from
         inputFile.close();
         
         //Used to track the number of smokers and non-smokers
         int numSmokers = 0;
         int numNonSmokers = 0;
         for(int i = 0; i < policyList.size(); i++)
         {
            //Prints all information of each policy
            //Prints out Policy Number
            System.out.println("Policy Number: " + policyList.get(i).getPolicyNumber());
            //Prints out Provider Name
            System.out.println("Provider Name: " + policyList.get(i).getProviderName());
            //Prints out PolicyHolder's First Name
            System.out.println("PolicyHolder's First Name: " + policyList.get(i).getFirstName());
            //Prints out PolicyHolder's Last Name
            System.out.println("PolicyHolder's Last Name: " + policyList.get(i).getLastName());
            //Prints out PolicyHolder's Age
            System.out.println("PolicyHolder's Age: " + policyList.get(i).getAge());
            //Prints out PolicyHolder's Smoking Status
            System.out.println("nPolicyHolder's Smoking Status (smoker/non-smoker): " + policyList.get(i).getSmokingStatus());
            //Prints out PolicyHolder's Height
            System.out.println("PolicyHolder's Height: " + policyList.get(i).getHeight() + " inches");
            //Prints out PolicyHolder's Weight
            System.out.println("PolicyHolder's Weight: " + policyList.get(i).getWeight() + " pounds");
            //Calculates and prints out Policyholder's BMI
            System.out.printf("PolicyHolder's BMI: %,.2f\n", policyList.get(i).BMICalculator());
            //Calculates and prints out Policy Price
            System.out.printf("Policy Price: $%,.2f\n\n", policyList.get(i).calculateInsurancePrice());
            
            //Used to find number of smokers/non-smokers
            if(policyList.get(i).getSmokingStatus().equals("smoker"))
            {
               numSmokers++;
            }
            else
            {
               numNonSmokers++;
            }
         }
         
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