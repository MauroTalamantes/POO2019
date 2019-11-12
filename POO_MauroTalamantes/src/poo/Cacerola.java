



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Cacerola {
    
    private String nombre;
    private String marca;
    private double precio;
    private double peso;
    private String material;
    
    public Cacerola(){
        nombre = "Desconocido";
        marca = "Desconocido";
        precio = 0;
        peso = 0;
        material = "Desconocido";    
    }

    
     public Cacerola(String nombre,
                    String marca, 
                    double precio,
                    double peso, String material ){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.material = material;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getCacerola (){
        return this.nombre;
    };
     public void setCacerola (String nombre){
        this.nombre=nombre;
    };
     
     public String getCacerola1 (){
        return this.marca;
    };
     public void setCacerola1 (String marca){
        this.marca=marca;
    }; 
    
      public double getCacerola2 (){
        return this.precio;
    };
     public void setCacerola (double precio){
        this.precio=precio;
    };
    
     public double getCacerola3 (){
        return this.peso;
    };
     public void setCacerola2 (double peso){
        this.peso=peso;
    }; 
     
     public String getCacerola4 (){
        return this.material;
    };
     public void setCacerola2 (String material){
        this.material=material;
    }; 
     
   
}  

