package BasicTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 
{
	@Parameters({"aUrl","ApiKey"})
	@Test
	public void homeLoan(String userName,String key) {
	
		System.out.println("This method for homeloan");
	    System.out.println(userName);
	    System.out.println(key);
	    
		
	}

	@Test(dataProvider = "getData")
	public void homeLoanApproved(String username,String pass) 
	{
	
		System.out.println("This method is used for homeloan approval");
		System.out.println(username);
		System.out.println(pass);
        	
	}
	
	@Test(dataProvider ="getData")
	public void homeLoanRejection(String username,String pass) 
	{
	
		System.out.println("This method is used for homeloan rejection");
		System.out.println(username);
		System.out.println(pass);
	}
	
	@Test
	public void amountCredited() {
	
		System.out.println("This method is used for amount credit to loan account");
	
	}
	@DataProvider
	 public Object[][] getData() {
		 
		 Object[][] data = new Object[3][2];
		 //creating a data set for pass candidate
		 data[0][0] = "First";
		 data[0][1] = "firstpassword";
		 //creating a data set for fail candidate
	     data[1][0] = "Second";
	     data[1][1] = "secondpassword";
	     //creating a data set for bunker
	     data[2][0] = "Third";
	     data[2][1] = "thirdpassword";
	     return data;
	 
	 
	 }
}
