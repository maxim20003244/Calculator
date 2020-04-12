package Method;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args) {
		int num1 = getInt();
		int num2 = getInt();
		char operation = getOperation();
		int result = calc(num1, num2, operation);
		System.out.println("Result of operation: "+result);
		
	}
	public static int getInt() {
		System.out.print("Enter the number: ");
		
	int	a=0 ;
		if(sc.hasNextInt()) {
			a = sc.nextInt();
		} else {
			System.out.println("You made a mistake when enter the number.Please try again.");
			sc.next();
			a =getInt();
		}
		return a;
		
	}
	public static char getOperation() {
		System.out.print("Enter the operation:");
		char operation;
		if(sc.hasNext()) {
			operation = sc.next().charAt(0);
		
		}else {
			System.out.println("You made a mistake when enter the number.Please try again.");
	    sc.next();
	    operation =getOperation();
		
		}
		return operation;
	}
	public static int calc(int num1,int num2,char operation) {
		int result;
		if (operation=='+') {
			
			result= num1+num2;
		}else if (operation=='-') {
			
			result= num1-num2;
		}else if(operation=='*') {
			
			result = num1*num2;  
		}else if(operation=='/') {
			
			result = num1/num2; 
		}else {
			System.out.println("Operation not recognized.Please try enter");
			result = calc(num1, num2, operation);
		}
		return result;
		
		
	}

}




