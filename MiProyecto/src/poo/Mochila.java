



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Mochila {
    
    public String marca;
    public double peso;
    public String tipo;
    
    public Mochila(){
        marca = "Desconocido";
        peso = 0;
        tipo = "Desconocido";    
    }

    
     public Mochila(String marca,
                    double peso, String tipo ){
        this.marca = marca;
        this.peso = peso;
        this.tipo = tipo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

