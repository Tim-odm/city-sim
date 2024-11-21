package org.example.citysim.buildings.OperationalBuilding.FoodBuilding;

import org.example.citysim.buildings.OperationalBuilding.OperationalBuilding;

/**
 * Abstract class for Food buildings
 * has a foodProdRate
 */

public abstract class FoodBuilding extends OperationalBuilding {
    /**
     * Rate at which food is produced
     */
    protected int foodProdRate;

    /**
     * Get rate at which food is produced
     * @return rate at which food is produced
     */
    public int getFoodProdRate() {
        return foodProdRate;
    }

    /**
     * Set rate at which food is produced
     * @param foodProdRate the rate at which food is produced
     */
    public void setFoodProdRate(int foodProdRate) {
        this.foodProdRate = foodProdRate;
    }
}
