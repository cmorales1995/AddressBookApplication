package address.data;

//import java.util.Collection;
/// look up hashmap... /// linked
public class addressEntry {
    /**
     * private variables for this class.
     */
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;
    public addressEntry(){
        this.firstName = "default";
        this.lastName = "last name default";
        this.street = "default street";
        this.city = "default city";
        this.state = "default state";
        this.zip = 0;
        this.phone = "default number";
        this.email = "default email";
    }
    // This is one of the constructors for the class that
    // takes Strings in order to set private variables.
    public addressEntry(String firstName, String lastName, String street, String city,
     String State , int zip , String phone , String email) {
        setFirstname(firstName);
        setLastName(lastName);
        setStreet(street);
        setCity(city);
        setState(State);
        setZip(zip);
        setPhone(phone);
        setEmail(email);
    }

    /**
     * toString() is function that displays strings to the console.
     */
    public String toString(){

        return  getFirstname() + ' ' + getLastName() + '\n' +
                ' ' + getStreet() + ' ' + '\n' +
                ' ' + getCity()  + '\n' +
                ' ' + getState() + ' ' + getZip()    + '\n' +
                ' ' + getPhone() + ' ' + getEmail()  + '\n';
    }

    /**
     *
     * The following code is a block of getters and setters for addressEntry
     */
    public void setFirstname(String firstname) { this.firstName = firstname;}

    public String getFirstname() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
