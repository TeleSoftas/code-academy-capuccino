package com.telesoftas.drinkingcappuccino.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/* src\main\resources\application.properties */
@Component
@ConfigurationProperties("cappuccino")
public class TelesoftasCoffeeStats {
    private int numberOfPeople;

    private int numberOfCups;

    private double totalMilkAmount;

    private double totalCoffeeAmount;

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public void setTotalMilkAmount(double totalMilkAmount) {
        this.totalMilkAmount = totalMilkAmount;
    }

    public void setTotalCoffeeAmount(double totalCoffeeAmount) {
        this.totalCoffeeAmount = totalCoffeeAmount;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public double getTotalMilkAmount() {
        return totalMilkAmount;
    }

    public double getTotalCoffeeAmount() {
        return totalCoffeeAmount;
    }
}
