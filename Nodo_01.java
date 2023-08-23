import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class

class Node {
    private List<Node> children = new ArrayList<Node>();
    private Node parent;
    private String data;
    
    public Node() {
    
        
    }
    public Node(String data) {
        setData(data);
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public List<Node> getChildren() {
        return children;
    }
    public void addChild(Node node) {
        node.parent = this;
        this.children.add(node);
    }
    public void removeChildren() {
        children = new ArrayList<Node>();
    }
    public Node getParent() {
        return parent;
    }
    public void print(){
        
        this.print("",true);
    }
    public void print(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "\\-- " : "|-- ") + data);
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).print(prefix + (isTail ? " " : "| "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1).print(prefix + (isTail ?" " : "| "), true);
        }
    }
}//end class Node

public class Nodo_01{
	public static void main(String[] args) {
		Node a=new Node("primero");
		Node b=new Node("segundo");
		Node c=new Node("tercero");
		Node d=new Node("cuarto");
		Node e=new Node("quinto");
		
		
		a.addChild(b);
		a.addChild(c);
		c.addChild(d);
		c.addChild(e);
		a.print();
		
		
	}
}
