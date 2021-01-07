package com.pl.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

import com.pl.dbObjects.Genres;
import com.pl.dbUtils.CallableStatementParameter;

public class GenresController {
    CallableStatementParameter cspie = new CallableStatementParameter();
    private ObservableList<String> listGenres;
    private ObservableList<Genres> Genres;

    @FXML
    private ComboBox<String> comboGenres;

    @FXML
    private TableView<Genres> Table;

    @FXML
    private TableColumn<Genres, String> Ttitle;

    @FXML
    private TableColumn<Genres, String> Tgenres;

    @FXML
    void pokaz(ActionEvent event) {
        przeladuj();
    }

    @FXML
    void initialize() {
        try {
            listGenres = FXCollections.observableArrayList(cspie.listGenres());
            Genres = FXCollections.observableArrayList(cspie.movieGenres("Wszystkie"));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem gatunkow");
            e.printStackTrace();
        }
        comboGenres.setItems(listGenres);
        comboGenres.getItems().add("Wszystkie");
        Table.setItems(Genres);

        Ttitle.setCellValueFactory(new PropertyValueFactory<>("MOV_TITLE"));
        Tgenres.setCellValueFactory(new PropertyValueFactory<>("GEN_TITLE"));
    }

    void przeladuj() {
        try {
            Genres = FXCollections.observableArrayList(cspie.movieGenres(comboGenres.getSelectionModel().getSelectedItem().toString()));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        Table.setItems(Genres);
    }

}

