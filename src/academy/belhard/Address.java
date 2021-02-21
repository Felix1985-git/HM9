package academy.belhard;

public class Address {
    private String city;
    private String street;
    private int homeNumber;

    public Address(String city, String street, int homeNumber) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        if (this.city == null || this.street == null || this.homeNumber == 0) {
            throw new NullFieldException("Поле не может null");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (this.city == null) {
            throw new NullFieldException("Поле не может null");
        }
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (this.street == null) {
            throw new NullFieldException("Поле не может null");
        }
        this.street = street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        if (this.homeNumber == 0) {
            throw new NullFieldException("Поле не может 0");
        }
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "City - " + city +
                "; Street - " + street +
                "; NumberHouse - " + homeNumber
                + "\n";
    }
}
