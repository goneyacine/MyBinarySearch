import java.util.*;
public class SortNames{

 public static MyBinaryTree initialSort(List<String> names,List<Character> charsID){
  if(names.size() == 0 || names == null){ return null; }
  boolean canIterate = true;
  int leftPivot = 0;
  int rightPivot = names.size()  - 1;
  MyBinaryTree tree = new MyBinaryTree(new ArrayList<TreeNode>());
  for(String name : names){
  	addNameIntoNode(name,0,tree.getHead(),charsID);
  }
  return tree;
 }
 public static void addNameIntoNode(String name,int charIndex,TreeNode parentNode,List<Character> charsID){
  if(charIndex + 1 >name.length())
  	return;
  if(parentNode.getChilds().size() > 0){
  for(int i = 0; i < parentNode.getChilds().size();i++){
  	TreeNode node = parentNode.getChilds().get(i);
  	boolean isEqual_ = false;
  	try{
  	String s = "";
  	s +=name.charAt(charIndex);	
  	isEqual_ = node.getName().equals(s);
    }catch(Exception e){System.out.println(e);} 
  	if(isEqual_){
  		if(i < parentNode.getChilds().size() - 1){
  		if(charIndex + 1 < name.length() - 1)
  		addNameIntoNode(name,charIndex + 1,node,charsID);
  	    else {
  	    List<String> nodeNames = parentNode.getNames();
  	    nodeNames.add(name);
  	    parentNode.setNames(nodeNames);
  		break;
  	    }
      }else {
      	String newNodeName = "";
      	newNodeName += name.charAt(charIndex);
      	TreeNode newNode = new TreeNode(new ArrayList<TreeNode>(),newNodeName);
        parentNode.addNode(newNode,charsID);
        if(charIndex < name.length() - 1)
         addNameIntoNode(name,charIndex + 1,newNode,charsID);
         else
         {
         List<String> nodeNames = new ArrayList<String>();
  	     nodeNames.add(name);
  	     newNode.setNames(nodeNames);
  	   
         }

       
  	}
  }
    
 }
}else{ 
 	    String newNodeName = "";
      	newNodeName += name.charAt(charIndex);
      	TreeNode newNode = new TreeNode(new ArrayList<TreeNode>(),newNodeName);
        newNode.setParentID(parentNode.myID);
        newNode.setMyID(0);
        newNode.setLayer(parentNode.layer);
        parentNode.addNode(newNode,charsID);
        if(charIndex < name.length() - 1)
         addNameIntoNode(name,charIndex + 1,newNode,charsID);
         else
         {
         List<String> nodeNames = new ArrayList<String>();
  	     nodeNames.add(name);
  	     newNode.setNames(nodeNames);
         }
      } 
    }
  }