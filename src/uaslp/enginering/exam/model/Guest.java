package uaslp.enginering.exam.model;

public class Guest {
    private String Name;
    private String Address;
    private String Country;
    private String PhoneNumber;

    public String getName() { return Name;}

    public void setName(String name) {
        this.Name = name;
    }

    public String getAddress() { return Address;}

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getCountry() { return Country;}

    public void setCountry(String country) {
        this.Country = country;
    }

    public String getPhoneNumber() { return PhoneNumber;}

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
}
