



/**/
package poo;

/**
 * Crear objetos
 * @author Mauro Talamantes Villagrana
 */
public class Figura_Geometrica {
    
    private String nombre;
    private int lados;
    private double largo;
    private double ancho;
    private double perimetro;
    
        public Figura_Geometrica(){
        nombre = "Desconocido";
        lados = 0;
        largo = 0;
        ancho = 0;   
        perimetro=0;
    }

    
     public Figura_Geometrica(String nombre,
                    int lados, 
                    double largo,
                    double ancho, double perimetro ){
        this.nombre = nombre;
        this.lados = lados;
        this.largo = largo;
        this.ancho = ancho;
        this.perimetro = perimetro;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
      public String getFigura_Geometrica (){
        return this.nombre;
    };
     public void setFigura_Geometrica (String nombre){
        this.nombre=nombre;
    };
     
      public int getFigura_Geometrica2 (){
        return this.lados;
    };
     public void setFigura_Geometrica2 (int lados){
        this.lados=lados;
    }; 
    
     
      public double getFigura_Geometrica3 (){
        return this.largo;
    };
     public void setFigura_Geometrica3 (double largo){
        this.largo=largo;
    };
    
       public double getFigura_Geometrica4 (){
        return this.ancho;
    };
     public void setFigura_Geometrica4 (double ancho){
        this.ancho=ancho;
    };
     
      public double getFigura_Geometrica5 (){
        return this.perimetro;
    };
     public void setFigura_Geometrica5 (double perimetro){
        this.perimetro=perimetro;
    }; 
    
}  

