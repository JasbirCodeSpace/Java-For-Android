package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    // Reference to the Activity output.
    protected ActivityInterface mOut;

    //Constructor initializes the field.
    public Logic(ActivityInterface out){
        mOut = out;
    }

    //Perform the @a operation on @a argumentOne and @a argumentTwo.
    public void process(int argumentOne,int argumentTwo,int operation){
        // depending on the operation values the corresponding class object 
        //is created and result is returned by toString() method
        switch (operation) {

            case ADDITION : Add obj = new Add(argumentOne,argumentTwo);
                            mOut.print(obj.toString());
                            break;

            case SUBTRACTION :  Subtract obj = new Subtract(argumentOne,argumentTwo);
                                mOut.print(obj.toString()); 
                                break;

            case MULTIPLICATION :   Multiply obj = new Multiply(argumentOne,argumentTwo);
                                    mOut.print(obj.toString()); 
                                    break;

            case DIVISION : // if the second argument is 0 then return error message
                            if(argumentTwo==0){ 
                                mOut.print('Error: Division By Zero');
                                return;
                            } 

                            Divide obj = new Divide(argumentOne,argumentTwo);
                            mOut.print(obj.toString());
                            break;

        }
    }
}
