



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Casa {
    
    private String ubicacion;
    public int año_construccion;
    public String color;
    public double metros;
    public String tipo;
    
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
     public void getCasa (String ubicacion){
        this.ubicacion=ubicacion;
    };
}