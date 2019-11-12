/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericas;

import poo.Alumno;
import poo.Persona;

/**
 *
 * @author mauro
 */
public class GenericasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GenericaA<Integer> aux = new GenericaA<>(5);
      aux.classType();
      GenericaA<Alumno> aux2 = new GenericaA<>(new Alumno());
      aux2.classType();
      GenericaA<Persona> aux3 = new GenericaA<>(new Persona());
      aux3.classType();
      
    }
    
}
