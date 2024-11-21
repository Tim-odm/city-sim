package org.example.citysim.buildings.OperationalBuilding.FoodBuilding;

/**
 * class Farm, a building which produces Food
 */
public class Farm extends FoodBuilding{
    /**
     * Descriptor for when people print a Farm object
     */
    private static final String DESCRIPTION = "This is a farm, a building "
            + "which produced food";

    /**
     * Constructs Farm object without any variables initialized
     */
    public Farm() {
    }

    /**
     * Constructs Farm object with variables initialized
     * @param buildCost Cost to build Farm
     * @param maintenanceCost Cost to maintain Farm
     * @param isConnected Whether Farm is accessible
     * @param energyConsRate Energy required to run Farm
     * @param maxWorkerCount Maximum workers Farm can hold
     * @param minWorkerCount Minimum workers for Farm to operate
     * @param workerCount Current number of workers in Farm
     * @param foodProdRate Food production rate of Farm
     */
    public Farm(int buildCost, int maintenanceCost, boolean isConnected,
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
     * Replaces Object.toString to give a description of the Farm
     * @return description of Farm
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }

}
