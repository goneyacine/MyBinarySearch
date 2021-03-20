import java.util.*;
import java.io.*;
public class MyBinaryTree{
 
 private TreeNode head;

 public MyBinaryTree(List<TreeNode> headChildNodes){ 
  head = new TreeNode(headChildNodes,"x");
  head.setParentID("...");
  head.setMyID(0);
  head.setLayer(0);
  }
 public TreeNode getHead(){return head;}
}