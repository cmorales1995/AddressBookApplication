package address.data;

import address.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// more info on Tree maps
// These were some links that helped me use a treemap
//https://www.geeksforgeeks.org/treemap-in-java/
//https://www.geeksforgeeks.org/how-to-iterate-over-a-treemap-in-java/
//https://stackoverflow.com/questions/43688506/how-to-format-the-output-of-a-treemap
public class AddressBook {
    /*
    there are currently two Tree maps being used in here for general testing.
    I need to see which one has the better implementation
     */


    public static TreeMap<Integer, addressEntry> addressEntryList = new TreeMap<>();

    /*
    This is the add function which looks at the key given and placed the incoming object into an index.
    if the key is zero then it's the first entry or object otherwise it the values continue to ascend.
     */
    public static void add(Integer MasterKey,addressEntry entry){

        if (MasterKey.equals(0)){ AddressBook.addressEntryList.put(0,entry);}

        else {
            AddressBook.addressEntryList.put(MasterKey, entry);
        }
    }

    public static void list(){
        for (Map.Entry<Integer,addressEntry> entry : addressEntryList.entrySet()) {
            System.out.println(entry.getKey()+1 + ")" + entry.getValue().toString());
        }
    }
    public static void remove(Integer entry){

            if(entry <= AddressBook.addressEntryList.size()){
                AddressBook.addressEntryList.remove(entry);
                Menu.MenuKey = Menu.MenuKey - 1;
            }
            else{
                System.out.println("User Entry is larger than address book size, Try again.");
            }


    }

    /*
    This function grabs the UserFile string and checks to see if the file exists and
    while it does, place all the contents into an addressEntry Object and
    calls the Additional function to add to the TreeMap
     */
    public static void ReadFile(File UserFile){

        if(UserFile.exists()) {
            System.out.println(UserFile.exists());
            Scanner OpenFile;

            try {
                OpenFile = new Scanner(UserFile);
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            while (OpenFile.hasNextLine()){
                Menu.Additional(OpenFile.nextLine(),
                                OpenFile.nextLine(),
                                OpenFile.nextLine(),
                                OpenFile.nextLine(),
                                OpenFile.nextLine(),
                                OpenFile.nextLine(),
                                OpenFile.nextLine(),
                                OpenFile.nextLine());
            }
            // Some confirmation messages.
            System.out.println(Menu.MenuKey + " Entries have been transferred.");
            System.out.println("*****Returning to Menu*****");

        }
        else
            System.out.println("File does not exist. Please place file in Source folder.");
    }

}
