package code.challenge;

public class Address {

    public Address(String streetName, String societyName, String city) {
        this.streetName = streetName;
        this.societyName = societyName;
        this.city = city;
    }

    public String streetName;
    public String societyName;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", societyName='" + societyName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
