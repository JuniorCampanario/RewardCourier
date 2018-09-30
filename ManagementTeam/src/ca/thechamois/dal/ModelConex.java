/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.thechamois.dal;

import java.sql.*;

/**
 *
 * @author apncj_000
 */
public class ModelConex {

    public static conection conector() {
        
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.jbdc.Driver";
        String url = "jdbc:mysql://localhost:3306/BDChamois";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

}
