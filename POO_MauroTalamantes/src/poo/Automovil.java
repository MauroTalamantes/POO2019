



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Automovil {
    
    private String marca;
    private int año;
    private String color;
    private double peso;
    private String modelo;
    
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
    
    
    public String getAutomovil (){
        return this.marca;
    };
     public void setAutomovil (String marca){
        this.marca=marca;
    };
     
    public int getAutomovil2 (){
        return this.año;
    };
     public void setAutomovil (int año){
        this.año=año;
    }; 
     
    public String getAutomovil3 (){
        return this.color;
    };
     public void setAutomovil1 (String color){
        this.color=color;
    };  
     
    public double getAutomovil4 (){
        return this.peso;
    };
     public void setAutomovil (double peso){
        this.peso=peso;
    }; 
     
     
    public int getAutomovil5 (){
        return this.año;
    };
     public void setAutomovil2 (String modelo){
        this.modelo=modelo;
    };  
     
}  

