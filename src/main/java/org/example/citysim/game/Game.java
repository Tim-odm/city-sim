package org.example.citysim.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import kotlin.jvm.internal.SourceDebugExtension;
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
    private ResourceManager resourceManager;
    /**
     * The list of buildings in the game.
     */
   private final ArrayList<Building> buildings = new ArrayList<>();
    public void init() {
        System.out.println("Initializing game...");
        // Simple init: create three buildings, run game loop and print current state (resources)
        initBaseBuildings();

        // Init resource manager
        resourceManager = new ResourceManager(buildings);

        // Init timeline
        initTimeline();
    }

    private void initBaseBuildings() {
        Farm farm = new Farm(0, 0, true,
                0, 2, 0, 2, 100);
        CoalMine coalMine = new CoalMine(100);
        Shop shop = new Shop(0, 0, true,
                0, 2, 0, 2, 100);
        buildings.add(farm);
        buildings.add(coalMine);
        buildings.add(shop);
    }

    /**
     * Initialize the timeline. 1 day = 10 minutes (600sec). 1 hour = 25sec.
     * Update resources every 25sec. Duration set to 5 for testing purposes.
     */
    private void initTimeline() {
        // Update resources every 25 seconds
        System.out.println("Initializing timeline...");
        KeyFrame resourceKeyFrame = new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Updating resources...");
                resourceManager.updateResources();
            }
        });

        // Animation keyframe set to 144 fps
        KeyFrame animationKeyFrame = new KeyFrame(Duration.seconds(1.0/5.0),
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Animating...");
            }
        });

        Timeline resourceTickRate = new Timeline(resourceKeyFrame);
        resourceTickRate.setCycleCount(Timeline.INDEFINITE);
        resourceTickRate.play();

//        Timeline animationTickRate = new Timeline(animationKeyFrame);
//        animationTickRate.setCycleCount(Timeline.INDEFINITE);
//        animationTickRate.play();
    }
}
