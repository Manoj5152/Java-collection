package J_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashPractice {
	public static void main(String[] args) {
		/*
		 * Set linkedhashset = new LinkedHashSet<>(); linkedhashset.add("c");
		 * linkedhashset.add("l"); linkedhashset.add("r");
		 * 
		 * 
		 * System.out.println("HI this is Lin :"+linkedhashset);
		 * linkedhashset.remove("r"); System.out.println(linkedhashset);
		 */
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(2);
		treeset.add(5);
		treeset.add(7);
		treeset.add(3);
		treeset.add(10);
		treeset.add(4);
		
		System.out.println("TreeSet is the content of :"+treeset);
		System.out.println("Treeset of the value in headset is :"+treeset.headSet(4));
		System.out.println("Treeset of the value in tailset is :"+treeset.tailSet(5));
		System.out.println("Treeset of the value in subset is :"+treeset.subSet(3, 7));
		
		
		
		
		
	/*HashSet<String> hashset = new HashSet<String>();
	hashset.add("A");
	hashset.add("B");
	hashset.add("C");
	hashset.add("D");
	hashset.add("E");
	hashset.add(null);
	hashset.add("A");
		
	System.out.println(hashset);
	
	
	Iterator<String> iterator = hashset.iterator();
	while (iterator.hasNext()) {
		System.out.println("Elements of hashset :"+ iterator.next());*/
	}
	
	
	
	
	
	
	
	}
	
	
	

