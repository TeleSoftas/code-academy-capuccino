package com.telesoftas.drinkingcappuccino.models;

public class Cappuccino {
    private int myCupsNum = 0;
    private double myCoffeeAmount = 0;
    private double myMilkAmount = 0;
    private double averageCoffeeAmount = 0;
    private double averageMilkAmount = 0;

    public Cappuccino() {
    }

    public Cappuccino(int myCupsNum, double myCoffeeAmount, double myMilkAmount, double averageCoffeeAmount, double averageMilkAmount) {
        this.myCupsNum = myCupsNum;
        this.myCoffeeAmount = myCoffeeAmount;
        this.myMilkAmount = myMilkAmount;
        this.averageCoffeeAmount = averageCoffeeAmount;
        this.averageMilkAmount = averageMilkAmount;
    }

    public int getMyCupsNum() {
        return myCupsNum;
    }

    public void setMyCupsNum(int myCupsNum) {
        this.myCupsNum = myCupsNum;
    }

    public double getMyCoffeeAmount() {
        return myCoffeeAmount;
    }

    public void setMyCoffeeAmount(double myCoffeeAmount) {
        this.myCoffeeAmount = myCoffeeAmount;
    }

    public double getMyMilkAmount() {
        return myMilkAmount;
    }

    public void setMyMilkAmount(double myMilkAmount) {
        this.myMilkAmount = myMilkAmount;
    }

    public double getAverageCoffeeAmount() {
        return averageCoffeeAmount;
    }

    public void setAverageCoffeeAmount(double averageCoffeeAmount) {
        this.averageCoffeeAmount = averageCoffeeAmount;
    }

    public double getAverageMilkAmount() {
        return averageMilkAmount;
    }

    public void setAverageMilkAmount(double averageMilkAmount) {
        this.averageMilkAmount = averageMilkAmount;
    }
}
