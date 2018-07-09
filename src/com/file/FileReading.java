package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	static int lineCount=0;
	static int wordCount=0;
	static int charCount=0;

	public static void main(String[] args) throws IOException  {
		FileReader fr=new FileReader("E:\\ganesh\\mail.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			
			lineCount++;
			String[] s1=line.split(" ");
			wordCount=wordCount+s1.length;
			for (String s2:s1) {
				
				charCount=charCount+s2.length();
			}
			
			line=br.readLine();
//			Java project
		}
		System.out.println("wordCount: "+wordCount);
		System.out.println("No of lines: "+lineCount);
		System.out.println("charCount: "+charCount);
		br.close();
		}
}
	


