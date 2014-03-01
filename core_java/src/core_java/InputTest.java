/**
 * This program demonstrates console input.
 * @version 1.10 2004-02-10
 * @author Cay Horstmann, Ferry Wang
 */

package core_java;

import java.util.*;

public class InputTest {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.print("what is your name? ");
		String name = in.nextLine();
		
		// get second input
		System.out.print("How old are you? ");
		int age = in.nextInt();
		
		// display output on console
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
	}

}
