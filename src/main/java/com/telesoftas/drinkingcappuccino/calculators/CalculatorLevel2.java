package com.telesoftas.drinkingcappuccino.calculators;

import com.telesoftas.drinkingcappuccino.properties.TelesoftasCoffeeStats;
import org.springframework.stereotype.Component;

@Component
public class CalculatorLevel2 {

    private final CalculatorLevel1 level1;
    private final TelesoftasCoffeeStats coffeeStats;

    public CalculatorLevel2(CalculatorLevel1 level1, TelesoftasCoffeeStats coffeeStats) {
        this.level1 = level1;
        this.coffeeStats = coffeeStats;
    }

    public double calcTotalCoffeeAmountForAllPeople() {
        return 0.0; //TODO
    }

    public double calcTotalMilkAmountForAllPeople() {
        return 0.0; //TODO
    }

    public double calcPeopleNumber() {
        return 0.0; //TODO
    }

    public double calcAverageCoffeeAmountForPerson() {
        return 0.0; //TODO
    }

    public double calcAverageMilkAmountForPerson() {
        return 0.0; //TODO
    }
}
