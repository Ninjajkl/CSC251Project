public class Policy
{
   //Initializing Fields
         private int policyNumber;
         private String providerName;
         private static int instanceCount = 0;
       
   //No-arg constructor  
   public Policy()
   {
      //Set default values for fields
         policyNumber = 0;
         providerName = "";
         instanceCount++;
   }
   
   //Constructor that accepts arguments
   public Policy(int pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w)
   {
      //Set field values to the given argument values
         policyNumber = pNumber;
         providerName = pName;
         instanceCount++;
   }
   
   /**
      Overrides the toString Method
      
      @return all fields in a string
   */
   public override String toString()
   {
      String returnString = "";
      returnString += "\nPolicy Number = " + policyNumber;
      returnString += "\nProvider name = " + providerName;
      return returnString
   }
   
   //All the Setter methods for each field
   
   /**
      Sets the policyNumber from the given pNumber
      
      @param pNumber - policy number to be changed to
   */
   public void setPolicyNumber(int pNumber)
   {
      policyNumber = pNumber;
   }
   /**
      Sets the providerName from the given pName
      
      @param pName - provider name to be changed to
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   //All the Getter methods for each field
   /**
      Returns the policyNumber
      
      @return policy number
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   /**
      Returns the providerName
      
      @return provider name
   */
   public String getProviderName()
   {
      return providerName;
   }
   /**
      Returns the instanceCount
      
      @return instance count
   */
   public String getInstanceCount()
   {
      return instanceCount;
   }
}