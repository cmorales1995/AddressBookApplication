package address;

import address.data.AddressBook;
import address.data.AddressBookTest;
import address.data.addressEntry;

import java.io.File;
import java.util.Scanner;

//import static java.lang.String.valueOf;

//https://www.youtube.com/watch?v=hOxeh_j4MEc&themeRefresh=1
public class Menu {

    public static void displayMenu(){
        Scanner menuObject = new Scanner(System.in);
        File UserFileName;
        String ConditionalString;
        do {

            TextDisplay();
            // String input since I will use a switch statement to load file.
            String option = menuObject.nextLine().toUpperCase();

            ConditionalString = option;
            System.out.println(ConditionalString + " --- this is the conditional");
                //this switch statement will call other functions in order for the menu to work.
                /*
                at the moment the switch statement looks at lower case letters only.
                 */
                switch (option) {
                    case ("A"):
                        System.out.println("Please Enter the file name:");
                        UserFileName = new File(menuObject.nextLine());
                        String FileSource = "address/data/" + UserFileName;
                        System.out.println(FileSource);

                        AddressBook.ReadFile(new File(FileSource));
                        break;
                    // This is the Additional in order to add
                    // another entry to the end of data structure
                    case ("B"):
                        String Confirmation;
                        String InputFirstname;
                        String InputLastName;
                        String InputStreetName;
                        String InputCity;
                        String InputState;
                        String InputZipCode;
                        String InputTelephone;
                        String InputEmail;
                        do {
                            Scanner ConfirmationInput = new Scanner(System.in);
                            System.out.println("Please Enter the following information to Add:");

                            InputFirstname = prompt_FirstName();
                            System.out.println(InputFirstname);

                            InputLastName = prompt_LastName();
                            System.out.println(InputLastName);

                            InputStreetName = prompt_Street();
                            System.out.println(InputStreetName);

                            InputCity = prompt_City();
                            System.out.println(InputCity);

                            InputState = prompt_State();
                            System.out.println(InputState);

                            InputZipCode = prompt_Zip();
                            System.out.println(InputZipCode);

                            InputTelephone = prompt_Telephone();
                            System.out.println(InputTelephone);

                            InputEmail = prompt_Email();
                            System.out.println(InputEmail);

                            System.out.println("Is This Correct? Y/N");
                            Confirmation = ConfirmationInput.nextLine().toUpperCase();
                        }
                        while (!Confirmation.equals("Y"));
                        // This is when the add function should be called.
                        Additional(InputFirstname, InputLastName, InputStreetName, InputCity, InputState,
                                InputZipCode, InputTelephone, InputEmail);
                        System.out.println("Returning to Menu");
                        break;
                    // This is the Removal function used to delete an entry by last name
                    // in the data structure
                    case ("C"):
                        System.out.println(option);
                        break;
                    /*
                    This function is used to find entries in the Address Book
                     */
                    case ("D"):
                        System.out.println(option);
                        break;
                    /*
                    This function is used to list the Address Book
                     */
                    case ("E"):
                        //AddressBook.addressEntryList.values();
                        System.out.println(option);
                        break;
                     /*
                    This ends the program and Menu.
                     */
                    case ("F"):
                        System.out.println(option);
                        break;
                    default:
                        System.out.println(option + " is not an option");
                        System.out.println("Please Try again");
                        break;
                }

        }
            while (!ConditionalString.equals("F"));
           // while (!ConditionalString.equals("f") && !conditionalString.equals("F"));
            System.out.print("Quiting");
    }

    public static String prompt_FirstName(){
        System.out.print("First Name: ");
        Scanner FirstName = new Scanner(System.in);
        return String.valueOf(FirstName.nextLine());
    }
    public static String prompt_LastName() {
        System.out.print("Last Name: ");
        Scanner LastName = new Scanner(System.in);
        return String.valueOf(LastName.nextLine());
        }
    public static String prompt_Street(){
        System.out.print("Street: ");
        Scanner StreetInput = new Scanner(System.in);
        return String.valueOf(StreetInput.nextLine());
    }
    public static String prompt_City(){
        System.out.print("City: ");
        Scanner CityInput = new Scanner(System.in);
        return String.valueOf(CityInput.nextLine());
    }
    public static String prompt_State(){
        System.out.print("State: ");
        Scanner StateInput = new Scanner(System.in);
        return String.valueOf(StateInput.nextLine());
    }
    public static String prompt_Zip(){

        System.out.print("Zip Code:");
        Scanner ZipCodeInput = new Scanner(System.in);
        return String.valueOf(ZipCodeInput.nextLine());
    }
    public static String prompt_Telephone(){
        System.out.print("Phone Number:");
        Scanner PhoneInput = new Scanner(System.in);
        return String.valueOf(PhoneInput.nextLine());
    }
    public static String prompt_Email(){
        System.out.print("Email: ");
        Scanner EmailInput = new Scanner(System.in);
        return String.valueOf(EmailInput.nextLine());
    }
    private static void TextDisplay(){
        System.out.println("*******************************");
        System.out.println("A)Loading from a File:");
        System.out.println("B)Additional");
        System.out.println("C)Removal");
        System.out.println("D)Find:");
        System.out.println("E)Listing");
        System.out.println("F)Quit:");
        System.out.println("*******************************");
    }
    public static void Additional(String FirstName, String LastName, String Street, String City,
                                  String State , String ZipCode , String Phone , String Email) {
       int ZipConvert = Integer.parseInt(ZipCode);
        addressEntry Contact = new addressEntry(FirstName,LastName,Street, City,
               State ,  ZipConvert , Phone ,Email);

        AddressBook.add(Contact);
        AddressBookTest.TreeInformation();
    }
}
