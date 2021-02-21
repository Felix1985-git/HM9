package academy.belhard;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        if (this.firstName == null || this.lastName == null || this.address == null) {
            throw new NullFieldException("Поле не может null");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (this.firstName == null) {
            throw new NullFieldException("Поле не может null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (this.lastName == null) {
            throw new NullFieldException("Поле не может null");
        }
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (this.address == null) {
            throw new NullFieldException("Поле не может null");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name - " + firstName +
                "; Surname - " + lastName +
                "; City - " + address.getCity() +
                "; Street - " + address.getStreet() +
                "; NumberHouse - " + address.getHomeNumber()
                + "\n";

    }

}
