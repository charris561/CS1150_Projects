package homework;

/*
 * By: Caleb Harris
 * CS 1150 - 001 (m/w)
 * Due: March 17, 2021
 * Assignment #7
 * Problem Statement: Create a program that calculates the area of a circle, pentagon, and a hexagon.
 * 
 * ****Psuedocode****
 * 	Main:
Import scanner
Print greeting message
Boolean computing = continueComputing (userInput)
While computing == true
	{
	Print options for shape
	Int shape = getShape (Scanner userInput)
	While shape != 1, 2, or 3
		{
		Prompt user for valid input
		}
	Switch shape
		{
		Case 1
			{
			Double Area = circleArea (double radius)
			While Area < 0
				{
				Ask for valid area
				}
			Print area for circle
			}
		Case 2
			{
			Double Area = pentagonArea (double length)
			While Area < 0
				{
				Ask for valid area
				}
			Print area for pentagon
			}
		Case 3
			{
			Double Area = hexagonArea (double side)
			While Area < 0
				{
				Ask for valid area
				}
			Print area for pentagon
			}
		}
	Prompt user if they would like to computer another area
	Computing = continueComputing (userInput)
	}
If computing != true
	{
	Print exit message
	}

getShape:
Shape = userInput.nextInt()
While shape != 1, 2, or 3
	{
	Prompt user for valid input
	}
Return shape

continueComputing:
Computing = userInput.next()
While computing != 't' or 'f' or 'T' or 'F'
	{
	Ask user for valid input
	}
If computing == 't' or 'T'
	{
	Return true
	}
If computing == 'f' or 'F'
	{
	Return false
}
 * 
 */

import java.util.Scanner;

public class HarrisCalebAssignment7 
{
	//set constants for shapes
	final static int CIRCLE = 1;
	final static int PENTAGON = 2;
	final static int HEXAGON = 3;

	public static void main(String[] args) 
	{	
		//create scanner object
		Scanner input = new Scanner (System.in);
		
		//greeting message
		System.out.println("****************************************");
		System.out.println("CS1150 Area Calculator");
		
		//asks user if they would like to compute the area of a shape
		boolean computing = continueComputing(input);
		
		//prompts user for what shape they want to computer the area of
		while (computing == true)
		{
		
			//getShape
			int shape = getShape(input);
			
			//switch to compute and display the area of the selected shape
			switch (shape)
			{
				case 1:
					{
						//calls circleArea method and assigns return value to variable in main
						double circleArea = circleArea(input);
						
						//prints area to 2 decimal places
						System.out.println("\n****************************************");
						System.out.print("The area of the circle is: ");
						System.out.printf("%.2f%n", circleArea);
						break;
					}
				case 2:
					{
						//calls pentagonArea method and assigns return value to variable in main
						double pentagonArea = pentagonArea(input);
						
						//prints area to 2 decimal places
						System.out.println("\n****************************************");
						System.out.print("The area of the pentagon is: ");
						System.out.printf("%.2f%n", pentagonArea);
						break;
					}
				case 3:
					{
						//calls hexagonArea method and assigns return value to variable in main
						double hexagonArea = hexagonArea(input);
						
						//prints area to 2 decimal places
						System.out.println("\n****************************************");
						System.out.print("The area of the hexagon is: ");
						System.out.printf("%.2f%n", hexagonArea);
						break;
					}
			} //end switch
			
			computing = continueComputing(input);
		}
		
		//ending message
		if (computing == false)
		{
			System.out.println("\n****************************************");
			System.out.println("Program ended, have a great day!");
			System.out.println("****************************************\n");
		}
		

	} //end main
	
	
	//***************************************************************************************************************************
	//methods
	//***************************************************************************************************************************
	
	
	//method continueComputing asks the user if they want to calculate another area and checks for invalid input
	//returns boolean
	public static boolean continueComputing (Scanner input)
	{		
		boolean userInputBoolean = true;
		
		System.out.println("****************************************\n");
		System.out.println("Compute area? (y/n)");
		char userChoice = input.next().charAt(0);
		
		//checks for valid user input
		while (userChoice != 'y' && userChoice != 'Y' && userChoice != 'n' && userChoice != 'N')
		{
			System.out.println("Please enter a valid input (y/n)");
			userChoice = input.next().charAt(0);
		}
		
		if (userChoice == 'y' || userChoice == 'Y')
		{
			userInputBoolean = true;
		}
		
		if (userChoice == 'n' || userChoice == 'N')
		{
			userInputBoolean = false;
		}
		
		return userInputBoolean;
	} // end continueComputing
	
	
	
	//method getShape gets the user input for shape
	//returns int
	public static int getShape (Scanner input)
	{	
		//print shape options
		System.out.println("\nOption	| Shape");
		System.out.println("----------------");
		System.out.println("1	| Circle");
		System.out.println("2	| Pentagon");
		System.out.println("3	| Hexagon\n\n");
		System.out.print("Please enter the shape you would like to compute the area of 1, 2, or 3: ");
		
		int shapeChoice = input.nextInt();

		while (shapeChoice != CIRCLE && shapeChoice != PENTAGON && shapeChoice != HEXAGON)
		{
			System.out.println("Please enter a valid input (1,2, or 3)");
			shapeChoice = input.nextInt();
		}
		
		return shapeChoice;
	} //end getShape
	
	
	
	//method circleArea computes the area of a circle given the radius
	//returns a double
	public static double circleArea (Scanner input)
	{
		//prompt user for radius
		System.out.print("You have selected a circle, please enter the radius of the circle: ");
		double radius = input.nextDouble();
		
		//calculates the area of a circle
		double circleArea = Math.PI * Math.pow(radius, 2);
		
		return circleArea;
	} //end circleArea
	
	
	
	//method pentagonArea computes the area of a pentagon given length
	//returns a double
	public static double pentagonArea (Scanner input)
	{
		//prompt user for length
		System.out.print("You have selected a pentagon, please enter the length from the center to a vertex: ");
		double length = input.nextDouble();
		
		//calculates the area of a pentagon
		double side = 2.0 * length * Math.sin(Math.PI / 5.0);
		double pentagonArea = (5.0 * Math.pow(side, 2) / (4.0 * Math.tan(Math.PI / 5.0)));
		
		return pentagonArea;
	} //end pentagonArea
	
	
	
	//method hexagonArea computes the area of a hexagon given a side value
	//returns a double
	public static double hexagonArea (Scanner input)
	{
		//prompt user for side length
		System.out.print("You have selected a hexagon, please enter the length of a side: ");
		double side = input.nextDouble();
		
		//calculates the area of a hexagon
		double hexagonArea = 6.0 * Math.pow(side, 2) / (4.0 * Math.tan(Math.PI / 6.0));
		
		return hexagonArea;
	}//end hexagonArea


} // end class HarrisCalebAssignment7