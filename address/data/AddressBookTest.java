package address.data;

public class AddressBookTest {
    /*
    This is just an instance of an address entry.
     */
   // public static AddressBook addressbook = new AddressBook();
   // public static AddressBook addressEntryList = new AddressBook();


    public static void TreeInformation() {
        if (AddressBook.addressEntryList.isEmpty()) {
            System.out.println("The AddressBook Tree map is empty");
        } else {
            System.out.println("The AddressBook Tree map length:");
            System.out.print(AddressBook.addressEntryList.size());
        }
    }

    /*
    In this class i need to test the functions I create for AddressBook
     */

}
