



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Celular {
    
    private String nombre;
    private String color;
    private double precio;
    private double peso;
    private String marca;

    @Override
    public String toString() {
        return "Celular{" + "nombre=" + nombre + ", color=" + color + ", precio=" + precio + ", peso=" + peso + ", marca=" + marca + '}';
    }
    
    public Celular(){
        nombre = "Desconocido";
        color = "Desconocido";
        precio = 0;
        peso = 0;
        marca = "Desconocido";    
    }

    
     public Celular(String nombre,
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
    public String getCelular (){
        return this.nombre;
    };
     public void setCelular (String nombre){
        this.nombre=nombre;
    };
     
    public String getCelular1 (){
        return this.color;
    };
     public void setCelular1 (String color){
        this.color=color;
    }; 
    
     
    public double getCelular2 (){
        return this.precio;
    };
     public void setCelular (double precio){
        this.precio=precio;
    }; 
     
    public double getCelular3 (){
        return this.peso;
    };
     public void setCelular3 (double peso){
        this.peso=peso;
    }; 
     
    public String getCelular4 (){
        return this.marca;
    };
     public void setCelular4 (String marca){
        this.marca=marca;
    }; 
   
}  

