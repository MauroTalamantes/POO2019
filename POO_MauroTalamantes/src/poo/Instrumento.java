



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Instrumento {
    
    private String nombre;
    private double precio;
    private double peso;
    private String material;
    
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
    public String getInstrumento (){
        return this.nombre;
    };
     public void setInstrumento (String nombre){
        this.nombre=nombre;
    };
     
    public double getInstrumento2 (){
        return this.precio;
    };
     public void setInstrumento2 (double precio){
        this.precio=precio;
    }; 
     
    public String getInstrumento3 (){
        return this.material;
    };
     public void setInstrumento3 (String material){
        this.material=material;
    }; 
    
}  

