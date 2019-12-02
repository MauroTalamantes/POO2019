/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Phoenix Azrael
 */
public class FrameAlmacen extends JFrame{
    public FrameAlmacen(){
        setTitle("Proyecto Final - INVENTARIO");
        iniciarComponentes();
        
    }

    private void iniciarComponentes() {
        //CREAR PANELES
        JPanel botones = new JPanel(new GridLayout(5, 1));
        JPanel cambio = new JPanel(new GridLayout());
        setLayout(new BorderLayout());
        //CREAR BOTONES
        JButton crear = new JButton("CREAR");
        JButton actual = new JButton("ACTUALIZAR");
        JButton borrar = new JButton("BORRAR");
        JButton mirar = new JButton("MIRAR");
        JButton consu = new JButton("CONSULTAR");
        //CREAR FUENTES
        Font now = new Font("BadaBoom BB",Font.BOLD, 46);
        Font nowo = new Font("BadaBoom BB",Font.BOLD, 24);
        //AGREGAR BOTONES AL PANEL
        botones.add(crear);
        botones.add(actual);
        botones.add(mirar);
        botones.add(borrar);
        botones.add(consu);
        //COLOR DE BOTONES
        crear.setBackground(new Color(26,131,127));
        actual.setBackground(new Color(40,90,117));
        mirar.setBackground(new Color(26,131,127));
        borrar.setBackground(new Color(40,90,117));
        consu.setBackground(new Color(26,131,127));
        //FUENTE EN LOS BOTONES
        crear.setFont(nowo);
        actual.setFont(nowo);
        mirar.setFont(nowo);
        borrar.setFont(nowo);
        consu.setFont(nowo);
        //DESFOCUS
        crear.setFocusable(false);
        actual.setFocusable(false);
        mirar.setFocusable(false);
        borrar.setFocusable(false);
        consu.setFocusable(false);
        //BIENVENIDA
        JLabel bien = new JLabel("BIENVENIDO A TU INVENTARIO");
        bien.setHorizontalAlignment(JLabel.CENTER);
        bien.setFont(now);
        cambio.add(bien);
        //PANEL CAMBIO COLOR
        cambio.setBackground(new Color(36,90,118));
        //AGREGAR PANELES AL FRAME
        add(botones, BorderLayout.WEST);
        add(cambio, BorderLayout.CENTER);
        //ESCUCHADORES
        EscuchadorPrincipal oilo = new EscuchadorPrincipal(cambio);
        crear.addActionListener(oilo);
        actual.addActionListener(oilo);
        borrar.addActionListener(oilo);
        mirar.addActionListener(oilo);
        consu.addActionListener(oilo);
        //PUCHALE A LA TACHA PA'QUE SE CIERRE :v
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
