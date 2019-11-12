



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Libro {
    
    private String nombre;
    private int paginas;
    private double precio;
    private String autor;
    
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
    public String getLibro (){
        return this.nombre;
    };
     public void setLibro (String nombre){
        this.nombre=nombre;
    };
     
    public int getLibro2 (){
        return this.paginas;
    };
     public void setLibro2 (int paginas){
        this.paginas=paginas;
    }; 
     
   public double getLibro3 (){
        return this.precio;
    };
     public void setLibro3 (double precio){
        this.precio=precio;
    }; 
     
    public String getLibro4 (){
        return this.autor;
    };
     public void setLibro4 (String autor){
        this.autor=autor;
    }; 

}  

