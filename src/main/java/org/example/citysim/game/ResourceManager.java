package org.example.citysim.game;

import org.example.citysim.buildings.Building;
import org.example.citysim.buildings.OperationalBuilding.FoodBuilding.Farm;
import org.example.citysim.buildings.OperationalBuilding.currencybuilding.Shop;
import org.example.citysim.buildings.OperationalBuilding.energyBuilding.CoalMine;

import java.util.ArrayList;

public class ResourceManager {
    private int currenyAmount;
    private int foodAmount;
    private int energyAmount;
    private int materialsAmount;
    private ArrayList<Building> buildings;
    public ResourceManager(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
    public void updateResources() {
        Farm farm = (Farm) buildings.get(0);
        foodAmount += farm.getFoodProdRate();
        CoalMine coalMine = (CoalMine) buildings.get(1);
        energyAmount += coalMine.getCoalProdRate();
        Shop shop = (Shop) buildings.get(2);
        currenyAmount += shop.getCurrencyProdRate();
        System.out.println("Currency: " + currenyAmount + " Food: " + foodAmount + " Energy: " + energyAmount);
    }
}
