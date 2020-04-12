package Method;

import java.awt.SystemTray;
import java.util.Scanner;

public class MyMethod {
	public static void main (String [] ars) {
		Mymethod(3,"ABS",3.7);
		System.out.println(devid(6));
		Scanner cScanner = new Scanner(System.in);
		System.out.print("Enter the number for multipl: ");
		abs(cScanner.nextInt());
		
		
	}
	

public static void Mymethod(int x,String s,double d) {
	System.out.println("Enter the number " + x);
}
     static boolean devid (int a ) {
    	 return (a%2==0);
     }
     static void abs (int i) {
    	 i = (i*i*i);
    	 System.out.println( i);
    	
     }
}
