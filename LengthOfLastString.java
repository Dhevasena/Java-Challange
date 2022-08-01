package week4.day2.assignment;

import java.util.Set;
import java.util.TreeSet;

public class LengthOfLastString {

	public static void main(String[] args) {
		//declare String Variable
		String text="Hello World";
		//Remove the space and add it String Array
		String[] str=text.split(" ");
		//Declare a set
        Set<String> setWord=new TreeSet<String>();
        //Iterate and add the string array to String
        for (int i = 0; i < str.length; i++) {
			setWord.add(str[i]);
            }
        //Print the Last Word in array
		String lastWord= ((TreeSet<String>) setWord).last();
		//Print it
		System.out.println("Print Last Word"+lastWord);
		//find the length of last word
		int lengthOfLastWord=lastWord.length();
		System.out.println("Length of Last word"+lengthOfLastWord);
		
		
	}

}
