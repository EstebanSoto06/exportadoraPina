/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Finca;
import logica.Proveedor;

/**
 *
 * @author Usuario
 */
public class FincasDB {
    public void cargarFincas(JTable paramTablaFincas){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ubicación");
        modelo.addColumn("ID Proveedor");
        modelo.addColumn("Proveedor");
        paramTablaFincas.setModel(modelo);
        
        String [] datos = new String[5];
        
        String query = "SELECT f.* , p.nombre FROM fincas f JOIN proveedores p ON f.id_proveedor = p.id;";
        
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
            
            paramTablaFincas.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void agregarFinca(String nombre, String ubicacion, int id_proveedor){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "INSERT INTO fincas (nombre, ubicacion, id_proveedor) VALUES (?,?,?);";
            st = conexion.prepareCall(query);
            st.setString(1, nombre);
            st.setString(2, ubicacion);
            st.setInt(3, id_proveedor);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos añadidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
    }
    
    public Finca seleccionarFinca(JTable paramTablaFincas){
        Finca finca = null;
        int fila = paramTablaFincas.getSelectedRow();
        
        int id;
        String nombre;
        String ubicación;
        int proveedor;
        
        if (fila>=0){
            id = Integer.parseInt(paramTablaFincas.getValueAt(fila, 0).toString());
            nombre = paramTablaFincas.getValueAt(fila, 1).toString();
            ubicación = paramTablaFincas.getValueAt(fila, 2).toString();
            proveedor = Integer.parseInt(paramTablaFincas.getValueAt(fila, 3).toString());

            finca = new Finca(id, nombre, ubicación, proveedor);
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una finca para editar");
        }
              
        return finca;
    }
    
    public void editarFinca(int id, String nombre, String ubicacion, int id_proveedor){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "UPDATE fincas SET nombre = ?, ubicacion = ?, id_proveedor = ? WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setString(1, nombre);
            st.setString(2, ubicacion);
            st.setInt(3, id_proveedor);
            st.setInt(4, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no modificados: ERROR(" + e.toString() + ")");
        }
    }
    
    public void eliminarFinca(int id){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "DELETE FROM fincas WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setInt(1, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Finca eliminada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Finca no eliminada: ERROR(" + e.toString() + ")");
        }
    }
    
    public String obtenerNombreProveedor(int id){
        String nombreProveedor = "";
        
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        PreparedStatement st = null;
        ResultSet rst = null;
        
        try {
            conexion = conexionDB.getConnection();
            String query = "SELECT nombre FROM proveedores WHERE id = ?";
            st = conexion.prepareStatement(query);
            st.setInt(1, id);
            
            rst = st.executeQuery();
            
            while (rst.next()) {
                nombreProveedor = rst.getString(1);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return nombreProveedor;
    }
}
