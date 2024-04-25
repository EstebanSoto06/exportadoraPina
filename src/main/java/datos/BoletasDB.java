/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.BoletaCosecha;
import logica.VariedadFruto;

/**
 *
 * @author Usuario
 */
public class BoletasDB {
    public void cargarBoletas(JTable paramTablaBoletas){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Finca");
        modelo.addColumn("Lote");
        modelo.addColumn("Bloque");
        modelo.addColumn("Numero Bin A");
        modelo.addColumn("Cantidad de Frutas Bin A");
        modelo.addColumn("Numero bin B");
        modelo.addColumn("Cantidad de Frutas Bin B");
        modelo.addColumn("Placa del Camión");
        modelo.addColumn("Fecha");
        modelo.addColumn("Consecutivo");
        modelo.addColumn("Tipo de Fruto");
        paramTablaBoletas.setModel(modelo);
        
        String [] datos = new String[13];
        
        String query = "SELECT b.id, p.nombre, f.nombre, b.lote, b.bloque, b.numeroBinA, b.cantidadFrutaBinA, b.numeroBinB, b.cantidadFrutaBinB, b.placaCamion, b.fecha, b.consecutivo, t.categoria FROM boletas b INNER JOIN proveedores p ON b.id_proveedor = p.id INNER JOIN fincas f ON b.id_finca = f.id INNER JOIN tipos t ON b.id_tipoFruto = t.id";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                datos[0]=rst.getString(1);
                datos[1]=rst.getString(2);
                datos[2]=rst.getString(3);
                datos[3]=rst.getString(4);
                datos[4]=rst.getString(5);
                datos[5]=rst.getString(6);
                datos[6]=rst.getString(7);
                datos[7]=rst.getString(8);
                datos[8]=rst.getString(9);
                datos[9]=rst.getString(10);
                datos[10]=rst.getString(11);
                datos[11]=rst.getString(12);
                datos[12]=rst.getString(13);
                
                modelo.addRow(datos);
            }
            
