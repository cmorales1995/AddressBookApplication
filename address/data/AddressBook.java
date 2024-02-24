package address.data;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// more info on Tree maps
//https://www.geeksforgeeks.org/treemap-in-java/
//https://www.geeksforgeeks.org/how-to-iterate-over-a-treemap-in-java/
public class AddressBook {
    /*
    there are currently two Tree maps being used in here for general testing.

     */
    Integer keys = 0;
    public static TreeMap<Integer, String> books = new TreeMap<>();

    public static TreeMap<Integer, addressEntry> addressEntryList = new TreeMap<>();

    public static void add(addressEntry entry){
        AddressBook.addressEntryList.put(2,entry);
    }
    /*
    Difference between these two functions is how they grab the elements in the treemap.
     */
     /*
    This is a function that allows me to see the contents of the treemap.
    */
    public static void list(int key) {

        System.out.println(books.get(key));
    }
    public static void list2() {

        System.out.println(addressEntryList.values());
    }
    // this needs a string in order to search and remove

    public static void remove(addressEntry name){
        Set<Map.Entry<Integer, addressEntry> > entries = addressEntryList.entrySet();

        for (Map.Entry<Integer, addressEntry> entry : entries) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
            if (entry.getValue() ==  name)
                System.out.println("TRUE");
            else
                System.out.println("False");

        }

        }



        //addressEntryList.

}






