package com.shubham.addressbook;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;



    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setZipcode(String zipcode){
        this.zipcode=zipcode;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
    public String getZipcode(){
        return this.zipcode;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }

}