            paramTablaBoletas.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public List<Map<Integer, String>> obtenerProveedores(){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        List<Map<Integer, String>> proveedores = new ArrayList<>();
        
        String query = "SELECT id, nombre FROM proveedores";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                int id = rst.getInt(1);
                String nombre = rst.getString(2);
                Map<Integer, String> proveedor = new HashMap<>();
                proveedor.put(id, nombre);
                proveedores.add(proveedor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proveedores;
    }
    
    public List<Map<Integer, String>> obtenerFincas(){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        List<Map<Integer, String>> fincas = new ArrayList<>();
        
        String query = "SELECT id, nombre FROM fincas";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                int id = rst.getInt(1);
                String nombre = rst.getString(2);
                Map<Integer, String> finca = new HashMap<>();
                finca.put(id, nombre);
                fincas.add(finca);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fincas;
    }
    
    public List<Map<Integer, String>> obtenerTipos(){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        List<Map<Integer, String>> tipos = new ArrayList<>();
        
        String query = "SELECT id, categoria FROM tipos";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                int id = rst.getInt(1);
                String nombre = rst.getString(2);
                Map<Integer, String> tipo = new HashMap<>();
                tipo.put(id, nombre);
                tipos.add(tipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipos;
    }
    
    public void agregarBoleta(BoletaCosecha boleta){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "INSERT INTO boletas (id_proveedor, id_finca, lote, bloque, numeroBinA, cantidadFrutaBinA, numeroBinB, cantidadFrutaBinB, placaCamion, fecha, consecutivo, id_tipoFruto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            st = conexion.prepareCall(query);
            st.setInt(1, boleta.getId_proveedor());
            st.setInt(2, boleta.getId_finca());
            st.setString(3, boleta.getLote());
            st.setString(4, boleta.getBloque());
            st.setString(5, boleta.getNumeroBinA());
            st.setInt(6, boleta.getCantidadFrutaBinA());
            st.setString(7, boleta.getNumeroBinB());
            st.setInt(8, boleta.getCantidadFrutaBinB());
            st.setString(9, boleta.getPlacaCamion());
            st.setString(10, boleta.getFecha());
            st.setString(11, boleta.getConsecutivo());
            st.setInt(12, boleta.getId_tipoFruto());

            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos añadidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
    }
    
    public void editarConsecutivoBoleta(){
        int idUltimaBoleta = 0;
        
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        PreparedStatement st = null;
        
        try {
            conexion = conexionDB.getConnection();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
        
        String sql = "SELECT MAX(id) FROM boletas"; // Obtener el ID máximo de la tabla boletas
        try (PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                idUltimaBoleta = rs.getInt(1);
            }
            
            System.out.println(idUltimaBoleta);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
        
        String query = "UPDATE boletas SET consecutivo = ? WHERE id = ?";
        try {
            st = conexion.prepareStatement(query);
            st.setString(1, "BC "+ (idUltimaBoleta + 100)); // Asumiendo que el consecutivo es el ID + 100
            st.setInt(2, idUltimaBoleta);
            
            int resultado = st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }    
    }
    
    public BoletaCosecha seleccionarBoleta(JTable paramTablaBoletas){
        BoletaCosecha boleta = null;
        int fila = paramTablaBoletas.getSelectedRow();
        
        int id;
        String lote;
        String bloque;
        String numeroBinA;
        int cantidadFrutaBinA;
        String numeroBinB;
        int cantidadFrutaBinB;
        String placaCamion;
        String fecha;
        String consecutivo;
        
        if (fila>=0){
            id = Integer.parseInt(paramTablaBoletas.getValueAt(fila, 0).toString());
            lote = paramTablaBoletas.getValueAt(fila, 3).toString();
            bloque = paramTablaBoletas.getValueAt(fila, 4).toString();
            numeroBinA = paramTablaBoletas.getValueAt(fila, 5).toString();
            cantidadFrutaBinA = Integer.parseInt(paramTablaBoletas.getValueAt(fila, 6).toString());
            numeroBinB = paramTablaBoletas.getValueAt(fila, 7).toString();
            cantidadFrutaBinB = Integer.parseInt(paramTablaBoletas.getValueAt(fila, 8).toString());
            placaCamion = paramTablaBoletas.getValueAt(fila, 9).toString();
            fecha = paramTablaBoletas.getValueAt(fila, 10).toString();
            consecutivo = paramTablaBoletas.getValueAt(fila, 11).toString();

            boleta = new BoletaCosecha(id, 0,0, lote, bloque, numeroBinA, cantidadFrutaBinA, numeroBinB, cantidadFrutaBinB, placaCamion, 0);
            boleta.setFecha(fecha);
            boleta.setConsecutivo(consecutivo);
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una boleta para editar");
        }
              
        return boleta;
    }
    
    public void editarBoleta(BoletaCosecha boleta){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "UPDATE boletas SET id_proveedor = ?, id_finca = ?, lote = ?, bloque = ?, numeroBinA = ?, cantidadFrutaBinA = ?, numeroBinB = ?, cantidadFrutaBinB = ?, placaCamion = ?, fecha = ?, consecutivo = ?, id_tipoFruto = ? WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setInt(1, boleta.getId_proveedor());
            st.setInt(2, boleta.getId_finca());
            st.setString(3, boleta.getLote());
            st.setString(4, boleta.getBloque());
            st.setString(5, boleta.getNumeroBinA());
            st.setInt(6, boleta.getCantidadFrutaBinA());
            st.setString(7, boleta.getNumeroBinB());
            st.setInt(8, boleta.getCantidadFrutaBinB());
            st.setString(9, boleta.getPlacaCamion());
            st.setString(10, boleta.getFecha());
            st.setString(11, boleta.getConsecutivo());
            st.setInt(12, boleta.getId_tipoFruto());
            st.setInt(13, boleta.getId());
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no modificados: ERROR(" + e.toString() + ")");
        }
    }
    
    public void eliminarBoleta(int id){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "DELETE FROM boletas WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setInt(1, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Boleta eliminada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Boleta no eliminada: ERROR(" + e.toString() + ")");
        }
    }
}
