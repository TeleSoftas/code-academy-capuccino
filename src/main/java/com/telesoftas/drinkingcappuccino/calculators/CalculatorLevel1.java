package com.telesoftas.drinkingcappuccino.calculators;

import com.telesoftas.drinkingcappuccino.properties.TelesoftasCoffeeStats;
import org.springframework.stereotype.Component;

@Component
public class CalculatorLevel1 {

    private final TelesoftasCoffeeStats coffeeStats;

    private int myCupsNum = 0;

    public CalculatorLevel1(TelesoftasCoffeeStats coffeeStats) {
        this.coffeeStats = coffeeStats;
    }

    public double calcCoffeeAmountInOneCup() {
        return 0.0; //TODO
    }

    public double calcMilkAmountInOneCup() {
        return 0.0; //TODO
    }

    public double calcCoffeeAmountInMyCups() {
        return 0.0; //TODO
    }

    public double calcMilkAmountInMyCups() {
        return 0.0; //TODO
    }

    public void incrementMyCupsNum() {
       //TODO
    }

    public int getMyCupsNum() {
        return 0; //TODO
    }

    public void setMyCupsNum(int myCupsNum) {
        //TODO
    }
}
