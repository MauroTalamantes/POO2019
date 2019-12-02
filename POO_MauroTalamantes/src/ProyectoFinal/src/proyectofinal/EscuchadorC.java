/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Phoenix Azrael
 */
public class EscuchadorC implements ActionListener{
    JButton auxB;   //AUXILIARES DE BOTONES
    JButton auxB2;
    JuguetesxD auxJ = new JuguetesxD(); //AUXILIAR DEL JUGUETE
    JTextField auxAT;   //AUXILIARES DE CAMPO DE TEXTO
    JTextField auxBT;
    JTextField auxCT;
    String sql ="";     //PARA HACER LA CONEXION
    Conexion a = new Conexion();    //PARA GACER LA CONEXION
    Connection b = a.conectar();    //PARA UTILIZAR LOS METODOS 
    
    public EscuchadorC(JTextField a, JTextField b, JTextField c){
        //INICIAMOS LOS AUXILIARES CON LOS COMPONENTES QUE UTILIZAREMOS
        auxAT = a;
        auxBT = b;
        auxCT = c;
    }
    public EscuchadorC(JTextField a, JTextField b, JTextField c, JButton r){
        //INICIAMOS LOS AUXILIARES CON LOS COMPONENTES QUE UTILIZAREMOS
        auxAT = a;
        auxBT = b;
        auxCT = c;
        auxB2 = r;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        auxB = (JButton) e.getSource();
        if("LISTO".equals(auxB.getText())){
            //PINTA LOS CAMPOS VERDES
            auxAT.setBackground(Color.green);
            auxBT.setBackground(Color.green);
            auxCT.setBackground(Color.green);
            //HABILITA EL BOTON SUBIR
            auxB2.setEnabled(true);
            //SE DESHABILITA A SI MISMO
            auxB.setEnabled(false);
        }
        if("SUBIR".equals(auxB.getText())){
            //INSERTA EN LA TABLA
            sql = "INSERT INTO inv (codigo, nombre_prod, cantidad) VALUES (?,?,?)";
            //LAS VARIABLES DEL JUGUETE AUXILIAR SE INSTANCIAN CON LO OBTENIDO EN LOS CAMPOS DE TEXTO
            auxJ.setCodigo(auxAT.getText());
            auxJ.setNombre(auxBT.getText());
            auxJ.setCantidad(auxCT.getText());
            //HACE LA CONEXION 
            try {
                PreparedStatement subida = b.prepareStatement(sql); //HACE EL UPDATE SIN VALORES
                subida.setString(1, auxJ.getCodigo());  //INSERTA LOS VALORES EN LA PRIMERA COLUMNA
                subida.setString(2, auxJ.getNombre());  //INSERTA LOS VALORES EN LA SEGUNDA COLUMNA
                subida.setString(3, auxJ.getCantidad());//INSERTA LOS VALORES EN LA TERCERA COLUMNA
                int careful = subida.executeUpdate();   //SI ALGO FALLA, AVISA, SI NO, DA EL AVISO QUE SE SUBIO AL INVENTARIO
                if(careful>0){
                    JOptionPane.showMessageDialog(null, "Se ha subido al inventario");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Algo ha fallado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EscuchadorC.class.getName()).log(Level.SEVERE, null, ex);
            }
            //RE-PINTA LOS CAMPOS EN BLANCO Y BORRA LO QUE HAY EN ELLOS
            auxAT.setBackground(Color.white);
            auxAT.setText(null);
            auxBT.setBackground(Color.white);
            auxBT.setText(null);
            auxBT.setEnabled(false);
            auxCT.setBackground(Color.white);
            auxCT.setText(null);
            auxCT.setEnabled(false);
            auxB2 = (JButton) e.getSource();
            //SE DESHABILITA A EL MISMO
            auxB2.setEnabled(false);
        }
    }
    
}
