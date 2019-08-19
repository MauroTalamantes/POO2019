



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Cacerola {
    
    public String nombre;
    public String marca;
    public double precio;
    public double peso;
    public String material;
    
    public Cacerola(){
        nombre = "Desconocido";
        marca = "Desconocido";
        precio = 0;
        peso = 0;
        material = "Desconocido";    
    }

    
     public Cacerola(String nombre,
                    String marca, 
                    double precio,
                    double peso, String material ){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.material = material;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

