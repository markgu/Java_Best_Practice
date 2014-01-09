package TreeTraversal;

public class BinaryTree {
	
	Node root;
	
	public void addNode(int key, String name){
		Node newNode = new Node(key, name);
		if(root == null){
			root = newNode;
		} else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				} else{
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
					
			}
		}
	}
	
	public void preOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);			
		}
		System.out.println("reached one cycle of RECURSIVE call !!!!!");
	}
	
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}
		System.out.println("reached one cycle of RECURSIVE call !!!!!");
	}
	
	public void postOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
		System.out.println("reached one cycle of RECURSIVE call !!!!!");
	}
	
	/*public Node focusNode = null;
	// Search all left sub-nodes and all right sub-node until you find key1, key2 both 
	public Node findLCA(Node focusNode, int key1, int key2){
		if(focusNode != null){
			if( searchAllSubNodes(focusNode.leftChild, key1, key2)  &&
					searchAllSubNodes(focusNode.rightChild, key1, key2)){
				return focusNode; 
			} 
			if(findLCA(focusNode.leftChild, key1, key2) != null) return focusNode.leftChild ;
			if(findLCA(focusNode.rightChild, key1, key2) != null) return focusNode.rightChild;	
		}
		return null;
	}*/
	
	// simple approach and easy to understand
	public Node findLCA2(Node node, int t1, int t2){
		if(node == null){
			return null;
		}
		if(node.key > t2 && node.key > t1){
			return findLCA2(node.leftChild, t1, t2);
		} else	if(node.key < t1 && node.key < t2){
			return findLCA2(node.rightChild, t1, t2);
		} else{
			return node;
		}
	}
	
	
	public Boolean searchAllSubNodes(Node focusNode, int key1, int key2){
		
		if( focusNode != null ){
			if ( focusNode.key == key1 || focusNode.key == key2) return true;
			if(searchAllSubNodes(focusNode.leftChild, key1, key2)) return true;
			if(searchAllSubNodes(focusNode.rightChild, key1, key2)) return true;	
		}
		return false;
	}
		
	// To show all sub-nodes
	// print focusNode first then print child nodes if it's not null
	public void showAllNodes(Node focusNode){
		System.out.println("focusNode => " + focusNode.toStringWithChild());
		if( focusNode.hasLeftChild() ){	
			showAllNodes(focusNode.leftChild);
		}
		if( focusNode.hasRightChild() ){	
			showAllNodes(focusNode.rightChild);
		}
	}
	
	public static void main(String[] args){
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice President");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(75, "Sales manager");
		theTree.addNode(85, "Salesman 1");
		
		theTree.showAllNodes(theTree.root);
		Node nd = theTree.findLCA2(theTree.root, 50, 30);
		System.out.println("\n\n" + nd);

		
		
		/*System.out.println("\n\n preOrderTraverseTree !!!!!");
		theTree.preOrderTraverseTree(theTree.root);
		System.out.println("\n\n inOrderTraverseTree !!!!!");
		theTree.inOrderTraverseTree(theTree.root);
		System.out.println("\n\n postOrderTraverseTree !!!!!");
		theTree.postOrderTraverseTree(theTree.root);*/
	}
}

class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	public Boolean hasLeftChild(){
		if(leftChild != null ) return true;
		return false;
	}
	
	public Boolean hasRightChild(){
		if(rightChild != null ) return true;
		return false;
	}
		
	
	public String toString(){
		return name + " has the key " + key;
	}
	
	public String toStringWithChild(){
		String str = this.toString() ;  
		if( hasLeftChild() ){
			str += "\n\t Left Child => " + leftChild.toString();	
		}
		if( hasRightChild() ){
			str += "\n\t Right Child => " + rightChild.toString();		
		}
		return str;
	}
	
}
