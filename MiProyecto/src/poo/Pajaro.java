



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Pajaro {
    
   private String nombre;
    private int edad;
    private String raza;
    private double peso;
    private String sexo;
    
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
    public String getPajaro (){
        return this.nombre;
    };
     public void setPajaro (String nombre){
        this.nombre=nombre;
    };
    
    public int getPajaro2 (){
        return this.edad;
    };
     public void setPajaro2 (int edad){
        this.edad=edad;
    };
     
    public String getPajaro3 (){
        return this.raza;
    };
     public void setPajaro3 (String raza){
        this.raza=raza;
    }; 
     
    public double getPajaro4 (){
        return this.peso;
    };
     public void setPajaro4 (double peso){
        this.peso=peso;
    }; 
     
     public String getPajaro5 (){
        return this.sexo;
    };
     public void setPajaro5 (String sexo){
        this.sexo=sexo;
    };
}  

