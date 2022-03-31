public class Policy
{
   //Initializing Fields
         private int policyNumber;
         private String providerName;
         private static int instanceCount = 0;
         private PolicyHolder myPolicyHolder;
       
   //No-arg constructor  
   public Policy()
   {
      //Set default values for fields
         policyNumber = 0;
         providerName = "";
         myPolicyHolder = new PolicyHolder();
         instanceCount++;
   }
   
   //Constructor that accepts arguments
   public Policy(int pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w)
   {
      //Set field values to the given argument values
         policyNumber = pNumber;
         providerName = pName;
         myPolicyHolder = new PolicyHolder(fName, lName, a, sStatus, h, w);
         instanceCount++;
   }
   
   /**
      Overrides the toString Method
      
      @return all fields in a string
   */
   public String toString()
   {
      String returnString = "";
      returnString += "\nPolicy Number: " + policyNumber;
      returnString += "\nProvider Name: " + providerName;
      returnString += myPolicyHolder.toString();
      return returnString;
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
    /**
      Sets the myPolicyHolder from the given PolicyHolder
      
      @param pHolder - PolicyHolder to be changed to
   */
   public void setPolicyHolder(PolicyHolder pHolder)
   {
      myPolicyHolder = new PolicyHolder(pHolder);
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
   public static int getInstanceCount()
   {
      return instanceCount;
   }
   /**
      Returns the myPolicyHolder
      
      @return myPolicyHolder
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(myPolicyHolder);
   }
}