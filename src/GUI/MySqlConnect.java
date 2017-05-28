/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author Crash
 */
public class MySqlConnect {
    Connection con = null;
    public MySqlConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userauth","root","");
            //JOptionPane.showMessageDialog(null,"Connected");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
    }
    
public String searchDisease(String s){
		String sym="";
		Statement st;
		ResultSet rs;
		try{
			st= con.createStatement();
			rs= st.executeQuery("SELECT * FROM symptom WHERE symptom='"+s+"'");
			
			while(rs.next()){
				sym = (rs.getString("disease"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return sym;
	}
    
    
    
    
    
}

