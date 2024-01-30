package controlloapp;

import java.util.Objects;

public class LoyaltyCard {

    private String restaurantName;
    private Integer fideltyPoints;
    private Boolean isCardActive;

    public LoyaltyCard(String restaurantName){
        this.restaurantName = restaurantName;
        this.fideltyPoints = 0;
        this.isCardActive = true;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getFideltyPoints() {
        return fideltyPoints;
    }

    public void setFideltyPoints(Integer fideltyPoints) {
        this.fideltyPoints = fideltyPoints;
    }

    public Boolean getCardActive() {
        return isCardActive;
    }

    public void setCardActive(Boolean cardActive) {
        isCardActive = cardActive;
    }

    public void addPoints(Integer pointsToAdd){
        if (pointsToAdd > 0){
            this.fideltyPoints += pointsToAdd;
        } else {
            throw new ArithmeticException("Non è possibile inserire numeri uguale o inferiori a 0");
        }
    }

    public void changeActiveStatus(){
        if (this.isCardActive){
            isCardActive = false;
        } else {
            isCardActive = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoyaltyCard that = (LoyaltyCard) o;
        return Objects.equals(restaurantName, that.restaurantName) && Objects.equals(fideltyPoints, that.fideltyPoints) && Objects.equals(isCardActive, that.isCardActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurantName, fideltyPoints, isCardActive);
    }

    @Override
    public String toString() {
        return "LoyaltyCard{" +
                "restaurantName='" + restaurantName + '\'' +
                ", fideltyPoints=" + fideltyPoints +
                ", isCardActive=" + isCardActive +
                '}';
    }
}
