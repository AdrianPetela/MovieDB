package com.pl.controllers;

import com.pl.dbObjects.topMovie;
import com.pl.dbUtils.CallableStatementParameter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.SQLException;

public class RankingController {
    CallableStatementParameter cspie = new CallableStatementParameter();
    private ObservableList<com.pl.dbObjects.topMovie> topMovie;

    @FXML
    private TextField ilosc;

    @FXML
    private TableView<topMovie> Table;

    @FXML
    private TableColumn<topMovie, String> Ttitle;

    @FXML
    private TableColumn<topMovie, String> Tratings;

    @FXML
    void pokaz(ActionEvent event) {
        przeladuj();
    }

    @FXML
    void initialize() {
        try {
            topMovie = FXCollections.observableArrayList(cspie.topMovie(10));
            Table.setItems(topMovie);
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }

        Ttitle.setCellValueFactory(new PropertyValueFactory<>("MOV_TITLE"));
        Tratings.setCellValueFactory(new PropertyValueFactory<>("rating"));
    }

    void przeladuj() {
        try {
            topMovie = FXCollections.observableArrayList(cspie.topMovie(Integer.parseInt(ilosc.getText())));
        } catch (SQLException e) {
            System.out.println("Problem z wyswietleniem hoteli");
            e.printStackTrace();
        }
        Table.setItems(topMovie);
    }
}
