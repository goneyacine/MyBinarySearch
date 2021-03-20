import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.*;
public class Main{
 private String binaryTreeDataPath = "BinaryTree\\";
 private static List<String> binaryTreeData = new ArrayList<String>();
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
     serializeBinaryTree(tree.getHead());
 for(String data : binaryTreeData)
  System.out.print("<<<........................................>>>> \n" + data);
 }catch(Exception e){e.printStackTrace();}
 }
 private static void serializeBinaryTree(TreeNode node){
  for(TreeNode childNode : node.getChilds()){
   if(binaryTreeData.size() == childNode.layer)
    binaryTreeData.set(childNode.layer - 2,binaryTreeData.get(childNode.layer - 2) + "\n <" + childNode.myID + ">...<" + childNode.getName() + ">");
  else{
    binaryTreeData.add(" ");
   binaryTreeData.set(childNode.layer - 2,binaryTreeData.get(childNode.layer - 2) + "\n <" + childNode.myID + ">...<" + childNode.getName() + ">");
  }

  if(node.getChilds().size() > 0)
    serializeBinaryTree(childNode);
  }
 }

}