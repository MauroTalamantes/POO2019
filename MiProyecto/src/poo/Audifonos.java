



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Audifonos {
    
    private String marca;
    public int frecuencia;
    public double calidad;
    public double precio;
    public String tipo;
    
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
     public void getAudifonos (String marca){
        this.marca=marca;
    };
}  

