package org.example.citysim.layout;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.citysim.game.Game;

import java.net.URL;
import java.util.ResourceBundle;

public class BaseController implements Initializable {
    /**
     * The width of the canvas
     */
    @FXML
    public static double WIDTH = 800;
    /**
     * The height of the canvas
     */
    @FXML
    public static double HEIGHT = 800;
    /**
     * The size of the grid
     */
    @FXML
    public static double GRID_SIZE = 20;
    /**
     * Background Canvas to draw grid
     */
    @FXML
    public Canvas canvas;
    /**
     * Background Pane
     */
    @FXML
    public Pane backgroundGrid;
    /**
     * Main Pane
     */
    @FXML
    public Pane mainPane;
    /**
     * Main Canvas to draw a rectangle (Use labels in future to draw buildings)
     */
    @FXML
    public Canvas mainCanvas;

    @FXML
    private Label resources;

    @FXML


    private Game game;

    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Draws the background grid on the canvas
     */
    public void drawBackgroundGrid() {
        canvas.setWidth(WIDTH);
        canvas.setWidth(HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.LIGHTGRAY);
        for(int i = 0; i < (WIDTH/GRID_SIZE) + 1; i++) {
            gc.strokeLine(0, i * GRID_SIZE, WIDTH, i * GRID_SIZE);
            gc.strokeLine(i * GRID_SIZE, 0, i * GRID_SIZE, HEIGHT);
        }

    }

    /**
     * Draws a rectangle on to the main pain
     */
    public void drawOnMainPane() {
        Rectangle rect = new Rectangle(100, 100, 100, 100);
        rect.setFill(Color.RED);
        mainPane.getChildren().add(rect);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        drawBackgroundGrid();
        drawOnMainPane();
        startUpdatingCurrencyLabel();
    }
    public void turnOffGrid(URL url, ResourceBundle resourceBundle) {
        drawOnMainPane();
    }
    private void startUpdatingCurrencyLabel() {
        Runnable updater = () -> {
            while (true) {
                try {
                    Thread.sleep(1000); // Update every second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Get the updated currency amount
                double currencyAmount = game.getResourceManager().getCurrencyAmount();
                double foodAmount = game.getResourceManager().getFoodAmount();
                double energyAmount = game.getResourceManager().getEnergyAmount();
                //int currencyAmount = 0;

                // Update the label on the UI thread
                Platform.runLater(() -> resources.setText("Currency: " + currencyAmount +" Food: " + foodAmount + " Energy: " + energyAmount));
            }
        };
        Thread updaterThread = new Thread(updater);
        updaterThread.setDaemon(true);
        updaterThread.start();
    }


    /**
     * Get the width of the canvas
     * @return the width of the canvas
     */
    public static double getWIDTH() {
        return WIDTH;
    }

    /**
     * Set the width of the canvas
     * @param WIDTH the width of the canvas
     */
    public static void setWIDTH(double WIDTH) {
        BaseController.WIDTH = WIDTH;
    }

    /**
     * Get the height of the canvas
     * @return the height of the canvas
     */
    public static double getHEIGHT() {
        return HEIGHT;
    }

    /**
     * Set the height of the canvas
     * @param HEIGHT the height of the canvas
     */
    public static void setHEIGHT(double HEIGHT) {
        BaseController.HEIGHT = HEIGHT;
    }

    /**
     * Get the size of the grid
     * @return the size of the grid
     */
    public static double getGridSize() {
        return GRID_SIZE;
    }

    /**
     * Set the size of the grid
     * @param gridSize the size of the grid
     */
    public static void setGridSize(double gridSize) {
        GRID_SIZE = gridSize;
    }
}
