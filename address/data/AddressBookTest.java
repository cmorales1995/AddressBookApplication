package address.data;

public class AddressBookTest {
    /*
    In this class I need to test the functions I create for AddressBook
     */
    public static void TreeInformation() {
        if (AddressBook.addressEntryList.isEmpty()) {
            System.out.println("The AddressBook Tree map is empty");
        } else {
            System.out.println("The AddressBook Tree map length:");
            System.out.println(AddressBook.addressEntryList.size());
        }
    }

}
