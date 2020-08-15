/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mili.selr;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author arifika.aop06542
 */
public class MthlaporanStokController implements Initializable {
    @FXML
    private AnchorPane childLoad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        childLoad.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mili/GrandChild/GcpnTbleLapStok.fxml"));
        
        
        //System.out.println(textQueryListtable);
        
        //ROOTPROJECTController.getInstance().tableLoadQuery = textQueryListtable;
        try {
           Node n = (Node)loader.load();
           AnchorPane.setTopAnchor(n, 0.0);
           AnchorPane.setRightAnchor(n, 0.0);
           AnchorPane.setLeftAnchor(n, 0.0);
           AnchorPane.setBottomAnchor(n, 0.0);
           childLoad.getChildren().setAll(n);
        } catch (IOException e){
               System.out.println(e.getMessage());
        }
        
    }    

    @FXML
    private void btn_GcpnTbleLapStok(ActionEvent event) {
        childLoad.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mili/GrandChild/GcpnTbleLapStok.fxml"));
        
        
        //System.out.println(textQueryListtable);
        
        //ROOTPROJECTController.getInstance().tableLoadQuery = textQueryListtable;
        try {
           Node n = (Node)loader.load();
           AnchorPane.setTopAnchor(n, 0.0);
           AnchorPane.setRightAnchor(n, 0.0);
           AnchorPane.setLeftAnchor(n, 0.0);
           AnchorPane.setBottomAnchor(n, 0.0);
           childLoad.getChildren().setAll(n);
        } catch (IOException e){
               System.out.println(e.getMessage());
        }
    }

    @FXML
    private void btn_GcpnTbleKartStok(ActionEvent event) {
        childLoad.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mili/GrandChild/GcpnTbleKartStok.fxml"));
        
        
        //System.out.println(textQueryListtable);
        
        //ROOTPROJECTController.getInstance().tableLoadQuery = textQueryListtable;
        try {
           Node n = (Node)loader.load();
           AnchorPane.setTopAnchor(n, 0.0);
           AnchorPane.setRightAnchor(n, 0.0);
           AnchorPane.setLeftAnchor(n, 0.0);
           AnchorPane.setBottomAnchor(n, 0.0);
           childLoad.getChildren().setAll(n);
        } catch (IOException e){
               System.out.println(e.getMessage());
        }
    }
    
}
