package org.example.citysim.utils.OperationalBuilding.FoodBuilding;

public class Farm extends FoodBuilding{

    public Farm() {
        System.out.println("Working");


    }
    public void setFoodProdRate(int testVal) {
        this.foodProdRate = testVal;
    }
    public int getFoodProdRate() {
        return this.foodProdRate;
    }
}
