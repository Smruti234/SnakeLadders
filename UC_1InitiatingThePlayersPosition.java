package SnakeLadder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Starting of Snake and Ladder Game");
		int snake = 1;
		int ladder = 2;
		int PresentStep = 0;
		int dieRoll = 0;
		while(PresentStep < 100)
		{
		dieRoll++;
		int dice = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on dice is " + dice);
		int option = (int) Math.floor(Math.random() * 3);	
		System.out.println("If you get 0 it is noPlay,1 it is snake & 2 it is snake " );
		System.out.println("You got option " + option);
		if(option == ladder)
		{
			    PresentStep += dice;
			if(PresentStep > 100)
				 PresentStep -= dice;
			System.out.println("You are on step :" + PresentStep);
		}
			else if(option == snake)
			{
				PresentStep -= dice;
				if(PresentStep < 0)
					PresentStep = 0;
				System.out.println("You are on step : " + PresentStep);				
			}
			else 
			{
				System.out.println("You are on step :" + PresentStep);
			}
	}
		System.out.println("Number of times die rolled to win the game : " + dieRoll);
}
}


