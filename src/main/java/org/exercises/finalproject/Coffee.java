package org.exercises.finalproject;

import org.exercises.finalproject.enums.CoffeeType;
import org.exercises.finalproject.enums.Roasting;

public class Coffee extends Drink {
    private CoffeeType coffeeType;
    private Roasting roasting;

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public Roasting getRoasting() {
        return roasting;
    }

    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }
}
