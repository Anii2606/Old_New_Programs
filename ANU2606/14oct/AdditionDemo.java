/*
Program: To understand various data types in java
@author: Anikesh Chouhan
@Data: 17 October,2022
*/

//declaring a class
class AdditionDemo 
{
	
	public static void main(String args[])
	{
		//
		//coverting or parsing string to integer//
		//int number1= Integer.parseInt(args[0]);
		//int number2= Integer.parseInt(args[1]);
		
		// parsing String to Float 
		float number1= Float.parseFloat(args[0]);
		float number2= Float.parseFloat(args[1]);
		
		//calculating the sum//
		float sum = number1+ number2;
        System.out.println("the sum is:" +sum); // printing the value of sum
	}
	// end of  main
}