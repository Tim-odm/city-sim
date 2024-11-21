package org.example.citysim.buildings;

public abstract class Building {
    /**
     * The cost to build the building
     */
    protected int buildCost;
    /**
     * The cost to maintain the building
     */
    protected double maintenanceCost;
    /**
     * The rate at which the building consumes energy
     */
    protected int energyConsRate;
    /**
     * Whether the building is connected to the road network
     */
    protected boolean isConnected;

    /**
     * Get the cost to build the building
     * @return the cost to build the building
     */
    public int getBuildCost() {
        return buildCost;
    }

    /**
     * Set the cost to build the building
     * @param buildCost the cost to build the building
     */
    public void setBuildCost(int buildCost) {
        this.buildCost = buildCost;
    }

    /**
     * Get the cost to maintain the building
     * @return the cost to maintain the building
     */
    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    /**
     * Set the cost to maintain the building
     * @param maintenanceCost the cost to maintain the building
     */
    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    /**
     * Get the rate at which the building consumes energy
     * @return the rate at which the building consumes energy
     */
    public int getEnergyConsRate() {
        return energyConsRate;
    }

    /**
     * Set the rate at which the building consumes energy
     * @param energyConsRate the rate at which the building consumes energy
     */
    public void setEnergyConsRate(int energyConsRate) {
        this.energyConsRate = energyConsRate;
    }

    /**
     * Get whether the building is connected to the road network
     * @return whether the building is connected to the road network
     */
    public boolean isConnected() {
        return isConnected;
    }

    /**
     * Set whether the building is connected to the road network
     * @param connected whether the building is connected to the road network
     */
    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}
