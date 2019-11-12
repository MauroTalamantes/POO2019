/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author mauro
 */
public class Lentes {
   private String marca;
   private String tipo;
   private double precio;
   private double graduacionder;
   private double graduacionizq;

    public Lentes() {
        this.marca = "";
        this.tipo = "";
        this.precio = 0;
        this.graduacionder = 0;
        this.graduacionizq = 0;
    }

    public Lentes(String marca, String tipo, double precio, double graduacionder, double graduacionizq) {
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.graduacionder = graduacionder;
        this.graduacionizq = graduacionizq;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the graduacionder
     */
    public double getGraduacionder() {
        return graduacionder;
    }

    /**
     * @param graduacionder the graduacionder to set
     */
    public void setGraduacionder(double graduacionder) {
        this.graduacionder = graduacionder;
    }

    /**
     * @return the graduacionizq
     */
    public double getGraduacionizq() {
        return graduacionizq;
    }

    /**
     * @param graduacionizq the graduacionizq to set
     */
    public void setGraduacionizq(double graduacionizq) {
        this.graduacionizq = graduacionizq;
    }
   
   
    
    
}
 