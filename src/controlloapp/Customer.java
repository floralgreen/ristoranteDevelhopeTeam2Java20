package controlloapp;

import classiconsumazioni.Portata;
import enumvari.GenderEnum;
import enumvari.TipoMenuEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Customer {

    private TipoMenuEnum preference;
    private String firstName;
    private String lastName;
    private Integer age;
    private GenderEnum gender;

    //TODO customerCard singola e cumulativa per tutti i ristoranti(convenzionati)
    private LoyaltyCard customerCard;

    private List<Portata> foodOrder;


    public Customer(TipoMenuEnum preference, String firstName, String lastName, Integer age, GenderEnum gender) {
        this.preference = preference;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.foodOrder = new ArrayList<>();
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


    public LoyaltyCard getCustomerCard() {
        return customerCard;
    }

    public void setCustomerCard(LoyaltyCard customerCard) {
        this.customerCard = customerCard;
    }

    public List<Portata> getFoodOrder() {
        return foodOrder;
    }

    public void setFoodOrder(List<Portata> foodOrder) {
        this.foodOrder = foodOrder;
    }

    public void addToOrder(Portata portataToAdd) {
        foodOrder.add(portataToAdd);
    }

    public void removeFromOrder(Portata portataToRemove){
        if (foodOrder.contains(portataToRemove)){
            foodOrder.remove(portataToRemove);
        } else {
            throw new IllegalArgumentException("Portata non presente nel tuo ordine, Impossibile rimuovere!");
        }
    }
    public void printOrder(){
        BigDecimal checkToPay = BigDecimal.valueOf(0);
        for (Portata portataCorrente: foodOrder) {
            checkToPay = checkToPay.add(BigDecimal.valueOf(portataCorrente.getPrezzoPortata()));
            portataCorrente.stampaInfoPortata();
        }

        System.out.println("Totale ordine: " + checkToPay.setScale(2, RoundingMode.DOWN));
    }

    public void printCustomerInfo() {
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
