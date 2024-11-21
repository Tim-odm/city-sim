package org.example.citysim.buildings.OperationalBuilding.energyBuilding;

public class CoalMine extends EnergyBuilding {
    /**
     * The rate at which the building produces coal
     */
    private int coalProdRate;

    /**
     * Create a new coal mine
     * @param coalProdRate the rate at which the building produces coal
     */
    public CoalMine(int coalProdRate) {
        this.coalProdRate = coalProdRate;
    }

    /**
     * Get the rate at which the building produces coal
     * @return the rate at which the building produces coal
     */
    public int getCoalProdRate() {
        return coalProdRate;
    }

    /**
     * Set the rate at which the building produces coal
     * @param coalProdRate the rate at which the building produces coal
     */
    public void setCoalProdRate(int coalProdRate) {
        this.coalProdRate = coalProdRate;
    }
}
