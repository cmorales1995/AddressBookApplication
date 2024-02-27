package address.data;

import address.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// more info on Tree maps
//https://www.geeksforgeeks.org/treemap-in-java/
//https://www.geeksforgeeks.org/how-to-iterate-over-a-treemap-in-java/
//https://stackoverflow.com/questions/43688506/how-to-format-the-output-of-a-treemap
public class AddressBook {
    /*
    there are currently two Tree maps being used in here for general testing.
    I need to see which one has the better implementation
     */
    private static int keys = 0;

    public static TreeMap<Integer, String> books = new TreeMap<>();

    public static TreeMap<Integer, addressEntry> addressEntryList = new TreeMap<>();

    public static void add(Integer MasterKey,addressEntry entry){
        Integer updateKeys;
        updateKeys = getKeys();

        if (MasterKey.equals(0)) {
            System.out.println("MASTER KEY VALUE: " + MasterKey);
            AddressBook.addressEntryList.put(0,entry);
        }
        else {
            AddressBook.addressEntryList.put(MasterKey, entry);
        }
        System.out.println("the key value is: " + MasterKey);
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
    public static void list3(){
        // stack overflow suggestion:
        AddressBook.addressEntryList.entrySet().forEach(System.out::println);
    }
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
    //this needs the key.
    // also see if you can just use TEST as the input rather than creating a different object for it.
    public static void ReadFile(File test){

        System.out.println(test.exists());
        Scanner OpenFile;
        addressEntry ml = new addressEntry();
        try {
            OpenFile = new Scanner(test);
         }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // if I want the file to go through every line, I need a delimiter to parse it.
        // currently this will reset the first name every time it's the while loop.
        List<String> results = new ArrayList<>();
        String data;
        // I can create an entry and push it with the key.
        while (OpenFile.hasNextLine()) {
            data = OpenFile.nextLine();
            results.add(List.of(Arrays.toString(data.split("\\s+"))).toString().replace("[", "")
                    .replace("]", "")
            );
        }
        //     results = List.of(data.split("\\s+"));
        if (results.isEmpty()) {
            System.out.println("File did not contain any information.");
            }

    //System.out.println(results.size() % 8 ); // this should be 0
    //System.out.println(results.get(3));
        int LoopResults = results.size() / 8;
        System.out.println(LoopResults);
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
        do{
              int counter = 0;
//            ml.setFirstname(results.get(0 + counter));
//            ml.setLastName(results.get(1 + counter));
//            String streetName = results.get(2 + counter);
//            ml.setStreet(streetName);
//            ml.setCity(results.get(3 + counter));
//            ml.setState(results.get(4 + counter));
//            ml.setZip(Integer.parseInt(results.get(5 +counter)));
//            ml.setPhone(results.get(6 +counter));
//            ml.setEmail(results.get(7 +counter));
//            counter = counter + 8;
//            add(Menu.MenuKey, ml);
//            Menu.MenuKey++;
            LoopResults = LoopResults - 1 ;
            System.out.println(results.get(0));
            System.out.println(results.get(8));
            System.out.println(LoopResults);
        }
        while(LoopResults != 0);

//       // ml.setFirstname(results.get(0));
//
//
//    for (int i = 0; i < results.size(); i++){
//            ml.setFirstname(results.get(i));
//            ml.setLastName(results.get(i+1));
//           String streetName = results.get(i+1) + " " + results.get(i+1);
//
//            ml.setStreet(streetName);
//            ml.setCity(results.get(i+1));
//            ml.setState(results.get(i+1));
//            System.out.println(i);
//            int zipcode = results();
//            ml.setZip(i+1);
//            ml.setPhone(results.get(i+1));
//            ml.setEmail(results.get(i+1));
//        }

        System.out.println(Menu.MenuKey);
    message();
    }

    public static void message(){
        System.out.println("*****Out of this Address Book function*****");
    }

    public static Integer getKeys() {
        return keys;
    }

    public static void setKeys(Integer keys) {
        AddressBook.keys = keys;
    }


}






