package org.example.citysim.buildings.OperationalBuilding.satisfactionbuilding;
/**
 * class PlaceOfHealing, a building which raises the satisfaction
 */
public class PlaceOfHealing extends SatisfactionBuilding{
    /**
     * Descriptor for when people print a PlaceOfHealing object
     */
    private static final String DESCRIPTION = "This is a PlaceOfHealing, a "
            + "place which resets satisfaction levels";

    /**
     * Constructs PlaceOfHealing object without any variables initialized
     */
    public PlaceOfHealing() {
    }

    /**
     * Constructs PlaceOfHealing object with variables initialized
     *
     * @param buildCost       Cost to build PlaceOfHealing
     * @param maintenanceCost Cost to maintain PlaceOfHealing
     * @param isConnected     Whether PlaceOfHealing is accessible
     * @param energyConsRate  Energy required to run PlaceOfHealing
     * @param maxWorkerCount  Maximum workers PlaceOfHealing can hold
     * @param minWorkerCount  Minimum workers for PlaceOfHealing to operate
     * @param workerCount     Current number of workers in PlaceOfHealing
     * @param satisfaction    satisfaction level having visited PlaceOfHealing
     * @param radius          radius of PlaceOfHealing to have an effect
     */
    public PlaceOfHealing(int buildCost, int maintenanceCost, boolean isConnected,
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
     * Replaces Object.toString to give a description of the PlaceOfHealing
     * @return description of PlaceOfHealing
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }

}
