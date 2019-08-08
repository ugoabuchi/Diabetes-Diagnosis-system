/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrsokiki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author hp
 */
public class saveTODb {
    
    public boolean add(int nPregnant, int pGlucose, int bloodPressure, int skinThickness, int insulin, double bodyMass, double dPFUnction, int age, String classLabel) throws Exception
    {
        PreparedStatement s;
		try { 
			s = cn().prepareStatement("INSERT INTO user(nPregnant, pGlucose, bloodPressure, skinThickness, insulin, bodyMass, dPFUnction, age, classLabel) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                       
                        s.setInt(1, nPregnant);
                        s.setInt(2, pGlucose);
                        s.setInt(3, bloodPressure);
                        s.setInt(4, skinThickness);
                        s.setInt(5, insulin);
                        s.setDouble(6, bodyMass);
                        s.setDouble(7, dPFUnction);
                        s.setInt(8, age);
                        s.setString(9, classLabel);
			s.executeUpdate();
                        return true;
		} catch (SQLException e) {  JOptionPane.showMessageDialog(null, e.getMessage()); return false;} 
    }
    
    
    public Connection cn() {
		Connection conn = null;
		try { Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/okiki", "root", "");
		} catch(Exception e) { JOptionPane.showMessageDialog(null, e.getMessage()); }
		
		return conn;
	}
    
}
