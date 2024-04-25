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
import logica.Proveedor;
import logica.TipoFruto;

/**
 *
 * @author Usuario
 */
public class TiposDB {
    public void cargarTipos(JTable paramTablaTipos){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Tipo de fruto");
        paramTablaTipos.setModel(modelo);
        
        String [] datos = new String[2];
        
        String query = "SELECT * FROM tipos";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                datos[0]=rst.getString(1);
                datos[1]=rst.getString(2);
                
                modelo.addRow(datos);
            }
            
            paramTablaTipos.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void agregarTipo(String categoria){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "INSERT INTO tipos (categoria) VALUES (?);";
            st = conexion.prepareCall(query);
            st.setString(1, categoria);

            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos añadidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
    }
    
    public TipoFruto seleccionarTipo(JTable paramTablaTipos){
        TipoFruto tipo = null;
        int fila = paramTablaTipos.getSelectedRow();
        
        int id;
        String categoria;
        
        if (fila>=0){
            id = Integer.parseInt(paramTablaTipos.getValueAt(fila, 0).toString());
            categoria = paramTablaTipos.getValueAt(fila, 1).toString();

            tipo = new TipoFruto(id, categoria);
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un tipo para editar");
        }
              
        return tipo;
    }
    
    public void editarTipo(int id, String categoria){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "UPDATE tipos SET categoria = ? WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setString(1, categoria);
            st.setInt(2, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no modificados: ERROR(" + e.toString() + ")");
        }
    }
    
    public void eliminarTipo(int id){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "DELETE FROM tipos WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setInt(1, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Tipo eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipo no eliminado: ERROR(" + e.toString() + ")");
        }
    }
}
