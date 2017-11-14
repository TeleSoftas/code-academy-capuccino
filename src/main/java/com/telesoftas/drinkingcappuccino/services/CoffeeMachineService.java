package com.telesoftas.drinkingcappuccino.services;

import com.telesoftas.drinkingcappuccino.calculators.CalculatorLevel1;
import com.telesoftas.drinkingcappuccino.calculators.CalculatorLevel2;
import com.telesoftas.drinkingcappuccino.models.Cappuccino;
import org.springframework.stereotype.Service;

@Service
public class CoffeeMachineService {

    private final CalculatorLevel1 level1;

    private final CalculatorLevel2 level2;

    public CoffeeMachineService(CalculatorLevel1 level1, CalculatorLevel2 level2) {
        this.level1 = level1;
        this.level2 = level2;
    }

    public Cappuccino showCappuccinoStatistics() {
        return new Cappuccino(
            level1.getMyCupsNum(),
            level1.calcCoffeeAmountInMyCups(),
            level1.calcMilkAmountInMyCups(),
            level2.calcAverageCoffeeAmountForPerson(),
            level2.calcAverageMilkAmountForPerson()
        );
    }

    public void incrementCappuccinoCups() {
        level1.incrementMyCupsNum();
    }

    public void reset() {
        level1.setMyCupsNum(0);
    }
}
