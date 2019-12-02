/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Phoenix Azrael
 */
public class JuguetesxD {
    private String nombre;
    private String codigo;
    private String cantidad;

    public JuguetesxD() {
    }

    public JuguetesxD(String codigo, String nombre, String cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return (codigo + "  -   " + nombre + "  -   " + cantidad);
    }
}
