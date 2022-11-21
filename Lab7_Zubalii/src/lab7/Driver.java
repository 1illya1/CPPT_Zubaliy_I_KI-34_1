/**
 * lab 7 package
 */
package lab7;

/**
 * Driver class implements main method for MyDoubleLinkedList class possibilities demonstration
 * 
 * @version 1.0
 */
public class Driver {
		
	public static void main(String[] args) {
		MyDoubleLinkedList<? super Data<?>> list = new MyDoubleLinkedList<Data<?>>();
		list.addFirst(new NumberData(6));
		list.addFirst(new StringData("G"));
		list.addLast(new StringData("B"));
		list.removeLast();
		list.addLast(new StringData("P"));
		list.addLast(new FloatData(1.0f));
		list.addFirst(new NumberData(5));
		list.addFirst(new StringData("K"));
		list.printList();
		Data<?> data = list.findMax();
		System.out.println("The greatest data is: ");
		data.print();
		
		
		
	}
	
	
}


