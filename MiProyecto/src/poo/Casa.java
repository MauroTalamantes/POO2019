



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Casa {
    
    private String ubicacion;
    private int año_construccion;
    private String color;
    private double metros;
    private String tipo;
    
    public Casa(){
        ubicacion = "Desconocido";
        año_construccion = 0;
        color = "Desconocido";
        metros = 0;
        tipo = "Desconocido";    
    }

    
     public Casa (String ubicacion,
                    int año_construccion, 
                    String color,
                    double metros, String tipo ){
        this.ubicacion = ubicacion;
        this.año_construccion = año_construccion;
        this.color = color;
        this.metros = metros;
        this.tipo = tipo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
    public String getCasa (){
        return this.ubicacion;
    };
     public void setCasa (String ubicacion){
        this.ubicacion=ubicacion;
    };
     
    public int getCasa2 (){
        return this.año_construccion;
    };
     public void setCasa (int año_construccion){
        this.año_construccion=año_construccion;
    }; 
     
    public String etCasa3 (){
        return this.color;
    };
     public void setCasa1 (String color){
        this.color=color;
    }; 
     
    public double getCasa4 (){
        return this.metros;
    };
     public void setCasa (double metros){
        this.metros=metros;
    }; 
     
    public String getCasa5 (){
        return this.tipo;
    };
     public void setCasa2 (String tipo){
        this.tipo=tipo;
    }; 
   
}