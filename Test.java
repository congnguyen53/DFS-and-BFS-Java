package students;


import java.util.Random;

public class Test {

	public static void main(String[] args) {

		/* Creating object of BST */
		BinaryTree bst = new BinaryTree();
		System.out.println("Binary Search Tree Test\n");
		int flag = 0;

		Random r = new Random(100);

		while (flag < 20) {
			bst.insert(r.nextInt(500));
			flag++;
		}

		BTreePrinter.printNode(bst.root);

	

		bst.printBFS();

	
		bst.printDFS();

	}

}
