



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Moneda {
    
    private String pais;
    private double valor;
    private String metal;
    
    public Moneda(){
        pais = "Desconocido";
        valor = 0;
        metal = "Desconocido";    
    }

    
     public Moneda(String pais,
                    double valor,
                    String metal ){
        this.pais = pais;
        this.valor = valor;
        this.metal = metal;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getMoneda (){
        return this.pais;
    };
     public void setMoneda (String pais){
        this.pais=pais;
    };
     
    public double getMoneda2 (){
        return this.valor;
    };
     public void setMoneda2 (double valor){
        this.valor=valor;
    }; 
     
    public String getMoneda3 (){
        return this.metal;
    };
     public void setMoneda3 (String metal){
        this.metal=metal;
    }; 
}  

