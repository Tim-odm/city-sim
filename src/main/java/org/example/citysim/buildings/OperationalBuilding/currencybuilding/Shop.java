package org.example.citysim.buildings.OperationalBuilding.currencybuilding;
/**
 * class Shop, a building which produces Currency
 */
public class Shop extends CurrencyBuilding{
    /**
     * Descriptor for when people print a Shop object
     */
    private static final String DESCRIPTION = "This is a Shop, a building "
            + "which makes money";

    /**
     * Constructs Shop object without any variables initialized
     */
    public Shop() {
    }

    /**
     * Constructs Shop object with variables initialized
     * @param buildCost Cost to build Shop
     * @param maintenanceCost Cost to maintain Shop
     * @param isConnected Whether Shop is accessible
     * @param energyConsRate Energy required to run Shop
     * @param maxWorkerCount Maximum workers Shop can hold
     * @param minWorkerCount Minimum workers for Shop to operate
     * @param workerCount Current number of workers in Shop
     * @param currencyProdRate Currency production rate of Shop
     */
    public Shop(int buildCost, int maintenanceCost, boolean isConnected,
                int energyConsRate, int maxWorkerCount, int minWorkerCount,
                int workerCount, int currencyProdRate) {
        setBuildCost(buildCost);
        setMaintenanceCost(maintenanceCost);
        setConnected(isConnected);
        setEnergyConsRate(energyConsRate);
        setMaxWorkerCount(maxWorkerCount);
        setMinWorkerCount(minWorkerCount);
        setWorkerCount(workerCount);
        setCurrencyProdRate(currencyProdRate);

    }

    /**
     * Replaces Object.toString to give a description of the Shop
     * @return description of Shop
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }
}
