
public class TreeNode{
	 
	private List<TreeNode> childs;
    private String nodeName;
    private List<String> names;
    public TreeNode(List<TreeNode> childs,String nodeName,String names){
    	//setting a default values
    	setChilds(childs);
    	setNodeName(nodeName);
    }
    //childs getter and setter 
    public void setChilds(List<TreeNode> childs){this.childs = childs;}
    public List<TreeNode> getChilds(){return childs;}
    //nodeName getter and setter 
    public void setNodeName(String nodeName){ this.name = name;}
    public String getName() {return name;} 
    //names getter and setter
    public void setNames(List<String> names){this.names = names;}
    public List<String>getNames(){return names;}
}