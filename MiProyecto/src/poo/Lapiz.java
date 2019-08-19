



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Lapiz {
    
    public String marca;
    public String calidad;
    public double precio;
    public String color;
    
    public Lapiz(){
        marca = "Desconocido";
        calidad = "Desconocido";
        precio = 0;
        color = "Desconocido";    
    }

    
     public Lapiz(String marca,
                    String calidad, 
                    double precio,
                    String color ){
        this.marca = marca;
        this.calidad = calidad;
        this.precio = precio;
        this.color = color;   
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

