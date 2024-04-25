/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.VariedadFruto;

/**
 *
 * @author Usuario
 */
public class PalletsDB {
    public void cargarVariedades(JTable paramTablaVariedades){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre de la variedad");
        modelo.addColumn("Características");
        paramTablaVariedades.setModel(modelo);
        
        String [] datos = new String[3];
        
        String query = "SELECT * FROM variedades";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                datos[0]=rst.getString(1);
                datos[1]=rst.getString(2);
                datos[2]=rst.getString(3);
                
                modelo.addRow(datos);
            }
            
            paramTablaVariedades.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void agregarVariedad(String nombre, String caracteristicas){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "INSERT INTO variedades (nombre, caracteristicas) VALUES (?,?);";
            st = conexion.prepareCall(query);
            st.setString(1, nombre);
            st.setString(2, caracteristicas);

            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos añadidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
    }
    
    public VariedadFruto seleccionarVariedad(JTable paramTablaVariedades){
        VariedadFruto variedad = null;
        int fila = paramTablaVariedades.getSelectedRow();
        
        int id;
        String nombre;
        String caracteristicas;
        
        if (fila>=0){
            id = Integer.parseInt(paramTablaVariedades.getValueAt(fila, 0).toString());
            nombre = paramTablaVariedades.getValueAt(fila, 1).toString();
            caracteristicas = paramTablaVariedades.getValueAt(fila, 2).toString();

            variedad = new VariedadFruto(id, nombre, caracteristicas);
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una variedad para editar");
        }
              
        return variedad;
    }
    
    public void editarVariedad(int id, String nombre, String caracteristicas){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "UPDATE variedades SET nombre = ?, caracteristicas = ? WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setString(1, nombre);
            st.setString(2, caracteristicas);
            st.setInt(3, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no modificados: ERROR(" + e.toString() + ")");
        }
    }
    
    public void eliminarVariedad(int id){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "DELETE FROM variedades WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setInt(1, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Variedad eliminada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Variedad no eliminada: ERROR(" + e.toString() + ")");
        }
    }
}
