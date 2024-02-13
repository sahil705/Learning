package BasicTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 
{
	@Test
	public void goldLoanRequest() {
		
		System.out.println("This method is for gold loan");
	}

	@Test(groups = {"Smoke"})
	public void goldLoanApproved(){
		
		System.out.println("This method is used for gold loan approval  ");
	}
	@Test
	public void goldLoanRejected(){
		
		System.out.println("This method is used for gold loan rejection ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This method executes first before execution of every methods in this class");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("This method executes last after execution of every methods in this class ");
	}
	
}

