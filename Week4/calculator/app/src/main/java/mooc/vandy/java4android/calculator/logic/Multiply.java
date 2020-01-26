package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    
    private int argument1 =0;
    private int argument2 = 0;

    // constructor to initialize instance variables
    public Multiply(int argument1,int argument2){
    	this.argument1 = argument1;
    	this.argument2 = argument2;
    }

    // overridden toString() method to return Multiplication result
    @Override
    public String toString(){
    	int result = this.argument1 * this.argument2;
    	return String.valueOf(result);
    }
}
