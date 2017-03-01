/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class DBConnection {
     public static Connection getConnection(){
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafemanagement","root","");
            System.out.println("Thanh Cong");
        } catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		} catch (SQLException e) {
			System.out.println("Error connect!");
		}
        return connect;
        }
    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        db.getConnection();
    }
}
