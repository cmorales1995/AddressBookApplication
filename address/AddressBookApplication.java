package address;

import address.data.addressEntry;
import address.data.AddressBook;

//import addressEntry.java;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddressBookApplication {
    static AddressBook addressbook = new AddressBook();

    public static void initAddressBookExercise(AddressBook ab) {
        addressEntry testName = new addressEntry("John", "Smith", "A street",
                "Hayward" ,"CA", 992, "920-023", "Jsmith@gmail.com");
        // this has default values given by the contructor.
        addressEntry ml = new addressEntry();
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

    }
    public static void main(String[] args) {

        initAddressBookExercise(addressbook);
    }

}