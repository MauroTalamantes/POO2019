



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Instrumento {
    
    public String nombre;
    public double precio;
    public double peso;
    public String material;
    
    public Instrumento(){
        nombre = "Desconocido";
        precio = 0;
        peso = 0;
        material = "Desconocido";    
    }

    
     public Instrumento(String nombre,
                    double precio,
                    double peso, String material ){
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.material = material;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

