



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Desodorante {
    
    public String nombre;
    public String marca;
    public String fragancia;
    public double precio;
    public String para;
    
    public Desodorante(){
        nombre = "Desconocido";
        marca = "Desconocido";
        fragancia = "Desconocido";
        precio = 0;
        para = "Desconocido";    
    }

    
     public Desodorante(String nombre,
                    String marca, 
                    String fragancia,
                    double precio, String para ){
        this.nombre = nombre;
        this.marca = marca;
        this.fragancia = fragancia;
        this.precio = precio;
        this.para = para;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

