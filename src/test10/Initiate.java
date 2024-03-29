package test10;

import java.util.*;
import java.net.MalformedURLException;

public class Initiate 
{
	protected static String groupbr;
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

		System.out.println("Welcome to SSF Test Automation Lab");
		Thread.sleep(500);
		System.out.println("What Type of testing you want to do? \n " + "1. Login Script \n " + "2. Chat Script \n "
				+ "3. Group Creation and complete group test Script \n " + "4. Bottom navigation and drawer Check \n "
				+ "5. Instant Broadcast Test \n " + "6. SANITY TEST \n " + "7. My broadcast test \n " + "8. Dummy data insertion for testing \n" 
				+ " 9. Password Change test \n" + " 10. Dummy data insertion for vvip from agent app \n" + "11. Chat Script for vvip \n" + "12. Dummy data insertion for vvip from vvip app \n" + "13. Chat Script for vvip from vvip app");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		//try 
		//{
			int num = scanner.nextInt();
			if (num == 1) 
			{
				System.out.println("Initiating login Test");
				Thread.sleep(200);
				try 
				{
					Calculator.logintest();
				} 
				catch (Exception e)
				{
					System.out.println("Login Test failed");
				}
			}
			if (num == 2) 
			{
				try 
				{
					Calculator.chattest();
				} 
				catch (Exception e)
				{
					System.out.println("Chat test failed");
				}			
			}	
			if (num == 3)
			{
				System.out.println("Initiating complete group Test");
				Thread.sleep(200);
				try
				{
					Calculator.groupcreatetest();
				} 
				catch (Exception e)
				{
					System.out.println("Complete group test failed");
				}
			}
			if (num == 4) 
			{
				try 
				{
					Calculator.navtest();
				} 
				catch (Exception e)
				{
					System.out.println("Bottom navigation and drawer Check failed");
				}			
			}
			if (num == 5)
			{
				System.out.println("Initiating Instant Broadcast Test");
				Thread.sleep(200);
				//try 
				//{
					Calculator.broadcasttest();
				//} 
				//catch (Exception e)
				//{
					System.out.println("Instant broadcast test failed");
				//}
			}
			if (num == 6) 
			{
				System.out.println("Initiating Sanity Test");
				Thread.sleep(200);
				try
				{
				    Calculator.sanitytest();
				}
				catch (Exception e)
				{
				    System.out.println("Sanity test failed");
				}
			}
			if (num == 7) 
			{
				
				System.out.println("Initiating  My broadcast test");
				Thread.sleep(200);
				System.out.println("Mention the agent number who will be triggered by my broadcast alert (Without '@')");
				scanner.nextLine();
				groupbr ="@"+scanner.nextLine();
				scanner.close();
				System.out.println("Working . ..");
				try
				{
				    Calculator.mybroadcasttest();
				}
				catch (Exception e)
				{
				    System.out.println("My broadcast test failed");
				}
			}
			if (num == 8) 
			{
				System.out.println("Initiating  Dummy data insertion");
				Thread.sleep(200);
				//try
				//{
				    Calculator.dummydatainsertion();
				//}
				//catch (Exception e)
				//{
				    System.out.println("Dummy data insertion failed");
				//}
			}
			if (num == 9) 
			{
				System.out.println("Initiating Password change test");
				Thread.sleep(200);
				try
				{
				    Calculator.passchange();
				}
				catch (Exception e)
				{
				    System.out.println("Password change test failed");
				}
			}
			if (num == 10) 
			{
				System.out.println("Initiating  Dummy data insertion for vvip");
				Thread.sleep(200);
				Calculator.dummydatainsertionvvip();
				//try
				//{
				//}
				//catch (Exception e)
				//{
				    
				//}
			}
			if (num == 11) 
			{
				    System.out.println("Initiating vvip chat test");
					Calculator.chattestvvip();	
			}	
			if (num == 12) 
			{
				    System.out.println("Initiating  Dummy data insertion for vvip from vvip app");
					Calculator.dummydatainsertionvvipfromvvip();	
			}	
			if (num == 13) 
			{
				    System.out.println("Initiating vvip chat test from vvip app");
					Calculator.chattestvvipfromvvip();	
			}	
		//} 
		//catch (Exception e)
		//{
		//}
			
		if (num>11 | num<0)
		{
			System.out.println("Enter number according to the menu");
			System.out.println("\n");
			Thread.sleep(650);
			main(null);
		}
	}
}