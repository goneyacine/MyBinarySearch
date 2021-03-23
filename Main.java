import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.*;
public class Main{
 private String binaryTreeDataPath = "BinaryTree\\";
 
 public static void main(String[] args) {
 	try{
 	List<Character> IDs = CharID.getCharsID();
 	File namesFile = new File("output file.txt");
 	Scanner scan = new Scanner(namesFile);
 	List<String> names = new ArrayList<String>();
    while (scan.hasNextLine()){
    names.add(scan.nextLine());
    }
    MyBinaryTree tree = SortNames.initialSort(names,IDs);
   
 }catch(Exception e){e.printStackTrace();}
 }
}