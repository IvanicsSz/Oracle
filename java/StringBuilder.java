//import java.lang.StringBuilder;

public class StringBuilder{
//Use StringBuilder whaen you have to make a lot of modifications to strings of characters ex. file I/O
//not thread-safe, not immutable, faster then StringBuffer (sychronized)
    public static void main(String[] args){
        System.out.println("StringBuilder practice");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.StringBuilder sb1 = new java.lang.StringBuilder(20);
        sb1.append("01234567891234567").insert(10,"abc");
        //sb1.insert(21, "abc");
        //StringIndexOutOfBoundsException
        System.out.println(sb1);
        //no unused string in memory
        sb.append("def").reverse().insert(3, "---");
        System.out.println(sb);
    }
}
