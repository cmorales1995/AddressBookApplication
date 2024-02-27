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

    public static void list(){
        for (Map.Entry<Integer,addressEntry> entry : addressEntryList.entrySet()) {
            System.out.println(entry.getKey() + ")" + entry.getValue().toString());
        }
    }
    public static void remove(Integer entry){
//        Set<Map.Entry<Integer, addressEntry> > entries = addressEntryList.entrySet();
//
//        for (Map.Entry<Integer, addressEntry> entry : entries) {
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//            if (entry.getValue() ==  name)
//                System.out.println("TRUE");
//            else
//                System.out.println("False");
            if(entry <= AddressBook.addressEntryList.size()){
                AddressBook.addressEntryList.remove(entry);
                Menu.MenuKey = Menu.MenuKey - 1;
            }
            else{
                System.out.println("User Entry is larger than address book size, Try again.");
            }


    }
    //this needs the key.
    // also see if you can just use TEST as the input rather than creating a different object for it.
    public static void ReadFile(File test){
        if(test.exists()) {
            System.out.println(test.exists());
            Scanner OpenFile;
            addressEntry FileEntryObject = new addressEntry();
            try {
                OpenFile = new Scanner(test);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            while (OpenFile.hasNextLine()) {
                FileEntryObject.setFirstname(OpenFile.nextLine());
                FileEntryObject.setLastName(OpenFile.nextLine());
                FileEntryObject.setStreet(OpenFile.nextLine());

                FileEntryObject.setCity(OpenFile.nextLine());
                FileEntryObject.setState(OpenFile.nextLine());

                FileEntryObject.setZip(Integer.parseInt(OpenFile.nextLine()));
                FileEntryObject.setPhone(OpenFile.nextLine());
                FileEntryObject.setEmail(OpenFile.nextLine());
                AddressBook.addressEntryList.put(Menu.MenuKey,FileEntryObject);
               // add(Menu.MenuKey, FileEntryObject);
                Menu.MenuKey = Menu.MenuKey + 1;
            }

            System.out.println(Menu.MenuKey);
            message();
        }
        else
            System.out.println("File does not exist. Please place file in Source folder.");
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






