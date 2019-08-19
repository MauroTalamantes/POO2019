



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Barco {
    
    public String nombre;
    public int num_velas;
    public double costo;
    public String material;
    public String tipo;
    
    public Barco(){
        nombre = "Desconocido";
        num_velas = 0;
        costo = 0;
        material = "Desconocido";
        tipo = "Desconocido";    
    }

    
     public Barco(String nombre,
                    int num_velas, 
                    double costo,
                    String material, String tipo ){
        this.nombre = nombre;
        this.num_velas = num_velas;
        this.costo = costo;
        this.material = material;
        this.tipo = tipo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

