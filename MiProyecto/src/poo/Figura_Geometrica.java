



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Figura_Geometrica {
    
    public String nombre;
    public int lados;
    public double largo;
    public double ancho;
    public double perimetro;
    
        public Figura_Geometrica(){
        nombre = "Desconocido";
        lados = 0;
        largo = 0;
        ancho = 0;   
        perimetro=0;
    }

    
     public Figura_Geometrica(String nombre,
                    int lados, 
                    double largo,
                    double ancho, double perimetro ){
        this.nombre = nombre;
        this.lados = lados;
        this.largo = largo;
        this.ancho = ancho;
        this.perimetro = perimetro;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

