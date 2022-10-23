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
				+ "3. Group Creation Script \n " + "4. Bottom navigation and drawer Check (not ready yet) \n "
				+ "5. Instant Broadcast Test \n " + "6. SANITY TEST \n " + "7. My broadcast test \n " + "8. Dummy data insertion for testing \n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		try 
		{
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
				System.out.println("Initiating group creation Test");
				Thread.sleep(200);
				try
				{
					Calculator.groupcreatetest();
				} 
				catch (Exception e)
				{
					System.out.println("Group creation test failed");
				}
			}
			if (num == 5)
			{
				System.out.println("Initiating Instant Broadcast Test");
				Thread.sleep(200);
				try 
				{
					Calculator.broadcasttest();
				} 
				catch (Exception e)
				{
					System.out.println("Instant broadcast test failed");
				}
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
				try
				{
				    Calculator.dummydatainsertion();
				}
				catch (Exception e)
				{
				    System.out.println("Dummy data insertion failed");
				}
			}
		} 
		catch (Exception e)
		{
			System.out.println("Only number please");
		}
	}
}
