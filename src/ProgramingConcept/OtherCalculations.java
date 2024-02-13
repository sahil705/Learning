package ProgramingConcept;

public class OtherCalculations extends NewCalculations
{
	int b;
    public OtherCalculations(int i) {
		super (i);
    	this.b =i;
	}
	public int multipleCase() {
    	
    	b=b*5;
    	return b;
    }

}
