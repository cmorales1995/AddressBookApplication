package address.data;

public class AddressBookTest {
    /*
    This is just an instance of an address entry.

    public static AddressBook Address Book = new AddressBook();
    public static AddressBook addressEntryList = new AddressBook();
*/

    public static void TreeInformation() {
        if (AddressBook.addressEntryList.isEmpty()) {
            System.out.println("The AddressBook Tree map is empty");
        } else {
            System.out.println("The AddressBook Tree map length:");
            System.out.println(AddressBook.addressEntryList.size());
        }
    }

    /*
    In this class I need to test the functions I create for AddressBook
     */

}
