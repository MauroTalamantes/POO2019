



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
    public String getFigura_Geometrica (){
        return this.marca;
    };
     public void setFigura_Geometrica (String marca){
        this.marca=marca;
    };
     
     public double getFigura_Geometrica2 (){
        return this.peso;
    };
     public void setFigura_Geometrica2 (double peso){
        this.peso=peso;
    };
     
     public String getFigura_Geometrica3 (){
        return this.tipo;
    };
     public void setFigura_Geometrica3 (String tipo){
        this.tipo=tipo;
    };
}  

