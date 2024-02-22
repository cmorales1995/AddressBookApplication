package address.data;

import java.util.TreeMap;
// more info on treemaps
//https://www.geeksforgeeks.org/treemap-in-java/
public class AddressBook {
    Integer keys = 0;
    static TreeMap<Integer, String> books = new TreeMap<>();

    public static TreeMap<Integer, addressEntry> addressEntryList = new TreeMap<>();

    public static void add(addressEntry entry){
        AddressBook.addressEntryList.put(2,entry);
    }
    /*
    Difference between these two functions is how they grab the elements in the treemap.
     */
    public static void list(int key) {

        System.out.println(books.get(key));
    }
    public static void list2() {

        System.out.println(addressEntryList.values());
    }
    /*
    This is a function that allows me to see the contents of the treemap.
    */

}


