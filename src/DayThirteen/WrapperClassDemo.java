package DayThirteen;

/*
    * java primitive data types
     i.e int, char, boolean are nt objects , which means they do nt hv methods associated with them.
    Their are situation where objects are required,  such as when working with collections like ArrayList, which can only store objects.
    To bridge this gap, java provides Wrapper Classes for each of the primitive data types.

    * Types of Wrapper Classes.
        byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        char -> Character
        boolean -> Boolean
 */
// ! Collections allows Wrapper classes.
// ! Usage of Wrapper Classes
/*
    1. Converting primitive data to object type i.e Auto Boxing.
    2. Converting object type to primitive ie Un boxing.
    3. Null values: wrapper classes can store null values, which is useful in situations where a value may be optional.
    4. Collections: like working with Java Collections like ArrayList, HashSet, because Collection cannot hold primitive types.
    5. Type Conversion:

 */


public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.14;
        char c = 'A';
        boolean B = true;

        // converting to object Auto Boxing.
        Integer aobj =  a;
        System.out.println(aobj);

        Double bobj = b;
        System.out.println(bobj);


        Boolean cobj = B;
        System.out.println(cobj);

        // converting object type data to primitive (un boxing):
        int intavlue = aobj;
        double doubleavlue = bobj;

        // Storing null
//        int x = null;  not allowed
        Integer x = null;  // allowed

        // Data Conversion using wrapper class.





    }
}
