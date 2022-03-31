public class PolicyHolder
{
   //Initializing Fields
         private String firstName;
         private String lastName;
         private int age;
         private String smokingStatus;
         private double height;
         private double weight;
   
   //No-arg constructor  
   public PolicyHolder()
   {
      //Set default values for fields
         firstName = "";
         lastName = "";
         age = 0;
         smokingStatus = "";
         height = 0;
         weight = 0;
   }
   
   //Copy Constructor
   public PolicyHolder(PolicyHolder pHolder)
   {
      firstName = pHolder.firstName;
      lastName = pHolder.lastName;
      age = pHolder.age;
      smokingStatus = pHolder.smokingStatus;
      height = pHolder.height;
      weight = pHolder.weight;
   }
   
   //Constructor that accepts arguments
   public PolicyHolder(String fName, String lName, int a, String sStatus, double h, double w)
   {
      //Set field values to the given argument values
         firstName = fName;
         lastName = lName;
         age = a;
         smokingStatus = sStatus;
         height = h;
         weight = w;
   }
   
   /**
      Calculates the BMI of the policyholder through their weight and height
      
      @return calculated BMI
   */
   public double BMICalculator()
   {
      return (weight*703)/(height*height);
   }
   
   /**
      Calculates the price of the insurance depending on age, smokingStatus, and BMI
      
      @return calculated price of the insurance
   */
   public double calculateInsurancePrice()
   {
      double price = 600;
      if(age > 50)
      {
         price += 75;
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
   
   /**
      Overrides the toString Method
      
      @return all fields in a string
   */
   public String toString()
   {
      String returnString = "";
      returnString += "\nPolicyHolder's First Name: " + firstName;
      returnString += "\nPolicyHolder's Last Name: " + lastName;
      returnString += "\nPolicyHolder's Age: " + age;
      returnString += "\nPolicyHolder's Smoking Status (Y/N): " + smokingStatus;
      returnString += "\nPolicyHolder's Height: " + height;
      returnString += "\nPolicyHolder's Weight: " + weight;
      returnString += String.format("\nPolicyHolder's BMI: %,.2f", BMICalculator());
      returnString += String.format("\nPolicy Price: $%,.2f\n", calculateInsurancePrice());
      return returnString;
   }
   
   //All the Setter methods for each field
   
   /**
      Sets the firstName from the given fName
      
      @param fName - first name to be changed to
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   /**
      Sets the lastName from the given lName
      
      @param lName - last name to be changed to
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   /**
      Sets the age from the given a
      
      @param a - age to be changed to
   */
   public void setAge(int a)
   {
      age = a;
   }
   /**
      Sets the smokingStatus from the given sStatus
      
      @param sStatus - smoking status to be changed to
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   /**
      Sets the height from the given h
      
      @param h - height to be changed to
   */
   public void setHeight(double h)
   {
      height = h;
   }
   /**
      Sets the weight from the given w
      
      @param w - weight to be changed to
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   //All the Getter methods for each field
   public String getFirstName()
   {
      return firstName;
   }
   /**
      Returns the lastName
      
      @return last name
   */
   public String getLastName()
   {
      return lastName;
   }
   /**
      Returns the age
      
      @return age
   */
   public int getAge()
   {
      return age;
   }
   /**
      Returns the smokingStatus
      
      @return smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /**
      Returns the height
      
      @return height
   */
   public double getHeight()
   {
      return height;
   }
   /**
      Returns the weight
      
      @return weight
   */
   public double getWeight()
   {
      return weight;
   }

}