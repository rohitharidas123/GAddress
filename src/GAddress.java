import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GAddress 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		String GAddress;
		Scanner file = new Scanner(new File(filename));
		ArrayList<String> words = new ArrayList<String>();
		String word;
		while (file.hasNext()) 
		{
			word = file.next();
			words.add(word);
		} 
		
		for(int i=0;i<words.size(); i++)
		{
			
		}
	}
}
