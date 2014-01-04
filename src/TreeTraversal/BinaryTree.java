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
	
	public void showAllNodes(Node focusNode){
		System.out.println("focusNode => " + focusNode.toString());
		if( focusNode.hasLeftChild(focusNode) || focusNode.hasRightChild(focusNode) ){
			System.out.println("focusNode Left Child => " + focusNode.leftChild.toString());
			System.out.println("focusNode Right Child => " + focusNode.rightChild.toString());
			showAllNodes(focusNode.leftChild);
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
	
	public Boolean hasLeftChild(Node focusNode){
		if(focusNode.leftChild != null ) return true;
		return false;
	}
	
	public Boolean hasRightChild(Node focusNode){
		if(focusNode.rightChild != null ) return true;
		return false;
	}
	
	
	
	
	
	public String toString(){
		return name + " has the key " + key;
	}
}
