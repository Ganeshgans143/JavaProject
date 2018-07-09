package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {

	public static void main(String[] args) throws IOException {


		FileWriter fr=new FileWriter("E:\\ganesh\\mail.txt", true);
		BufferedWriter br=new BufferedWriter(fr);
		PrintWriter pr = new PrintWriter(br);
		pr.println();
		pr.println("Hii This is ganeshgans");
		System.out.println("done");
		
		

	}

}
