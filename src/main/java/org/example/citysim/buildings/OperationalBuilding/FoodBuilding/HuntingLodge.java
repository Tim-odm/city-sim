package org.example.citysim.buildings.OperationalBuilding.FoodBuilding;

/**
 * class Hunting Lodge, a building which produces food
 */
public class HuntingLodge extends FoodBuilding {
    /**
     * Descriptor for when people print a HuntingLodge object
     */
    private static final String DESCRIPTION = "This is a hunting lodge, a building "
            + "which produced food";

    /**
     * Constructs HuntingLodge object without any variables initialized
     */
    public HuntingLodge() {
    }

    /**
     * Constructs HuntingLodge object with variables initialized
     * @param buildCost Cost to build HuntingLodge
     * @param maintenanceCost Cost to maintain HuntingLodge
     * @param isConnected Whether HuntingLodge is accessible
     * @param energyConsRate Energy required to run HuntingLodge
     * @param maxWorkerCount Maximum workers HuntingLodge can hold
     * @param minWorkerCount Minimum workers for HuntingLodge to operate
     * @param workerCount Current number of workers in HuntingLodge
     * @param foodProdRate Food production rate of HuntingLodge
     */
    public HuntingLodge(int buildCost, int maintenanceCost, boolean isConnected,
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
     * Replaces Object.toString to give a description of the HuntingLodge
     * @return description of HuntingLodge
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }

}

