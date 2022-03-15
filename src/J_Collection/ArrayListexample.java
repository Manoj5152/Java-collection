package J_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListexample {
	public static void main(String[] args) {
	
	List<String> arrayList = new ArrayList<String>();   //Parent class oda reference = chlid class oda object
	arrayList.add("Benz");
	arrayList.add("BMW");
	arrayList.add("Benely");
	System.out.println(arrayList);
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.lastIndexOf("Benely"));
	System.out.println(arrayList.isEmpty());
	
	//iterate
	for(String string: arrayList) {
		System.out.println("usingeach: "+string);
	}
	System.out.println("-----------------------------------");
	
	
	for (int i=0; i<arrayList.size();i++) {
	System.out.println("usingloop: "+arrayList.get(i));
}
	System.out.println("---------------------------------");
	ListIterator<String> iterator = arrayList.listIterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());	
	}System.out.println("---------------------------------");
		Iterator<String>  hi_iterator= arrayList.listIterator();
		while(hi_iterator.hasNext()) {
			System.out.println(hi_iterator.next());
		}
	}
}
