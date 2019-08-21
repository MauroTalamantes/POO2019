



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Computadora {
    
    private String nombre;
    private String color;
    private double precio;
    private double peso;
    private String marca;
    
    public Computadora(){
        nombre = "Desconocido";
        color = "Desconocido";
        precio = 0;
        peso = 0;
        marca = "Desconocido";    
    }

    
     public Computadora(String nombre,
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
      public String getComputadora (){
        return this.nombre;
    };
     public void setComputadora (String nombre){
        this.nombre=nombre;
    };
     
     public String getComputadora2 (){
        return this.color;
    };
     public void setComputadora2 (String color){
        this.color=color;
    };
   
     
     
    public double getComputadora3 (){
        return this.precio;
    };
     public void setComputadora3 (double precio){
        this.precio=precio;
    };
    
     
     public double getComputadora4 (){
        return this.peso;
    };
     public void setComputadora4 (double peso){
        this.peso=peso;
    };
     
    public String setComputadora5 (){
        return this.marca;
    };
     public void setComputadora5 (String marca){
        this.marca=marca;
    };
     
}  

