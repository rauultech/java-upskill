package day03_oop;

public class Address {
    private String street;
    private String zipCode;
    private String city;

    public Address (String street, String zipCode, String city) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + "Pin - " + zipCode;
    }
}
