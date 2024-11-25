package org.example.citysim.game;

import org.example.citysim.buildings.Building;
import org.example.citysim.buildings.OperationalBuilding.FoodBuilding.Farm;
import org.example.citysim.buildings.OperationalBuilding.currencybuilding.Shop;
import org.example.citysim.buildings.OperationalBuilding.energyBuilding.CoalMine;

import java.util.ArrayList;

public class ResourceManager {
    /**
     * The amount of currency the player has
     */
    private int currencyAmount;
    /**
     * The amount of food the player has
     */
    private int foodAmount;
    /**
     * The amount of energy the player has
     */
    private int energyAmount;
    /**
     * The amount of materials the player has
     */
    private int materialsAmount;
    /**
     * ArrayList of buildings
     */
    private ArrayList<Building> buildings;

    /**
     * Create a new resource manager
     * @param buildings the list of buildings in the game
     */
    public ResourceManager(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    /**
     * Update the resources of the player
     */
    public void updateResources() {
        // In order to access the production rates we need to manually cast each building to its
        // respective type
        // TODO: Filter different buildings according to type OR create separate lists for each
        Farm farm = (Farm) buildings.get(0);
        foodAmount += farm.getFoodProdRate();
        CoalMine coalMine = (CoalMine) buildings.get(1);
        energyAmount += coalMine.getCoalProdRate();
        Shop shop = (Shop) buildings.get(2);
        currencyAmount += shop.getCurrencyProdRate();
        System.out.println("Currency: " + currencyAmount + " Food: " + foodAmount + " Energy: " + energyAmount);
    }
    public double getCurrencyAmount() {
        return currencyAmount;
    }
    public double getFoodAmount() {
        return foodAmount;
    }
    public double getEnergyAmount() {
        return energyAmount;
    }
}
