



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Persona {
    
    
    
    String nombre;
    int edad;
    float estatura;
    double peso;
    String sexo;
   
    public Persona(){
    nombre="Desconocido";
    edad=0;
    estatura=0;
    peso=0;
    sexo="Desconocido";
    };
    
    public void saludar(){ 
        System.out.println("Hola mundo");
    }    
}
