import java.util.*;

public class WorkWithArrayList{

//You need to be able to increase and decrease the size of your list of things.
//■ The order of things in your list is important and might change.
    public static void main(String[] args){
        List<String> strli = new ArrayList<>();
        //ArrayList implements the List interface
        //ArrayLists can have duplicates
        strli.add("oslo");
        strli.add("budapest");
        int index = strli.indexOf("budapest");
        System.out.println("strli: " + strli);
        System.out.println("index: " + index);
        strli.add(0, "bukarest");
        strli.add(index, "belgrad");
        System.out.println("string list: " + strli);
    }
}
