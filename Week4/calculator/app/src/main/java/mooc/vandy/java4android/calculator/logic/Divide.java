package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    
    private int argument1 = 0;
    private int argument2 = 0;

    // constructor to initialize instance variables
    public Divide(int argument1,int argument2){
    	this.argument1 = argument1;
    	this.argument2 = argumrnt2;
    } 

	// overridden toString() method to return division result
	@Override
    public String toString(){
    	int quotient = this.argument1 / this.argument2;
    	int remainder = this.argument1 % this.argument2;

    	return String.valueOf(quotient)+" R:"+String.valueOf(remainder);
    }
}
