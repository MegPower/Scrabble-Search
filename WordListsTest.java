import java.io.*;
import java.util.Scanner;

public class WordListsTest {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);		
		
		File inFile = new File("dictionary.txt");
		
		Scanner input2 = null;
		try{
			input2= new Scanner(inFile);
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			return;
		}
		
		WordLists wl = new WordLists("dictionary.txt");
		
		int response = 0;
		
		System.out.println("Let's find some scrabble words. Pick an option");
		System.out.println("The found words will be in the FoundWords.txt file");
		System.out.println("1 - Test length");
		System.out.println("2 - Test startsWith");
		System.out.println("3 - Test containsLetter");
		System.out.println("4 - Test vowelHeavy");
		System.out.println("5 - Test multiLetter");
		
		response = input.nextInt();
		
		if(response == 1){
			int n = 0;
			System.out.println("Give me a length to test");
			n = input.nextInt();
			PrintWriter output = new PrintWriter("FoundWords.txt");
			output.println(wl.lengthN(n));
			output.close();
		}
		
		if(response == 2){
			int n = 0;
			System.out.println("Let's start with a length");
			n = input.nextInt();
			System.out.println("and a letter?");
			char m = ' ';
			m = (input.next()).charAt(0);
			//wl.startsWith(n, m);
			PrintWriter output = new PrintWriter("FoundWords.txt");
			output.print(wl.startsWith(n, m));
			output.close();
		}

		if(response == 3){
			int n = 0;
			System.out.println("First, a length ");
			n = input.nextInt();
			char m = ' ';
			System.out.println("and a letter");
			m = (input.next()).charAt(0);
			//wl.containsLetter(n, m);
			PrintWriter output = new PrintWriter("FoundWords.txt");
			output.print(wl.containsLetter(n, m));
			output.close();
		}
		
		if(response == 4){
			int n = 0;
			int m = 0;
			System.out.println("Length of the word?");
			n = input.nextInt();
			System.out.println("Number of vowels?");
			m = input.nextInt();
			//wl.vowelHeavy(n, m);
			PrintWriter output = new PrintWriter("FoundWords.txt");
			output.print(wl.vowelHeavy(n, m));
			output.close();
		}
	
		if(response == 5){
			int m = 0;
			System.out.println("Number of occurances?");
			m = input.nextInt();
			char included = ' ';
			System.out.println("of which letter?");
			included = (input.next()).charAt(0);
			//wl.multiLetter(m, included);
			PrintWriter output = new PrintWriter("FoundWords.txt");
			output.print(wl.multiLetter(m, included));
			output.close();
		}
	}

}
