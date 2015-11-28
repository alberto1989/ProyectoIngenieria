/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;


import java.sql.*;

public class Conexion {
   private static Connection conect = null;
   public static Connection obtener() throws SQLException, ClassNotFoundException {
      if ( conect== null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/pgj", "root", "");
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return conect;
   }
   public static void cerrar() throws SQLException {
      if (conect!= null) {
         conect.close();
     
      }
   
   }   
}