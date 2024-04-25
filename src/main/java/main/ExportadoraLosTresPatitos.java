package main;

import datos.ConexionDB;
import interfaces.Login;

public class ExportadoraLosTresPatitos {

    public static void main(String[] args) {
        Login login = new Login ();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
        System.out.println("Programa iniciado!");
    }
}
