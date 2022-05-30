/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ECG;
import javax.persistence.Query;
import model.Person;
import view.test1;

/**
 *
 */
public class ECGController {

    public void create(ECG ecg) {
        
    }

    public ArrayList<ECG> getecg(){
        try {
            
            Connection conn = DBHandler.getConnection();
            ArrayList<ECG> ECGList = new ArrayList();
            PreparedStatement s = conn.prepareStatement("SELECT idecg, bpm, registerDateTime, idPatient FROM ecg;");
            
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                int idecg = rs.getInt("idecg");
                float bpm = rs.getFloat("bpm");
                String registerDateTime = rs.getString("registerDateTime");
                ECGList.add(new ECG(idecg, bpm, registerDateTime));
            }
            
            rs.close();
            s.close();
            
            return ECGList;
        } catch (SQLException ex) {
            Logger.getLogger(test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
