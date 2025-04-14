package DayFifteen;
/*
    Key:
    is an object that we use 2 retrieve a value from the HashMap.
    Each key must be unique, meaning u cannot hv duplicate keys in a HashMap.
    Wen we want 2 store/ retrieve a value from the HashMap. we use associated Key.

    Value:
        a value is data or object associated with a specific key in the HashMap.
        While keys must/are unique, values can be duplicated.
    HashMap:
        class implements the Map interface which allows us to store key and value pair
        Contains values based on the key.
        Contains only unique key.
        HashMap may hv one null key and multiple null values.
        HashMap maintains no order.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Declaration
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding pairs to hashmap
        hashMap.put(100, "John");
        hashMap.put(200, "Scot");
        hashMap.put(300, "Mike");
        hashMap.put(400, "Jane");
        hashMap.put(400, "Mike");

        System.out.println("HashMap Contains:" + hashMap); // {100="john", 200="Scot", 300="Mike", 400="Jane", 400="Mike"}

        //Remove pair from hashMap
        hashMap.remove(100);

        System.out.println("HashMap After Pair Removed Contains:" + hashMap);

        //Access specific value from the hashmap
        System.out.println("The value of 200 key:" + hashMap.get(200));

        //Accessing all the keys from the hashMap
        System.out.println("Keys in the hashmap:" + hashMap.keySet());

        //Accessing all the values frm Hashmap
        System.out.println("Values in the hashmap:" + hashMap.values());

        //reading hashMap using enhanced loop
        for(Integer key :hashMap.keySet()){
            System.out.println(key + ":" + hashMap.get(key));
        }

        System.out.println(hashMap.entrySet());  //[null=null, 101=john, 102=David, 104=Scott]

        // Reading hashmap using iterator
        Iterator<Map.Entry<Integer, String>> itr = hashMap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
