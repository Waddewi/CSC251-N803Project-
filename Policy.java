/**
   Policy class to outline a persons policy information
*/
public class Policy
{

int policyNumber, age;
double height, weight;
String name1, name2, providerName, smokingStatus;
final double BASEPRICE = 600;

   /**
      Constructor for the policy class
      @param pN policy number
      @param a age
      @param h height
      @param w weight
      @param n1 first name
      @param n2 last name 
      @param prN provider name
      @param sS smoking Status
   */
   public Policy(int pN,int a, double h, double w, String n1, String n2, String prN, String sS)
   {
      policyNumber = pN;
      age = a;
      height = h;
      weight = w;
      name1 = n1;
      name2 = n2;
      providerName = prN;
      smokingStatus = sS;
   }
   
   /**
      no-arg constructor
   */   
   public Policy()
   {
      policyNumber = 1234;
      age = 25;
      height = 65;
      weight = 250;
      name1 = "DaMeatus";
      name2 = "Brown";
      providerName = "Allstate";
      smokingStatus = "no";
   } 
   
   /**
      getter method
      @return policy number
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      setter method
      @param pN policy number
   */
   public void setPolicyNumber(int pN)
   {
      policyNumber = pN;
   }
   
   /**
      getter method
      @return service provider
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      setter method
      @param prN provider name
   */
   public void setProvider(String prN)
   {
   
      providerName = prN;
   }
   
   /**
      getter method
      @return first name
   */
   public String getName1()
   {
      return name1;
   }
   
   /**
      setter method
      @param n1 first name
   */
   public void setName1(String n1)
   {
      name1 = n1;
   }
   
   /**
      getter method
      @return last name
   */
   public String getName2()
   {
      return name2;
   }
   
   /**
      setter method
      @param n2 last name
   */
   public void setName2(String n2)
   {
      name2 = n2;
   }
   
   /**
      getter method
      @return age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      setter method
      @param a age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
      getter method
      @return smoking status
   */
   public String getSmoke()
   {
      return smokingStatus;
   }
   
   /**
      setter method
      @param sS smoking Status
   */
   public void setSmoke(String sS)
   {
      smokingStatus = sS;
   }
   
   /**
      getter method
      @return height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      setter method
      @param h height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      getter method
      @return weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      setter method
      @param w weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
      This method will calculate the total BMI of the policy holder.
      @return BMI
   */
   public  double getBMI()
   {
      return (weight * 703)/(height * height);
   }
   
   /**
      This method will calculate the total price of the policy.
      @return policy price
   */
   public double getPrice()
   {
      double price = BASEPRICE;
      
      if (age > 50) 
         price += 75;
      if (smokingStatus.equalsIgnoreCase("smoker"))
         price += 100;
      if (getBMI() > 35)
         price += ((getBMI() - 35)*20);
      return price;
   }
   
   /**
      This method will display all information of the policy holder.
   */
   public void getInfo()
   {
      System.out.printf("\nPolicy Number: %d\nProvider Name: %s\nPolicyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status: %s\nPolicyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds\nPolicyholder's BMI: %.2f\nPolicy Price: $%.2f", policyNumber, providerName, name1,name2, age, smokingStatus, height, weight, getBMI(), getPrice());
   }   
}