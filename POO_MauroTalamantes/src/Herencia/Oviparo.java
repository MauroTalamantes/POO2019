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
public class Oviparo extends Animal {
    String clasificacion;
    String cantidad_huevos;
    String incubacion;

    public Oviparo() {
    }

    public Oviparo(String clasificacion, String cantidad_huevos, String incubacion) {
        this.clasificacion = clasificacion;
        this.cantidad_huevos = cantidad_huevos;
        this.incubacion = incubacion;
    }

    public Oviparo(String clasificacion, String cantidad_huevos, String incubacion, String especie, String genero, String familia, String orden, String clase, String filo, String reino) {
        super(especie, genero, familia, orden, clase, filo, reino);
        this.clasificacion = clasificacion;
        this.cantidad_huevos = cantidad_huevos;
        this.incubacion = incubacion;
    }
    
    
}
