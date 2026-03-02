package day04_oop_inheritance;

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
