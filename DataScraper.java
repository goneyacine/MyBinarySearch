import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;

public class DataScraper{
  public static void main(String[] args) throws Exception{
  	Scanner scan = new Scanner(System.in);
  	//getting the path of the usersnames input file 
  	System.out.println("Enter The Input File Path");
  	String inputFilePathInput =  scan.nextLine();
  	//getting the path of the target output file
  	System.out.println("Enter The Output File Path");
  	String outputFilePathInput = scan.nextLine();
  	//closing the opened scanner
  	scan.close();
  	File inputFile = new File(inputFilePathInput);
  	Scanner inputFileScanner = new Scanner(inputFile);
  	FileWriter writer = new FileWriter(outputFilePathInput);
    while(inputFileScanner.hasNextLine()){
    	String name = "";
    	String line = inputFileScanner.nextLine();
    	for(int i = 0;i < line.length();i++){
    		if(line.charAt(i)== ';')
    		break;
    		else{
    		 name += line.charAt(i);	
    		}
    	}
    	writer.write("\n"+ name);
    }
    inputFileScanner.close();
    writer.close();
  }
}


