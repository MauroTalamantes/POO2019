/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;
import poo.Alumno;
import poo.Celular;


/**
 *
 * @author mauro
 */
public class Colecciones {
    private ArrayList<Object> listaDeArreglos;
    
    public Colecciones(){
        
    }
    public static void main(String[] args){
        ArrayList<Object> listaDeArreglos = new ArrayList<>();
        listaDeArreglos.add(1);
        listaDeArreglos.add(2);
        listaDeArreglos.add(3);
        listaDeArreglos.add(4);
        listaDeArreglos.add(5);
        listaDeArreglos.add(6);
        listaDeArreglos.add(7);
        listaDeArreglos.add(8);
        listaDeArreglos.add(9);
        listaDeArreglos.add(10);
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Celular());
        listaDeArreglos.add(new Celular());
        listaDeArreglos.add(new Celular());
        listaDeArreglos.add(new Celular());
        
  
        for(Object aux: listaDeArreglos){
            if(aux instanceof Integer){
                Integer aux2 = (Integer)aux;
                System.out.println(aux2);
            }
            if(aux instanceof Alumno){
                Alumno aux2 = (Alumno)aux;
                System.out.println(aux2);
            }
            if(aux instanceof Celular){
                Celular aux2 = (Celular)aux;
                System.out.println(aux2);
            }
            
        }
    }
}
