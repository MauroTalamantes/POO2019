



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Persona {
    
    private String nombre;
    public int edad;
    public double estatura;
    public double peso;
    public String sexo;
    
    public Persona(){
        nombre = "Desconocido";
        edad = 0;
        estatura = 0;
        peso = 0;
        sexo = "Desconocido";    
    }

    
     public Persona(String nombre,
                    int edad, 
                    double estatura,
                    double peso, String sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    public String getNombre (){
        return this.nombre;
    };
     public void setNombre (String nombre){
        this.nombre=nombre;
    };
}  

