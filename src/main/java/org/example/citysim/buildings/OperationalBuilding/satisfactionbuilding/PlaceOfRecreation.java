package org.example.citysim.buildings.OperationalBuilding.satisfactionbuilding;

public class PlaceOfRecreation extends SatisfactionBuilding{
    /**
     * Descriptor for when people print a PlaceOfRecreation object
     */
    private static final String DESCRIPTION = "This is a PlaceOfRecreation, a "
            + "place which resets satisfaction levels";

    /**
     * Constructs PlaceOfHealing object without any variables initialized
     */
    public PlaceOfRecreation() {
    }

    /**
     * Constructs PlaceOfRecreation object with variables initialized
     *
     * @param buildCost       Cost to build PlaceOfRecreation
     * @param maintenanceCost Cost to maintain PlaceOfRecreation
     * @param isConnected     Whether PlaceOfRecreation is accessible
     * @param energyConsRate  Energy required to run PlaceOfRecreation
     * @param maxWorkerCount  Maximum workers PlaceOfRecreation can hold
     * @param minWorkerCount  Minimum workers for PlaceOfRecreation to operate
     * @param workerCount     Current number of workers in PlaceOfRecreation
     * @param satisfaction    satisfaction level having visited PlaceOfRecreation
     * @param radius          radius of PlaceOfRecreation to have an effect
     */
    public PlaceOfRecreation(int buildCost, int maintenanceCost, boolean isConnected,
                          int energyConsRate, int maxWorkerCount, int minWorkerCount,
                          int workerCount, int satisfaction, int radius) {
        setBuildCost(buildCost);
        setMaintenanceCost(maintenanceCost);
        setConnected(isConnected);
        setEnergyConsRate(energyConsRate);
        setMaxWorkerCount(maxWorkerCount);
        setMinWorkerCount(minWorkerCount);
        setWorkerCount(workerCount);
        setSatisfaction(satisfaction);
        setRadius(radius);

    }

    /**
     * Replaces Object.toString to give a description of the PlaceOfRecreation
     * @return description of PlaceOfRecreation
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }

}
