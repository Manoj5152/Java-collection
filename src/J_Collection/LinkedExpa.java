package J_Collection;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedExpa {
public static void main(String[] args) {
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	linkedList.add(1);
	linkedList.add(2);
	linkedList.add(4);
	linkedList.add(5);
	System.out.println("Linkedlist :"+linkedList);
	//By adding first 
	linkedList.addFirst(1);
	System.out.println("Linkedlist :"+linkedList);
	linkedList.addLast(6);
	System.out.println("Linkedlist :"+linkedList);
	System.out.println("Linkedlist :"+linkedList.getFirst());
	System.out.println("Linkedlist :"+linkedList.getLast());
	System.out.println("Linkedlist :"+linkedList.get(3));
	System.out.println("removeList :"+linkedList.removeFirst());
	System.out.println("Poll :"+linkedList.pollFirst());
	System.out.println(linkedList);
	System.out.println("Linkedlist :"+linkedList.getFirst());
	linkedList.removeFirstOccurrence(2);
	System.out.println("after occur" + linkedList);
}	




}
