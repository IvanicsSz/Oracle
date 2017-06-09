
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
        List<String> strs = new ArrayList<>();//fast iteration and fast random access
        strs.add("new");
        System.out.println("Arraylist" + "\n");
        System.out.println("index of new: " + strs.indexOf("new"));
        System.out.println("get(0): " + strs.get(0));
        System.out.println("contains old: " + strs.contains("old"));
        System.out.println("size: " + strs.size());
        System.out.println("In general, collections can hold Objects but not primitives.");

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
}
