package com.pl.controllers;

import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import com.pl.dbObjects.Director;
import com.pl.dbUtils.CallableStatementParameter;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.sql.SQLException;

public class DirectorController {
    CallableStatementParameter cspie = new CallableStatementParameter();
    private ObservableList<String> listDirector;
    private ObservableList<Director> movieDirector;

    @FXML
    private ComboBox<String> comboDirector;

    @FXML
    private TableView<Director> Table;

    @FXML
    private TableColumn<Director, String> Ttitle;

    @FXML
    private TableColumn<Director, String> Tdirector;

    @FXML
    void pokaz(ActionEvent event) {
        przeladuj();
    }

    @FXML
    void initialize() {
        try {
            listDirector = FXCollections.observableArrayList(cspie.listDirector());
            movieDirector = FXCollections.observableArrayList(cspie.movieDirector("Wszystkie"));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem gatunkow");
            e.printStackTrace();
        }
        comboDirector.setItems(listDirector);
        comboDirector.getItems().add("Wszystkie");
        Table.setItems(movieDirector);

        Ttitle.setCellValueFactory(new PropertyValueFactory<>("MOV_TITLE"));
        Tdirector.setCellValueFactory(new PropertyValueFactory<>("DIRECTOR"));
    }

    void przeladuj() {
        try {
            movieDirector = FXCollections.observableArrayList(cspie.movieDirector(comboDirector.getSelectionModel().getSelectedItem().toString()));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        Table.setItems(movieDirector);
    }

}
