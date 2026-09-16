/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date:Friday Sept 18
 * Project Name: MadLibs
 * 
 * Project Description
 * You will read in multiple entries from the user and store the results in variables
 * You will then insert those variables into the following story to create a MadLib style result
 * 
 * A recent survey informs us that one out of every PLURALNOUN1 owns a/an ADJECTIVE1 phone. 
 * Fortunately, VERB_ING_1 over a mobile NOUN1 in recent years has improved ADVERB1. 
 * Today, BODY_PART1-held PLURALNOUN2 are all the rage. 
 * In restaurants, you find many PLURALNOUN3 talking ADVERB2 into their ADJECTIVE2 phones as they eat their NOUN2. 
 * NUMBER1 percent of American PLURALNOUN4 place their NOUN3 calls from their cars as they are VERB_ING_2 to and from their home, office, or NOUN4. 
 * Walking and talking are now the “in” NOUN5 to do. 
 * Over NUMBER2 percent of Americans walk our ADJECTIVE3 streets with a handheld PLURALNOUN5 pressed against their BODYPART2.
 * 
 * Ask for the capitalized words in the input. Print out the full story in the output.
 * See https://www.thewordfinder.com/wordlibs/story/41/ for an example.
 ********************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// YOUR CODE GOES HERE!!!!
		System.out.println("Give me a whole number:  ");
		int number1 = in.nextInt();
		in.nextLine();
		
		System.out.println("Give me a plural noun:   ");
		String pluralNoun = in.nextLine();
		System.out.println("Give me an adjective:  ");
		String adjective= in.nextLine();
		System.out.println("Give me a verb:  ");
		String verb = in.nextLine();
		System.out.println("Give me a noun");
		String noun = in.nextLine();		
		System.out.println("Give me an adjective");
		String adjective2 = in.nextLine();
		
		System.out.println("A recent sruvey informs us that one of every " + pluralNoun + " owns a " + adjective + " phone. ");
		System.out.println("Fortunately, " + verb + "has improved in recent years.");
		System.out.println("Today, " + noun+ " are all the  rage.");
		System.out.println("In response, you find many " + pluralNoun + " taking " + adjective + " into their phones." );
		System.out.println("Walking and talking are now the method " + noun + "to do");
		System.out.println("Over " + number1 + " percent of Americans walk our " + adjective + " streets. ");
		
		
		
		
		
		
		
		
		in.close();//Don't forget to clean up after yourselves!
	}

}
