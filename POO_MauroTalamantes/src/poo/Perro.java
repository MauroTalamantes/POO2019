



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Perro {
    
    private String nombre;
    private int edad;
    private String raza;
    private double peso;
    private String sexo;
    
    public Perro(){
        nombre = "Desconocido";
        edad = 0;
        raza = "Desconocido";
        peso = 0;
        sexo = "Desconocido";    
    }

    
     public Perro(String nombre,
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
    public String getPerro (){
        return this.nombre;
    };
     public void SetPerro (String nombre){
        this.nombre=nombre;
    };
     
     public int getPerro2 (){
        return this.edad;
    };
     public void SetPerro2 (int edad){
        this.edad=edad;
    }; 
     
     public String getPerro3 (){
        return this.raza;
    };
     public void SetPerro3 (String raza){
        this.raza=raza;
    }; 
    
      public double getPerro4 (){
        return this.peso;
    };
     public void SetPerro4 (double peso){
        this.peso=peso;
    };
     
     public String getPerro5 (){
        return this.sexo;
    };
     public void SetPerro5 (String sexo){
        this.sexo=sexo;
    }; 
}  

