//import static java.util.Integer.*;


public class StringPractice{

    public static void main(String[] args) {
        //chars in string is 16-bit Unicode character
        // string is an object that represents a sequence of characters
        //implemented interfaces CharSequence, Serializable, Comparable
        //final means immutable Immutable objects: String, Boolean, Byte, Short, Integer, Long, Float, Double
        System.out.println("Hello Atom no IDE");
        int $_ = 10;
        double _234 = 20.4;
        Double hope = new Double(20.4);

        String s1 = "aa";//By string literal  JVM checks the string constant pool first
        String s2 = new String("aa");//By new keyword, creates two objects and one reference variable one in heap one in a pool (with literal)
                                     //The variable s2 will refer to the object in heap(non pool).
        String s3 = null;
        System.out.println("String null instance of String: " + s3 instanceof String);
        s2.concat(" bb");
        s3 = "";
        s3 = s3.concat("aa");
        System.out.println("String concat aa concat bb: " + s2);
        System.out.println("String concat s3 = s3.concat(aa): " + s3);
        //System.out.println(MAX_VALUE);
        System.out.println($_ + _234 + " new value");
        System.out.println(hope instanceof Double);
        System.out.println("double equals with new Double by value: " + hope.equals(_234));
        System.out.println("double == with new Double by value: " + (_234 == hope));
        //String with new String it is in the pool and in the heap not the same
        System.out.println("String equals with new String by value: " + s1.equals(s2));
        System.out.println("String == with new String by value: " + (s1 == s2));


    }
}
