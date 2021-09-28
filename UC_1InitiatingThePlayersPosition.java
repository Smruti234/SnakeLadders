package SnakeLadder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Starting of Snake & Ladder Game");
		int ladder = 1;
		int snake = 2;
		int PresentStep = 0;
    	System.out.println("Starting the Game & You Are On step:" + PresentStep);
		while(PresentStep < 100)
		{
		int die = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on dice is " + die);
		int option = (int) Math.floor(Math.random() * 3);	
		System.out.println("If you get option as 0 it is noPlay,1 it is ladder,2 it is snake " );
		System.out.println("You got option" + option);
		if(option == ladder)
		{
			 PresentStep += die;
			System.out.println("You are on step:" +  PresentStep);
		}
		        if(option == snake)
			{
				 PresentStep -= die;
				if(PresentStep < 0)
					PresentStep = 0;
				System.out.println("You are on step : " + PresentStep);
				
			}
			else 
			{
				System.out.println("You are on step :" + PresentStep);
			}
		
	}
}
}


