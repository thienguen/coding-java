public class Main {
	public static void main(String[] args) {

		// search tree implementation is false, don't use it
		// SearchTree list = new SearchTree(null);

		MyLinkedList list = new MyLinkedList(null);

		// this will shown the dumbass messgae
		list.traverse(list.getRoot());

		String stringData = "Nguyen Van Ky Thien Anh Tam Le Ly Thi Nguyen Lam Nguyen Guen"; 
		
		String[] data = stringData.split(" ");

		for (String s : data) { list.addItem(new Node(s));}

		// first travesal
		list.traverse(list.getRoot());

		// remove Nguyen
		list.removeItem(new Node("Nguyen"));
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("Van"));
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("Ky"));
		list.removeItem(new Node("Thien"));
		list.removeItem(new Node("Anh"));
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("Tam"));
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("Le"));
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("Ly"));
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("Thi"));
		list.removeItem(list.getRoot());
		
		list.traverse(list.getRoot());
	}
}