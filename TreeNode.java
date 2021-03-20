import java.util.*;
import java.io.*;
public class TreeNode {
    public String parentID = "empty parent id";
    public String myID = "empty id";
    public List<String> childID = new ArrayList<String>();
	private List<TreeNode> childs;
    private String name;
    private List<String> names = new ArrayList<String>();
    public String data = "";
    public int layer;
    public TreeNode(List<TreeNode> childs,String name){
    	//setting a default values
    	setChilds(childs);
        this.name = name;
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
    childID = new ArrayList<String>();
    for(int i = 0;i < charsID.size();i++){
     if(node.getName().charAt(node.getName().length() - 1) == charsID.get(i)){
        //setting the id of the new node
        node.setParentID(myID);
        node.setMyID(i);
        node.setLayer(layer);
     	extraNodes.add(node);
     }
     else if(y < childs.size()){
        //resetting the id of the target node
        childs.get(y).setParentID(myID);
        childs.get(y).setMyID(i);
        childs.get(y).setLayer(layer);
     	extraNodes.add(childs.get(y));
     	y++;
     }else {break;}
    //adding the id of the new child to the child id list 
     childID.add(myID + "^" + i);
    }
    childs = extraNodes;
    } 
    public void setParentID(String parentID){
     this.parentID = parentID;
    } 
    public void setMyID(int order){
     this.myID = this.parentID + "^" + order; 
    }
    public void setLayer(int parentLayer){
    this.layer = parentLayer + 1;
    }
}