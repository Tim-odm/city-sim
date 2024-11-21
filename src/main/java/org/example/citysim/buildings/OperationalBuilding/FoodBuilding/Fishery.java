package org.example.citysim.buildings.OperationalBuilding.FoodBuilding;


/**
 * class Fishery, a building which produces food
 */
public class Fishery extends FoodBuilding {
    /**
     * Descriptor for when people print a Fishery object
     */
    private static final String DESCRIPTION = "This is a Fishery, a building "
            + "which produced food";

    /**
     * Constructs Fishery object without any variables initialized
     */
    public Fishery() {
    }

    /**
     * Constructs Fishery object with variables initialized
     * @param buildCost Cost to build Fishery
     * @param maintenanceCost Cost to maintain Fishery
     * @param isConnected Whether Fishery is accessible
     * @param energyConsRate Energy required to run Fishery
     * @param maxWorkerCount Maximum workers Fishery can hold
     * @param minWorkerCount Minimum workers for Fishery to operate
     * @param workerCount Current number of workers in Fishery
     * @param foodProdRate Food production rate of Fishery
     */
    public Fishery(int buildCost, int maintenanceCost, boolean isConnected,
                   int energyConsRate, int maxWorkerCount, int minWorkerCount,
                   int workerCount, int foodProdRate) {
        setBuildCost(buildCost);
        setMaintenanceCost(maintenanceCost);
        setConnected(isConnected);
        setEnergyConsRate(energyConsRate);
        setMaxWorkerCount(maxWorkerCount);
        setMinWorkerCount(minWorkerCount);
        setWorkerCount(workerCount);
        setFoodProdRate(foodProdRate);

    }

    /**
     * Replaces Object.toString to give a description of the Fishery
     * @return description of Fishery
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }

}

