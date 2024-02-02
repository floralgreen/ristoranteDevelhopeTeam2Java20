package controlloapp;

import java.util.Objects;

public class LoyaltyCard {

    private Integer fideltyPoints;
    //TODO refactoring boolean primitive
    private Boolean isCardActive;

    public LoyaltyCard(String restaurantName){
        this.fideltyPoints = 0;
        this.isCardActive = true;
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


}