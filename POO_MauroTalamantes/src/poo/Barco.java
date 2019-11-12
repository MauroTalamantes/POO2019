



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Barco {
    
    private String nombre;
    private int num_velas;
    private double costo;
    private String material;
    private String tipo;
    
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
    public String getBarco (){
        return this.nombre;
    };
     public void setBarco (String nombre){
        this.nombre=nombre;
    };
     
    public int getBarco2 (){
        return this.num_velas;
    };
     public void setBarco (int num_velas){
        this.num_velas=num_velas;
    }; 
     
    public double getBarco3 (){
        return this.costo;
    };
     public void setBarco (double costo){
        this.costo=costo;
    }; 
    
     public String getBarco4 (){
        return this.material;
    };
     public void setBarco1 (String material){
        this.material=material;
    };
     
     
    public String getBarco5 (){
        return this.tipo;
    };
     public void setBarco2 (String tipo){
        this.tipo=tipo;
    }; 
     
}  

