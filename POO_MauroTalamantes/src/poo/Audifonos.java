



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Audifonos {
    
    private String marca;
    private int frecuencia;
    private double calidad;
    private double precio;
    private String tipo;
    
    public Audifonos(){
        marca = "Desconocido";
        frecuencia = 0;
        calidad = 0;
        precio = 0;
        tipo = "Desconocido";    
    }

    
     public Audifonos(String marca,
                    int frecuencia, 
                    double calidad,
                    double precio, String tipo ){
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.calidad = calidad;
        this.precio = precio;
        this.tipo = tipo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
    public String getAudifonos (){
        return this.marca;
    };
     public void setAudifonos (String marca){
        this.marca=marca;
    };
     
    public int getAudifonos1 (){
        return this.frecuencia;
    };
     public void setAudifonos (int frecuencia){
        this.frecuencia=frecuencia;
    };
      
    public double getAudifonos2 (){
        return this.calidad;
    };
     public void setAudifonos (double calidad){
        this.calidad=calidad;
    };
     
    public double getAudifonos3 (){
        return this.precio;
    };
     public void setAudifonos1 (double precio){
        this.precio=precio;
    }; 
    
    public String getAudifonos4 (){
        return this.tipo;
    };
     public void setAudifonos2 (String tipo){
        this.tipo=tipo;
    }; 
     
}  

