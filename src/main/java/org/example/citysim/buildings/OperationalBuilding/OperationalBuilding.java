package org.example.citysim.buildings.OperationalBuilding;

import org.example.citysim.buildings.Building;

/**
 * Abstract class for Operational Buildings
 * has a maxWorkerCount, minWorkerCount, workerCount, and get and set methods
 */
public abstract class OperationalBuilding extends Building {

    /**
     * The minimum number of workers required for the building to operate.
     */
    protected int minWorkerCount;

    /**
     * The maximum number of workers the building can accommodate.
     */
    protected int maxWorkerCount;

    /**
     * The current number of workers assigned to the building.
     */
    protected int workerCount;

    /**
     * Retrieves the minimum number of workers required for the building to operate.
     * @return the minimum number of workers required for operation.
     */
    public int getMinWorkerCount() {
        return minWorkerCount;
    }

    /**
     * Sets the minimum number of workers required for the building to operate.
     * @param minWorkerCount The minimum number of workers needed for the building to function.
     */
    public void setMinWorkerCount(int minWorkerCount) {
        this.minWorkerCount = minWorkerCount;
    }

    /**
     * Retrieves the maximum number of workers that the building can accommodate.
     *
     * @return the maximum number of workers the building can house.
     */
    public int getMaxWorkerCount() {
        return maxWorkerCount;
    }

    /**
     * Sets the maximum number of workers that the building can accommodate.
     * @param maxWorkerCount The maximum number of workers the building can house.
     */
    public void setMaxWorkerCount(int maxWorkerCount) {
        this.maxWorkerCount = maxWorkerCount;
    }

    /**
     * Retrieves the current number of workers assigned to the building.
     * @return the current worker count in the building.
     */
    public int getWorkerCount() {
        return workerCount;
    }

    /**
     * Sets the current number of workers assigned to the building.
     * @param workerCount The current worker count.
     */
    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }
}
