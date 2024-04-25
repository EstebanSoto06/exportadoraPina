/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import logica.Usuario;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class UsuariosDB {   
    public static Usuario verificarUsuario(String username, String password) throws SQLException{
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        PreparedStatement st = null;
        ResultSet rst = null;
        Usuario usuario = null;
        
        try {
            conexion = conexionDB.getConnection();
            String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
            st = conexion.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);

            rst = st.executeQuery();


            while (rst.next()) {
                Boolean isAdmin = rst.getBoolean(4);
                usuario = new Usuario(0,"null","null",isAdmin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar ResultSet, PreparedStatement y Connection
            try {
                if (rst != null) {
                    rst.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }      
        return usuario;
    }
    
    public void cargarUsuarios(JTable paramTablaUsuarios){
        ConexionDB conexion = new ConexionDB();
        Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre de usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Admin");
        paramTablaUsuarios.setModel(modelo);
        
        String [] datos = new String[4];
        
        String query = "SELECT * FROM usuarios";
        
        try {
            st = conexion.getConnection().createStatement();
            ResultSet rst = st.executeQuery(query);
            
            while (rst.next()) {
                datos[0]=rst.getString(1);
                datos[1]=rst.getString(2);
                datos[2]=rst.getString(3);
                datos[3]=rst.getString(4);
                
                modelo.addRow(datos);
            }
            
            paramTablaUsuarios.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void agregarUsuario(String username, String password, boolean admin){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "INSERT INTO usuarios (username, password, admin) VALUES (?,?,?);";
            st = conexion.prepareCall(query);
            st.setString(1, username);
            st.setString(2, password);
            st.setBoolean(3, admin);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos añadidos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no añadidos: ERROR(" + e.toString() + ")");
        }
    }
    
    public Usuario seleccionarUsuario(JTable paramTablaUsuarios){
        Usuario usuario = null;
        int fila = paramTablaUsuarios.getSelectedRow();
        
        int id;
        String username;
        String password;
        boolean admin = false;
        
        if (fila>=0){
            id = Integer.parseInt(paramTablaUsuarios.getValueAt(fila, 0).toString());
            username = paramTablaUsuarios.getValueAt(fila, 1).toString();
            password = paramTablaUsuarios.getValueAt(fila, 2).toString();
            String valor = paramTablaUsuarios.getValueAt(fila, 3).toString();
            if (valor.equalsIgnoreCase("true") || valor.equals("1")) {
                admin = true;
            } else if (valor.equalsIgnoreCase("false") || valor.equals("0")) {
                admin = false;
            }
            
            usuario = new Usuario(id, username, password, admin);
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un usuario para editar");
        }
              
        return usuario;
    }
    
    public void editarUsuario(int id, String username, String password, boolean admin){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "UPDATE usuarios SET username = ?, password = ?, admin = ? WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setString(1, username);
            st.setString(2, password);
            st.setBoolean(3, admin);
            st.setInt(4, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos modificados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no modificados: ERROR(" + e.toString() + ")");
        }
    }
    
    public void eliminarUsuario(int id){
        ConexionDB conexionDB = new ConexionDB();
        Connection conexion = null;
        CallableStatement st = null;
        ResultSet resultSet = null;
        
        
        try {
            conexion = conexionDB.getConnection();
            String query = "DELETE FROM usuarios WHERE id = ?";
            st = conexion.prepareCall(query);
            st.setInt(1, id);
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Usuario eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario no eliminado: ERROR(" + e.toString() + ")");
        }
    }
}