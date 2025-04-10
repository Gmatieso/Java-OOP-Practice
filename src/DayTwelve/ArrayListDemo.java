package DayTwelve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ! Remember Collections only Object Types of Data. Primitive is not allowed.

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(); //! Generic

        List myList1 = new ArrayList();  // storing child class object in parent class variable. i.e upcasting

        myList.add(100);
        myList.add("Welcome");
        myList.add(true);
        myList.add(100.10);
        myList.add(null);
        myList.add('A');
        myList.add(true);

        //finding the size of our ArrayList Collection.
        System.out.println("Size of array list:"  + myList.size());

        System.out.println("ArrayList elements:" + myList);

        myList.remove(5); // 5 is an index of the element
        System.out.println("ArrayList elements:" + myList);

        // inserting
        myList.add(2, "Second");
        System.out.println("After inserting ArrayList elements:" + myList);

        // modification
        myList.set(2, "Third");
        System.out.println("After modifying ArrayList elements:" + myList);

        //access specific element
        System.out.println("Element at index 3:" + myList.get(3));

        // read element using normal for loop.
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // read element using enhanced loop i.e. for...each  loop
        for( Object element:myList){
            System.out.println(element);
        }

        // read elements using Iterator
        Iterator iterate = myList.iterator();

        while(iterate.hasNext()){
            // returns a boolean value i.e True or False.
            System.out.println(iterate.next());
        }

        // removing specific group of elements.
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add("Welcome");

        System.out.println("Before removing ArrayLIst element" + arrayList);

        arrayList.removeAll(arrayList);
        System.out.println("After removing ArrayList elements:" + arrayList);
    }
}
