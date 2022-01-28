/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personal.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author olubusolamisogunle
 */
public class PersonalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/studentinfo", "root","");
            String sql= "INSERT INTO info2 values(?, ?, ?, ?)";
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1,"19CG0265");
            ps.setString(2, "Louis");
            ps.setString(3, "Tomiwa");
            ps.setInt(4, 400);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Data inserted succesfully");
            
            }
            
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error occured"+ex.getMessage());
            }
    }
    
}
