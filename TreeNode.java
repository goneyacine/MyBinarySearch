import java.util.*;
import java.io.*;
public class TreeNode {

	private List<TreeNode> childs;
    private String name;
    private List<String> names = new ArrayList<String>();
    public String data = "";
    public TreeNode parentNode;
    public TreeNode(List<TreeNode> childs,String name,TreeNode parentNode){
    	//setting a default values
    	setChilds(childs);
        this.name = name;
        this.parentNode = parentNode;
    }
    //childs getter and setter 
    public void setChilds(List<TreeNode> childs){this.childs = childs;}
    public List<TreeNode> getChilds(){return childs;}
    //nodeName getter and setter 
    public void setName(String name){ this.name = name;}
    public String getName() {return name;} 
    //names getter and setter
    public void setNames(List<String> names){
        this.names = names;
    } 
    public List<String>getNames(){return names;}
    public void addNode(TreeNode node,List<Character> charsID){
    //here we're adding the new node element into array & make sure that our child nodes array is sorted
    List<TreeNode> extraNodes = new ArrayList<TreeNode>();
    int y = 0;
    for(int i = 0;i < charsID.size();i++){
     if(node.getName().charAt(node.getName().length() - 1) == charsID.get(i))
     	extraNodes.add(node);
     else if(y < childs.size()){
     	extraNodes.add(childs.get(y));
     	y++;
     }else {break;}
    }
    childs = extraNodes;
    
    } 
}