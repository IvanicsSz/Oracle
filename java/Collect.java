
    /*

No. ArrayList           vs                                  Vector
1)  ArrayList is not synchronized.	                        Vector is synchronized.
2)	ArrayList is not a legacy class.	                    Vector is a legacy class.
3)	ArrayList increases its size by 50% of the array size.	Vector increases its size by doubling the array size.

No.	ArrayList       vs                                      LinkedList
1)	ArrayList uses a dynamic array.	                        LinkedList uses doubly linked list.
2)	ArrayList is not efficient for manipulation
    because a lot of shifting is required.	                LinkedList is efficient for manipulation.
3)	ArrayList is better to store and fetch data.	        LinkedList is better to manipulate data.

No.	Iterator    	                                            ListIterator
1)	Iterator traverses the elements in forward direction only.	ListIterator traverses the elements in backward and forward directions both.
2)	Iterator can be used in List, Set and Queue.	            ListIterator can be used in List only.

No.	Iterator	                                                Enumeration
1)	Iterator can traverse legacy and non-legacy elements.	    Enumeration can traverse only legacy elements.
2)	Iterator is fail-fast.	                                    Enumeration is not fail-fast.
3)	Iterator is slower than Enumeration.	                    Enumeration is faster than Iterator.

No.	HashMap	                                                    Hashtable
1)	HashMap is not synchronized.	                            Hashtable is synchronized.
2)	HashMap can contain one null key and multiple null values.	Hashtable cannot contain any null key or null value.

No.	Comparable	                                                Comparator
1)	Comparable provides only one sort of sequence.	            Comparator provides multiple sort of sequences.
2)	It provides one method named compareTo().	                It provides one method named compare().
3)	It is found in java.lang package.	                        it is found in java.util package.
4)	If we implement Comparable interface, actual class is modified.	   Actual class is not modified.
HashSet vs HashMap
HashSet contains only values whereas HashMap contains entry(key,value). HashSet can be iterated but HashMap need to convert into Set to be iterated.

❑ ArrayList Fast iteration and fast random access.
❑ Vector It's like a slower ArrayList , but it has synchronized methods.
❑ LinkedList Good for adding elements to the ends, i.e., stacks and queues.
❑ HashSet Fast access, assures no duplicates, provides no ordering.
❑ LinkedHashSet No duplicates; iterates by insertion order.
❑ TreeSet No duplicates; iterates in sorted order.
❑ HashMap Fastest updates (key/values); allows one null key, many null
values.
❑ Hashtable Like a slower HashMap (as with Vector , due to its synchronized
methods). No null values or null keys allowed.
❑ LinkedHashMap Faster iterations; iterates by insertion order or last
accessed; allows one null key, many null values.
❑ TreeMap A sorted map.
❑ PriorityQueue A to-do list ordered by the elements' priority.

Sorting and Searching Arrays and Lists
❑ Sorting can be in natural order or via a Comparable or many Comparator s.
❑ Implement Comparable using compareTo() ; provides only one sort order.
❑ Create many Comparator s to sort a class many ways; implement compare() .
❑ To be sorted and searched, an array's or List 's elements must be comparable.
❑ To be searched, an array or List must first be sorted.

11) What is the difference between Collection and Collections?

Collection is an interface whereas Collections is a class. Collection interface provides normal functionality of data structure to List, Set and Queue. But, Collections class is to sort and synchronize collection elements.
    */
    import java.util.*;

    public class Collect{

        static class Bob{
            private String name;
            private int age;

            public Bob(String name, int age){
                this.name = name;
                this.age = age;
            }

            public String getName(){
                return this.name;
            }

            public String toString(){
                return "My name is " + name + " and my age is " + age;
            }
/*
            whenever you need to sort or search through a collection of
            objects, the equals() and hashCode() methods are essential
            in the wrapper classes equals method is overriden by default to check the value
            you has to override equals if you would likt to use object with collection (because hastable key)

            If you want objects of your class to be used as keys for a
            hashtable (or as elements in any data structure that uses equivalency for searching
            for—and/or retrieving—an object), then you must override equals() so that two
            different instances can be considered the same
*/
            //reflexive
            //symmetrive
            //transitive
            //consistent
            //null-value false
            public boolean equals(Object o){
                //IS-A relation
                if ((o instanceof Collect.Bob) && ((Collect.Bob)o).getName() == this.getName()){//just in time cast
                    return true;
                } else{
                    return false;
                }
            }

            //Hashcodes are typically used to increase the performance of large collections of data
            //1. Find the right bucket (using hashCode() ).
            //2. Search the bucket for the right element (using equals() ).
            // When you put an object in a collection that uses hashcodes, the
            // collection uses the hashcode of the object to decide in which bucket/slot the object should land.
            //transient variables are not saved when an object is serialized
            public int hasCode(){
                int result = 17;
                String name = this.getName();
                result = 31 * result; //name.hasCode();
                return result;
            }
        }
        //Interfaces for collections
            //Collection Set SortedSet
            //List Map SortedMap
            //Queue NavigableSet NavigableMap

        //Concrete Class implementations
//        Maps          Sets            Lists           Queues          Utilities
//        HashMap       HashSet         ArrayList       PriorityQueue   Collections
//        Hashtable     LinkedHashSet   Vector                          Arrays
//        TreeMap       TreeSet         LinkedList
//        LinkedHashMap
//none of the Map-related classes and interfaces extend from Collection
/*
■ collection, which represents any of the data structures in which
objects are stored and iterated over.
■ Collection, which is actually the java.util.Collection interface from which Set , List , and Queue extend.
(That's right, extend, not implement. There are no direct implementations of Collection .)
■ Collections is the java.util.Collections class that holds a pile of static utility methods for use with collections.

Ordered When a collection is ordered, it means you can iterate through the
collection in a specific (not random) order.

Sorted A sorted collection means that the order in the collection is determined
according to some rule or rules, known as the sort order.
*/

    public static void main(String[] args){
        //equals(), hasCode()
        Collect collect = new Collect();
        Collect.Bob noBob = new Collect.Bob("Adam", 23);
        Collect.Bob who = new Collect.Bob("Manna", 12);
        System.out.println(noBob);
        System.out.println(who);
        System.out.println("equals Adam and Manna: " + noBob.equals(who));

        //List Interface
        //A List cares about the index, ordered by index

        //ArrayList
        //Choose this over a LinkedList when you need fast iteration but aren't as likely to be doing
        //a lot of insertion and deletion.
        //You can use an ArrayList to keep track of what locations were visited and in what order.
        List<String> strs = new ArrayList<>();//fast iteration and fast random access
        strs.add("new");
        System.out.println("\n");
        System.out.println("ARRAYLIST" + "\n");
        System.out.println("index of new: " + strs.indexOf("new"));
        System.out.println("get(0): " + strs.get(0));
        System.out.println("contains old: " + strs.contains("old"));
        System.out.println("size: " + strs.size());

        System.out.println("\n");
        System.out.println("AUTOBOXING AND WRAPPER CLASS\n");
        //"wrapper classes" a way to get primitives into and out of collections.
        //wrapper objects are immutable
        System.out.println("In general, collections can hold Objects but not primitives.");

        Integer y = 567;
        Integer z = 568;
        Integer x = y; // make a wrapper
        System.out.println("y=x y=567 y==x: " + (y==x));// assign a second ref
                                // var to THE wrapper
        System.out.println("++y: (expression is the final value) " + ++y);
        System.out.println("y++: (remember the original value) "+ y++);
        System.out.println("x: " +x + " " + "y: " + y);//verify that they refer to the same object, unwrap, use, "rewrap"
        System.out.println("after y++ y==x: " + (y==x));// verify that they refer, to different objects
        System.out.println("z= 568 y==z: " + (y==z));
        System.out.println("z= 568 y.equlas(z): " + (y.equals(z)));

        int x2 = y.intValue();      // unwrap it
        x2++;                       // use it
        y = new Integer(x2);        // rewrap it

        //all the wrapper classes, two objects are equal if they are of the same type and have the same value
        Integer i1 = 1000;
        Integer i2 = 1000;
        if(i1 != i2) System.out.println("different objects");
        if(i1.equals(i2)) System.out.println("meaningfully equal");
        //!!!!!
        Integer i3 = 10;
        Integer i4 = 10;
        if(i3 == i4) System.out.println("same object");
        if(i3.equals(i4)) System.out.println("meaningfully equal");
        //When == is used to compare a primitive to a wrapper, the wrapper will be
        //unwrapped and the comparison will be primitive to primitive.
        //!= telling us that i1 and i2 are different objects
        //Remember, wrapper reference variables can be null. That means you have
        //to watch out for code that appears to be doing safe primitive operations but that could throw a NullPointerException :
        ArrayList<String> stuff = new ArrayList<>();
        List<Collect> myDogs = new ArrayList<>();
        Map<String, Collect> dogMap = new HashMap<>();
        //WRONG List<> wrong = new ArrayList<String>();
        stuff.add("Denver");
        stuff.add("Boulder");
        stuff.add("Vail");
        stuff.add("Aspen");
        stuff.add("Telluride");
        System.out.println("unsorted " + stuff);
        Collections.sort(stuff);    // #2
        System.out.println("sorted" + stuff);
        //Collections.sort() he List must implement an interface called Comparable
        //The sort() method uses compareTo() to determine how the List or object array should be sorted.

        //Sorting with Collections
        //Comparator s cannot be used when searching arrays of primitives.
        class DVDInfo implements Comparable<DVDInfo> {
            String title;
            String genre;
            String leadActor;
            DVDInfo(String t, String g, String a) {
                title = t; genre = g; leadActor = a;
            }
            public String toString() {
                return title + " " + genre + " " + leadActor + "\n";
            }
            public int compareTo(DVDInfo d) {
                return title.compareTo(d.getTitle());
            }


            public String getTitle() {
                return title;
            }
            public String getGenre(){
                return genre;
            }
            // other getters and setters
            }

            //you have to implement Comperatot outside of the class in the new class
            // Many sort sequences can be created.
            // whenever you want to sort an array or a collection, the elements inside must all be mutually comparable. In other
            // words, if you have an Object[] and you put Cat and Dog objects into it, you won't be
            // able to sort it. In general, objects of different types should be considered NOT mutually comparable unless specifi cally stated otherwise.
            class GenreSort implements Comparator<DVDInfo> {
                public int compare(DVDInfo one, DVDInfo two) {
                    return one.getGenre().compareTo(two.getGenre());
                }
            }

        //Sorting with Arrays

        //The Arrays.sort() method is overloaded in the same way the Collections.sort() method is:
        // ■ Arrays.sort(arrayToSort)
        // ■ Arrays.sort(arrayToSort, Comparator)
        //The Arrays.sort(myArray) methods that sort primitives always sort
        //based on natural order. Don't be fooled by an exam question that tries to sort a primitive array using a Comparator .

        //Searching Arrays and Collections
        /*■ Searches are performed using the binarySearch() method.
        ■ Successful searches return the int index of the element being searched.
        ■ The collection/array being searched must be sorted before you can search it.
        ■ If you attempt to search an array or collection that has not already been
        sorted, the results of the search will not be predictable.
        ■ If the collection/array you want to search was sorted in natural order, it must
        be searched in natural order. (Usually, this is accomplished by NOT sending a
        Comparator as an argument to the binarySearch() method.)
        ■ If the collection/array you want to search was sorted using a Comparator , it
        must be searched using the same Comparator , which is passed as the second
        argument to the binarySearch() method. Remember that Comparator s
        cannot be used when searching arrays of primitives.
        */
        String [] sa = {"one", "two", "three", "four"};
        Arrays.sort(sa);
        for(String s : sa)
        System.out.print(s + " ");
        System.out.println("\none = "+ Arrays.binarySearch(sa,"one"));
        System.out.println("now reverse sort");
        Collect.ReSortComparator rs = new Collect.ReSortComparator();
        Arrays.sort(sa,rs);
        for(String s : sa)
        System.out.print(s + " ");
        System.out.println("\none = "+ Arrays.binarySearch(sa,"one"));
        System.out.println("one = "+ Arrays.binarySearch(sa,"one",rs));
        //Searching an array or collection that hasn't been sorted.
        //Using a Comparator in either the sort or the search, but not both.

        //Converting Arrays to Lists to Arrays
        //List and Set classes have toArray() methods
        //Arrays class has a method called asList()
        String[] psa = {"one", "two", "three", "four"};
        List sList = Arrays.asList(psa);
        // make a List
        System.out.println("size " + sList.size());
        System.out.println("idx2 " + sList.get(2));
        sList.set(3,"six");
        // change List
        psa[1] = "five";
        // change array
        for(String s : psa)
        System.out.print(s + " ");
        System.out.println("\nsl[1] " + sList.get(1));
        //they has affect to each other if you change them

        List<Integer> iL = new ArrayList<Integer>();
        for(int s=0; s<3; s++)
            iL.add(s);
        Object[] oa = iL.toArray();// create an Object array
        Integer[] ia2 = new Integer[3];
        ia2 = iL.toArray(ia2);// create an Integer array


        //Vector
        //Vector and Hashtable were the two original collection
        //Vactor is the same as ArrayList but syncronized thread-safe
        List<String> vcts = new Vector<>();

        //LinkedList
        //A LinkedList is ordered by index position and elements are doubly linked to one another
        //makes it an easy choice for implementing a stack or queue.
        //good choice when you need fast insertion and deletion
        List<String> lits = new LinkedList<>();


        //Set interface
        //A Set cares about uniqueness—it doesn't allow duplicates. equals() method determines whether two objects are identical

        boolean[] ba = new boolean[5];
        Set s = new HashSet();
        //Set s = new TreeSet();//its elements must be mutually comparable wont be compiled with this cause of type
         ba[0] = s.add("a");
        ba[1] = s.add(new Integer(42));
        ba[2] = s.add("b");
        ba[3] = s.add("a");
        ba[4] = s.add(new Object());
        for(int t=0; t<ba.length; t++)
        System.out.print(ba[t] + " ");
        System.out.println();
        for(Object o : s)
        System.out.print(o + " ");
        //HashSet
        //A HashSet is an unsorted, unordered Set
        //more efficient your hashCode() implementation, the better access performance you'll get.
        //Use this class when you want a collection with no duplicates and you don't care about order when you iterate through it.
        //the objects you add to them must override hashCode()
        Set<String> hset = new HashSet<>();

        //LinkedHashSet
        //A LinkedHashSet is an ordered version of HashSet that maintains a doubly linked List across all elements.
        //Use this class when you care about the iteration order.
        //the objects you add to them must override hashCode()
        Set<String> liset = new LinkedHashSet<>();

        //TreeSet
        //The TreeSet is one of two sorted collections, It uses a Red-Black tree structure
        Set<String> trset = new TreeSet<>();


        //Map interface
        //A Map cares about unique identifiers. You map a unique key (the ID) to a specific
        //value, where both the key and the value are, of course, objects
        //Like Set s, Map s rely on the equals() method to determine whether two keys are the same or different.
        //Remember that when you use a class that implements Map , any classes that you use
        //as a part of the keys for that map must override the hashCode() and equals() methods.

        //HashMap
        //The HashMap gives you an unsorted, unordered Map.
        //Where the keys land in the Map is based on the key's hashcode, so, like HashSet , the more efficient your
        //hashCode() implementation, the better access performance you'll get. HashMap allows one null key and multiple null values in a collection.

        //Hashtable
        //Hashtable is the synchronized counterpart to HashMap
        //Hashtable doesn't let you have anything that's null .

        //LinkedHashMap
        //LinkedHashMap collection maintains insertion order (or, optionally, access order)

        //TreeMap
        //TreeMap is a sorted Map, lets you define a custom sort order (via a Comparator ) when you construct a TreeMap
        //that specifies how the elements should be compared to one another when they're being ordered


        //Queue Interface
        //Queue is designed to hold a list of "to-dos," FIFO

        //PriorityQueue
        //The purpose of a PriorityQueue is to create a "priority-in, priority out" queue as opposed to a typical FIFO queue.
        //elements are ordered either by natural ordering
    }
    static class ReSortComparator implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}
