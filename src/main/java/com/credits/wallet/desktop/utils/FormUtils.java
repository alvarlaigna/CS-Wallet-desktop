package com.credits.wallet.desktop.utils;

import com.credits.wallet.desktop.thread.GetBalanceUpdater;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.StageStyle;

public class FormUtils {
    private static final String MSG_RETRIEVE_BALANCE = "Retrieving balance...";

    public static void showError(String text) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Error");
        alert.setHeaderText("Error!");
        alert.setContentText(text);
        alert.showAndWait();
    }

    public static void showInfo(String text) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Information");
        alert.setHeaderText("Information");
        alert.setContentText(text);
        alert.showAndWait();
    }

    public static void displayBalance(String coin, Label label) {
        label.setText(MSG_RETRIEVE_BALANCE);
        Platform.runLater(new GetBalanceUpdater(coin, label));
    }
}

