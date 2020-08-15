/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mili.selr;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author ar4ch
 */
public class Mi_mainController implements Initializable {
    @FXML
    private BorderPane rootLoad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            rootLoad.setCenter(null);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MthlaporanPenj.fxml"));
            BorderPane newScene = loader.load();
            rootLoad.setCenter(newScene);
        } catch (IOException ex) {
            Logger.getLogger(Mi_mainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void btn_Close(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    private void btn_MthpnTrk(ActionEvent event) throws IOException {
        rootLoad.setCenter(null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MthpnTrk.fxml"));
        BorderPane newScene = loader.load();
        rootLoad.setCenter(newScene);
    }
    
    @FXML
    private void btn_MthpnIsiSt(ActionEvent event) throws IOException {
        rootLoad.setCenter(null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MthpnIsiSt.fxml"));
        BorderPane newScene = loader.load();
        rootLoad.setCenter(newScene);
    }
    
    @FXML
    private void btn_MthpnMast(ActionEvent event) throws IOException {
        rootLoad.setCenter(null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MthpnMast.fxml"));
        BorderPane newScene = loader.load();
        rootLoad.setCenter(newScene);
    }

    @FXML
    private void btm_MthlaporanStok(ActionEvent event) throws IOException {
        rootLoad.setCenter(null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MthlaporanStok.fxml"));
        BorderPane newScene = loader.load();
        rootLoad.setCenter(newScene);
    }
    
    @FXML
    private void btn_MthlaporanPenj(ActionEvent event) throws IOException {
        rootLoad.setCenter(null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MthlaporanPenj.fxml"));
        BorderPane newScene = loader.load();
        rootLoad.setCenter(newScene);
    }

    

    
    
}
