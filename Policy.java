public class Policy
{

int policyNumber, age;
double height, weight;
String name1, name2, providerName, smokingStatus;
final double BASEPRICE = 600;


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
   
//accessor/mutator methods
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setPolicyNumber(int pN)
   {
      policyNumber = pN;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public void setProvider(String prN)
   {
   
      providerName = prN;
   }
   
   public String getName1()
   {
      return name1;
   }
   
   public void setName1(String n1)
   {
      name1 = n1;
   }
   
   public String getName2()
   {
      return name2;
   }
   
   public void setName2(String n2)
   {
      name2 = n2;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public String getSmoke()
   {
      return smokingStatus;
   }
   
   public void setSmoke(String sS)
   {
      smokingStatus = sS;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }
   
   //This method will calculate the total BMI of the policy holder.
   public  double getBMI()
   {
      return (weight * 703)/(height * height);
   }
   
   //This method will calculate the total price of the policy.
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
   
   //This method will display all information of the policy holder.
   public void getInfo()
   {
      System.out.printf("\nPolicy Number: %d\nProvider Name: %s\nPolicyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status: %s\nPolicyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds\nPolicyholder's BMI: %.2f\nPolicy Price: $%.2f", policyNumber, providerName, name1,name2, age, smokingStatus, height, weight, getBMI(), getPrice());
   }   
}