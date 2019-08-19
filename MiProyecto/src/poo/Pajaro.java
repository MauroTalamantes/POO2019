



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Pajaro {
    
   public String nombre;
    public int edad;
    public String raza;
    public double peso;
    public String sexo;
    
    public Pajaro(){
        nombre = "Desconocido";
        edad = 0;
        raza = "Desconocido";
        peso = 0;
        sexo = "Desconocido";    
    }

    
     public Pajaro(String nombre,
                    int edad, 
                    String raza,
                    double peso, String sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.sexo = sexo;   
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}  

