package org.example.citysim.game;

import org.example.citysim.buildings.Building;
import org.example.citysim.buildings.OperationalBuilding.FoodBuilding.Farm;
import org.example.citysim.buildings.OperationalBuilding.currencybuilding.Shop;
import org.example.citysim.buildings.OperationalBuilding.energyBuilding.CoalMine;

import java.util.ArrayList;

/**
 * The main game class. This class will initialize the game and store the game
 * state.
 * @author Timothy
 * @version 1.0.0
 */
public class Game {
    /**
     * The list of buildings in the game.
     */
   private ArrayList<Building> buildings;
    public void init() {
      // Simple init: create three buildings, run game loop and print current state (resources)
        Farm farm = new Farm(0, 0, true, 0, 2, 0, 2, 100);
        CoalMine coalMine = new CoalMine(100);
        Shop shop = new Shop(0, 0, true, 0, 2, 0, 2, 100);
    }
}
