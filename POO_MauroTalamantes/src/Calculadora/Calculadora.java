/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Phoenix Azrael
 */
public class Calculadora {
   private double operando1;
   private double operando2;
   private double resultado;
   
   public Calculadora(){
       operando1 = 0;
       operando2 = 0;
       resultado = 0;
   }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
   
    
   public double suma(){
       resultado = operando1+operando2;
       return resultado;   
   }
   public double resta(){
       resultado = operando1-operando2;
       return resultado;
   }
   public double multi(){
       resultado = operando1*operando2;
       return resultado;
   }
   public double div(){
       resultado = operando1/operando2;
       return resultado;
   }
}
