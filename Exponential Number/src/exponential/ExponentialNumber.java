package exponential;

import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) 
	{

	Scanner input = new Scanner(System.in);
	System.out.println("Enter an interger base number: ");
	int base = input.nextInt();
	System.out.println("Enter exponent: ");
	int expo = input.nextInt();
	
	
	for(int i =0; i <=expo; i ++)
	{
		System.out.println(base + " to the power " + i + " is : " + Pow(base,i));
	}
	
	input.close();
	}
	
	public static int Pow(int num, int power)
	{
		return (int) Math.pow(num, power);
	}
	
	

}
