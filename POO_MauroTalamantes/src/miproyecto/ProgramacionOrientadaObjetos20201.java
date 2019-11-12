/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyecto;

import gui.NuevoJFrame;
import java.util.LinkedList;
import javax.swing.JFrame;
import poo.Alumno;
import poo.Persona;
import poo2.Docente;
import poo2.Grupo;

/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  NuevoJFrame aux = new NuevoJFrame("Mi nuevo JFrame", 400, 600);
        //aux2.setSize(600,400);
          // aux2.setVisible(true);
           
          // JFrame aux3 = new JFrame();
           //aux3.setVisible(true);
           
           
           
          Grupo grupo1 = new Grupo("2CM1");
          grupo1.setTutor(new Docente());
          grupo1.getTutor().setNombre("Juan Julian");
          grupo1.getTutor().setEdad(30);
          grupo1.getTutor().setEstatura(1.85);
           
           System.out.println(grupo1.getTutor()); 
       
    }
    
}
