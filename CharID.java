import java.util.Scanner;
import java.io.File;
import java.util.*;

public class CharID {

    public static List<Character> getCharsID()  {
    List<Character> chars = new ArrayList<Character>();
    try{
     Scanner input = new Scanner(System.in);
     System.out.println("ENTER THE INPUT FILE PATH");
     String inputFilePath = input.nextLine();
     input.close();
     File file = new File(inputFilePath);
     Scanner fileReader = new Scanner(file);
     while(fileReader.hasNextLine()){
      String word = fileReader.nextLine();
      for(int i = 0;i < word.length();i++){
        char c = word.charAt(i);
        if(chars.contains(c)){continue;}
        else {
          System.out.println(c);
          chars.add(c);
        }
      }
     }
     System.out.println("DONE");
   }catch(Exception e){e.printStackTrace();}
   return chars;
   }
}