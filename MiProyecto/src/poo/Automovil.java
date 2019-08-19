



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Automovil {
    
    public String marca;
    public int año;
    public String color;
    public double peso;
    public String modelo;
    
    public Automovil(){
        marca = "Desconocido";
        año = 0;
        color = "Desconocido";
        peso = 0;
        modelo = "Desconocido";    
    }

    
     public Automovil(String marca,
                    int año, 
                    String color,
                    double peso, String modelo ){
        this.marca = marca;
        this.año = año;
        this.color = color;
        this.peso = peso;
        this.modelo = modelo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

