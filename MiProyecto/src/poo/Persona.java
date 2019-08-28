



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Persona {

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", sexo=" + sexo + '}';
    }
    
    private String nombre;
    private int edad;
    private double estatura;
    private double peso;
    private String sexo;
    
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

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     
}  

