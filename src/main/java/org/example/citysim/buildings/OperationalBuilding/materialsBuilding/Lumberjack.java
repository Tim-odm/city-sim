package org.example.citysim.buildings.OperationalBuilding.materialsBuilding;

public class Lumberjack {
    /**
     * The rate at which the building produces wood
     */
    private int woodProdRate;

    /**
     * Create a new lumberjack
     * @param woodProdRate the rate at which the building produces wood
     */
    public Lumberjack(int woodProdRate) {
        this.woodProdRate = woodProdRate;
    }

    /**
     * Get the rate at which the building produces wood
     * @return the rate at which the building produces wood
     */
    public int getWoodProdRate() {
        return woodProdRate;
    }

    /**
     * Set the rate at which the building produces wood
     * @param woodProdRate the rate at which the building produces wood
     */
    public void setWoodProdRate(int woodProdRate) {
        this.woodProdRate = woodProdRate;
    }
}
