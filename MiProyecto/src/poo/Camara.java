



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Camara {
    
    private String marca;
    public double precio;
    public String software;
    public double peso;
    public double calidad;
    
    public Camara(){
        marca = "Desconocido";
        precio = 0;
        software = "Desconocido";
        peso = 0;
        calidad = 0;    
    }

    
     public Camara(String marca,
                    int precio, 
                    String software,
                    double peso, double calidad ){
        this.marca = marca;
        this.precio = precio;
        this.software = software;
        this.peso = peso;
        this.calidad = calidad;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getCamara (){
        return this.marca;
    };
     public void getCamara (String marca){
        this.marca=marca;
    };
}  

