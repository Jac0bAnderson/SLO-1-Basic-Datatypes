package sLO.Controller;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class SLOController 
{
private double sum;
private int newUser;
	public SLOController()
	{
		int Whole = 2;
		double Dot = 3.2;
		String userName ="default";
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an integer");
	      Whole = in.nextInt();
	      System.out.println("Enter a double");
	      Dot = in.nextDouble();
	      double sum = Whole - Dot;
	      
	      if (sum == 0)
	      {
	    	  System.out.println("they are equal");
	      }
	      else
	      {
	    	  System.out.println("they are not equal");
	    	  
	      }
	      
	      System.out.println("Enter a Username With at least 8 Characters.");
	     userName = in.next();
	     newUser = userName.length();
	     
	     if (newUser >= 8)
	     {
	    	 System.out.println("The Username " +userName+  " is good");
	     }
	     else
	     {
	    	 System.out.println("try this username: " + userName + "12347892347");
	     }
	     
	     
	     
	      
}
	
	
	public void start() 
	{
		
		
	}

}
