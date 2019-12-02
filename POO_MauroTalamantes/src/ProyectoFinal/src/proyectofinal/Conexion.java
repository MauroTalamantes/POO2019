/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Phoenix Azrael
 */
public class Conexion {     //CONECTARSE A BASE DE DATOS
    private static final String driver = "com.mysql.jdbc.Driver";   //DRIVER NECESARIO
    private static final String user = "root";      //USUARIO
    private static final String password = "";      //CONTRASEÑA
    private static final String url = "jdbc:mysql://localhost:3306/inventario";     //URL DE LA BASE DE DATOS
 
    Connection conect = null;   //VARIABLE PARA CONECTAR
    
    public Connection conectar()    //METODO PARA LA CONEXION
        {
            try {
                //Cargamos el Driver MySQL
                Class.forName(driver);  //INICIAMOS EL DRIVER
                //Class.forName("org.gjt.mm.mysql.Driver");
                conect = (Connection) DriverManager.getConnection(url, user, password); //MANDAMOS LA CONEXION
                //System.out.println("conexion establecida");
                //JOptionPane.showMessageDialog(null,"Conectado");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("error de conexion");
                JOptionPane.showMessageDialog(null,"Error de conexion"+e);
            }
            return conect;
        }
}
