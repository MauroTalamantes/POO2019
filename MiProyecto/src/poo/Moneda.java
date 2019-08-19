



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Moneda {
    
    public String pais;
    public double valor;
    public String metal;
    
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
    
}  

