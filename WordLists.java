import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class WordLists {
	
	String fileName;

	public WordLists(String fileName) throws FileNotFoundException
	{
		this.fileName = fileName;
	}
	
	public ArrayList<String> lengthN(int n) throws FileNotFoundException
	{
		ArrayList<String> foundWords = new ArrayList<String>();
		File inFile = new File("dictionary.txt");
		Scanner input = new Scanner(inFile);
		String word;
		while(input.hasNext())
		{
			word = input.next();
				if(word.length() == n)
					foundWords.add(word);
		}
			//System.out.println(foundWords);
			return foundWords;	
		}

	public ArrayList<String> startsWith(int n, char firstLetter) throws FileNotFoundException
	{
		ArrayList<String> foundWords = new ArrayList<String>();
		File inFile = new File("dictionary.txt");
		Scanner input = new Scanner(inFile);
		String word;
		while(input.hasNext())
		{
			word = input.next();
				if(word.charAt(0) == firstLetter)
					if(word.length() == n)
						foundWords.add(word);
		}
			//System.out.println(foundWords);
			return foundWords;	
		}

	public ArrayList<String> containsLetter(int n, char included) throws FileNotFoundException
	{
		ArrayList<String> foundWords = new ArrayList<String>();
		File inFile = new File("dictionary.txt");
		Scanner input = new Scanner(inFile);
		String word;
		while(input.hasNext())
		{
			word = input.next();
				if(word.length() == n)
				if(word.charAt(0) != included)
				for(int i = 1; i < n; i++)
				{
					if(word.charAt(i) == included)
						foundWords.add(word); 
				}
		}					
			return foundWords;	

	}
	
	
	public ArrayList<String> vowelHeavy(int n, int m) throws FileNotFoundException
	{
		ArrayList<String> foundWords = new ArrayList<String>();
		File inFile = new File("dictionary.txt");
		Scanner input = new Scanner(inFile);
		String word;
		int vowels;
		String test;
		while(input.hasNext())
		{
			word = input.next();
			vowels = 0;
			for(int i = 0; i < word.length(); i++)
			{
				test = word.substring(i, i + 1);
				if(test.equals("a") || test.equals("e") || test.equals("i") || test.equals("o") || test.equals("u"))
					vowels++;
			}
			if((vowels >= m) && (word.length() == n))
					foundWords.add(word);
		}
			return foundWords;	}

	public ArrayList<String> multiLetter(int m, char included) throws FileNotFoundException
	{
		ArrayList<String> foundWords = new ArrayList<String>();
		File inFile = new File("dictionary.txt");
		Scanner input = new Scanner(inFile);
		String word;
		int incldOccurs;
		while(input.hasNext())
		{
			word = input.next();
			incldOccurs = 0;
			for(int i = 0; i < word.length(); i++){
				if(word.charAt(i) == included)
					incldOccurs++;
			//		System.out.println(incldOccurs);
			}
			if(incldOccurs >= m)
				foundWords.add(word);
		} 
			//System.out.println(foundWords);
			return foundWords;	
		}
}
