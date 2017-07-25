package randomnumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberDemo {

	public static void main(String[] args) {
		int secretnumber;
		Random r = new Random();
		int guessnumber;
		Scanner scanner = new Scanner(System.in);		
		secretnumber =1+r.nextInt(10);
	    System.out.println("Please enter your guess number");
	    guessnumber =scanner.nextInt();
	    
		while(guessnumber !=secretnumber){
			if(guessnumber > secretnumber){
			System.out.println("it's too high, please enter again");
			guessnumber =scanner.nextInt();
			}
			else if(guessnumber < secretnumber){
				System.out.println("you guessed too low,please enter again");
				guessnumber =scanner.nextInt();
			
			}
			
			
		}
	System.out.println("Good Guess");
	}

}
