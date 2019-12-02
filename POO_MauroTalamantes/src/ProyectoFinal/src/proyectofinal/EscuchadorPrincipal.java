/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Phoenix Azrael
 */
public class EscuchadorPrincipal implements ActionListener{
    //AUXILIARES 
    JPanel aux;
    JButton aux2;
    
    public EscuchadorPrincipal(JPanel a){
        //PARA CAMBIAR PANELES
        aux = a;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //OBTENER BOTON PARA LAS DIFERENTES ACCIONES
        aux2 = (JButton)e.getSource();
        
        if("CREAR".equals(aux2.getText())){ //CREAR NUEVOS ITEMS
            //NUEVO PANEL
            JPanel p = new JPanel(new GridLayout(2, 2));
            p.setLayout(null);
            //COLOR DE PANEL
            p.setBackground(new Color(36,90,118));
            //ETIQUETAS CHIDAS
            JLabel codigo = new JLabel("CODIGO");
            JLabel nombreA = new JLabel("NOMBRE JUGUETE: ");
            JLabel cantidad = new JLabel("CANTIDAD: ");
            //POSICION DE ETIQUETAS
            codigo.setBounds(100, 50, 400, 40);
            nombreA.setBounds(100, 140, 400, 40);
            cantidad.setBounds(100, 230, 400, 40);
            //CAMPOS DE TEXTO 
            JTextField campo1 = new JTextField(150);
            JTextField campo2 = new JTextField(150);
            JTextField campo3 = new JTextField(150);
            //POSICION DE CAMPOS
            campo1.setBounds(100, 90, 400, 40);
            campo2.setBounds(100, 180, 400, 40);
            campo3.setBounds(100, 270, 400, 40);
            //BOTONES DEL NUEVO PANEL
            JButton listo = new JButton("LISTO");
            JButton subir = new JButton("SUBIR");
            //POSICION DE BOTONES
            listo.setBounds(200, 400, 200, 40);   
            subir.setBounds(400, 400, 200, 40);
            //CREAR FUENTE
            Font nowo = new Font("BadaBoom BB",Font.BOLD, 24);
            //FUENTE DE BOTONES
            listo.setFont(nowo);
            subir.setFont(nowo);
            //COLOR DE BOTONES
            listo.setBackground(new Color(26,131,127));
            subir.setBackground(new Color(26,131,127));
            //DESHABILITAR 
            campo2.setEnabled(false);
            campo3.setEnabled(false);
            listo.setEnabled(false);
            subir.setEnabled(false);
            //HABILITAR
            campo1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased (KeyEvent a){
                    campo2.setEnabled(campo1.getText().length()!=0);
                }
            });
            campo2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased (KeyEvent a){
                    campo3.setEnabled(campo2.getText().length()!=0);
                }
            });
            campo3.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased (KeyEvent a){
                    listo.setEnabled(campo3.getText().length()!=0);
                }
            });
            //ESCUCHADORES
            EscuchadorC esc = new EscuchadorC(campo1, campo2, campo3);
            EscuchadorC esc2 = new EscuchadorC(campo1, campo2, campo3, subir);
            subir.addActionListener(esc);
            listo.addActionListener(esc2);
            //AGREGAR A PANEL
            p.add(codigo);
            p.add(campo1);
            p.add(nombreA);
            p.add(campo2);
            p.add(cantidad);
            p.add(campo3);
            p.add(subir);
            p.add(listo);
            //LIMPIAR PANEL Y AGREGAR EL NUEVO, FINALMENTE ACTUALIZA
            aux.removeAll();
            aux.add(p);
            aux.validate();
        }
        if("ACTUALIZAR".equals(aux2.getText())){ //ACTUALIZAR LOS ITEMS
            //NUEVO PANEL
            JPanel p = new JPanel(new GridLayout(2, 2));
            p.setLayout(null);
            //COLOR DE PANEL
            p.setBackground(new Color(36,90,118));
            //ETIQUETAS CHIDAS
            JLabel codigo = new JLabel("CODIGO A BUSCAR:");
            JLabel registro = new JLabel("CODIGO:  -  NOMBRE PROD:  -  CANTIDAD: ");
            JLabel nombreA = new JLabel("NOMBRE ARTICULO: ");
            JLabel cantidad = new JLabel("CANTIDAD: ");
            //POSICION DE ETIQUETAS
            codigo.setBounds(100, 50, 400, 40);
            registro.setBounds(100, 135, 400, 20);
            nombreA.setBounds(100, 180, 400, 40);
            cantidad.setBounds(100, 260, 400, 40);
            //CAMPOS DE TEXTO
            JTextField campo1 = new JTextField(150);
            JTextField campo2 = new JTextField(150);
            JTextField campo3 = new JTextField(150);
            //POSICION DE CAMPOS
            campo1.setBounds(100, 90, 400, 40);
            campo2.setBounds(100, 220, 400, 40);
            campo3.setBounds(100, 300, 400, 40);
            //AREAS DE TEXTO
            JTextArea busqueda = new JTextArea();
            //POSICION DE AREAS
            busqueda.setBounds(100, 155, 400, 20);
            //DESHABILITAR AREAS
            busqueda.setEditable(false);
            //BOTONES NUEVOS
            JButton search = new JButton("BUSCAR");
            JButton subir = new JButton("SUBIR");
            JButton ready = new JButton("LISTO");
            //POSICION DE BOTONES
            search.setBounds(600, 90, 200, 40);
            subir.setBounds(200, 400, 200, 40);
            ready.setBounds(600, 300, 200, 40);
            //CREAR FUENTE
            Font nowo = new Font("BadaBoom BB",Font.BOLD, 24);
            //FUENTE DE BOTONES
            ready.setFont(nowo);
            search.setFont(nowo);
            subir.setFont(nowo);
            //COLOR DE BOTONES
            ready.setBackground(new Color(26,131,127));
            search.setBackground(new Color(26,131,127));
            subir.setBackground(new Color(26,131,127));
            //DESHABILITAR
            search.setEnabled(false);
            campo2.setEnabled(false);
            campo3.setEnabled(false);
            ready.setEnabled(false);
            subir.setEnabled(false);
            //HABILITAR
            campo1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent a){
                    search.setEnabled(campo1.getText().length()!=0);
                }
            });
            campo2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent a){
                    campo3.setEnabled(campo2.getText().length()!=0);
                }
            });
            campo3.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent a){
                    ready.setEnabled(campo3.getText().length()!=0);
                }
            });
            //ESCUCHADORES
            EscuchadorU oilo = new EscuchadorU(campo1, busqueda,campo2);
            EscuchadorU ii = new EscuchadorU(campo1, campo2, campo3);
            EscuchadorU ili = new EscuchadorU(campo1, campo2, campo3,subir);
            search.addActionListener(oilo);
            subir.addActionListener(ii);
            ready.addActionListener(ili);
            //AGREGAR A PANEL
            p.add(registro);
            p.add(ready);
            p.add(search);
            p.add(codigo);
            p.add(campo1);
            p.add(nombreA);
            p.add(campo2);
            p.add(cantidad);
            p.add(campo3);
            p.add(subir);
            p.add(busqueda);
            //LIMPIAR PANEL Y AGREGAR EL NUEVO, FINALMENTE ACTUALIZA
            aux.removeAll();
            aux.add(p);
            aux.validate();
        }
        if("BORRAR".equals(aux2.getText())){
            //NUEVO PANEL
            JPanel p = new JPanel(new GridLayout(2, 2));
            p.setLayout(null);
            //COLOR DE PANEL
            p.setBackground(new Color(36,90,118));
            //ETIQUETAS CHIDAS
            JLabel codigo = new JLabel("CODIGO A BORRAR:");
            JLabel registro = new JLabel("CODIGO:  -  NOMBRE PROD:  -  CANTIDAD: ");
            //POSICION DE ETIQUETAS
            codigo.setBounds(100, 50, 400, 40);
            registro.setBounds(100, 135, 400, 20);
            //CAMPOS DE TEXTO
            JTextField campo1 = new JTextField(150);
            //POSICION DE CAMPOS
            campo1.setBounds(100, 90, 400, 40);
            //AREAS DE TEXTO
            JTextArea busqueda = new JTextArea();
            JTextArea lohicimos = new JTextArea();
            //POSICION DE AREAS
            busqueda.setBounds(100, 155, 400, 20);
            lohicimos.setBounds(100, 190, 400, 20);
            //DESHABILITAR AREAS
            busqueda.setEditable(false);
            lohicimos.setEditable(false);
            //NUEVO BOTON
            JButton search = new JButton("ACEPTAR");
            //POSICION DE BOTON
            search.setBounds(600, 90, 200, 40);
            //CREAR FUENTE
            Font nowo = new Font("BadaBoom BB",Font.BOLD, 24);
            //FUENTE DE BOTONES
            search.setFont(nowo);
            //COLOR DE BOTONES
            search.setBackground(new Color(26,131,127));
            //ESCUCHADORES
            EscuchadorU oilo = new EscuchadorU(campo1, busqueda, lohicimos);
            search.addActionListener(oilo);
            //DESHABILITAR
            search.setEnabled(false);
            //HABILITAR
            campo1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent a){
                    search.setEnabled(campo1.getText().length()!=0);
                }
            });
            //AGREGAR A PANEL
            p.add(lohicimos);
            p.add(registro);
            p.add(search);
            p.add(codigo);
            p.add(campo1);
            p.add(busqueda);
            //LIMPIAR PANEL Y AGREGAR NUEVO, FINALMENTE ACTUALIZAR
            aux.removeAll();
            aux.add(p);
            aux.validate();
        }
        if("MIRAR".equals(aux2.getText())){ //MOSTRAR TODA LA BASE DE DATOS
            //NUEVO PANEL
            JPanel p = new JPanel(new GridLayout(2, 2));
            p.setLayout(null);
            //COLOR DE PANEL
            p.setBackground(new Color(36,90,118));
            //NUEVA TABLA PARA DATOS
                //MODELO
            DefaultTableModel m = new DefaultTableModel();
            m.addColumn("CODIGO");
            m.addColumn("NOMBRE");
            m.addColumn("CANTIDAD");
                //TABLA CON MODELO
            final JTable tab = new JTable(m);
            //POSICION DE TABLA
            tab.setBounds(100, 100, 600, 400);
            //CABECERA DE LA TABLA
            JTableHeader cabeza = tab.getTableHeader();
            //POSICION DE LA CABECERA
            cabeza.setBounds(100, 80, 600, 20);
            //REALIZAR LA CONEXION A BASE DE DATOS
            Conexion a = new Conexion();
            Connection b = a.conectar();
            String sql = "SELECT * FROM inv"; //CONSULTA QUE TRAE LOS DATOS
            String datos[] = new String[3];   //VARIABLE PARA ALMACENAR DATOS
            Statement st;                     //SE INICIA UNA VARIABLE DE ARRANQUE
            try {                             //INTENTA EJECUTAR EL CODIGO
                st = b.createStatement();     //CREA UN INICIO DE ARRANQUE
                ResultSet rs = st.executeQuery(sql);    //OBTIENE LOS RESULTADOS DE LA CONSULTA
                while(rs.next()){                       //MIENTRAS QUE EXISTA ALGO EN LA TABLA
                    datos[0] = rs.getString(1);         //GUARDA EL DATO DE LA PRIMERA COLUMNA EN EL PRIMER CAMPO
                    datos[1] = rs.getString(2);         //GUARDA EL DATO DE LA SEGUNDA COLIMNA EN EL SEGUNDO CAMPO
                    datos[2] = rs.getString(3);         //GUARDA EL DATO DE LA TERCERA COLUMNA EN EL TERCER CAMPO
                    m.addRow(datos);                    //GUARDA LOS DATOS JUNTOS EN LA TABLA
                }
                tab.setModel(m);
            } catch (SQLException ex) {       //SI HAY UN ERROR LO MUESTRA
                Logger.getLogger(EscuchadorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            //AGREGAR AL PANEL
            p.add(cabeza);
            p.add(tab);
            //LIMPIA EL PANEL Y AGREGA EL NUEVO, FINALMENTE LO ACTUALIZA
            aux.removeAll();
            aux.add(p);
            aux.validate();
        }
        if("CONSULTAR".equals(aux2.getText())){
            //NUEVO PANEL
            JPanel p = new JPanel(new GridLayout(2, 2));
            p.setLayout(null);
            //COLOR DE PANEL
            p.setBackground(new Color(36,90,118));
            //AREA DE TEXTO
            JTextArea ins = new JTextArea("RECUERDA QUE LA CONSULTA SE HACE: \nSELECT * FROM inv WHERE... \n"
                    + "SEGUIDO DE TU CONSULTA, COMO POR EJEMPLO: \ncodigo = 'P2' \nnombre_prod = 'Ruben' \ncantidad = 12"
                    + "\netc.");
            //POSICION DE AREA
            ins.setBounds(100, 300, 400, 500);
            //OPACIDAD DE AREA
            ins.setOpaque(false);
            //ETIQUETA CHIDA
            JLabel codigo = new JLabel("INSERTE CONSULTA:");
            //POSICION DE ETIQUETA
            codigo.setBounds(100, 50, 400, 40);
            //CAMPO DE TEXTO
            JTextField campo1 = new JTextField(150);
            //POSICION DE CAMPO
            campo1.setBounds(100, 90, 400, 40);
            //NUEVO BOTON
            JButton search = new JButton("CONSULTAR");
            //POSICION DE BOTON
            search.setBounds(600, 90, 200, 40);
            //CREAR FUENTE
            Font nowo = new Font("BadaBoom BB",Font.BOLD, 24);
            //FUENTE DE BOTONES
            search.setFont(nowo);
            //COLOR DE BOTONES
            search.setBackground(new Color(26,131,127));
            //AREA DE TEXTO
            JTextArea lohicimos = new JTextArea();
            //DESHABILITAR AREA
            lohicimos.setEditable(false);
            //SCROLL
            JScrollPane ss = new JScrollPane(lohicimos);
            //POSICION DE SCROLL
            ss.setBounds(100, 190, 400, 100);
            //ESCUCHADORES
            EscuchadorU iralos = new EscuchadorU(campo1, lohicimos);
            search.addActionListener(iralos);
            //DESHABILITAR 
            search.setEnabled(false);
            //HABILITAR
            campo1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent a){
                    search.setEnabled(campo1.getText().length()!=0);
                }
            });
            //AGREGAR A PANEL
            p.add(ins);
            p.add(campo1);
            p.add(search);
            p.add(ss);
            p.add(codigo);
            //LIMPIAR PANEL Y AGREGAR NUEVO, FINALMENTE ACTUALIZA
            aux.removeAll();
            aux.add(p);
            aux.validate();
        }
    }
}

