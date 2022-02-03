public class Policy
{
   //Initializing Fields
         private int policyNumber;
         private String providerName;
         private String firstName;
         private String lastName;
         private int age;
         private String smokingStatus;
         private double height;
         private double weight;
       
   //No-arg constructor  
   public Policy()
   {
      //Set default values for fields
         policyNumber = 0;
         providerName = "";
         firstName = "";
         lastName = "";
         age = 0;
         smokingStatus = "";
         height = 0;
         weight = 0;
   }
   
   //Constructor that accepts arguments
   public Policy(int pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w)
   {
      //Set field values to the given argument values
         policyNumber = pNumber;
         providerName = pName;
         firstName = fName;
         lastName = lName;
         age = a;
         smokingStatus = sStatus;
         height = h;
         weight = w;
   }
   
   //Calculates the BMI of the policyholder through their weight and height
   public double BMICalculator()
   {
      return (weight*703)/(height*height);
   }
   
   public double calculateInsurancePrice()
   {
      double price = 600;
      if(age > 50)
      {
         price += 50;
      }
      if(smokingStatus.equals("smoker"))
      {
         price += 100;
      }
      double BMI = BMICalculator();
      if(BMI > 35)
      {
         price += (BMI - 35) * 20;
      }
      return price;
   }
   
   //All the Setter methods for each field
   public void setPolicyNumber(int pNumber)
   {
      policyNumber = pNumber;
   }
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   public void setAge(int a)
   {
      age = a;
   }
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   public void setHeight(double h)
   {
      height = h;
   }
   public void setWeight(double w)
   {
      weight = w;
   }
   
   //All the Getter methods for each field
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   public String getProviderName()
   {
      return providerName;
   }
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return lastName;
   }
   public int getAge()
   {
      return age;
   }
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   public double getHeight()
   {
      return height;
   }
   public double getWeight()
   {
      return weight;
   }
}