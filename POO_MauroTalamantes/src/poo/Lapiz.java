



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Lapiz {
    
    private String marca;
    private String calidad;
    private double precio;
    private String color;
    
    public Lapiz(){
        marca = "Desconocido";
        calidad = "Desconocido";
        precio = 0;
        color = "Desconocido";    
    }

    
     public Lapiz(String marca,
                    String calidad, 
                    double precio,
                    String color ){
        this.marca = marca;
        this.calidad = calidad;
        this.precio = precio;
        this.color = color;   
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getLapiz (){
        return this.marca;
    };
     public void setLapiz (String marca){
        this.marca=marca;
    };
     
     public String getLapiz2 (){
        return this.calidad;
    };
     public void setLapiz2 (String calidad){
        this.calidad=calidad;
    };
     
    public double getLapiz3 (){
        return this.precio;
    };
     public void setLapiz3 (double precio){
        this.precio=precio;
    }; 
    
     public String getLapiz4 (){
        return this.color;
    };
     public void setLapiz4 (String color){
        this.color=color;
    };

}  

