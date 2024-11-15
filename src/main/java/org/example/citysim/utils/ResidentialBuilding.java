package org.example.citysim.utils;

/**
 * Abstract class representing habitable buildings.
 * @author rhysevans
 * @version 1.0
 */
public abstract class ResidentialBuilding extends Building {
    protected int satisfaction;

    // rate at which food is consumed by houses.
    protected int foodConsRate;
    protected int capacity;

    /**
     * Get the satisfaction of a building.
     * @return the satisfaction of the building.
     */
    public int getSatisfaction() {
        return satisfaction;
    }

    /**
     * Set the satisfaction of a building
     * @param satisfaction the desired satisfaction.
     */
    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    /**
     * Get the food consumption rate.
     * @return the food consumption rate of a residence.
     */
    public int getFoodConsRate() {
        return foodConsRate;
    }

    /**
     * Set the food consumption rate.
     * @param foodConsRate the desired food consumption rate.
     */
    public void setFoodConsRate(int foodConsRate) {
        this.foodConsRate = foodConsRate;
    }

    /**
     * Get the capacity of a building.
     * @return the capacity of a building.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Set the capacity of a building.
     * @param capacity the desired capacity.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
