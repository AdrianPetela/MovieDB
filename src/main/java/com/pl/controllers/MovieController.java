package com.pl.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.SQLException;
import com.pl.dbObjects.Movie;
import com.pl.dbUtils.CallableStatementParameter;

public class MovieController {
    CallableStatementParameter cspie = new CallableStatementParameter();
    private ObservableList<String> listYear;
    private ObservableList<Movie> listMovie;

    @FXML
    private ComboBox<String> comboYear;

    @FXML
    private TableView<Movie> Table;

    @FXML
    private TableColumn<Movie, String> Ttitle;

    @FXML
    private TableColumn<Movie, Integer> Tyear;

    @FXML
    private TableColumn<Movie, Integer> Ttime;

    @FXML
    private TableColumn<Movie, String> Tlang;

    @FXML
    private TableColumn<Movie, String> Tdate;

    @FXML
    private TableColumn<Movie, String> Tcountry;

    @FXML
    void pokaz(ActionEvent event) {
        przeladuj();
    }

    @FXML
    void initialize() {
        try {
            listYear = FXCollections.observableArrayList(cspie.listYear());
            listMovie = FXCollections.observableArrayList(cspie.listMovie("Wszystkie"));
            Table.setItems(listMovie);
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        comboYear.setItems(listYear);
        comboYear.getItems().add("Wszystkie");

        Ttitle.setCellValueFactory(new PropertyValueFactory<>("MOV_TITLE"));
        Tyear.setCellValueFactory(new PropertyValueFactory<>("MOV_YEAR"));
        Ttime.setCellValueFactory(new PropertyValueFactory<>("MOV_TIME"));
        Tlang.setCellValueFactory(new PropertyValueFactory<>("MOV_LANG"));
        Tdate.setCellValueFactory(new PropertyValueFactory<>("MOV_DT_REL"));
        Tcountry.setCellValueFactory(new PropertyValueFactory<>("MOV_REL_COUNTRY"));
    }

    void przeladuj() {
        try {
            listMovie = FXCollections.observableArrayList(cspie.listMovie(comboYear.getSelectionModel().getSelectedItem()));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        Table.setItems(listMovie);
    }

}

