package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class string12
{
  public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\admin\\Desktop\\file2.txt");
	FileWriter f2=new FileWriter(f1,true);
	BufferedWriter b1=new BufferedWriter(f2);
	
	b1.write("hello word");
	b1.newLine();
	b1.write("meenu");
	b1.newLine();
	b1.write("meenu");
	b1.newLine();
	
	b1.close();
	
	
				
			
			
	
	
}		 
}
