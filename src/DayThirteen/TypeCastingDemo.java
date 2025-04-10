package DayThirteen;

// !Involves changing the type of the variable. i.e from one type to another.
// * Here datatype must be compatible each other while converting.
// * Two main types of type casting. i.e
// ! Widening and Narrowing
// * Widening Type Casting (Automatic Type Conversion) i.e implicit conversion, casting down. No data loss
// *i.e. from lower to higher
// * follows the order. byte -> short -> int -> long -> float -> double
// *Examples: byte to short, int to long, float to double.
// ! Narrowing Type Casting (Explicit Type Conversion)
// * larger data type to lower / smaller
// * done manuallly
// *Data is lost during conversion.
// * follows the order double -> float -> long -> int -> short => byte.
//

public class TypeCastingDemo {
    public static void main(String[] args) {

        //WideningExample (Lower to Higher)
        // byte -> short -> int -> Long -> Float -> double
//        byte b = 127;
//        short s = b;   // Automatic type conversion from byte to short
//        int i = s;
//        long l = i;
//        float f = l;
//        double d = f;
//
//        System.out.println("Byte value:" + b);
//        System.out.println("Short value:" + s);
//        System.out.println("Integer value:" + i);
//        System.out.println("Long value:" + l);
//        System.out.println("Float value:" + f);
//        System.out.println("Double value:" + d);

        //! NarrowingExample (Higher to Lower)
        //! double -> float -> long -> int -> short -> byte
        double d = 9.1234564;
        float df = (float) d;
        long l = (long) d;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("Double value : " + d);
        System.out.println("Float value: " + df);
        System.out.println("Long value: " + l);
        System.out.println("Integer value: " + i);
        System.out.println("Short value: " + s);
        System.out.println("Byte value: " + b);


    }
}
