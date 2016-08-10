/*
 *8) 	Write a program that will analyze a paragraph for the user. 
 * It should allow the user to type in a paragraph (or multiple sentences) 
 *and then give the following options  (put in everything in a big loop 
 *so the user can pick multiple options before they quit):

1.	Display the paragraph
2.	Display the number of words.
3.	Display the total number of characters (including letters, numbers,
 and symbols, but not spaces).
4.	Display the words in order alphabetically.
5.	Display the longest and shortest words.
6.	Display the number of sentences.
7.	Replace a word with a different word.
8.	Replace a character with a different character throughout the sentence. 
9.	Display a certain word (the fifth word, for example).
10.	  ????  (come up with one more option on your own)
11.	  Profit

Suggestions:  Creating methods for the different options will help 
with the organization of the program.  Instead of dealing with the 
entire String, you may want to break it up into words and save them 
as an array of Strings.  You can assume that periods are only used to end sentences.
*/
import javax.swing.JOptionPane;
public class Unit1Ex8CS2 {
	public static void main (String [] args) {
		String a = JOptionPane.showInputDialog("Input paragraph.");
		int LoopUntilTheEndOfTime = 0;
		while (LoopUntilTheEndOfTime == 0) {
			String What = JOptionPane.showInputDialog("What do you want to do?" + "\n" + "1) Display the paragraph." + "\n" + "2) Display the number of words." + "\n" + "3) Display the total number of letters." + "\n" + "4) Display the words in order alphabetically." + "\n" + "5) Display the longest and shortest words." + "\n" + "6) Display the number of sentences." + "\n" + "7) Replace a word with a different word." + "\n" + "8) Replace a character with a different character throughout the sentence. " + "\n" + "9) Display the third word." + "\n" + "10) Display vowels." + "\n" + "11) Exit.");
		
			int W = Integer.parseInt(What);
			if (W == 1) {
/**/			PrintFull(a);
			} else if (W == 2) {
/**/				PrintNumWords(a);
			} else if (W == 3) {
/**/				PrintNumChars(a);
			} else if (W == 4) {
				PrintABC(a);
			} else if (W == 5) {
/**/				PrintLength(a);
			} else if (W == 6) {
/**/				PrintNumSentence(a);
			} else if (W == 7) {
/**/				PrintReplaceWord(a);
			} else if (W == 8) {
/**/				PrintReplaceChar(a);
			} else if (W == 9) {
/**/				PrintDisplay(a);
			} else if (W == 10) {
/**/				PrintNumVowels(a);
			} else if (W == 11) {
/**/				System.exit(0);
			}
		
		}
	}
	public static void PrintFull(String a) {
		System.out.println("Full Paragraph:" + "\n" + a);
	}
	public static void PrintNumWords(String a) {
		String array[] = a.split(" ");
		System.out.println("Number of Words:" + "\n" + array.length);
	} 
	public static void PrintNumChars(String a) {
		String array[] = a.split(" ");
		int i = 0;
		for (int y = 0; y<=array.length;y++) {
			i+=array[y].length();
		}
		System.out.println("Number of characters: " + i);
	}
	public static void PrintABC(String a) {
		String array[] = a.split(" ");
		int x = 0;
		int c,b;	    
		String temp;		
		int sort = array.length - 1;		
		for (c = 0; c < sort; ++c)	{	
			for (b = 0; b < sort; ++b)	{
				if(array[b].compareTo(array[b + 1]) > 0) {		  
					temp = array[b];		  
					array[b] = array[b + 1];		  
					array[b + 1] = temp;		  
				}
			}
		}
		System.out.println("Words by alphabetical: ");
		while (x != array.length) {
			System.out.print(array[x] + " ");
			x++;
		}
		
	}
	public static void PrintLength(String a) {
		String array[] = a.split(" ");
		String Longx = "", Shortx = "";
		int x = 0;
		for (int i = 0; i <= array.length; i++) {
			int z = array[i].length();
			int y = array[i+1].length();
			if (z>y) {
				Longx = array[i];
				Shortx = array[i+1];
				array[i] = Shortx;
				array[i+1] = Longx;
			}
		}
		System.out.println("Words by length: ");
		while (x != array.length) {
			System.out.print(array[x] + " ");
			x++;
		}
		
	}
	public static void PrintNumSentence(String a) {
		String array[] = a.split(" ");
		int NumWords = array.length - 1;
		int Sentence = 0;
		
		for (int i = 0; NumWords == i; i++) {
			String Now = array[i];
			if (Now.endsWith(".") || Now.endsWith("?") || Now.endsWith("!")) {
				Sentence++;
			}
		}
		System.out.println("Number of sentences: " + Sentence);
	}
	public static void PrintReplaceWord(String a) {
		String array[] = a.split(" ");
		array[2] = "arrows";
		System.out.println("Third word replaced with \"arrows\": ");
		for (int i = 0; i >= array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static void PrintReplaceChar(String a) {
		String lol = "f", lol2 = "a";
		System.out.println(a.replace(lol,lol2));
		
		
		System.out.println("Third letter replaced with \"a\": ");
	}
	public static void PrintDisplay(String a) {
		String array[] = a.split(" ");
		System.out.println("The third word: " + array[2]);
	}
	public static void PrintNumVowels(String a) {
		char[] array2 = {'a','e','i','o','u'};
		String array[] = a.split(" ");
		int vowels = 0;
		for (int i = 0; i <= array.length; i++) {
			for (int ii = 0; ii <= array[i].length(); ii++) {
				if ((array[i].charAt(ii) == array2[0]) || (array[i].charAt(ii) == array2[1]) || (array[i].charAt(ii) == array2[2]) || (array[i].charAt(ii) == array2[3]) || (array[i].charAt(ii) == array2[4])) {
					vowels++;
				}
			}
		}
		System.out.println("Number of Vowels: " + vowels);
	}
}