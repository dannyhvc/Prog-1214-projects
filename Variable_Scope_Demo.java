package Operator_And_Arethmatic;

/**
 *Program Name: Vaiable_Scope_Demo.java 
 *Purpose: Shows how the "curly braces" or the scope delimiter operator
 *				 affects the visiblility of a variable with your program.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 20, 2018 | 2:39:15 PM
 */

public class Variable_Scope_Demo {

	public static void main(String[] args) {
		//create 3 different areas of scope... outer , middle, and inner using the
		//curly braces
		
		//outer scope area
		{
			System.out.println("just insde outer scope opening brace{outter}.");
			int outterInt = 1;
			System.out.println("Current value of outter int is " + outterInt);
			
			//middle scope area
			{
				System.out.println("\njust inside middle scope opening brace{middle}.");
				int middleInt = 2;
				System.out.println("Current value of outter int is " + middleInt);
				
				//can we see out to the outer scope area
				System.out.println("from middle, value of outterInt is " + outterInt);
				
				//inner scope
				{
					System.out.println("\njust inside inner scope opening brace{inner}.");
					int innerInt = 3;
					System.out.println("Current value of outter int is " + innerInt);
					
					//can we see out to the middle scope area
					System.out.println("from middle, value of middleInt is " + middleInt);
					
					//can we see out to the outter scope area
					System.out.println("from inner, value of outterInt is " + outterInt);
					
				}//end of inner scope area*	
				
//				line below will cause compile error, message will be that innerInt cannot
//				resolved to a variable, this is because the variable innerInt
//				was not declared inside the INNER SCOPE area. We are now past tha and the
//				phrase we use is "The variable has gone out of scope".
//				uncomment the line below to see the compile error.
				
				//System.out.println("from middle, value of innerInt is " + innerInt);
				
				
			}//end of middle scope area*				
		}//end outer scope area*		

	}//end main scope area
}//end class scope area




