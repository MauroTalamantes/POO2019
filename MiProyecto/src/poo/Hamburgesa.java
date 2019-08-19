



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Hamburgesa {
    
    public String ingrediente_1;
    public String ingrediente_2;
    public String ingrediente_3;
    public String ingrediente_4;
    public String ingrediente_5;
    
    public Hamburgesa(){
        ingrediente_1 = "Desconocido";
        ingrediente_2 = "Desconocido";
        ingrediente_3 = "Desconocido";
        ingrediente_4 = "Desconocido";
        ingrediente_5 = "Desconocido";    
    }

    
     public Hamburgesa(String ingrediente_1,
                    String ingrediente_2, 
                    String ingrediente_3,
                    String ingrediente_4, String ingrediente_5 ){
        this.ingrediente_1 = ingrediente_1;
        this.ingrediente_2 = ingrediente_2;
        this.ingrediente_3 = ingrediente_3;
        this.ingrediente_4 = ingrediente_4;
        this.ingrediente_5 = ingrediente_5;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

