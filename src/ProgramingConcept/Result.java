package ProgramingConcept;

import org.testng.annotations.Test;

public class Result extends BasicCalculations 
{
    @Test
    public void calculationResult() 
    {
    	OtherCalculations oc = new OtherCalculations(10);
    	int data = oc.multipleCase();
    	System.out.println(data);
    	
    	System.out.println(additionCase(2));
    	System.out.println(subtractionCase(3));
    	System.out.println(oc.divisionCase());
    	
    }
	
}
