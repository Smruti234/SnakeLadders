package SnakeLadder;

public class SnakeLadder {
	public static void main(String[] args) {
		
		int die = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on dice " + die);
		int option = (int) Math.floor(Math.random() * 3);
		int ladder = 1;
		int snake = 2 ;
		int PresentStep = 0;
		System.out.println("Present You are on Step:" + PresentStep);
		System.out.println("If you get option as 0 it is noPlay,1 its ladder,2 its snake " );
		System.out.println("You got option" + option);
		if(option == ladder)
		{
			PresentStep += die;
			System.out.println("You are on :" + PresentStep);
		}
		 if(option == snake)
			{
				PresentStep = die;
				System.out.println("You are on : " + PresentStep);
			}
			else 
			{
				System.out.println("You are on :" + PresentStep);
			}
		
	}
}
