/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author mauro
 */
public class Docente extends Persona{
    
   
   private String materia;
   private String turno;


    public Docente() {
        this.materia = "";
        this.turno = "";
    }

    public Docente(String nombre,
                    int edad, 
                    double estatura,
                    double peso, String sexo, String materia,String turno) {
      super(nombre, edad, estatura, peso, sexo);
        this.materia = materia;
        this.turno = turno;

    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
    

    
    
}
