



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Libro {
    
    public String nombre;
    public int paginas;
    public double precio;
    public String autor;
    
    public Libro(){
        nombre = "Desconocido";
        paginas = 0;
        precio = 0;
        autor = "Desconocido";    
    }

    
     public Libro(String nombre,
                    int paginas, 
                    double precio,
                    String autor ){
        this.nombre = nombre;
        this.paginas = paginas;
        this.precio = precio;
        this.autor = autor;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

