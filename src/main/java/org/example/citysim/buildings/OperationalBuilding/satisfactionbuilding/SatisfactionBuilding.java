package org.example.citysim.buildings.OperationalBuilding.satisfactionbuilding;

import org.example.citysim.buildings.OperationalBuilding.OperationalBuilding;

/**
 * Abstract class for buildings which increase satisfaction
 * has a satisfaction and radius of effect
 */
public abstract class SatisfactionBuilding extends OperationalBuilding {
    /**
     * satisfaction level from being within radius of building
     */
    protected int satisfaction;
    /**
     * satisfaction radius
     */
    protected int radius;

    /**
     * Get level
     * @return satisfaction level
     */
    public int getSatisfaction() {
        return satisfaction;
    }

    /**
     * Set satisfaction level
     * @param satisfaction is level of satisfaction
     */
    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    /**
     * Get radius of satisfaction
     * @return radius of satisfaction
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Set radius of satisfaction
     * @param radius of satisfaction
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
