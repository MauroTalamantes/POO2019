



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Tablet {
    
    private String nombre;
    public String color;
    public double precio;
    public double peso;
    public String marca;
    
    public Tablet(){
        nombre = "Desconocido";
        color = "Desconocido";
        precio = 0;
        peso = 0;
        marca = "Desconocido";    
    }

    
     public Tablet(String nombre,
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
    public String getTablet (){
        return this.nombre;
    };
     public void setTablet (String nombre){
        this.nombre=nombre;
    };
     
    public String getTablet1 (){
        return this.color;
    };
     public void setTablet1 (String color){
        this.color=color;
    }; 
    
     
    public double getTablet2 (){
        return this.precio;
    };
     public void setTablet (double precio){
        this.precio=precio;
    }; 
     
    public double getTablet3 (){
        return this.peso;
    };
     public void setTablet3 (double peso){
        this.peso=peso;
    }; 
     
    public String getTablet4 (){
        return this.marca;
    };
     public void setTablet4 (String marca){
        this.marca=marca;
    }; 
}  

