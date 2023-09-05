package TWSIP;

import java.util.Scanner;
//Number Guessing Game
class Task1 
{
	public static void main(String[] args)
	{
		
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Welcome to the Guess Number Game.");
		   System.out.println("You will be asked To Guess A Number To Win The Game.");
		   System.out.println("You have Maximun 5 Attempt Limit.");
	       int gn = (int)(Math.random() * 100) + 1; 
	       int count=5; 

	     while(count>0)
	      {
	    	 System.out.println("Enter the Number between 1 to 100.");
	    	 int num=sc.nextInt();
	    	 if(num>gn)
	    	 {
	    		 System.out.println("Your Guess Number is Greater.");
	    	 }
	    	 else if(num<gn) 
	    	 {
	    		 System.out.println("Your Guess Number is Smaller.");
	    	 }
	    	 else
	    	 {
	    		 System.err.println("OOhOO!, Your Number is Correct.You Win the Game!");
	    		 break;
	    	 }
	    	 count--;
	      }
	     
	     if(count==0)
	     {
	    	 System.err.println("Your trial is over.You Lost the Game!");
	     }
	    
	 }

}

