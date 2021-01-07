package com.pl.controllers;

import com.pl.fxUtils.FxmlUtils;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainWindowController {
    @FXML
    private BorderPane mainWindowBorderPane;

    @FXML
    private DashboardController dashboardController;

    @FXML
    void initialize() {
        this.dashboardController.setMainWindowController(this);
    }

    public void setCenter(String fxmlPath) {
        mainWindowBorderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }
}