public class Policy
{
   //Initializing Fields
         private int policyNumber;
         private String providerName;
       
   //No-arg constructor  
   public Policy()
   {
      //Set default values for fields
         policyNumber = 0;
         providerName = "";
   }
   
   //Constructor that accepts arguments
   public Policy(int pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w)
   {
      //Set field values to the given argument values
         policyNumber = pNumber;
         providerName = pName;
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
}