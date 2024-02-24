package address.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// more info on Tree maps
//https://www.geeksforgeeks.org/treemap-in-java/
//https://www.geeksforgeeks.org/how-to-iterate-over-a-treemap-in-java/
public class AddressBook {
    /*
    there are currently two Tree maps being used in here for general testing.
    I need to see which one has the better implementation
     */
    //Integer keys = 0;

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

    public static void ReadFile(File test){

        System.out.println(test.exists());
        Scanner myReader;
        try {
            myReader = new Scanner(test);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // if I want the file to go through every line, I need a delimiter to parse it.
        // currently this will reset the first name every time it's the while loop.
        List<String> results = new ArrayList<>();
        String data;
        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            results.add(List.of(Arrays.toString(data.split("\\s+"))).toString().replace("[", "")
                    .replace("]", "")
            );
        }
        //     results = List.of(data.split("\\s+"));
        if (results.isEmpty()) {
            System.out.println("File did not contain any information.");
            }
            // ml.setFirstname(results.get(0));
            // System.out.println();
            System.out.println(results.size());

            /*
            ml.setFirstname(results.get(0));
            ml.setLastName(results.get(1));
            // String streetName = results.get(2) + " " + results.get(3);
            ml.setStreet((results.get(2) + results.get(3)));
            ml.setCity(results.get(4));
            ml.setState(results.get(5));
            //ml.setZip(Integer.parseInt(results.get(6)));
            ml.setPhone(results.get(7));
            //ml.setEmail(results.get(8));
             */

        message();
    }

    public static void message(){
        System.out.println("*****Out of this Address Book function*****");
    }
        //addressEntryList.

}






