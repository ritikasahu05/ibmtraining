import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Google");
		list.add("Oracle");
		list.add(2, "Microsoft");
		list.add("IBM");
		
		System.out.println("-- Traversing over ArrayList using for..loop");
		for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("--Traversing over ArrayList using Iterator");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
	         System.out.println(itr.next());
        
        System.out.println("-- Traversing over ArrayList using for..each");
		for(String s: list)
            System.out.println(s);
        
		LinkedList<String> link = new LinkedList<String>();
		link.add("Tesla");
		link.add("Apache");
		link.add("Apple");
		link.addLast("Meta");
		
		link.addAll(link);
		System.out.println("--Traversing over updated ArrayList using for..each ");
		for(String s : list)
			System.out.println(s);
		
		//Convert ArrayList into HashSet
		HashSet<String> set= new HashSet<String>(list);
		set.add("Banana");
		set.add("Kiwi");
		set.add("Strawberry");
		
		System.out.println("-- Traversing over HashSet using for..each");
		for(String t: set)
            System.out.println(t);
        
		System.out.println("--Traversing over HashSet using Iterator");
        Iterator<String> ith = set.iterator();
        while(ith.hasNext())
	         System.out.println(ith.next());
        
        //System.out.println("-- Traversing over HashSet using for..loop");
		//for(int i=0; i<set.size(); i++)
        //    System.out.println(set.get(i));
        
        
	}
}
