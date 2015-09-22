/*

Anish Muthali

Sept 21, 2015

Project 07 - Seasons

With this statement, I acknowledge that this work is my own and I have not shared it with anyone.

*/

import java.util.Scanner;


public class Project07Seasons{



	public static void main(String[] args) {

		//Asks the user for input
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Please enter the month: ");
		
		int month = in.nextInt();
		
		
		System.out.println("Please enter the day: ");
		
		int day = in.nextInt();
		
		
		//Checks the season based on what user said
		
		String season = null;
		
		if(month == 1 || month == 2 || month == 3){
			
			season = "Winter";
		
		}
		
		else if(month == 4 || month == 5 || month == 6){
			
			season = "Spring";
		
		}
		
		else if(month == 7 || month == 8 || month == 9){
			
			season = "Summer";
		
		}
		
		else if(month == 10 || month == 11 || month == 12){
			
			season = "Fall";
		}
		
		
		Boolean tf;
		
		if (month%3 == 0 && day >= 21){

			tf = true;
		
		}
		
		else {
			
		tf = false;
		
		}
		
		String season2 = season;
		
		
		if(season2.equals("Winter") && tf){
			
			System.out.println("Spring");
		
		}
		
		else if(season2.equals("Spring")&&tf){
			System.out.println("Summer");
		
		}
		
		else if(season2.equals("Summer")&&tf){
			
			System.out.println("Fall");

		}

		else if(season2.equals("Fall")&&tf){

			System.out.println("Winter");

		}

		else{

			System.out.println(season2);

		}
		System.out.println("Hello world");

	
	}


}
