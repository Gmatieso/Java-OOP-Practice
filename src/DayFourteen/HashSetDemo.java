package DayThirteen;

/*
    Hash-Set Rules Collection:
    1. HashSet is implemented set interface
    2. We can store both Heterogeneous and Homogeneous data.
    3. Duplicate elements not allowed.
    4. Insertion Order Not preserved.
    5. Indexing is not supported.
    6. Null Handling
    7. Only one null is allowed.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

//        Set mySet = new HashSet(); // generic
//        Set<String> set = new HashSet<>(); specific

        HashSet myset = new HashSet();

        // Adding elements
        myset.add("A");
        myset.add(100);
        myset.add(10.5);
        myset.add(true);
        myset.add(null);
        myset.add(100); // Duplicate
        myset.add(null);

        // printing - insertion order not preserved.
        System.out.println(myset);

        //size of HashSet
        System.out.println("Size is: " + myset.size());

        //remove element
        myset.remove(10.5);

        System.out.println("After removing:" + myset);

        //logically insertion of element is not possible. since data is not sorted in  correct order. There's no indexing concept.

        //Access specific element is not possible, since indexing is not supported.

        // we can access specific element in different way. i.e converting Set into List this is indirectly.
        ArrayList mylist = new ArrayList(myset);

        mylist.add("A");
        mylist.add("A");
        mylist.add(100);
        mylist.add(100);
        mylist.add(10.5);

        //printing elements in ArrayList after coping from myset
        System.out.println("Size is: " + mylist.size());
        System.out.println("Printing elements in myList array" + mylist);

        System.out.println("Printing elements in myList in 3rd position: " + mylist.get(3)); // print true


//        Set myset2 = new HashSet(mylist);
//        System.out.println("Size is: " + myset2.size());
//        System.out.println("Printing elements in mySet2 array" + myset2);

        // read data using enhanced loop.
        for( Object element:myset){
            System.out.println("Reading data using forEach loop" + element);
        }
        //Read data using Iterator
       Iterator itr = myset.iterator();

        // Now let capture data frm iterator using while loop.
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //clearing
        myset.clear();
        System.out.println("My set is empty:" + myset);

        //checking if myset is empty?
        System.out.println("Is HashSet empty?" + myset.isEmpty()); // true

    }
}
