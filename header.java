/* package whatever; // don't place package name! */
 
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
 
/* Name of the class has to be "Main" only if the class is public. */
public class header
{
	public static void main (String[] args)
	{
		System.out.println("Please enter the project name");
		Scanner in = new Scanner(System.in);
		String project = in.next();
                String number = in.next();
                String title = in.next();
		System.out.print("/* \n\n");
		System.out.print("\tAnish Muthali \n\n");
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	   	//get current date time with Date()
	        Date date = new Date();
	   	System.out.print("\t" + dateFormat.format(date) + "\n\n");
	   	System.out.print("\t" + project + " " + number + " " + title + "\n\n");
		System.out.print("\tWith this statement, I acknowledge that this work is my own and I have not shared it with anyone. \n\n");
		System.out.print("*/");
 
	}
}
