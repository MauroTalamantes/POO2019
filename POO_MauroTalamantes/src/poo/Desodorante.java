



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Desodorante {
    
    private String nombre;
    private String marca;
    private String fragancia;
    private double precio;
    private String para;
    
    public Desodorante(){
        nombre = "Desconocido";
        marca = "Desconocido";
        fragancia = "Desconocido";
        precio = 0;
        para = "Desconocido";    
    }

    
     public Desodorante(String nombre,
                    String marca, 
                    String fragancia,
                    double precio, String para ){
        this.nombre = nombre;
        this.marca = marca;
        this.fragancia = fragancia;
        this.precio = precio;
        this.para = para;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getDesodorante (){
        return this.nombre;
    };
     public void setDesodorante (String nombre){
        this.nombre=nombre;
    };
     
    public String getDesodorante2 (){
        return this.marca;
    };
     public void setDesodorante2 (String marca){
        this.marca=marca;
    }; 
     
    public String getDesodorante3 (){
        return this.fragancia;
    };
     public void setDesodorante3 (String fragancia){
        this.fragancia=fragancia;
    };
    
    public double getDesodorante4 (){
        return this.precio;
    };
     public void setDesodorante4 (double precio){
        this.precio=precio;
    }; 
     
    public String getDesodorante5 (){
        return this.para;
    };
     public void setDesodorante5 (String para){
        this.para=para;
    }; 
     
}  

