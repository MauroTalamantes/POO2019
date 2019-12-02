/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Phoenix Azrael (FABIÁN GAYTÁN ORTIZ          -   2019670094
 *                         MAURO TALAMANTES VILLAGRANA  -   2019670126)
 * 
 * LA BASE DE DATOS, SE LLAMA inventario; CONTIENE UNA TABLA inv CON TRES COLUMNAS codigo, nombre_prod, cantidad.
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameAlmacen almacen = new FrameAlmacen();
        almacen.setSize(1000, 600);
        almacen.setVisible(true);
    }
    
}
