package org.example.citysim.materialsBuilding;

public class Quarry extends MaterialsBuilding {
    /**
     * The rate at which the building produces stone
     */
    private int stoneProdRate;

    /**
     * Create a new quarry
     * @param stoneProdRate the rate at which the building produces stone
     */
    public Quarry(int stoneProdRate) {
        super();
        this.stoneProdRate = stoneProdRate;
    }

    /**
     * Get the rate at which the building produces stone
     * @return the rate at which the building produces stone
     */
    public int getStoneProdRate() {
        return stoneProdRate;
    }

    /**
     * Set the rate at which the building produces stone
     * @param stoneProdRate the rate at which the building produces stone
     */
    public void setStoneProdRate(int stoneProdRate) {
        this.stoneProdRate = stoneProdRate;
    }
}
