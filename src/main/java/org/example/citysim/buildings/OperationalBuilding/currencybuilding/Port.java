package org.example.citysim.buildings.OperationalBuilding.currencybuilding;
/**
 * class Port, a building which produces Currency
 */
public class Port extends CurrencyBuilding{
    /**
     * Descriptor for when people print a Port object
     */
    private static final String DESCRIPTION = "This is a Port, a building "
            + "which makes money";

    /**
     * Constructs Port object without any variables initialized
     */
    public Port() {
    }

    /**
     * Constructs Port object with variables initialized
     * @param buildCost Cost to build Port
     * @param maintenanceCost Cost to maintain Port
     * @param isConnected Whether Port is accessible
     * @param energyConsRate Energy required to run Port
     * @param maxWorkerCount Maximum workers Port can hold
     * @param minWorkerCount Minimum workers for Port to operate
     * @param workerCount Current number of workers in Port
     * @param currencyProdRate Currency production rate of Port
     */
    public Port(int buildCost, int maintenanceCost, boolean isConnected,
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
     * Replaces Object.toString to give a description of the Port
     * @return description of Port
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }

}
