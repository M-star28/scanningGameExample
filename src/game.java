import java.util.Random;
import java.util.Scanner;


public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner  = new Scanner (System.in);
		
		System.out.println("Can I have your name ");
		
		String name = scanner.next();
		
		if (name == " "){
			System.out.print(" Can I have your name please");
		
				name = scanner.next();
			}
		
			
		
		System.out.print(" Welcome  " + name + " Good afternoon ");
		
		System.out.print(" Shall we begin ?");

		String shouldStart = scanner.next();
		
		while (!shouldStart.equals("yes") ) {
			
		/* shall we start will repeat unless the user says yes */
			
			System.out.print("shall we begin");
		 
			shouldStart= scanner.next();
		}
		
		
		int x = new Random().nextInt(20)+1;
		
		boolean win =false;
		
		int timesTried = 0;
		
		boolean shouldQuit= false;
		
		while (shouldQuit!= true ) {
			
			if (timesTried >= 5 ) {
				
				shouldQuit = true;
				
			}else {
				timesTried++;
				
				System.out.print(" please guess a number ");
				
				int userInput= scanner.nextInt();
				
			if (userInput == x) {
				shouldQuit = true;
				win= true;
				
				
			}else if ( userInput > x) {
				System.out.print(" Guess a lower number ");
				
			}else {
				System.out.print("Guess higher number ");
				
			}
			
			}
		}
		
		
					
			
		
	
	if (win) {
		
		System.out.print(" Congrats you have won the game " +   timesTried   + "try");
	} else {
		System.out.print( " Game Over ");
	}
	System.out.print( "  x was :  "+ x );
	}				
	
}			
			
			
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	


