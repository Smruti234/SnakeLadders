package SnakeLadder;

public class SnakeLadderuc5 {
	public static void main(String[] args) {
		System.out.println("Start Snake and Ladder Game");
		int snake = 1;
		int ladder = 2;
		int  PresentStep = 0;
		while ( PresentStep < 100)
		{
		int die = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on die  " + die);
		int option = (int) Math.floor(Math.random() * 3);	
		System.out.println("If you get 0 it is noPlay & 2 it is ladder & 1 it is snake " );
		System.out.println("You got " + option);
		if(option == ladder)
		{
			  PresentStep += die;
			if(PresentStep > 100)
				PresentStep -= die;
			System.out.println("You are on :" + PresentStep);
		}
			else if(option == snake)
			{
				  PresentStep -= die;
				if( PresentStep < 0)
					 PresentStep = 0;
				System.out.println("You are on : " + PresentStep);			
			}
			else 
			{
				System.out.println("You are on :" + PresentStep);
			}
		
	}
}

}



