



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Mochila {
    
    private String marca;
    private double peso;
    private String tipo;
    
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
    public String getMochila (){
        return this.marca;
    };
     public void setMochila (String marca){
        this.marca=marca;
    };
     
     public double getMochila2 (){
        return this.peso;
    };
     public void setMochila2 (double peso){
        this.peso=peso;
    };
     
     public String getMochila3 (){
        return this.tipo;
    };
     public void setMochila3 (String tipo){
        this.tipo=tipo;
    };
}  

