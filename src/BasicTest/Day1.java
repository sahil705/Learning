package BasicTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 
{
 
	@Parameters({"pUrl"})
	@Test
	public void personalLoan(String uName) 
   {
	   System.out.println("This mathod is for personel loan");
	   System.out.println(uName);
   }
   @Test(groups = {"Smoke"})
   public void carLoan() {
	   
	   System.out.println("This mathod is for car loan ");
   }
   
   @Test(groups = {"Smoke"})
   public void carLoanApproved() {
	   
   }
   @Test
   public void jobApplication() {
	   System.out.println("This method is used to execute job application");
   }
   @Test(dependsOnMethods = {"jobApplication"})
   public void jobApplicationStatus() {
	   System.out.println("This method is used to execute job application status");
   }

   @BeforeTest
   public void preRequest() {
	   
	   System.out.println("This block executes first");
   }
   @AfterTest
   public void postRequest() {
	   
	   System.out.println("This block executes last ");
   }
}
