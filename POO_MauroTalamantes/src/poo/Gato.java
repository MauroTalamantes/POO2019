



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Gato {
    
    private String nombre;
    private int edad;
    private String raza;
    private double peso;
    private String sexo;
    
    public Gato(){
        nombre = "Desconocido";
        edad = 0;
        raza = "Desconocido";
        peso = 0;
        sexo = "Desconocido";    
    }

    
     public Gato(String nombre,
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
    public String getGato (){
        return this.nombre;
    };
     public void SetGato (String nombre){
        this.nombre=nombre;
    };
     
     public int getGato2 (){
        return this.edad;
    };
     public void SetGato2 (int edad){
        this.edad=edad;
    }; 
     
     public String getGato3 (){
        return this.raza;
    };
     public void SetGato3 (String raza){
        this.raza=raza;
    }; 
    
      public double getGato4 (){
        return this.peso;
    };
     public void SetGato4 (double peso){
        this.peso=peso;
    };
     
     public String getGato5 (){
        return this.sexo;
    };
     public void SetGato5 (String sexo){
        this.sexo=sexo;
    }; 
}  

