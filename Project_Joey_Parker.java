import java.util.Scanner;

public class Project_Joey_Parker
{
   public static void main(String[] args)
   {
      //creating a Scanner object to get input
      Scanner keyboard = new Scanner(System.in);
      //creating a Policy Object
      Policy testPolicy = new Policy();
      
      //Asks for Policy Number
      System.out.print("Please enter the Policy Number: ");
      testPolicy.setPolicyNumber(keyboard.nextInt());
      //Needed to prevent skipping after the use of nextInt()
      keyboard.nextLine();
      
      //Asks for Provider Name
      System.out.print("Please enter the Provider Name: ");
      testPolicy.setProviderName(keyboard.nextLine());
      
      //Asks for Policyholder's First Name
      System.out.print("Please enter the Policyholder's First Name: ");
      testPolicy.setFirstName(keyboard.nextLine());
      
      //Asks for Policyholder's Last Name
      System.out.print("Please enter the Policyholder's Last Name: ");
      testPolicy.setLastName(keyboard.nextLine());
      
      //Asks for Policyholder's Age
      System.out.print("Please enter the Policyholder's Age: ");
      testPolicy.setAge(keyboard.nextInt());
      //Needed to prevent skipping after the use of nextInt()
      keyboard.nextLine();
      
      //Asks for Policyholder's Smoking Status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      testPolicy.setSmokingStatus(keyboard.nextLine());
      
      //Asks for Policyholder's Height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      testPolicy.setHeight(keyboard.nextDouble());
      
      //Asks for Policyholder's Weight
      System.out.print("Please enter the Policyholder's Weight (in inches): ");
      testPolicy.setWeight(keyboard.nextDouble());
      
      //Demonstrating the Get Functions
      
      //Prints out Policy Number
      System.out.println("\n\nPolicy Number: " + testPolicy.getPolicyNumber());
      //Prints out Provider Name
      System.out.println("Provider Name: " + testPolicy.getProviderName());
      //Prints out PolicyHolder's First Name
      System.out.println("PolicyHolder's First Name: " + testPolicy.getFirstName());
      //Prints out PolicyHolder's Last Name
      System.out.println("PolicyHolder's Last Name: " + testPolicy.getLastName());
      //Prints out PolicyHolder's Age
      System.out.println("PolicyHolder's Age: " + testPolicy.getAge());
      //Prints out PolicyHolder's Smoking Status
      System.out.println("nPolicyHolder's Smoking Status: " + testPolicy.getSmokingStatus());
      //Prints out PolicyHolder's Height
      System.out.println("PolicyHolder's Height: " + testPolicy.getHeight() + " inches");
      //Prints out PolicyHolder's Weight
      System.out.println("PolicyHolder's Weight: " + testPolicy.getWeight() + " pounds");
      //Calculates and prints out Policyholder's BMI
      System.out.printf("PolicyHolder's BMI: $%,.2f\n", testPolicy.BMICalculator());
      //Calculates and prints out Policy Price
      System.out.printf("Policy Price: $%,.2f\n", testPolicy.calculateInsurancePrice());
   }
}