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

/**
 *
 * @author Usuario
 */
public class ProveedoresDB {
    public void cargarProveedores(JTable paramTablaProveedores){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Encargado");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        paramTablaProveedores.setModel(modelo);
        
        String [] datos = new String[5];
        
        String query = "SELECT * FROM proveedores";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                datos[0]=rst.getString(1);
                datos[1]=rst.getString(2);
                datos[2]=rst.getString(3);
                datos[3]=rst.getString(4);
                datos[4]=rst.getString(5);
                
                modelo.addRow(datos);
            }
            
            paramTablaProveedores.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void agregarProveedor(String nombre, String encargado, String telefono, String correo){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "INSERT INTO proveedores (nombre, encargado, telefono, correo) VALUES (?,?,?,?);";
            st = conexion.prepareCall(query);
            st.setString(1, nombre);
            st.setString(2, encargado);
            st.setString(3, telefono);
            st.setString(4, correo);
            
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos añadidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
    }
    
    public Proveedor seleccionarProveedor(JTable paramTablaProveedores){
        Proveedor proveedor = null;
        int fila = paramTablaProveedores.getSelectedRow();
        
        int id;
        String nombre;
        String encargado;
        int telefono;
        String correo;
        
        if (fila>=0){
            id = Integer.parseInt(paramTablaProveedores.getValueAt(fila, 0).toString());
            nombre = paramTablaProveedores.getValueAt(fila, 1).toString();
            encargado = paramTablaProveedores.getValueAt(fila, 2).toString();
            telefono = Integer.parseInt(paramTablaProveedores.getValueAt(fila, 3).toString());
            correo = paramTablaProveedores.getValueAt(fila, 4).toString();

            proveedor = new Proveedor(id, nombre, encargado, telefono, correo);
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un proveedor para editar");
        }
              
        return proveedor;
    }
    
    public void editarProveedor(int id, String nombre, String encargado, String telefono, String correo){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "UPDATE proveedores SET nombre = ?, encargado = ?, telefono = ?, correo = ? WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setString(1, nombre);
            st.setString(2, encargado);
            st.setString(3, telefono);
            st.setString(4, correo);
            st.setInt(5, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no modificados: ERROR(" + e.toString() + ")");
        }
    }
    
    public void eliminarProveedor(int id){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "DELETE FROM proveedores WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setInt(1, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Proveedor eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Proveedor no eliminado: ERROR(" + e.toString() + ")");
        }
    }
}
