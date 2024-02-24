package address;

import address.data.AddressBookTest;
import address.data.addressEntry;
import address.data.AddressBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//import addressEntry.java;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// learned how to take away brackets from here.
//https://www.knowprogram.com/java/print-arraylist-without-brackets-java/
public class AddressBookApplication {
    public static AddressBook addressbook = new AddressBook();

    /*
    This is a function that creates an entry
    and places the entry into the addressbook data structure.
     */
    public static void initAddressBookExercise(AddressBook ab) {
        addressEntry testName = new addressEntry("John", "Smith", "A street",
                "Hayward" ,"CA", 992, "920-023", "Jsmith@gmail.com");
        // this has default values given by the contructor.
        addressEntry ml = new addressEntry();
        /*
        This area is going to be used to open a file.
        this is the exact file path it should be
         */
        File test = new File("/Users/cesarmorales/IdeaProjects/AddressBookApplication/src/address/data/Test.txt");
        System.out.println(test.exists());
        Scanner myReader = null;
        try {
            myReader = new Scanner(test);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // if i want the file to go through every line, i need a delimiter to parse it.
        // currently this will reset the first name every time it's the while loop.
        List<String> results = new ArrayList<>();
        String data = null;
        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            results.add(List.of((String)
                    Arrays.toString(data.split("\\s+"))).toString().replace("[", "")
                    .replace("]", "")
            );
            }
       //     results = List.of(data.split("\\s+"));
            if (results.size() == 0){
                System.out.println("LIST IS 0");

           // ml.setFirstname(results.get(0));
           // System.out.println();
        }

        System.out.println(results.size());
         ml.setFirstname(results.get(0));
         ml.setLastName(results.get(1));
        // String streetName = results.get(2) + " " + results.get(3);
         ml.setStreet((results.get(2) + results.get(3)));
         ml.setCity(results.get(4));
         ml.setState(results.get(5));
         //ml.setZip(Integer.parseInt(results.get(6)));
         ml.setPhone(results.get(7));
         //ml.setEmail(results.get(8));

        /*
          System.out.println(results.toString()
                .replace("[", "")
                .replace("]", ""));
         */

        //this is the treemap and i was able to place the first entry with key 1
        // the second value with key 2
        AddressBook.addressEntryList.put(1,testName);
        AddressBook.add(ml);
        //addressEntryList.books2.put(2,ml);

        //System.out.println(book1.toString());

        // use the key and get function to access the data structure without the []
        // in addressEntryList, i will need to provide a key.
        AddressBook.list(1);
        AddressBook.list2();
        //
        System.out.print("*****Out of this initAddressBookExercise function*****");

    }
    public static void main(String[] args) {

        initAddressBookExercise(addressbook);
        System.out.println(100);

        // this was test code of an instance I created in my test class. I deleted it.
       // System.out.println(AddressBookTest.testcase.getFirstname());

        String n = "Hello";
        addressEntry testName2 = new addressEntry("John", "Smith", "A street",
                "Hayward" ,"CA", 992, "920-023", "Jsmith@gmail.com");
        AddressBook.books.put(2, n);
        System.out.println(AddressBook.books.get(2));
        AddressBookTest.TreeInformation();
        System.out.println();
        AddressBook.remove(testName2);
        Menu.prompt_FirstName();
    }

}