package magicballapp;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

		protected final static String[] response =
			{							  "8-BALL ERROR!", 
										  "It is certain", 
										  "It is decidedly so", 
										  "Without a doubt",
										  "Yes - definitely",
										  "You may rely on it",
										  "As I see it, yes",
										  "Most likely",
										  "Outlook good",
										  "Signs point to yes",
										  "Reply hazy, try again",
										  "Ask again later",
										  "Better not tell you now",
										  "Cannot predict now",
										  "Concentrate and ask again",
										  "Don't count on it",
										  "My reply is no",
										  "My sources say no",
										  "Outlook not so good",
										  "Very doubtful" 
		};
		
		Random ran = new Random();
		public String shakeIt() {
			int choice = 1 + ran.nextInt(20);
			return response[choice];
		}
}
