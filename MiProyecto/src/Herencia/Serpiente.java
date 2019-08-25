/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author mauro
 */
public class Serpiente extends Oviparo{
    String largo;
    String toxicidad;
    String medio;

    public Serpiente() {
    }

    public Serpiente(String largo, String toxicidad, String medio) {
        this.largo = largo;
        this.toxicidad = toxicidad;
        this.medio = medio;
    }

    public Serpiente(String largo, String toxicidad, String medio, String clasificacion, String cantidad_huevos, String incubacion) {
        super(clasificacion, cantidad_huevos, incubacion);
        this.largo = largo;
        this.toxicidad = toxicidad;
        this.medio = medio;
    }

    public Serpiente(String largo, String toxicidad, String medio, String clasificacion, String cantidad_huevos, String incubacion, String especie, String genero, String familia, String orden, String clase, String filo, String reino) {
        super(clasificacion, cantidad_huevos, incubacion, especie, genero, familia, orden, clase, filo, reino);
        this.largo = largo;
        this.toxicidad = toxicidad;
        this.medio = medio;
    }
     
    
}
