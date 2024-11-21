package org.example.citysim.buildings.OperationalBuilding.satisfactionbuilding;

public class PlaceOfWorship extends SatisfactionBuilding{
    /**
     * Descriptor for when people print a PlaceOfWorship object
     */
    private static final String DESCRIPTION = "This is a PlaceOfWorship, a "
            + "place which resets satisfaction levels";

    /**
     * Constructs PlaceOfWorship object without any variables initialized
     */
    public PlaceOfWorship() {
    }

    /**
     * Constructs PlaceOfWorship object with variables initialized
     *
     * @param buildCost       Cost to build PlaceOfWorship
     * @param maintenanceCost Cost to maintain PlaceOfWorship
     * @param isConnected     Whether PlaceOfWorship is accessible
     * @param energyConsRate  Energy required to run PlaceOfWorship
     * @param maxWorkerCount  Maximum workers PlaceOfWorship can hold
     * @param minWorkerCount  Minimum workers for PlaceOfWorship to operate
     * @param workerCount     Current number of workers in PlaceOfWorship
     * @param satisfaction    satisfaction level having visited PlaceOfWorship
     * @param radius          radius of PlaceOfWorship to have an effect
     */
    public PlaceOfWorship(int buildCost, int maintenanceCost, boolean isConnected,
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
     * Replaces Object.toString to give a description of the PlaceOfWorship
     * @return description of PlaceOfWorship
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }

}
