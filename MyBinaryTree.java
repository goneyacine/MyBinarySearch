import java.util.*;
import java.io.*;
public class MyBinaryTree implements Serializable{
 
 private TreeNode head;

 public MyBinaryTree(List<TreeNode> headChildNodes){ head = new TreeNode(headChildNodes,"x",null); }
 public TreeNode getHead(){return head;}
}