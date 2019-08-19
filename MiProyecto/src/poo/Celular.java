



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Celular {
    
    public String nombre;
    public String color;
    public double precio;
    public double peso;
    public String marca;
    
    public Celular(){
        nombre = "Desconocido";
        color = "Desconocido";
        precio = 0;
        peso = 0;
        marca = "Desconocido";    
    }

    
     public Celular(String nombre,
                    String color, 
                    double precio,
                    double peso, String marca ){
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.peso = peso;
        this.marca = marca;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

