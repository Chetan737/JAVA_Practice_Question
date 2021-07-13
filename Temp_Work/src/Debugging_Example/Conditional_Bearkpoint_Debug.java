package Debugging_Example;

import java.util.ArrayList;

public class Conditional_Bearkpoint_Debug {

	public void process(String model)
	{
		System.out.println("Processing a: "+ model);
		
		//do stuff with the model
		System.out.println("Doing stuff with: "+ model); //So in this case we have to give a breakpoint on line 12 
		System.out.println("Finished processing:  "+ model);
	
	}

	public static void main(String[] args) {
		
		Conditional_Bearkpoint_Debug obj= new Conditional_Bearkpoint_Debug();
		obj.process("CAR");
		obj.process("House");
		obj.process("Boat");
	}

}
/*
 *Once we have to assign a conditional breakpoint if the condition is satisfy then program will stop working
 * So to do this 
 * 1> Double click on the line 12 and make a breakpoint
 * 2> right click on that and choose breakpoint properties
 * 3> After that choose a condition and edit the condition over there like 
 * 4> model.equals("House")
 * if the condition satisfy by the compiler then program is going to be stoped 
 * 5> if you run the other code go to the title bar and choose RUN toolbar and choose resume option so the compiler
 *  continue the process.
 */

