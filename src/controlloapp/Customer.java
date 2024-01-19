package controlloapp;

import enumvari.GenderEnum;
import enumvari.TipoMenuEnum;

public class Customer {

    private TipoMenuEnum preference;
    private String firstName;
    private String lastName;
    private Integer age;
    private GenderEnum gender;


    public Customer(TipoMenuEnum preference, String firstName, String lastName, Integer age, GenderEnum gender){
        this.preference = preference;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public TipoMenuEnum getPreference() {
        return preference;
    }

    public void setPreference(TipoMenuEnum preference) {
        this.preference = preference;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public void printCustomerInfo(){
        System.out.println("Nome: " + firstName + "\n" +
                "Cognome: " + lastName + "\n" +
                "Età: " + age + "\n" +
                "Genere: " + gender + "\n" +
                "Menù preferito: " + preference.getNomeMenu());
    }

    @Override
    public String toString() {
        return "Prenotazione.Customer{" +
                "preference=" + preference +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
