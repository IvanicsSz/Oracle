
public class WorkWithArrays{
    //the array itself will always be an
    //object on the heap, even if the array is declared to hold primitive elements
    //Constructing an array means creating the array object on the heap
    public static void main(String[] args){

        int[] arr = new int[4];  //best ok  new int[]: compilation fails
        int arr2 [] = {1,2,3,7}; //ok
        int[] arr3 [] = {{5,2,4,7}, {9,2}, {3,4}};
        //int[10] arr; BAD
        //runtime exceptions is out-of-range exception
        int[] testScores;
        byte b = 4;
        char c = 'c';
        short sh = 7;
        testScores = new int[] {b,c,sh}; //anonymous array creation no size declaration
        String[][] s = new String[3][];   //2 dim array best  [3][] is OK
        String[] s1 [];  //2 dim array ok
        //Remember,a reference that has not had an object assigned to it is a null reference. And if you
        //actually try to use that null reference by, say, applying the dot operator to invoke amethod on it, you'll get the infamous NullPointerException .

        int[] splats;
        int[] dats = new int[4];
        char[] letters = new char[5];
        splats = dats;
        // OK, dats refers to an int array
        //splats = letters; // NOT OK, letters refers to a char array
        //IS-A (instanceof)test to help sort the legal from the illegal

        String sr[] = new String[] {new String("a"),new String("b"), new String("c")};
        String sr2[] = sr;
        System.out.println("sr: " + sr[0] +" " +sr[1] +" " +sr[2]);
        System.out.println("sr2: " + sr2[0] +" " +sr2[1] +" " +sr2[2]);
        System.out.println("sr == sr2: " + (sr == sr2));
        System.out.println("sr equals sr2: " + sr[0].equals(sr2[0]));
        sr[0] = new String("aaa");
        System.out.println("after sr[0] ha changed sr: " + sr[0] +" " +sr[1] +" " +sr[2]);
        System.out.println("sr2: " + sr2[0] +" " +sr2[1] +" " +sr2[2]);
        System.out.println("sr == sr2: " + (sr == sr2));
        System.out.println("sr equals sr2: " + sr[0].equals(sr2[0]));


        System.out.println("arr1: " + arr2.length + "1: " + arr2[0]);
        System.out.println("arr2: " + arr3.length + "1: " + arr3[0][1]);
        System.out.println("testscore: " + testScores[1]);
    }
}
