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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Phoenix Azrael
 */
public class EscuchadorU implements ActionListener{
    //SE CREAN AUXILIARES
    JButton auxB = new JButton();
    JButton auxBEN = new JButton();
    JTextField auxEN = new JTextField();
    JTextField auxJT1 = new JTextField();
    JTextField auxJT2 = new JTextField();
    JTextField auxJT3 = new JTextField();
    JTextArea auxJA = new JTextArea();
    JTextArea auxJA2 = new JTextArea();
    JuguetesxD auxJ = new JuguetesxD();
    //ESTE STRING HACE DIFERENTES COSAS, SIRVE COMO AUXILIAR PARA COMANDOS DE BADE DE DATOS
    String sql ="";
    //CONEXIONES
    Conexion a = new Conexion();
    Connection b = a.conectar();
    
    public EscuchadorU(JTextField a, JTextArea b){  //CONSTRUCTOR PARA ESCUCHADORES QUE OBTIENEN UN TEXTO Y LO PONEN EN OTRO SITIO
        auxJT1 = a;
        auxJA = b;
    }
    public EscuchadorU(JTextField a, JTextArea b, JTextField r){    //CONSTRUCTOR PARA ESCUCHADORES QUE HABILITAN UN C.T
        auxJT1 = a;
        auxJA = b;
        auxEN = r;
    }
     public EscuchadorU(JTextField a, JTextArea b, JTextArea c){    //CONSTRUCTOR PARA MODIFICAR LOS CAMPOS EN "BORRAR"
        auxJT1 = a;
        auxJA = b;
        auxJA2 = c;
    }
    public EscuchadorU(JTextField a, JTextField b, JTextField c){   //TOMA LO QUE HAY EN LOS C.T
        auxJT1 = a;
        auxJT2 = b;
        auxJT3 = c;
    }
    public EscuchadorU(JTextField a, JTextField b, JTextField c, JButton r){    //TOMA LO DE LOS C.T Y HABILITA UN BOTON
        auxJT1 = a;
        auxJT2 = b;
        auxJT3 = c;
        auxBEN = r;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        auxB = (JButton) e.getSource();
        
        
        if("BUSCAR".equals(auxB.getText())){
            auxJ.setCodigo(auxJT1.getText());   //OBTIENE CODIGO Y LO SETEA EN LA VARIABLE CODIGO DEL OBJETO AUX JUGUETE
            auxJT1.setBackground(Color.green);  //MARCA EL CAMPO DE TEXTO EN VERDE
            sql = "SELECT * FROM inv WHERE " + "'" + auxJ.getCodigo() +"'" + " = codigo";   //BUSCA EL CODIGO DEL C.T
            try {
                Statement st = b.createStatement();
                ResultSet rs = st.executeQuery(sql);    //HACE LA CONSULTA
                
                while(rs.next()){
                    auxJA.setText(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(EscuchadorU.class.getName()).log(Level.SEVERE, null, ex);
            }
            //HABILITA EL BOTON SUBIR
            auxEN.setEnabled(true);
            //SE DESHABILITA EL MISMO
            auxB.setEnabled(false);
        }
        if("LISTO".equals(auxB.getText())){
            //SETEA LO OBTENIDO EN EL OBJETO AUX JUGUETE
            auxJ.setNombre(auxJT2.getText());
            auxJ.setCantidad(auxJT3.getText());
            auxJ.setCodigo(auxJT1.getText());
            //MARCA CAMPOS EN VERDE
            auxJT2.setBackground(Color.green);
            auxJT3.setBackground(Color.green);
            //HABILITA EL BOTON
            auxBEN.setEnabled(true);
            //SE DESHABILITA A EL MISMO
            auxB.setEnabled(false);
        }
        if("SUBIR".equals(auxB.getText())){
            //TOMA LOS CAMPOS Y LOS SETEA EN EL OBJETO JUGUETE
                auxJ.setCodigo(auxJT1.getText());
                auxJ.setNombre(auxJT2.getText());
                auxJ.setCantidad(auxJT3.getText());
                //CODIGO QUE HACE UPDATE
            sql = "UPDATE inv SET nombre_prod = ?, cantidad = ? WHERE codigo = '"+auxJ.getCodigo()+"'";
            try {
                PreparedStatement subida = b.prepareStatement(sql); //HACE EL UPDATE SIN LOS VALORES
                subida.setString(1, auxJ.getNombre());  //SETEA UN VALOR EN LA COLUMNA DE NOMBRE_PROD
                subida.setString(2, auxJ.getCantidad());//SETEA UN VALOR EN LA COLUMNA DE CANTIDAD
                int careful = subida.executeUpdate();   //AVISA DE ALGUN ERROR
                if(careful>0){
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el inventario");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Algo ha fallado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EscuchadorU.class.getName()).log(Level.SEVERE, null, ex);
            }
            //BORRA LO QUE CONTIENE LOS CAMPOS Y LO REPINTA EN BLANCO
            //TAMBIEN DESHABILITA ALGUNOS CAMPOS Y BOTONES
            auxJT1.setText(null);
            auxJT1.setBackground(Color.white);
            auxJT2.setText(null);
            auxJT2.setEnabled(false);
            auxJT2.setBackground(Color.white);
            auxJT3.setText(null);
            auxJT3.setEnabled(false);
            auxJT3.setBackground(Color.white);
            auxB.setEnabled(false);
        }
        if("ACEPTAR".equals(auxB.getText())){
            //AUXILIARES
            auxJ.setCodigo(auxJT1.getText());
            auxJA.setText(null);
            auxJA2.setText(null);
            auxJT1.setBackground(Color.green);
            //HACE CONSULTA SEGUN EL CODIGO QUE SE OBTIENE DEL CAMPO DE TEXTO
            sql = "SELECT * FROM inv WHERE " + "'" + auxJ.getCodigo() +"'" + " = codigo";
            try {
                Statement st = b.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.getFetchSize()==0){   //EN CASO DE QUE NO SE OBTENGA DA EL AVISO, EN CASO DE QUE SI, PUES LO MANDA
                        auxJA.setText("NO SE ENCONTRO EL CODIGASO MI CHAVO");
                }
                while(rs.next()){
                    auxJ.setNombre(rs.getString(2));
                    auxJ.setCantidad(rs.getString(3));
                    auxJA.setText(auxJ.toString());
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(EscuchadorU.class.getName()).log(Level.SEVERE, null, ex);
            }
            //DESPUES DE LA CONSULTA LO BORRA
            sql = "DELETE FROM inv WHERE codigo = '"+auxJ.getCodigo()+"'";
            try {
                PreparedStatement borra = b.prepareStatement(sql);
                borra.execute();
                if("NO SE ENCONTRO EL CODIGASO MI CHAVO".equals(auxJA.getText())){  //SI NO SE ENCONTRO EL CODIGO AVISA QUE NO
                    auxJA2.setText("NO SE BORRO NADA, KAPPA");                      //BORRO NADA
                }
                else{
                    auxJA2.setText("EL PRODUCTO->[" + auxJ.getNombre() + "]->HA SIDO ELIMINADO");
                }   //EN CASO DE QUE SI, PUES AVISA
                
            } catch (SQLException ex) {
                Logger.getLogger(EscuchadorU.class.getName()).log(Level.SEVERE, null, ex);
            }
            //BORRA LO DEL CAMPO Y LO REPINTA A BLANCO
            auxJT1.setText(null);
            auxJT1.setBackground(Color.white);
            //DESHABILITA EL BOTON
            auxB.setEnabled(false);
        }
        if("CONSULTAR".equals(auxB.getText())){
            //BORRA SI EXITE ALGO EN EL AREA DE TEXTO
            auxJA.setText(null);
            //AUXILIAR JUGUETE PARA MOSTRAR EN EL AREA DE TEXTO LA CONSULTA
            JuguetesxD auxi = new JuguetesxD();
            JTextField auxSQL = auxJT1;
            //SI NO EXISTE LA PALABRA SELECT MANDA UN AVISO DE QUE NO SE PASE DE LISTO
            if((auxSQL.getText().indexOf("SELECT"))!=-1){
                try {
                Statement st = b.createStatement();
                ResultSet rs = st.executeQuery(auxSQL.getText());
                
                while(rs.next()){
                    //SI NO EXISTE TODA LA CADENA MANDA UN PEQUEÑO ERROR
                    if(auxSQL.getText().contains("SELECT * FROM inv WHERE")){
                        auxi.setCodigo(rs.getString(1));
                        auxi.setNombre(rs.getString(2));
                        auxi.setCantidad(rs.getString(3));
                        auxJA.setText(auxJA.getText() + auxi + "\n");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "SEGUI LAS INSTRUCCIONES, POR FAVOR :c");
                        break;
                    }
                    
                }
                
                } catch (SQLException ex) {
                    Logger.getLogger(EscuchadorU.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "SOLO PUEDES HACER CONSULTAS LOQUILLO ._.");
            }
            //DESHABILITAR EL BOTON
            auxB.setEnabled(false);
        }
    }
    
}
