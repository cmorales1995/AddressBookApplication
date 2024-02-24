package address;

import java.util.Scanner;

import static java.lang.String.valueOf;

//https://www.youtube.com/watch?v=hOxeh_j4MEc&themeRefresh=1
public class Menu {

    public static void displayMenu(){
        Scanner menuObject = new Scanner(System.in);
        String conditonalString = null;
        do {
            TextDisplay();
            // String input since I will use a switch statement to load file.
            String option = menuObject.nextLine().toUpperCase();
            conditonalString = option;
            System.out.println(conditonalString + " --- this is the conditional");
                //this switch statement will call other functions in order for the menu to work.
                /*
                at the moment the switch statement looks at lower case letters only.
                 */
                switch (option) {
                    case ("A"):
                        System.out.println(option);
                        break;
                    case ("B"):
                        System.out.println(option);
                        break;
                    case ("C"):
                        System.out.println(option);
                        break;
                    case ("D"):
                        System.out.println(option);
                    case ("E"):
                        System.out.println(option);
                        break;
                    case ("F"):
                        System.out.println(option);
                        break;
                    default:
                        System.out.println(option + " is not an option");
                        System.out.println("Please Try again");
                        break;
                }

        }

            while (!conditonalString.equals("f") && !conditonalString.equals("F"));

            System.out.print("Quiting");
    }

    public static String prompt_FirstName(){
        System.out.print("First Name: ");
            return "Jane";
    }
    public static String prompt_LastName() {
        System.out.print("Last Name: ");
            return "Doe";
        }
    public static String prompt_Street(){
        System.out.print("Street: ");
        return "Default street";
    }
    public static String prompt_City(){
        System.out.print("City: ");

        return "Default city";
    }
    public static String prompt_State(){
        System.out.print("State: ");
        return "Default State";
    }
    public static String prompt_Zip(){
        System.out.print("Zip Code:");
        return "9921";
    }
    public static String prompt_Telephone(){
        System.out.print("Phone Number:");
        return "911";
    }
    public static String prompt_Email(){
        System.out.print("Email: ");
        return "email@yahoo.com";
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
}

//remainder code
/*
        //this is the first name
        String first_Name = Menu.prompt_FirstName();
        System.out.println(first_Name);
        // this is the last name
        String last_Name = Menu.prompt_LastName();
        System.out.println(last_Name);
        // This is the street
        String Street_name = Menu.prompt_Street();
        System.out.println(Street_name);
        // This is the city
        String city_name = Menu.prompt_City();
        System.out.println(city_name);
        // This is the state
        String State_name = Menu.prompt_State();
        System.out.println(State_name);
        // This is the zip code
        String zip_code = Menu.prompt_Zip();
        System.out.println(zip_code);
        // This is the phone number
        String phone_number = Menu.prompt_Telephone();
        System.out.println(phone_number);
        // This is the email address
        String email_address = Menu.prompt_Email();
        System.out.println(email_address);
        */
