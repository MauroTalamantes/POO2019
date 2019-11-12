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
public class Animal {
    private String especie;
    private String genero;
    private String familia;
    private String orden;
    private String clase;
    private String filo;
    private String reino;

    public Animal() {
    }

    public Animal(String especie, String genero, String familia, String orden, String clase, String filo, String reino) {
        this.especie = especie;
        this.genero = genero;
        this.familia = familia;
        this.orden = orden;
        this.clase = clase;
        this.filo = filo;
        this.reino = reino;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * @return the orden
     */
    public String getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(String orden) {
        this.orden = orden;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * @return the filo
     */
    public String getFilo() {
        return filo;
    }

    /**
     * @param filo the filo to set
     */
    public void setFilo(String filo) {
        this.filo = filo;
    }

    /**
     * @return the reino
     */
    public String getReino() {
        return reino;
    }

    /**
     * @param reino the reino to set
     */
    public void setReino(String reino) {
        this.reino = reino;
    }
    
    
    
    
}

