package address;

import address.data.AddressBookTest;
import address.data.MenuTest;
import address.data.addressEntry;
import address.data.AddressBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Project Requirements:
//http://borg.csueastbay.edu/~grewe/CS401/Projects/Proj1.htm
//import addressEntry.java;


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
        System.out.println("*****Out of this initAddressBookExercise function*****");

    }

    public static void main(String[] args) {
       /*
        File test = new File("/Users/cesarmorales/IdeaProjects/AddressBookApplication/src/address/data/Test.txt");

        initAddressBookExercise(addressbook);
        AddressBook.ReadFile(test);
        */
        Menu.displayMenu();

        // this was test code of an instance I created in my test class. I deleted it.
       // System.out.println(AddressBookTest.testcase.getFirstname());
        /*
        String n = "Hello";
        addressEntry testName2 = new addressEntry("John", "Smith", "A street",
                "Hayward" ,"CA", 992, "920-023", "Jsmith@gmail.com");
        AddressBook.books.put(2, n);
        System.out.println(AddressBook.books.get(2));
        AddressBookTest.TreeInformation();
        System.out.println();
        AddressBook.remove(testName2);
        Menu.prompt_FirstName();
         */

    }

}