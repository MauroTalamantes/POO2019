



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Camara {
    
    private String marca;
    private double precio;
    private String software;
    private double peso;
    private double calidad;
    
    public Camara(){
        marca = "Desconocido";
        precio = 0;
        software = "Desconocido";
        peso = 0;
        calidad = 0;    
    }

    
     public Camara(String marca,
                    double precio, 
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
     public void setCamara (String marca){
        this.marca=marca;
    };
    public double getCamara1 (){
        return this.precio;
    };
     public void setCamara (double precio){
        this.precio=precio;
    }; 
    public String getCamara2 (){
        return this.software;
    };
     public void setCamara1 (String software){
        this.software=software;
    };
    public double getCamara3 (){
        return this.peso;
    };
     public void setCamara2 (double peso){
        this.peso=peso;
    }; 
     
    public double getCamara4 (){
        return this.calidad;
    };
     public void setCamara3 (double calidad){
        this.calidad=calidad;
    }; 
     
}  

