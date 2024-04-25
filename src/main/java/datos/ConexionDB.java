package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class ConexionDB {
    Connection conectar = null;
    
    public Connection getConnection()
    {
        String CadenaConexion = "jdbc:sqlserver://localhost:1433;"
                + "database=tresPatitosDB;"
                + "user=sa;"
                + "password=admin123;"
                + "encrpt=true;trustServerCertificate=true";
        try
        {
            conectar = DriverManager.getConnection(CadenaConexion); 
            //JOptionPane.showMessageDialog(null, "Conexion establecida");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        return conectar;
    }

    PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
